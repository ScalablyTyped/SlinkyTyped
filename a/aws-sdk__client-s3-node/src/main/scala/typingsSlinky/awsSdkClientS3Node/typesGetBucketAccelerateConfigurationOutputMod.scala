package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Suspended
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketAccelerateConfigurationOutput", JSImport.Namespace)
@js.native
object typesGetBucketAccelerateConfigurationOutputMod extends js.Object {
  @js.native
  trait GetBucketAccelerateConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>The accelerate configuration of the bucket.</p>
      */
    var Status: js.UndefOr[Enabled | Suspended | String] = js.native
  }
  
}

