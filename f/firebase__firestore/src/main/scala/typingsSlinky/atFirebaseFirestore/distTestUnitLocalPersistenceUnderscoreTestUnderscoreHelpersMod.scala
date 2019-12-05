package typingsSlinky.atFirebaseFirestore

import typingsSlinky.atFirebaseFirestore.distSrcAuthUserMod.User
import typingsSlinky.atFirebaseFirestore.distSrcCoreDatabaseUnderscoreInfoMod.DatabaseId
import typingsSlinky.atFirebaseFirestore.distSrcCoreListenUnderscoreSequenceMod.SequenceNumberSyncer
import typingsSlinky.atFirebaseFirestore.distSrcCoreTypesMod.BatchId
import typingsSlinky.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
import typingsSlinky.atFirebaseFirestore.distSrcLocalIndexeddbUnderscorePersistenceMod.IndexedDbPersistence
import typingsSlinky.atFirebaseFirestore.distSrcLocalLocalUnderscoreSerializerMod.LocalSerializer
import typingsSlinky.atFirebaseFirestore.distSrcLocalLruUnderscoreGarbageUnderscoreCollectorMod.LruParams
import typingsSlinky.atFirebaseFirestore.distSrcLocalMemoryUnderscorePersistenceMod.MemoryPersistence
import typingsSlinky.atFirebaseFirestore.distSrcLocalSharedUnderscoreClientUnderscoreStateMod.ClientId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/local/persistence_test_helpers", JSImport.Namespace)
@js.native
object distTestUnitLocalPersistenceUnderscoreTestUnderscoreHelpersMod extends js.Object {
  val INDEXEDDB_TEST_DATABASE_NAME: String = js.native
  val MOCK_SEQUENCE_NUMBER_SYNCER: SequenceNumberSyncer = js.native
  val TEST_DATABASE_ID: DatabaseId = js.native
  val TEST_PERSISTENCE_PREFIX: String = js.native
  val TEST_SERIALIZER: LocalSerializer = js.native
  def clearTestPersistence(): js.Promise[Unit] = js.native
  def clearWebStorage(): Unit = js.native
  def populateWebStorage(
    user: User,
    existingClientId: ClientId,
    existingMutationBatchIds: js.Array[BatchId],
    existingQueryTargetIds: js.Array[TargetId]
  ): js.Promise[Unit] = js.native
  def testIndexedDbPersistence(): js.Promise[IndexedDbPersistence] = js.native
  def testIndexedDbPersistence(options: Anon_DontPurgeData): js.Promise[IndexedDbPersistence] = js.native
  def testIndexedDbPersistence(options: Anon_DontPurgeData, lruParams: LruParams): js.Promise[IndexedDbPersistence] = js.native
  def testMemoryEagerPersistence(): js.Promise[MemoryPersistence] = js.native
  def testMemoryLruPersistence(): js.Promise[MemoryPersistence] = js.native
  def testMemoryLruPersistence(params: LruParams): js.Promise[MemoryPersistence] = js.native
}

