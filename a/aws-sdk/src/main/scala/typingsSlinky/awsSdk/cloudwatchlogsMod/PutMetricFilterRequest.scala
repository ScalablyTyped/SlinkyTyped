package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutMetricFilterRequest extends js.Object {
  /**
    * A name for the metric filter.
    */
  var filterName: FilterName = js.native
  /**
    * A filter pattern for extracting metric data out of ingested log events.
    */
  var filterPattern: FilterPattern = js.native
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
  /**
    * A collection of information that defines how metric data gets emitted.
    */
  var metricTransformations: MetricTransformations = js.native
}

object PutMetricFilterRequest {
  @scala.inline
  def apply(
    filterName: FilterName,
    filterPattern: FilterPattern,
    logGroupName: LogGroupName,
    metricTransformations: MetricTransformations
  ): PutMetricFilterRequest = {
    val __obj = js.Dynamic.literal(filterName = filterName.asInstanceOf[js.Any], filterPattern = filterPattern.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any], metricTransformations = metricTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMetricFilterRequest]
  }
  @scala.inline
  implicit class PutMetricFilterRequestOps[Self <: PutMetricFilterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterName(value: FilterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterPattern(value: FilterPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogGroupName(value: LogGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricTransformations(value: MetricTransformations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricTransformations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

