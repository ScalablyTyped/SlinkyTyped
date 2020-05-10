package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditionUpgradeConfiguration extends DeviceConfiguration {
  // Edition Upgrade License File Content.
  var license: js.UndefOr[String] = js.native
  // Edition Upgrade License Type. Possible values are: productKey, licenseFile.
  var licenseType: js.UndefOr[EditionUpgradeLicenseType] = js.native
  // Edition Upgrade Product Key.
  var productKey: js.UndefOr[String] = js.native
  /**
    * Edition Upgrade Target Edition. Possible values are: windows10Enterprise, windows10EnterpriseN, windows10Education,
    * windows10EducationN, windows10MobileEnterprise, windows10HolographicEnterprise, windows10Professional,
    * windows10ProfessionalN, windows10ProfessionalEducation, windows10ProfessionalEducationN,
    * windows10ProfessionalWorkstation, windows10ProfessionalWorkstationN.
    */
  var targetEdition: js.UndefOr[Windows10EditionType] = js.native
}

object EditionUpgradeConfiguration {
  @scala.inline
  def apply(): EditionUpgradeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditionUpgradeConfiguration]
  }
  @scala.inline
  implicit class EditionUpgradeConfigurationOps[Self <: EditionUpgradeConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLicense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseType(value: EditionUpgradeLicenseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseType")(js.undefined)
        ret
    }
    @scala.inline
    def withProductKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetEdition(value: Windows10EditionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetEdition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetEdition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetEdition")(js.undefined)
        ret
    }
  }
  
}

