package typingsSlinky.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveyCost extends js.Object {
  var costPerResponseNanos: js.UndefOr[String] = js.native
  var currencyCode: js.UndefOr[String] = js.native
  var maxCostPerResponseNanos: js.UndefOr[String] = js.native
  var nanos: js.UndefOr[String] = js.native
}

object SurveyCost {
  @scala.inline
  def apply(): SurveyCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurveyCost]
  }
  @scala.inline
  implicit class SurveyCostOps[Self <: SurveyCost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCostPerResponseNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costPerResponseNanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCostPerResponseNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costPerResponseNanos")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCostPerResponseNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCostPerResponseNanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCostPerResponseNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCostPerResponseNanos")(js.undefined)
        ret
    }
    @scala.inline
    def withNanos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNanos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanos")(js.undefined)
        ret
    }
  }
  
}

