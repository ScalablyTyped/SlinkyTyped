package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingTargetsResult extends js.Object {
  /**
    * The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since the service last retrieved it, the service should call GetSamplingRules to get the latest version.
    */
  var LastRuleModification: js.UndefOr[js.Date] = js.native
  /**
    * Updated rules that the service should use to sample requests.
    */
  var SamplingTargetDocuments: js.UndefOr[SamplingTargetDocumentList] = js.native
  /**
    * Information about SamplingStatisticsDocument that X-Ray could not process.
    */
  var UnprocessedStatistics: js.UndefOr[UnprocessedStatisticsList] = js.native
}

object GetSamplingTargetsResult {
  @scala.inline
  def apply(): GetSamplingTargetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSamplingTargetsResult]
  }
  @scala.inline
  implicit class GetSamplingTargetsResultOps[Self <: GetSamplingTargetsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastRuleModification(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRuleModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRuleModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRuleModification")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplingTargetDocuments(value: SamplingTargetDocumentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingTargetDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingTargetDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingTargetDocuments")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprocessedStatistics(value: UnprocessedStatisticsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedStatistics")(js.undefined)
        ret
    }
  }
  
}

