package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows autoscaling based on Stackdriver metrics.
  */
@js.native
trait SchemaCustomMetric extends js.Object {
  /**
    * Allows filtering on the metric&#39;s fields.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The name of the metric.
    */
  var metricName: js.UndefOr[String] = js.native
  /**
    * May be used instead of target_utilization when an instance can handle a
    * specific amount of work/resources and the metric value is equal to the
    * current amount of work remaining. The autoscaler will try to keep the
    * number of instances equal to the metric value divided by
    * single_instance_assignment.
    */
  var singleInstanceAssignment: js.UndefOr[Double] = js.native
  /**
    * The type of the metric. Must be a string representing a Stackdriver
    * metric type e.g. GAGUE, DELTA_PER_SECOND, etc.
    */
  var targetType: js.UndefOr[String] = js.native
  /**
    * The target value for the metric.
    */
  var targetUtilization: js.UndefOr[Double] = js.native
}

object SchemaCustomMetric {
  @scala.inline
  def apply(): SchemaCustomMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomMetric]
  }
  @scala.inline
  implicit class SchemaCustomMetricOps[Self <: SchemaCustomMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
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
    def withSingleInstanceAssignment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleInstanceAssignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleInstanceAssignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleInstanceAssignment")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetType")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetUtilization(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUtilization")(js.undefined)
        ret
    }
  }
  
}

