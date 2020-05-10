package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMetricWidgetImageOutput extends js.Object {
  /**
    * The image of the graph, in the output format specified.
    */
  var MetricWidgetImage: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.MetricWidgetImage] = js.native
}

object GetMetricWidgetImageOutput {
  @scala.inline
  def apply(): GetMetricWidgetImageOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricWidgetImageOutput]
  }
  @scala.inline
  implicit class GetMetricWidgetImageOutputOps[Self <: GetMetricWidgetImageOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricWidgetImageUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricWidgetImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricWidgetImage(value: MetricWidgetImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricWidgetImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricWidgetImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricWidgetImage")(js.undefined)
        ret
    }
  }
  
}

