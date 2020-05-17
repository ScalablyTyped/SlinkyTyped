package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesPoint class.
  */
@js.native
trait ASPxClientSeriesPoint extends ASPxClientWebChartElement {
  /**
    * Gets the data point's argument.
    */
  var argument: js.Any = js.native
  /**
    * Gets the color of a series point.
    */
  var color: String = js.native
  /**
    * Gets the percent value of a series point.
    */
  var percentValue: Double = js.native
  /**
    * Gets the series that owns the current series point object.
    */
  var series: ASPxClientSeries = js.native
  /**
    * Gets a hint that is shown in series points tooltips.
    */
  var toolTipHint: String = js.native
  /**
    * Gets the text to be displayed within series points tooltips.
    */
  var toolTipText: String = js.native
  /**
    * Gets the point's data value(s).
    */
  var values: js.Array[_] = js.native
}

object ASPxClientSeriesPoint {
  @scala.inline
  def apply(
    argument: js.Any,
    chart: ASPxClientWebChart,
    color: String,
    percentValue: Double,
    series: ASPxClientSeries,
    toolTipHint: String,
    toolTipText: String,
    values: js.Array[_]
  ): ASPxClientSeriesPoint = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], percentValue = percentValue.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], toolTipHint = toolTipHint.asInstanceOf[js.Any], toolTipText = toolTipText.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSeriesPoint]
  }
  @scala.inline
  implicit class ASPxClientSeriesPointOps[Self <: ASPxClientSeriesPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgument(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeries(value: ASPxClientSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTipHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTipText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

