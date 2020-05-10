package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsMeasureTypeOptions extends js.Object {
  var background: js.UndefOr[AnnotationsMeasureTypeBackgroundOptions] = js.native
  /**
    * (Highstock) Configure a crosshair that is horizontally placed in middle
    * of rectangle.
    */
  var crosshairX: js.UndefOr[AnnotationsMeasureTypeCrosshairXOptions] = js.native
  /**
    * (Highstock) Configure a crosshair that is vertically placed in middle of
    * rectangle.
    */
  var crosshairY: js.UndefOr[AnnotationsMeasureTypeCrosshairYOptions] = js.native
  var label: js.UndefOr[AnnotationsMeasureTypeLabelOptions] = js.native
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsMeasureTypeLineOptions] = js.native
  var points: js.UndefOr[js.Array[AnnotationsMeasureTypePointsOptions]] = js.native
  /**
    * (Highstock) Decides in what dimensions the user can resize by dragging
    * the mouse. Can be one of x, y or xy.
    */
  var selectType: js.UndefOr[String] = js.native
  /**
    * (Highstock) This number defines which xAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var xAxis: js.UndefOr[Double] = js.native
  /**
    * (Highstock) This number defines which yAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the yAxis array.
    */
  var yAxis: js.UndefOr[Double] = js.native
}

object AnnotationsMeasureTypeOptions {
  @scala.inline
  def apply(): AnnotationsMeasureTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureTypeOptions]
  }
  @scala.inline
  implicit class AnnotationsMeasureTypeOptionsOps[Self <: AnnotationsMeasureTypeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: AnnotationsMeasureTypeBackgroundOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshairX(value: AnnotationsMeasureTypeCrosshairXOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshairX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairX")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshairY(value: AnnotationsMeasureTypeCrosshairYOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshairY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairY")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: AnnotationsMeasureTypeLabelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: AnnotationsMeasureTypeLineOptions): Self = {
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
    def withPoints(value: js.Array[AnnotationsMeasureTypePointsOptions]): Self = {
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
    def withSelectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectType")(js.undefined)
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

