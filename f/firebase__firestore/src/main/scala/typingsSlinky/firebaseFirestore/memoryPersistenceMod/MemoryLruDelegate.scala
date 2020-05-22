package typingsSlinky.firebaseFirestore.memoryPersistenceMod

import typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.documentMod.MaybeDocument
import typingsSlinky.firebaseFirestore.lruGarbageCollectorMod.ActiveTargets
import typingsSlinky.firebaseFirestore.lruGarbageCollectorMod.LruDelegate
import typingsSlinky.firebaseFirestore.lruGarbageCollectorMod.LruGarbageCollector
import typingsSlinky.firebaseFirestore.lruGarbageCollectorMod.LruParams
import typingsSlinky.firebaseFirestore.persistenceMod.PersistenceTransaction
import typingsSlinky.firebaseFirestore.persistenceMod.ReferenceDelegate
import typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.targetDataMod.TargetData
import typingsSlinky.firebaseFirestore.typesMod.ListenSequenceNumber
import typingsSlinky.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/memory_persistence", "MemoryLruDelegate")
@js.native
class MemoryLruDelegate protected ()
  extends ReferenceDelegate
     with LruDelegate {
  def this(persistence: MemoryPersistence, lruParams: LruParams) = this()
  /* CompleteClass */
  override val garbageCollector: LruGarbageCollector = js.native
  var isPinned: js.Any = js.native
  var orphanedDocumentCount: js.Any = js.native
  var orphanedSequenceNumbers: js.Any = js.native
  val persistence: js.Any = js.native
  /** Notify the delegate that the given document was added to a target. */
  /* CompleteClass */
  override def addReference(txn: PersistenceTransaction, targetId: TargetId, doc: DocumentKey): PersistencePromise[Unit] = js.native
  def documentSize(maybeDoc: MaybeDocument): Double = js.native
  /**
    * Enumerates sequence numbers for documents not associated with a target.
    * Note that this may include duplicate sequence numbers.
    */
  /* CompleteClass */
  override def forEachOrphanedDocumentSequenceNumber(txn: PersistenceTransaction, f: js.Function1[/* sequenceNumber */ ListenSequenceNumber, Unit]): PersistencePromise[Unit] = js.native
  /** Enumerates all the targets in the TargetCache. */
  /* CompleteClass */
  override def forEachTarget(txn: PersistenceTransaction, f: js.Function1[/* target */ TargetData, Unit]): PersistencePromise[Unit] = js.native
  /* CompleteClass */
  override def getCacheSize(txn: PersistenceTransaction): PersistencePromise[Double] = js.native
  /* CompleteClass */
  override def getSequenceNumberCount(txn: PersistenceTransaction): PersistencePromise[Double] = js.native
  /**
    * Notify the delegate that a document may no longer be part of any views or
    * have any mutations associated.
    */
  /* CompleteClass */
  override def markPotentiallyOrphaned(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
  def onTransactionCommitted(txn: PersistenceTransaction): PersistencePromise[Unit] = js.native
  def onTransactionStarted(): Unit = js.native
  /**
    * Removes all unreferenced documents from the cache that have a sequence number less than or
    * equal to the given `upperBound`.
    *
    * @return the number of documents removed.
    */
  /* CompleteClass */
  override def removeOrphanedDocuments(txn: PersistenceTransaction, upperBound: ListenSequenceNumber): PersistencePromise[Double] = js.native
  /** Notify the delegate that the given document was removed from a target. */
  /* CompleteClass */
  override def removeReference(txn: PersistenceTransaction, targetId: TargetId, doc: DocumentKey): PersistencePromise[Unit] = js.native
  /**
    * Notify the delegate that a target was removed. The delegate may, but is not obligated to,
    * actually delete the target and associated data.
    */
  /* CompleteClass */
  override def removeTarget(txn: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit] = js.native
  /**
    * Removes all targets that have a sequence number less than or equal to `upperBound`, and are not
    * present in the `activeTargetIds` set.
    *
    * @return the number of targets removed.
    */
  /* CompleteClass */
  override def removeTargets(txn: PersistenceTransaction, upperBound: ListenSequenceNumber, activeTargetIds: ActiveTargets): PersistencePromise[Double] = js.native
  /** Notify the delegate that a limbo document was updated. */
  /* CompleteClass */
  override def updateLimboDocument(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
}

