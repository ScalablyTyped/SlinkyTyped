package typingsSlinky.firebaseFirestore.lruGarbageCollectorMod

import typingsSlinky.firebaseFirestore.persistenceMod.PersistenceTransaction
import typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.targetDataMod.TargetData
import typingsSlinky.firebaseFirestore.typesMod.ListenSequenceNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LruDelegate extends js.Object {
  val garbageCollector: LruGarbageCollector = js.native
  /**
    * Enumerates sequence numbers for documents not associated with a target.
    * Note that this may include duplicate sequence numbers.
    */
  def forEachOrphanedDocumentSequenceNumber(txn: PersistenceTransaction, f: js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]): PersistencePromise[Unit] = js.native
  /** Enumerates all the targets in the TargetCache. */
  def forEachTarget(txn: PersistenceTransaction, f: js.Function1[/* target */ TargetData, Unit]): PersistencePromise[Unit] = js.native
  def getCacheSize(txn: PersistenceTransaction): PersistencePromise[Double] = js.native
  def getSequenceNumberCount(txn: PersistenceTransaction): PersistencePromise[Double] = js.native
  /**
    * Removes all unreferenced documents from the cache that have a sequence number less than or
    * equal to the given `upperBound`.
    *
    * @return the number of documents removed.
    */
  def removeOrphanedDocuments(txn: PersistenceTransaction, upperBound: ListenSequenceNumber): PersistencePromise[Double] = js.native
  /**
    * Removes all targets that have a sequence number less than or equal to `upperBound`, and are not
    * present in the `activeTargetIds` set.
    *
    * @return the number of targets removed.
    */
  def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double] = js.native
}

object LruDelegate {
  @scala.inline
  def apply(
    forEachOrphanedDocumentSequenceNumber: (PersistenceTransaction, js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]) => PersistencePromise[Unit],
    forEachTarget: (PersistenceTransaction, js.Function1[/* target */ TargetData, Unit]) => PersistencePromise[Unit],
    garbageCollector: LruGarbageCollector,
    getCacheSize: PersistenceTransaction => PersistencePromise[Double],
    getSequenceNumberCount: PersistenceTransaction => PersistencePromise[Double],
    removeOrphanedDocuments: (PersistenceTransaction, ListenSequenceNumber) => PersistencePromise[Double],
    removeTargets: (PersistenceTransaction, ListenSequenceNumber, ActiveTargets) => PersistencePromise[Double]
  ): LruDelegate = {
    val __obj = js.Dynamic.literal(forEachOrphanedDocumentSequenceNumber = js.Any.fromFunction2(forEachOrphanedDocumentSequenceNumber), forEachTarget = js.Any.fromFunction2(forEachTarget), garbageCollector = garbageCollector.asInstanceOf[js.Any], getCacheSize = js.Any.fromFunction1(getCacheSize), getSequenceNumberCount = js.Any.fromFunction1(getSequenceNumberCount), removeOrphanedDocuments = js.Any.fromFunction2(removeOrphanedDocuments), removeTargets = js.Any.fromFunction3(removeTargets))
    __obj.asInstanceOf[LruDelegate]
  }
  @scala.inline
  implicit class LruDelegateOps[Self <: LruDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForEachOrphanedDocumentSequenceNumber(
      value: (PersistenceTransaction, js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]) => PersistencePromise[Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEachOrphanedDocumentSequenceNumber")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withForEachTarget(
      value: (PersistenceTransaction, js.Function1[/* target */ TargetData, Unit]) => PersistencePromise[Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEachTarget")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGarbageCollector(value: LruGarbageCollector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("garbageCollector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCacheSize(value: PersistenceTransaction => PersistencePromise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCacheSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSequenceNumberCount(value: PersistenceTransaction => PersistencePromise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSequenceNumberCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveOrphanedDocuments(value: (PersistenceTransaction, ListenSequenceNumber) => PersistencePromise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOrphanedDocuments")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveTargets(value: (PersistenceTransaction, ListenSequenceNumber, ActiveTargets) => PersistencePromise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTargets")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

