package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComplianceDetailResponse extends js.Object {
  /**
    * Information about the resources and the policy that you specified in the GetComplianceDetail request.
    */
  var PolicyComplianceDetail: js.UndefOr[typingsSlinky.awsSdk.fmsMod.PolicyComplianceDetail] = js.native
}

object GetComplianceDetailResponse {
  @scala.inline
  def apply(): GetComplianceDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceDetailResponse]
  }
  @scala.inline
  implicit class GetComplianceDetailResponseOps[Self <: GetComplianceDetailResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyComplianceDetail(value: PolicyComplianceDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyComplianceDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyComplianceDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyComplianceDetail")(js.undefined)
        ret
    }
  }
  
}

