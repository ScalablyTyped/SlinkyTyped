package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUsageForLicenseConfigurationResponse extends js.Object {
  /**
    * Information about the license configurations.
    */
  var LicenseConfigurationUsageList: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.LicenseConfigurationUsageList] = js.native
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListUsageForLicenseConfigurationResponse {
  @scala.inline
  def apply(): ListUsageForLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsageForLicenseConfigurationResponse]
  }
  @scala.inline
  implicit class ListUsageForLicenseConfigurationResponseOps[Self <: ListUsageForLicenseConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLicenseConfigurationUsageList(value: LicenseConfigurationUsageList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseConfigurationUsageList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseConfigurationUsageList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseConfigurationUsageList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

