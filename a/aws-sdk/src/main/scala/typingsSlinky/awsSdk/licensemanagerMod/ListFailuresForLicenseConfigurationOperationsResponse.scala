package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFailuresForLicenseConfigurationOperationsResponse extends js.Object {
  /**
    * License configuration operations that failed.
    */
  var LicenseOperationFailureList: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.LicenseOperationFailureList] = js.native
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListFailuresForLicenseConfigurationOperationsResponse {
  @scala.inline
  def apply(): ListFailuresForLicenseConfigurationOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFailuresForLicenseConfigurationOperationsResponse]
  }
  @scala.inline
  implicit class ListFailuresForLicenseConfigurationOperationsResponseOps[Self <: ListFailuresForLicenseConfigurationOperationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLicenseOperationFailureList(value: LicenseOperationFailureList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseOperationFailureList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseOperationFailureList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseOperationFailureList")(js.undefined)
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

