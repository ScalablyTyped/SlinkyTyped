package typingsSlinky.dojo.dojox.charting.Theme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/Theme.defaultTheme.html
  *
  *
  */
@js.native
trait defaultTheme extends js.Object {
  /**
    *
    */
  var axis: js.Object = js.native
  /**
    *
    */
  var chart: js.Object = js.native
  /**
    *
    */
  var indicator: js.Object = js.native
  /**
    *
    */
  var marker: js.Object = js.native
  /**
    *
    */
  var plotarea: js.Object = js.native
  /**
    *
    */
  var series: js.Object = js.native
}

object defaultTheme {
  @scala.inline
  def apply(
    axis: js.Object,
    chart: js.Object,
    indicator: js.Object,
    marker: js.Object,
    plotarea: js.Object,
    series: js.Object
  ): defaultTheme = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], plotarea = plotarea.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultTheme]
  }
  @scala.inline
  implicit class defaultThemeOps[Self <: defaultTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChart(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicator(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarker(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlotarea(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotarea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeries(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

