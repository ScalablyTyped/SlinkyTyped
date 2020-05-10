package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshTrustedAdvisorCheckRequest extends js.Object {
  /**
    * The unique identifier for the Trusted Advisor check to refresh. Note: Specifying the check ID of a check that is automatically refreshed causes an InvalidParameterValue error.
    */
  var checkId: String = js.native
}

object RefreshTrustedAdvisorCheckRequest {
  @scala.inline
  def apply(checkId: String): RefreshTrustedAdvisorCheckRequest = {
    val __obj = js.Dynamic.literal(checkId = checkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTrustedAdvisorCheckRequest]
  }
  @scala.inline
  implicit class RefreshTrustedAdvisorCheckRequestOps[Self <: RefreshTrustedAdvisorCheckRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

