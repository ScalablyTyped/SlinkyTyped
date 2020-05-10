package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFailuresForLicenseConfigurationOperationsRequest extends js.Object {
  /**
    * Amazon Resource Name of the license configuration.
    */
  var LicenseConfigurationArn: String = js.native
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.native
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListFailuresForLicenseConfigurationOperationsRequest {
  @scala.inline
  def apply(LicenseConfigurationArn: String): ListFailuresForLicenseConfigurationOperationsRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFailuresForLicenseConfigurationOperationsRequest]
  }
  @scala.inline
  implicit class ListFailuresForLicenseConfigurationOperationsRequestOps[Self <: ListFailuresForLicenseConfigurationOperationsRequest] (val x: Self) extends AnyVal {
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
    def withMaxResults(value: BoxInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
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

