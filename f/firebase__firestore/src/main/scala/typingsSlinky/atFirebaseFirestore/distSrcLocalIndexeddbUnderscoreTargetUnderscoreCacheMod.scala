package typingsSlinky.atFirebaseFirestore

import typingsSlinky.atFirebaseFirestore.distSrcCoreTypesMod.ListenSequenceNumber
import typingsSlinky.atFirebaseFirestore.distSrcLocalIndexeddbUnderscorePersistenceMod.IndexedDbLruDelegate
import typingsSlinky.atFirebaseFirestore.distSrcLocalIndexeddbUnderscoreSchemaMod.DbTargetDocument
import typingsSlinky.atFirebaseFirestore.distSrcLocalIndexeddbUnderscoreSchemaMod.DbTargetDocumentKey
import typingsSlinky.atFirebaseFirestore.distSrcLocalLocalUnderscoreSerializerMod.LocalSerializer
import typingsSlinky.atFirebaseFirestore.distSrcLocalLruUnderscoreGarbageUnderscoreCollectorMod.ActiveTargets
import typingsSlinky.atFirebaseFirestore.distSrcLocalPersistenceMod.PersistenceTransaction
import typingsSlinky.atFirebaseFirestore.distSrcLocalPersistenceUnderscorePromiseMod.PersistencePromise
import typingsSlinky.atFirebaseFirestore.distSrcLocalSimpleUnderscoreDbMod.SimpleDbStore
import typingsSlinky.atFirebaseFirestore.distSrcLocalSimpleUnderscoreDbMod.SimpleDbTransaction
import typingsSlinky.atFirebaseFirestore.distSrcLocalTargetUnderscoreCacheMod.TargetCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/indexeddb_target_cache", JSImport.Namespace)
@js.native
object distSrcLocalIndexeddbUnderscoreTargetUnderscoreCacheMod extends js.Object {
  @js.native
  class IndexedDbTargetCache protected () extends TargetCache {
    def this(referenceDelegate: IndexedDbLruDelegate, serializer: LocalSerializer) = this()
    val referenceDelegate: js.Any = js.native
    var retrieveMetadata: js.Any = js.native
    var saveMetadata: js.Any = js.native
    var saveTargetData: js.Any = js.native
    var serializer: js.Any = js.native
    var targetIdGenerator: js.Any = js.native
    /**
      * In-place updates the provided metadata to account for values in the given
      * TargetData. Saving is done separately. Returns true if there were any
      * changes to the metadata.
      */
    var updateMetadataFromTargetData: js.Any = js.native
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

