package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketPolicyOutput", JSImport.Namespace)
@js.native
object typesGetBucketPolicyOutputMod extends js.Object {
  @js.native
  trait GetBucketPolicyOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>The bucket policy as a JSON document.</p>
      */
    var Policy: js.UndefOr[String] = js.native
  }
  
}

