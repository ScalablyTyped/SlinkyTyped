package typingsSlinky.firebaseFirestore.indexManagerMod

import typingsSlinky.firebaseFirestore.pathMod.ResourcePath
import typingsSlinky.firebaseFirestore.persistenceMod.PersistenceTransaction
import typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexManager extends js.Object {
  /**
    * Creates an index entry mapping the collectionId (last segment of the path)
    * to the parent path (either the containing document location or the empty
    * path for root-level collections). Index entries can be retrieved via
    * getCollectionParents().
    *
    * NOTE: Currently we don't remove index entries. If this ends up being an
    * issue we can devise some sort of GC strategy.
    */
  def addToCollectionParentIndex(transaction: PersistenceTransaction, collectionPath: ResourcePath): PersistencePromise[Unit] = js.native
  /**
    * Retrieves all parent locations containing the given collectionId, as a
    * list of paths (each path being either a document location or the empty
    * path for a root-level collection).
    */
  def getCollectionParents(transaction: PersistenceTransaction, collectionId: String): PersistencePromise[js.Array[ResourcePath]] = js.native
}

object IndexManager {
  @scala.inline
  def apply(
    addToCollectionParentIndex: (PersistenceTransaction, ResourcePath) => PersistencePromise[Unit],
    getCollectionParents: (PersistenceTransaction, String) => PersistencePromise[js.Array[ResourcePath]]
  ): IndexManager = {
    val __obj = js.Dynamic.literal(addToCollectionParentIndex = js.Any.fromFunction2(addToCollectionParentIndex), getCollectionParents = js.Any.fromFunction2(getCollectionParents))
    __obj.asInstanceOf[IndexManager]
  }
  @scala.inline
  implicit class IndexManagerOps[Self <: IndexManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddToCollectionParentIndex(value: (PersistenceTransaction, ResourcePath) => PersistencePromise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToCollectionParentIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCollectionParents(value: (PersistenceTransaction, String) => PersistencePromise[js.Array[ResourcePath]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCollectionParents")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

