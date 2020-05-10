package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsElliottWaveTypeOptions extends js.Object {
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsElliottWaveTypeLineOptions] = js.native
  var points: js.UndefOr[AnnotationsElliottWaveTypePointsOptions] = js.native
  /**
    * (Highstock) This number defines which xAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var xAxis: js.UndefOr[Double] = js.native
  /**
    * (Highstock) This number defines which yAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var yAxis: js.UndefOr[Double] = js.native
}

object AnnotationsElliottWaveTypeOptions {
  @scala.inline
  def apply(): AnnotationsElliottWaveTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsElliottWaveTypeOptions]
  }
  @scala.inline
  implicit class AnnotationsElliottWaveTypeOptionsOps[Self <: AnnotationsElliottWaveTypeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLine(value: AnnotationsElliottWaveTypeLineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withPoints(value: AnnotationsElliottWaveTypePointsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(js.undefined)
        ret
    }
  }
  
}

