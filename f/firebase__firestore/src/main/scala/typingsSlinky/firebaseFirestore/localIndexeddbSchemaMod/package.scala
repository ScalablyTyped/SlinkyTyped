package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object localIndexeddbSchemaMod {
  type DbClientMetadataKey = java.lang.String
  type DbCollectionParentKey = js.Tuple2[
    java.lang.String, 
    typingsSlinky.firebaseFirestore.localEncodedResourcePathMod.EncodedResourcePath
  ]
  type DbDocumentMutationKey = js.Tuple3[
    java.lang.String, 
    typingsSlinky.firebaseFirestore.localEncodedResourcePathMod.EncodedResourcePath, 
    typingsSlinky.firebaseFirestore.coreTypesMod.BatchId
  ]
  type DbMutationBatchKey = typingsSlinky.firebaseFirestore.coreTypesMod.BatchId
  type DbMutationQueueKey = java.lang.String
  type DbPrimaryClientKey = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DbPrimaryClient.key */ js.Any
  type DbQuery = typingsSlinky.firebaseFirestore.firestoreProtoApiMod.QueryTarget | typingsSlinky.firebaseFirestore.firestoreProtoApiMod.DocumentsTarget
  type DbRemoteDocumentGlobalKey = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DbRemoteDocumentGlobal.key */ js.Any
  type DbRemoteDocumentKey = js.Array[java.lang.String]
  type DbTargetDocumentKey = js.Tuple2[
    typingsSlinky.firebaseFirestore.coreTypesMod.TargetId, 
    typingsSlinky.firebaseFirestore.localEncodedResourcePathMod.EncodedResourcePath
  ]
  type DbTargetGlobalKey = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DbTargetGlobal.key */ js.Any
  type DbTargetKey = typingsSlinky.firebaseFirestore.coreTypesMod.TargetId
  type DbTimestampKey = js.Tuple2[/* seconds */ scala.Double, /* nanos */ scala.Double]
}
