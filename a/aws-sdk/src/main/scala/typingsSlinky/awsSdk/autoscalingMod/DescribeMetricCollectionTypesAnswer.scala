package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMetricCollectionTypesAnswer extends js.Object {
  /**
    * The granularities for the metrics.
    */
  var Granularities: js.UndefOr[MetricGranularityTypes] = js.native
  /**
    * One or more metrics.
    */
  var Metrics: js.UndefOr[MetricCollectionTypes] = js.native
}

object DescribeMetricCollectionTypesAnswer {
  @scala.inline
  def apply(): DescribeMetricCollectionTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMetricCollectionTypesAnswer]
  }
  @scala.inline
  implicit class DescribeMetricCollectionTypesAnswerOps[Self <: DescribeMetricCollectionTypesAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGranularities(value: MetricGranularityTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Granularities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranularities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Granularities")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: MetricCollectionTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(js.undefined)
        ret
    }
  }
  
}

