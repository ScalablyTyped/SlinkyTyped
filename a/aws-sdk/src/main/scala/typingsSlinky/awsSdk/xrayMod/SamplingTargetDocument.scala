package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingTargetDocument extends js.Object {
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  var FixedRate: js.UndefOr[Double] = js.native
  /**
    * The number of seconds for the service to wait before getting sampling targets again.
    */
  var Interval: js.UndefOr[NullableInteger] = js.native
  /**
    * The number of requests per second that X-Ray allocated this service.
    */
  var ReservoirQuota: js.UndefOr[NullableInteger] = js.native
  /**
    * When the reservoir quota expires.
    */
  var ReservoirQuotaTTL: js.UndefOr[js.Date] = js.native
  /**
    * The name of the sampling rule.
    */
  var RuleName: js.UndefOr[String] = js.native
}

object SamplingTargetDocument {
  @scala.inline
  def apply(): SamplingTargetDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingTargetDocument]
  }
  @scala.inline
  implicit class SamplingTargetDocumentOps[Self <: SamplingTargetDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixedRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedRate")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interval")(js.undefined)
        ret
    }
    @scala.inline
    def withReservoirQuota(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservoirQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservoirQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservoirQuota")(js.undefined)
        ret
    }
    @scala.inline
    def withReservoirQuotaTTL(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservoirQuotaTTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservoirQuotaTTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservoirQuotaTTL")(js.undefined)
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
  }
  
}

