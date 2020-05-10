package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosVppApp extends MobileApp {
  // The store URL.
  var appStoreUrl: js.UndefOr[String] = js.native
  // The applicable iOS Device Type.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.native
  // The Identity Name.
  var bundleId: js.UndefOr[String] = js.native
  // The supported License Type.
  var licensingType: js.UndefOr[VppLicensingType] = js.native
  // The VPP application release date and time.
  var releaseDateTime: js.UndefOr[String] = js.native
  // The total number of VPP licenses.
  var totalLicenseCount: js.UndefOr[Double] = js.native
  // The number of VPP licenses in use.
  var usedLicenseCount: js.UndefOr[Double] = js.native
  /**
    * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible
    * values are: business, education. Possible values are: business, education.
    */
  var vppTokenAccountType: js.UndefOr[VppTokenAccountType] = js.native
  // The Apple Id associated with the given Apple Volume Purchase Program Token.
  var vppTokenAppleId: js.UndefOr[String] = js.native
  // The organization associated with the Apple Volume Purchase Program Token
  var vppTokenOrganizationName: js.UndefOr[String] = js.native
}

object IosVppApp {
  @scala.inline
  def apply(): IosVppApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosVppApp]
  }
  @scala.inline
  implicit class IosVppAppOps[Self <: IosVppApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppStoreUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppStoreUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicableDeviceType(value: IosDeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicableDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicableDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicableDeviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withLicensingType(value: VppLicensingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicensingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensingType")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDateTime")(js.undefined)
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
    @scala.inline
    def withVppTokenAccountType(value: VppTokenAccountType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vppTokenAccountType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVppTokenAccountType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vppTokenAccountType")(js.undefined)
        ret
    }
    @scala.inline
    def withVppTokenAppleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vppTokenAppleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVppTokenAppleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vppTokenAppleId")(js.undefined)
        ret
    }
    @scala.inline
    def withVppTokenOrganizationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vppTokenOrganizationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVppTokenOrganizationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vppTokenOrganizationName")(js.undefined)
        ret
    }
  }
  
}

