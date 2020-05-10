package typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricRule extends js.Object {
  /**
    * Metrics to update when the selected methods are called, and the associated
    * cost applied to each metric.
    *
    * The key of the map is the metric name, and the values are the amount
    * increased for the metric against which the quota limits are defined.
    * The value must not be negative.
    */
  var metricCosts: js.UndefOr[Record[String, String]] = js.native
  /**
    * Selects the methods to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object MetricRule {
  @scala.inline
  def apply(): MetricRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricRule]
  }
  @scala.inline
  implicit class MetricRuleOps[Self <: MetricRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricCosts(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricCosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricCosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricCosts")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

