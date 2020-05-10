package typingsSlinky.awsSdkClientXrayNode.typesSamplingStatisticSummaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingStatisticSummary extends js.Object {
  /**
    * <p>The number of requests recorded with borrowed reservoir quota.</p>
    */
  var BorrowCount: js.UndefOr[Double] = js.native
  /**
    * <p>The number of requests that matched the rule.</p>
    */
  var RequestCount: js.UndefOr[Double] = js.native
  /**
    * <p>The name of the sampling rule.</p>
    */
  var RuleName: js.UndefOr[String] = js.native
  /**
    * <p>The number of requests recorded.</p>
    */
  var SampledCount: js.UndefOr[Double] = js.native
  /**
    * <p>The start time of the reporting window.</p>
    */
  var Timestamp: js.UndefOr[js.Date | String | Double] = js.native
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
    def withBorrowCount(value: Double): Self = {
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
    def withRequestCount(value: Double): Self = {
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
    def withSampledCount(value: Double): Self = {
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
    def withTimestampDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date | String | Double): Self = {
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

