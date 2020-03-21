package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.coreQueryMod.Query
import typingsSlinky.firebaseFirestore.coreTypesMod.BatchId
import typingsSlinky.firebaseFirestore.coreTypesMod.ProtoByteString
import typingsSlinky.firebaseFirestore.localMutationQueueMod.MutationQueue
import typingsSlinky.firebaseFirestore.localPersistenceMod.Persistence
import typingsSlinky.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.modelMutationBatchMod.MutationBatch
import typingsSlinky.firebaseFirestore.modelMutationMod.Mutation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/local/test_mutation_queue", JSImport.Namespace)
@js.native
object localTestMutationQueueMod extends js.Object {
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
    def getAllMutationBatchesAffectingDocumentKeys(documentKeys: DocumentKeySet_): js.Promise[js.Array[MutationBatch]] = js.native
    def getAllMutationBatchesAffectingQuery(query: Query): js.Promise[js.Array[MutationBatch]] = js.native
    def getLastStreamToken(): js.Promise[String] = js.native
    def getNextMutationBatchAfterBatchId(batchId: BatchId): js.Promise[MutationBatch | Null] = js.native
    def lookupMutationBatch(batchId: BatchId): js.Promise[MutationBatch | Null] = js.native
    def removeMutationBatch(batch: MutationBatch): js.Promise[Unit] = js.native
    def setLastStreamToken(streamToken: String): js.Promise[Unit] = js.native
  }
  
}

