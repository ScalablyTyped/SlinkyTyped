package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/PutObjectTaggingOutput", JSImport.Namespace)
@js.native
object typesPutObjectTaggingOutputMod extends js.Object {
  @js.native
  trait PutObjectTaggingOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _ObjectVersionId shape
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  
}

