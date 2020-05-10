package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingRulesResult extends js.Object {
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Rule definitions and metadata.
    */
  var SamplingRuleRecords: js.UndefOr[SamplingRuleRecordList] = js.native
}

object GetSamplingRulesResult {
  @scala.inline
  def apply(): GetSamplingRulesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSamplingRulesResult]
  }
  @scala.inline
  implicit class GetSamplingRulesResultOps[Self <: GetSamplingRulesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSamplingRuleRecords(value: SamplingRuleRecordList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingRuleRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingRuleRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingRuleRecords")(js.undefined)
        ret
    }
  }
  
}

