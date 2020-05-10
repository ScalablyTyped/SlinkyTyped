package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateOrganizationsAccessReportResponse extends js.Object {
  /**
    * The job identifier that you can use in the GetOrganizationsAccessReport operation.
    */
  var JobId: js.UndefOr[jobIDType] = js.native
}

object GenerateOrganizationsAccessReportResponse {
  @scala.inline
  def apply(): GenerateOrganizationsAccessReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateOrganizationsAccessReportResponse]
  }
  @scala.inline
  implicit class GenerateOrganizationsAccessReportResponseOps[Self <: GenerateOrganizationsAccessReportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: jobIDType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(js.undefined)
        ret
    }
  }
  
}

