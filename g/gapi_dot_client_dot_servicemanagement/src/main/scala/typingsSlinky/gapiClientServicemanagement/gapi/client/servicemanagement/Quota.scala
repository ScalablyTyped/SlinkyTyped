package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quota extends js.Object {
  /** List of `QuotaLimit` definitions for the service. */
  var limits: js.UndefOr[js.Array[QuotaLimit]] = js.native
  /**
    * List of `MetricRule` definitions, each one mapping a selected method to one
    * or more metrics.
    */
  var metricRules: js.UndefOr[js.Array[MetricRule]] = js.native
}

object Quota {
  @scala.inline
  def apply(): Quota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quota]
  }
  @scala.inline
  implicit class QuotaOps[Self <: Quota] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimits(value: js.Array[QuotaLimit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limits")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricRules(value: js.Array[MetricRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricRules")(js.undefined)
        ret
    }
  }
  
}

