package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MicrosoftStoreForBusinessApp extends MobileApp {
  // The app license type. Possible values are: offline, online.
  var licenseType: js.UndefOr[MicrosoftStoreForBusinessLicenseType] = js.native
  // The app package identifier
  var packageIdentityName: js.UndefOr[String] = js.native
  // The app product key
  var productKey: js.UndefOr[String] = js.native
  // The total number of Microsoft Store for Business licenses.
  var totalLicenseCount: js.UndefOr[Double] = js.native
  // The number of Microsoft Store for Business licenses in use.
  var usedLicenseCount: js.UndefOr[Double] = js.native
}

object MicrosoftStoreForBusinessApp {
  @scala.inline
  def apply(): MicrosoftStoreForBusinessApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrosoftStoreForBusinessApp]
  }
  @scala.inline
  implicit class MicrosoftStoreForBusinessAppOps[Self <: MicrosoftStoreForBusinessApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLicenseType(value: MicrosoftStoreForBusinessLicenseType): Self = {
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
    def withPackageIdentityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageIdentityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageIdentityName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageIdentityName")(js.undefined)
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
    def withTotalLicenseCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalLicenseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalLicenseCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalLicenseCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUsedLicenseCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedLicenseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsedLicenseCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedLicenseCount")(js.undefined)
        ret
    }
  }
  
}

