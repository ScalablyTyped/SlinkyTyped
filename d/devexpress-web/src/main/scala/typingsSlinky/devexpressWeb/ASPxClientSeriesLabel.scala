package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesLabelBase class.
  */
@js.native
trait ASPxClientSeriesLabel extends ASPxClientWebChartElement {
  /**
    * Gets the series that owns the current series label object.
    */
  var series: ASPxClientSeries = js.native
  /** @deprecated This property is obsolete and isn't used at all. */
  /**
    * Gets the common text for all series point labels.
    */
  var text: String = js.native
}

object ASPxClientSeriesLabel {
  @scala.inline
  def apply(chart: ASPxClientWebChart, series: ASPxClientSeries, text: String): ASPxClientSeriesLabel = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSeriesLabel]
  }
  @scala.inline
  implicit class ASPxClientSeriesLabelOps[Self <: ASPxClientSeriesLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeries(value: ASPxClientSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

