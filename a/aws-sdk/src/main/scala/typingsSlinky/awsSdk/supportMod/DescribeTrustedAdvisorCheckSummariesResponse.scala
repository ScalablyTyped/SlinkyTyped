package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrustedAdvisorCheckSummariesResponse extends js.Object {
  /**
    * The summary information for the requested Trusted Advisor checks.
    */
  var summaries: TrustedAdvisorCheckSummaryList = js.native
}

object DescribeTrustedAdvisorCheckSummariesResponse {
  @scala.inline
  def apply(summaries: TrustedAdvisorCheckSummaryList): DescribeTrustedAdvisorCheckSummariesResponse = {
    val __obj = js.Dynamic.literal(summaries = summaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckSummariesResponse]
  }
  @scala.inline
  implicit class DescribeTrustedAdvisorCheckSummariesResponseOps[Self <: DescribeTrustedAdvisorCheckSummariesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSummaries(value: TrustedAdvisorCheckSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

