package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.anon.DontPurgeData
import typingsSlinky.firebaseFirestore.databaseInfoMod.DatabaseId
import typingsSlinky.firebaseFirestore.indexeddbPersistenceMod.IndexedDbPersistence
import typingsSlinky.firebaseFirestore.listenSequenceMod.SequenceNumberSyncer
import typingsSlinky.firebaseFirestore.localSerializerMod.LocalSerializer
import typingsSlinky.firebaseFirestore.lruGarbageCollectorMod.LruParams
import typingsSlinky.firebaseFirestore.memoryPersistenceMod.MemoryPersistence
import typingsSlinky.firebaseFirestore.sharedClientStateMod.ClientId
import typingsSlinky.firebaseFirestore.typesMod.BatchId
import typingsSlinky.firebaseFirestore.typesMod.TargetId
import typingsSlinky.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/unit/local/persistence_test_helpers", JSImport.Namespace)
@js.native
object persistenceTestHelpersMod extends js.Object {
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
  def testIndexedDbPersistence(options: DontPurgeData): js.Promise[IndexedDbPersistence] = js.native
  def testIndexedDbPersistence(options: DontPurgeData, lruParams: LruParams): js.Promise[IndexedDbPersistence] = js.native
  def testMemoryEagerPersistence(): js.Promise[MemoryPersistence] = js.native
  def testMemoryLruPersistence(): js.Promise[MemoryPersistence] = js.native
  def testMemoryLruPersistence(params: LruParams): js.Promise[MemoryPersistence] = js.native
}

