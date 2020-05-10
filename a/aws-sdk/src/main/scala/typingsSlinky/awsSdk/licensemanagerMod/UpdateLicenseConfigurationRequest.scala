package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLicenseConfigurationRequest extends js.Object {
  /**
    * New description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: String = js.native
  /**
    * New status of the license configuration.
    */
  var LicenseConfigurationStatus: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.LicenseConfigurationStatus] = js.native
  /**
    * New number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.native
  /**
    * New hard limit of the number of available licenses.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.native
  /**
    * New license rules.
    */
  var LicenseRules: js.UndefOr[StringList] = js.native
  /**
    * New name of the license configuration.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * New product information.
    */
  var ProductInformationList: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.ProductInformationList] = js.native
}

object UpdateLicenseConfigurationRequest {
  @scala.inline
  def apply(LicenseConfigurationArn: String): UpdateLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLicenseConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateLicenseConfigurationRequestOps[Self <: UpdateLicenseConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLicenseConfigurationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseConfigurationStatus(value: LicenseConfigurationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseConfigurationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseConfigurationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseConfigurationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseCount(value: BoxLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseCountHardLimit(value: BoxBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseCountHardLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseCountHardLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseCountHardLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseRules(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseRules")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withProductInformationList(value: ProductInformationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductInformationList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductInformationList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductInformationList")(js.undefined)
        ret
    }
  }
  
}

