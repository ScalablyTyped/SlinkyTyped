package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a set of metric values in the same metric. Each metric value in
  * the set should have a unique combination of start time, end time, and label
  * values.
  */
@js.native
trait SchemaMetricValueSet extends js.Object {
  /**
    * The metric name defined in the service configuration.
    */
  var metricName: js.UndefOr[String] = js.native
  /**
    * The values in this metric.
    */
  var metricValues: js.UndefOr[js.Array[SchemaMetricValue]] = js.native
}

object SchemaMetricValueSet {
  @scala.inline
  def apply(): SchemaMetricValueSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricValueSet]
  }
  @scala.inline
  implicit class SchemaMetricValueSetOps[Self <: SchemaMetricValueSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricValues(value: js.Array[SchemaMetricValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricValues")(js.undefined)
        ret
    }
  }
  
}

