package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricFilter extends js.Object {
  /**
    * The creation time of the metric filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the metric filter.
    */
  var filterName: js.UndefOr[FilterName] = js.native
  var filterPattern: js.UndefOr[FilterPattern] = js.native
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.native
  /**
    * The metric transformations.
    */
  var metricTransformations: js.UndefOr[MetricTransformations] = js.native
}

object MetricFilter {
  @scala.inline
  def apply(): MetricFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricFilter]
  }
  @scala.inline
  implicit class MetricFilterOps[Self <: MetricFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterName(value: FilterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterName")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterPattern(value: FilterPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withLogGroupName(value: LogGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricTransformations(value: MetricTransformations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricTransformations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricTransformations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricTransformations")(js.undefined)
        ret
    }
  }
  
}

