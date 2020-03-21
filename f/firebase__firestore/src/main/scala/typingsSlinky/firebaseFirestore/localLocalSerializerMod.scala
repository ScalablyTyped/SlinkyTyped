package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typingsSlinky.firebaseFirestore.localEncodedResourcePathMod.EncodedResourcePath
import typingsSlinky.firebaseFirestore.localIndexeddbSchemaMod.DbMutationBatch
import typingsSlinky.firebaseFirestore.localIndexeddbSchemaMod.DbRemoteDocument
import typingsSlinky.firebaseFirestore.localIndexeddbSchemaMod.DbTarget
import typingsSlinky.firebaseFirestore.localIndexeddbSchemaMod.DbTimestampKey
import typingsSlinky.firebaseFirestore.localTargetDataMod.TargetData
import typingsSlinky.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typingsSlinky.firebaseFirestore.modelDocumentMod.MaybeDocument
import typingsSlinky.firebaseFirestore.modelMutationBatchMod.MutationBatch
import typingsSlinky.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/local_serializer", JSImport.Namespace)
@js.native
object localLocalSerializerMod extends js.Object {
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
    /** Decodes an array of EncodedResourcePaths into a set of document keys. */
    def fromDbResourcePaths(encodedPaths: js.Array[EncodedResourcePath]): DocumentKeySet_ = js.native
    /** Decodes a DbTarget into TargetData */
    def fromDbTarget(dbTarget: DbTarget): TargetData = js.native
    def fromDbTimestampKey(dbTimestampKey: DbTimestampKey): SnapshotVersion = js.native
    /** Encodes a batch of mutations into a DbMutationBatch for local storage. */
    def toDbMutationBatch(userId: String, batch: MutationBatch): DbMutationBatch = js.native
    /** Encodes a document for storage locally. */
    def toDbRemoteDocument(maybeDoc: MaybeDocument, readTime: SnapshotVersion): DbRemoteDocument = js.native
    def toDbResourcePaths(keys: DocumentKeySet_): js.Array[EncodedResourcePath] = js.native
    /** Encodes TargetData into a DbTarget for storage locally. */
    def toDbTarget(targetData: TargetData): DbTarget = js.native
    def toDbTimestampKey(snapshotVersion: SnapshotVersion): DbTimestampKey = js.native
  }
  
}

