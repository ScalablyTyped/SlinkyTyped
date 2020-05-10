package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingStatisticSummary extends js.Object {
  /**
    * The number of requests recorded with borrowed reservoir quota.
    */
  var BorrowCount: js.UndefOr[Integer] = js.native
  /**
    * The number of requests that matched the rule.
    */
  var RequestCount: js.UndefOr[Integer] = js.native
  /**
    * The name of the sampling rule.
    */
  var RuleName: js.UndefOr[String] = js.native
  /**
    * The number of requests recorded.
    */
  var SampledCount: js.UndefOr[Integer] = js.native
  /**
    * The start time of the reporting window.
    */
  var Timestamp: js.UndefOr[js.Date] = js.native
}

object SamplingStatisticSummary {
  @scala.inline
  def apply(): SamplingStatisticSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingStatisticSummary]
  }
  @scala.inline
  implicit class SamplingStatisticSummaryOps[Self <: SamplingStatisticSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorrowCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorrowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorrowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorrowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleName")(js.undefined)
        ret
    }
    @scala.inline
    def withSampledCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampledCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampledCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampledCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(js.undefined)
        ret
    }
  }
  
}

