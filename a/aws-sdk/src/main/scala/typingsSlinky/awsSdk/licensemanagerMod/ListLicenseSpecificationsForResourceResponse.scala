package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLicenseSpecificationsForResourceResponse extends js.Object {
  /**
    * License configurations associated with a resource.
    */
  var LicenseSpecifications: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.LicenseSpecifications] = js.native
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListLicenseSpecificationsForResourceResponse {
  @scala.inline
  def apply(): ListLicenseSpecificationsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLicenseSpecificationsForResourceResponse]
  }
  @scala.inline
  implicit class ListLicenseSpecificationsForResourceResponseOps[Self <: ListLicenseSpecificationsForResourceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLicenseSpecifications(value: LicenseSpecifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseSpecifications")(js.undefined)
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

