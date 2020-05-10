package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrustedAdvisorCheckSummariesRequest extends js.Object {
  /**
    * The IDs of the Trusted Advisor checks.
    */
  var checkIds: StringList = js.native
}

object DescribeTrustedAdvisorCheckSummariesRequest {
  @scala.inline
  def apply(checkIds: StringList): DescribeTrustedAdvisorCheckSummariesRequest = {
    val __obj = js.Dynamic.literal(checkIds = checkIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckSummariesRequest]
  }
  @scala.inline
  implicit class DescribeTrustedAdvisorCheckSummariesRequestOps[Self <: DescribeTrustedAdvisorCheckSummariesRequest] (val x: Self) extends AnyVal {
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

