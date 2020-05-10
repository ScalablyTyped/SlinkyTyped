package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsUniversalAppX extends MobileLobApp {
  // The Windows architecture(s) for which this app can run on. Possible values are: none, x86, x64, arm, neutral.
  var applicableArchitectures: js.UndefOr[WindowsArchitecture] = js.native
  /**
    * The Windows device type(s) for which this app can run on. Possible values are: none, desktop, mobile, holographic,
    * team.
    */
  var applicableDeviceTypes: js.UndefOr[WindowsDeviceType] = js.native
  // The Identity Name.
  var identityName: js.UndefOr[String] = js.native
  // The Identity Publisher Hash.
  var identityPublisherHash: js.UndefOr[String] = js.native
  // The Identity Resource Identifier.
  var identityResourceIdentifier: js.UndefOr[String] = js.native
  // The identity version.
  var identityVersion: js.UndefOr[String] = js.native
  // Whether or not the app is a bundle.
  var isBundle: js.UndefOr[Boolean] = js.native
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[WindowsMinimumOperatingSystem] = js.native
}

object WindowsUniversalAppX {
  @scala.inline
  def apply(): WindowsUniversalAppX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUniversalAppX]
  }
  @scala.inline
  implicit class WindowsUniversalAppXOps[Self <: WindowsUniversalAppX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicableArchitectures(value: WindowsArchitecture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicableArchitectures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicableArchitectures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicableArchitectures")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicableDeviceTypes(value: WindowsDeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicableDeviceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicableDeviceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicableDeviceTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityName")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityPublisherHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityPublisherHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityPublisherHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityPublisherHash")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityResourceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityResourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityResourceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityResourceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBundle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBundle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBundle")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumSupportedOperatingSystem(value: WindowsMinimumOperatingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSupportedOperatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumSupportedOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSupportedOperatingSystem")(js.undefined)
        ret
    }
  }
  
}

