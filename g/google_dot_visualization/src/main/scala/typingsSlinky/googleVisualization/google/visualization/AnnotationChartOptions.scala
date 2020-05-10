package typingsSlinky.googleVisualization.google.visualization

import typingsSlinky.googleVisualization.googleVisualizationStrings.newRow
import typingsSlinky.googleVisualization.googleVisualizationStrings.sameRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationChartOptions extends js.Object {
  var allValuesSuffix: js.UndefOr[String] = js.native
  var allowHtml: js.UndefOr[Boolean] = js.native
  var annotationsWidth: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[js.Array[String]] = js.native
  var dateFormat: js.UndefOr[String] = js.native
  var displayAnnotations: js.UndefOr[Boolean] = js.native
  var displayAnnotationsFilter: js.UndefOr[Boolean] = js.native
  var displayDateBarSeparator: js.UndefOr[Boolean] = js.native
  var displayExactValues: js.UndefOr[Boolean] = js.native
  var displayLegendDots: js.UndefOr[Boolean] = js.native
  var displayLegendValues: js.UndefOr[Boolean] = js.native
  var displayRangeSelector: js.UndefOr[Boolean] = js.native
  var displayZoomButtons: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[Double] = js.native
  var legendPosition: js.UndefOr[sameRow | newRow] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var numberFormats: js.UndefOr[js.Any] = js.native
  var scaleColumns: js.UndefOr[js.Array[Double]] = js.native
  var scaleFormat: js.UndefOr[String] = js.native
  var scaleType: js.UndefOr[String] = js.native
  var thickness: js.UndefOr[Double] = js.native
  var zoomEndTime: js.UndefOr[js.Date] = js.native
  var zoomStartTime: js.UndefOr[js.Date] = js.native
}

object AnnotationChartOptions {
  @scala.inline
  def apply(): AnnotationChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationChartOptions]
  }
  @scala.inline
  implicit class AnnotationChartOptionsOps[Self <: AnnotationChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllValuesSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allValuesSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllValuesSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allValuesSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationsWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationsWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationsWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationsWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayAnnotations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAnnotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAnnotations")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayAnnotationsFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAnnotationsFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayAnnotationsFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAnnotationsFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayDateBarSeparator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDateBarSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayDateBarSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDateBarSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayExactValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExactValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayExactValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExactValues")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayLegendDots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLegendDots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayLegendDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLegendDots")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayLegendValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLegendValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayLegendValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLegendValues")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayRangeSelector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayRangeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayRangeSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayRangeSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayZoomButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayZoomButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayZoomButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayZoomButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendPosition(value: sameRow | newRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormats(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleColumns(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleType")(js.undefined)
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomStartTime")(js.undefined)
        ret
    }
  }
  
}

