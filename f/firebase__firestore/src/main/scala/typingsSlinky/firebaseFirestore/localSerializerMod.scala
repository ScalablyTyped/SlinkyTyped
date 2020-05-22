package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.documentMod.MaybeDocument
import typingsSlinky.firebaseFirestore.indexeddbSchemaMod.DbMutationBatch
import typingsSlinky.firebaseFirestore.indexeddbSchemaMod.DbRemoteDocument
import typingsSlinky.firebaseFirestore.indexeddbSchemaMod.DbTarget
import typingsSlinky.firebaseFirestore.indexeddbSchemaMod.DbTimestampKey
import typingsSlinky.firebaseFirestore.mutationBatchMod.MutationBatch
import typingsSlinky.firebaseFirestore.serializerMod.JsonProtoSerializer
import typingsSlinky.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import typingsSlinky.firebaseFirestore.targetDataMod.TargetData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/local_serializer", JSImport.Namespace)
@js.native
object localSerializerMod extends js.Object {
  @js.native
  class LocalSerializer protected () extends js.Object {
    def this(remoteSerializer: JsonProtoSerializer) = this()
    var fromDbTimestamp: js.Any = js.native
    var remoteSerializer: js.Any = js.native
    var toDbTimestamp: js.Any = js.native
    /** Decodes a DbMutationBatch into a MutationBatch */
    def fromDbMutationBatch(dbBatch: DbMutationBatch): MutationBatch = js.native
    /** Decodes a remote document from storage locally to a Document. */
    def fromDbRemoteDocument(remoteDoc: DbRemoteDocument): MaybeDocument = js.native
    /** Decodes a DbTarget into TargetData */
    def fromDbTarget(dbTarget: DbTarget): TargetData = js.native
    def fromDbTimestampKey(dbTimestampKey: DbTimestampKey): SnapshotVersion = js.native
    /** Encodes a batch of mutations into a DbMutationBatch for local storage. */
    def toDbMutationBatch(userId: String, batch: MutationBatch): DbMutationBatch = js.native
    /** Encodes a document for storage locally. */
    def toDbRemoteDocument(maybeDoc: MaybeDocument, readTime: SnapshotVersion): DbRemoteDocument = js.native
    /** Encodes TargetData into a DbTarget for storage locally. */
    def toDbTarget(targetData: TargetData): DbTarget = js.native
    def toDbTimestampKey(snapshotVersion: SnapshotVersion): DbTimestampKey = js.native
  }
  
}

