package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.indexeddbPersistenceMod.IndexedDbLruDelegate
import typingsSlinky.firebaseFirestore.indexeddbSchemaMod.DbTargetDocument
import typingsSlinky.firebaseFirestore.indexeddbSchemaMod.DbTargetDocumentKey
import typingsSlinky.firebaseFirestore.localSerializerMod.LocalSerializer
import typingsSlinky.firebaseFirestore.lruGarbageCollectorMod.ActiveTargets
import typingsSlinky.firebaseFirestore.persistenceMod.PersistenceTransaction
import typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.simpleDbMod.SimpleDbStore
import typingsSlinky.firebaseFirestore.simpleDbMod.SimpleDbTransaction
import typingsSlinky.firebaseFirestore.targetCacheMod.TargetCache
import typingsSlinky.firebaseFirestore.targetDataMod.TargetData
import typingsSlinky.firebaseFirestore.typesMod.ListenSequenceNumber
import typingsSlinky.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/indexeddb_target_cache", JSImport.Namespace)
@js.native
object indexeddbTargetCacheMod extends js.Object {
  @js.native
  class IndexedDbTargetCache protected () extends TargetCache {
    def this(referenceDelegate: IndexedDbLruDelegate, serializer: LocalSerializer) = this()
    val referenceDelegate: js.Any = js.native
    var retrieveMetadata: js.Any = js.native
    var saveMetadata: js.Any = js.native
    var saveTargetData: js.Any = js.native
    var serializer: js.Any = js.native
    /**
      * In-place updates the provided metadata to account for values in the given
      * TargetData. Saving is done separately. Returns true if there were any
      * changes to the metadata.
      */
    var updateMetadataFromTargetData: js.Any = js.native
    /**
      * Looks up a TargetData entry by target ID.
      *
      * @param targetId The target ID of the TargetData entry to look up.
      * @return The cached TargetData entry, or null if the cache has no entry for
      * the target.
      */
    def getTargetDataForTarget(transaction: PersistenceTransaction, targetId: TargetId): PersistencePromise[TargetData | Null] = js.native
    /**
      * Drops any targets with sequence number less than or equal to the upper bound, excepting those
      * present in `activeTargetIds`. Document associations for the removed targets are also removed.
      * Returns the number of targets removed.
      */
    def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double] = js.native
  }
  
  def documentTargetStore(txn: PersistenceTransaction): SimpleDbStore[DbTargetDocumentKey, DbTargetDocument] = js.native
  def getHighestListenSequenceNumber(txn: SimpleDbTransaction): PersistencePromise[ListenSequenceNumber] = js.native
}

