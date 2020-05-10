package typingsSlinky.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bind API methods to metrics. Binding a method to a metric causes that
  * metric&#39;s configured quota behaviors to apply to the method call.
  */
@js.native
trait SchemaMetricRule extends js.Object {
  /**
    * Metrics to update when the selected methods are called, and the
    * associated cost applied to each metric.  The key of the map is the metric
    * name, and the values are the amount increased for the metric against
    * which the quota limits are defined. The value must not be negative.
    */
  var metricCosts: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Selects the methods to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object SchemaMetricRule {
  @scala.inline
  def apply(): SchemaMetricRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricRule]
  }
  @scala.inline
  implicit class SchemaMetricRuleOps[Self <: SchemaMetricRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricCosts(value: StringDictionary[String]): Self = {
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

