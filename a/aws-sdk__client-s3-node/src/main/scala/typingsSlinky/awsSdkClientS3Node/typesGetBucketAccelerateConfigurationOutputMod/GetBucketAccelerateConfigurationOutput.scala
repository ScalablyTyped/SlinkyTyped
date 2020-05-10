package typingsSlinky.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Suspended
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketAccelerateConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>The accelerate configuration of the bucket.</p>
    */
  var Status: js.UndefOr[Enabled | Suspended | String] = js.native
}

object GetBucketAccelerateConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketAccelerateConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketAccelerateConfigurationOutput]
  }
  @scala.inline
  implicit class GetBucketAccelerateConfigurationOutputOps[Self <: GetBucketAccelerateConfigurationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: Enabled | Suspended | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

