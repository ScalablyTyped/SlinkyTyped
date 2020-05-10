package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metric filter to be used in a segment filter clause.
  */
@js.native
trait SchemaSegmentMetricFilter extends js.Object {
  /**
    * The value to compare against. If the operator is `BETWEEN`, this value is
    * treated as minimum comparison value.
    */
  var comparisonValue: js.UndefOr[String] = js.native
  /**
    * Max comparison value is only used for `BETWEEN` operator.
    */
  var maxComparisonValue: js.UndefOr[String] = js.native
  /**
    * The metric that will be filtered on. A `metricFilter` must contain a
    * metric name.
    */
  var metricName: js.UndefOr[String] = js.native
  /**
    * Specifies is the operation to perform to compare the metric. The default
    * is `EQUAL`.
    */
  var operator: js.UndefOr[String] = js.native
  /**
    * Scope for a metric defines the level at which that metric is defined. The
    * specified metric scope must be equal to or greater than its primary scope
    * as defined in the data model. The primary scope is defined by if the
    * segment is selecting users or sessions.
    */
  var scope: js.UndefOr[String] = js.native
}

object SchemaSegmentMetricFilter {
  @scala.inline
  def apply(): SchemaSegmentMetricFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentMetricFilter]
  }
  @scala.inline
  implicit class SchemaSegmentMetricFilterOps[Self <: SchemaSegmentMetricFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparisonValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxComparisonValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxComparisonValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxComparisonValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxComparisonValue")(js.undefined)
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
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

