package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceSettingsRequest extends js.Object {
  /**
    * Activates cross-account discovery.
    */
  var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.native
  /**
    * Enables integration with AWS Organizations for cross-account discovery.
    */
  var OrganizationConfiguration: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.OrganizationConfiguration] = js.native
  /**
    * Amazon Resource Name (ARN) of the Amazon S3 bucket where the License Manager information is stored.
    */
  var S3BucketArn: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the Amazon SNS topic used for License Manager alerts.
    */
  var SnsTopicArn: js.UndefOr[String] = js.native
}

object UpdateServiceSettingsRequest {
  @scala.inline
  def apply(): UpdateServiceSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServiceSettingsRequest]
  }
  @scala.inline
  implicit class UpdateServiceSettingsRequestOps[Self <: UpdateServiceSettingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableCrossAccountsDiscovery(value: BoxBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableCrossAccountsDiscovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCrossAccountsDiscovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableCrossAccountsDiscovery")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationConfiguration(value: OrganizationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BucketArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BucketArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BucketArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BucketArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSnsTopicArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopicArn")(js.undefined)
        ret
    }
  }
  
}

