package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object indexeddbSchemaMod {
  type DbClientMetadataKey = java.lang.String
  type DbCollectionParentKey = js.Tuple2[
    java.lang.String, 
    typingsSlinky.firebaseFirestore.encodedResourcePathMod.EncodedResourcePath
  ]
  type DbDocumentMutationKey = js.Tuple3[
    java.lang.String, 
    typingsSlinky.firebaseFirestore.encodedResourcePathMod.EncodedResourcePath, 
    typingsSlinky.firebaseFirestore.typesMod.BatchId
  ]
  type DbMutationBatchKey = typingsSlinky.firebaseFirestore.typesMod.BatchId
  type DbMutationQueueKey = java.lang.String
  type DbPrimaryClientKey = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DbPrimaryClient.key */ js.Any
  type DbQuery = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.QueryTarget */ js.Any
  type DbRemoteDocumentGlobalKey = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DbRemoteDocumentGlobal.key */ js.Any
  type DbRemoteDocumentKey = js.Array[java.lang.String]
  type DbTargetDocumentKey = js.Tuple2[
    typingsSlinky.firebaseFirestore.typesMod.TargetId, 
    typingsSlinky.firebaseFirestore.encodedResourcePathMod.EncodedResourcePath
  ]
  type DbTargetGlobalKey = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DbTargetGlobal.key */ js.Any
  type DbTargetKey = typingsSlinky.firebaseFirestore.typesMod.TargetId
  type DbTimestampKey = js.Tuple2[/* seconds */ scala.Double, /* nanos */ scala.Double]
}
