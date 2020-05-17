package typingsSlinky.awsSdkClientS3Browser.typesGetBucketLocationOutputMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.EU
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-northeast-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-south-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-southeast-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-southeast-2`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`cn-north-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`eu-central-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`eu-west-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`sa-east-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`us-west-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`us-west-2`
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketLocationOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * _BucketLocationConstraint shape
    */
  var LocationConstraint: js.UndefOr[
    EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String
  ] = js.native
}

object GetBucketLocationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketLocationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLocationOutput]
  }
  @scala.inline
  implicit class GetBucketLocationOutputOps[Self <: GetBucketLocationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocationConstraint(
      value: EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationConstraint")(js.undefined)
        ret
    }
  }
  
}

