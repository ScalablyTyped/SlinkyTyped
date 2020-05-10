package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrustedAdvisorCheckRefreshStatusesRequest extends js.Object {
  /**
    * The IDs of the Trusted Advisor checks to get the status of. Note: Specifying the check ID of a check that is automatically refreshed causes an InvalidParameterValue error.
    */
  var checkIds: StringList = js.native
}

object DescribeTrustedAdvisorCheckRefreshStatusesRequest {
  @scala.inline
  def apply(checkIds: StringList): DescribeTrustedAdvisorCheckRefreshStatusesRequest = {
    val __obj = js.Dynamic.literal(checkIds = checkIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckRefreshStatusesRequest]
  }
  @scala.inline
  implicit class DescribeTrustedAdvisorCheckRefreshStatusesRequestOps[Self <: DescribeTrustedAdvisorCheckRefreshStatusesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckIds(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

