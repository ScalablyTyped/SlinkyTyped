package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMetricStatisticsOutput extends js.Object {
  /**
    * The data points for the specified metric.
    */
  var Datapoints: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Datapoints] = js.native
  /**
    * A label for the specified metric.
    */
  var Label: js.UndefOr[MetricLabel] = js.native
}

object GetMetricStatisticsOutput {
  @scala.inline
  def apply(): GetMetricStatisticsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricStatisticsOutput]
  }
  @scala.inline
  implicit class GetMetricStatisticsOutputOps[Self <: GetMetricStatisticsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatapoints(value: Datapoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Datapoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatapoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Datapoints")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: MetricLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(js.undefined)
        ret
    }
  }
  
}

