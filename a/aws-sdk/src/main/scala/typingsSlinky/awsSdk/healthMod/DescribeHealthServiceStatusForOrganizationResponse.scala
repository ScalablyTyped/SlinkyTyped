package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHealthServiceStatusForOrganizationResponse extends js.Object {
  /**
    * Information about the status of enabling or disabling AWS Health Organizational View in your organization. Valid values are ENABLED | DISABLED | PENDING. 
    */
  var healthServiceAccessStatusForOrganization: js.UndefOr[typingsSlinky.awsSdk.healthMod.healthServiceAccessStatusForOrganization] = js.native
}

object DescribeHealthServiceStatusForOrganizationResponse {
  @scala.inline
  def apply(): DescribeHealthServiceStatusForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHealthServiceStatusForOrganizationResponse]
  }
  @scala.inline
  implicit class DescribeHealthServiceStatusForOrganizationResponseOps[Self <: DescribeHealthServiceStatusForOrganizationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthServiceAccessStatusForOrganization(value: healthServiceAccessStatusForOrganization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthServiceAccessStatusForOrganization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthServiceAccessStatusForOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthServiceAccessStatusForOrganization")(js.undefined)
        ret
    }
  }
  
}

