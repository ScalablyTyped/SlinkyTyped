package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.anon.Queue
import typingsSlinky.firebaseFirestore.authUserMod.User
import typingsSlinky.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typingsSlinky.firebaseFirestore.coreListenSequenceMod.SequenceNumberSyncer
import typingsSlinky.firebaseFirestore.coreTypesMod.BatchId
import typingsSlinky.firebaseFirestore.coreTypesMod.TargetId
import typingsSlinky.firebaseFirestore.localIndexeddbPersistenceMod.IndexedDbPersistence
import typingsSlinky.firebaseFirestore.localLocalSerializerMod.LocalSerializer
import typingsSlinky.firebaseFirestore.localLruGarbageCollectorMod.LruParams
import typingsSlinky.firebaseFirestore.localMemoryPersistenceMod.MemoryPersistence
import typingsSlinky.firebaseFirestore.localSharedClientStateMod.ClientId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/local/persistence_test_helpers", JSImport.Namespace)
@js.native
object localPersistenceTestHelpersMod extends js.Object {
  val INDEXEDDB_TEST_DATABASE_NAME: String = js.native
  val MOCK_SEQUENCE_NUMBER_SYNCER: SequenceNumberSyncer = js.native
  val TEST_DATABASE_ID: DatabaseId = js.native
  val TEST_PERSISTENCE_KEY: /* "[PersistenceTestHelpers]" */ String = js.native
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
  def testIndexedDbPersistence(options: Queue): js.Promise[IndexedDbPersistence] = js.native
  def testIndexedDbPersistence(options: Queue, lruParams: LruParams): js.Promise[IndexedDbPersistence] = js.native
  def testMemoryEagerPersistence(): js.Promise[MemoryPersistence] = js.native
  def testMemoryLruPersistence(): js.Promise[MemoryPersistence] = js.native
  def testMemoryLruPersistence(params: LruParams): js.Promise[MemoryPersistence] = js.native
}

