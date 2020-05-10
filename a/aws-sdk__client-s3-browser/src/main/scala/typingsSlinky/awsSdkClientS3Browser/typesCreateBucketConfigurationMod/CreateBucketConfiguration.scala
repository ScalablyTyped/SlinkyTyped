package typingsSlinky.awsSdkClientS3Browser.typesCreateBucketConfigurationMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBucketConfiguration extends js.Object {
  /**
    * <p>Specifies the region where the bucket will be created. If you don't specify a region, the bucket will be created in US Standard.</p>
    */
  var LocationConstraint: js.UndefOr[
    EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String
  ] = js.native
}

object CreateBucketConfiguration {
  @scala.inline
  def apply(): CreateBucketConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketConfiguration]
  }
  @scala.inline
  implicit class CreateBucketConfigurationOps[Self <: CreateBucketConfiguration] (val x: Self) extends AnyVal {
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

