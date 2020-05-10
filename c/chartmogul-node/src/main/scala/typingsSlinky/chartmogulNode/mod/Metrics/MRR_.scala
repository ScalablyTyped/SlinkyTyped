package typingsSlinky.chartmogulNode.mod.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MRR_ extends js.Object {
  var date: String = js.native
  var mrr: Double = js.native
  var `mrr-churn`: Double = js.native
  var `mrr-contraction`: Double = js.native
  var `mrr-expansion`: Double = js.native
  var `mrr-new-business`: Double = js.native
  var `mrr-reactivation`: Double = js.native
}

object MRR_ {
  @scala.inline
  def apply(
    date: String,
    mrr: Double,
    `mrr-churn`: Double,
    `mrr-contraction`: Double,
    `mrr-expansion`: Double,
    `mrr-new-business`: Double,
    `mrr-reactivation`: Double
  ): MRR_ = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], mrr = mrr.asInstanceOf[js.Any])
    __obj.updateDynamic("mrr-churn")(`mrr-churn`.asInstanceOf[js.Any])
    __obj.updateDynamic("mrr-contraction")(`mrr-contraction`.asInstanceOf[js.Any])
    __obj.updateDynamic("mrr-expansion")(`mrr-expansion`.asInstanceOf[js.Any])
    __obj.updateDynamic("mrr-new-business")(`mrr-new-business`.asInstanceOf[js.Any])
    __obj.updateDynamic("mrr-reactivation")(`mrr-reactivation`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRR_]
  }
  @scala.inline
  implicit class MRR_Ops[Self <: MRR_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMrr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mrr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMrr-churn`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mrr-churn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMrr-contraction`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mrr-contraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMrr-expansion`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mrr-expansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMrr-new-business`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mrr-new-business")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMrr-reactivation`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mrr-reactivation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

