package typingsSlinky.atFirebaseFirestore

import typingsSlinky.atFirebaseFirestore.distSrcCoreQueryMod.Query
import typingsSlinky.atFirebaseFirestore.distSrcCoreTypesMod.BatchId
import typingsSlinky.atFirebaseFirestore.distSrcCoreTypesMod.ProtoByteString
import typingsSlinky.atFirebaseFirestore.distSrcLocalMutationUnderscoreQueueMod.MutationQueue
import typingsSlinky.atFirebaseFirestore.distSrcLocalPersistenceMod.Persistence
import typingsSlinky.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentKeySet
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import typingsSlinky.atFirebaseFirestore.distSrcModelMutationMod.Mutation
import typingsSlinky.atFirebaseFirestore.distSrcModelMutationUnderscoreBatchMod.MutationBatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/local/test_mutation_queue", JSImport.Namespace)
@js.native
object distTestUnitLocalTestUnderscoreMutationUnderscoreQueueMod extends js.Object {
  @js.native
  class TestMutationQueue protected () extends js.Object {
    def this(persistence: Persistence, queue: MutationQueue) = this()
    var persistence: Persistence = js.native
    var queue: MutationQueue = js.native
    def acknowledgeBatch(batch: MutationBatch, streamToken: ProtoByteString): js.Promise[Unit] = js.native
    def addMutationBatch(mutations: js.Array[Mutation]): js.Promise[MutationBatch] = js.native
    def checkEmpty(): js.Promise[Boolean] = js.native
    def countBatches(): js.Promise[Double] = js.native
    def getAllMutationBatches(): js.Promise[js.Array[MutationBatch]] = js.native
    def getAllMutationBatchesAffectingDocumentKey(documentKey: DocumentKey): js.Promise[js.Array[MutationBatch]] = js.native
    def getAllMutationBatchesAffectingDocumentKeys(documentKeys: DocumentKeySet): js.Promise[js.Array[MutationBatch]] = js.native
    def getAllMutationBatchesAffectingQuery(query: Query): js.Promise[js.Array[MutationBatch]] = js.native
    def getLastStreamToken(): js.Promise[String] = js.native
    def getNextMutationBatchAfterBatchId(batchId: BatchId): js.Promise[MutationBatch | Null] = js.native
    def lookupMutationBatch(batchId: BatchId): js.Promise[MutationBatch | Null] = js.native
    def removeMutationBatch(batch: MutationBatch): js.Promise[Unit] = js.native
    def setLastStreamToken(streamToken: String): js.Promise[Unit] = js.native
  }
  
}

