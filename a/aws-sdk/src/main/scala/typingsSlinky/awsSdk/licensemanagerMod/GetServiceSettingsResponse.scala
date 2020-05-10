package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceSettingsResponse extends js.Object {
  /**
    * Indicates whether cross-account discovery has been enabled.
    */
  var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.native
  /**
    * Amazon Resource Name (ARN) of the AWS resource share. The License Manager master account will provide member accounts with access to this share.
    */
  var LicenseManagerResourceShareArn: js.UndefOr[String] = js.native
  /**
    * Indicates whether AWS Organizations has been integrated with License Manager for cross-account discovery.
    */
  var OrganizationConfiguration: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.OrganizationConfiguration] = js.native
  /**
    * Regional S3 bucket path for storing reports, license trail event data, discovery data, and so on.
    */
  var S3BucketArn: js.UndefOr[String] = js.native
  /**
    * SNS topic configured to receive notifications from License Manager.
    */
  var SnsTopicArn: js.UndefOr[String] = js.native
}

object GetServiceSettingsResponse {
  @scala.inline
  def apply(): GetServiceSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceSettingsResponse]
  }
  @scala.inline
  implicit class GetServiceSettingsResponseOps[Self <: GetServiceSettingsResponse] (val x: Self) extends AnyVal {
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
    def withLicenseManagerResourceShareArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseManagerResourceShareArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseManagerResourceShareArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseManagerResourceShareArn")(js.undefined)
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

