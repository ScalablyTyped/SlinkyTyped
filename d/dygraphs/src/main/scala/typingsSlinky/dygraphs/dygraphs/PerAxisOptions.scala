package typingsSlinky.dygraphs.dygraphs

import typingsSlinky.dygraphs.AnonLabel
import typingsSlinky.dygraphs.Dygraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerAxisOptions extends js.Object {
  /**
    * Color for x- and y-axis labels. This is a CSS color string.
    */
  var axisLabelColor: js.UndefOr[String] = js.native
  /**
    * Size of the font (in pixels) to use in the axis labels, both x- and y-axis.
    */
  var axisLabelFontSize: js.UndefOr[Double] = js.native
  /**
    * Function to call to format the tick values that appear along an axis. This is usually set
    * on a <a href='per-axis.html'>per-axis</a> basis.
    */
  var axisLabelFormatter: js.UndefOr[
    js.Function4[
      /* v */ Double | js.Date, 
      /* granularity */ Double, 
      /* opts */ js.Function1[/* name */ String, _], 
      /* dygraph */ Dygraph, 
      _
    ]
  ] = js.native
  /**
    * Width (in pixels) of the containing divs for x- and y-axis labels. For the y-axis, this
    * also controls the width of the y-axis. Note that for the x-axis, this is independent from
    * pixelsPerLabel, which controls the spacing between labels.
    */
  var axisLabelWidth: js.UndefOr[Double] = js.native
  /**
    * Color of the x- and y-axis lines. Accepts any value which the HTML canvas strokeStyle
    * attribute understands, e.g. 'black' or 'rgb(0, 100, 255)'.
    */
  var axisLineColor: js.UndefOr[String] = js.native
  /**
    * Thickness (in pixels) of the x- and y-axis lines.
    */
  var axisLineWidth: js.UndefOr[Double] = js.native
  /**
    * The size of the line to display next to each tick mark on x- or y-axes.
    */
  var axisTickSize: js.UndefOr[Double] = js.native
  /**
    * Whether to draw the specified axis. This may be set on a per-axis basis to define the
    * visibility of each axis separately. Setting this to false also prevents axis ticks from
    * being drawn and reclaims the space for the chart grid/lines.
    */
  var drawAxis: js.UndefOr[Boolean] = js.native
  /**
    * Whether to display gridlines in the chart. This may be set on a per-axis basis to define
    * the visibility of each axis' grid separately.
    */
  var drawGrid: js.UndefOr[Boolean] = js.native
  /**
    * The color of the gridlines. This may be set on a per-axis basis to define each axis' grid
    * separately.
    */
  var gridLineColor: js.UndefOr[String] = js.native
  /**
    * A custom pattern array where the even index is a draw and odd is a space in pixels. If
    * null then it draws a solid line. The array should have a even length as any odd lengthed
    * array could be expressed as a smaller even length array. This is used to create dashed
    * gridlines.
    */
  var gridLinePattern: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Thickness (in pixels) of the gridlines drawn under the chart. The vertical/horizontal
    * gridlines can be turned off entirely by using the drawXGrid and drawYGrid options. This
    * may be set on a per-axis basis to define each axis' grid separately.
    */
  var gridLineWidth: js.UndefOr[Double] = js.native
  /**
    * Only valid for y and y2, has no effect on x: This option defines whether the y axes should
    * align their ticks or if they should be independent. Possible combinations: 1.) y=true,
    * y2=false (default): y is the primary axis and the y2 ticks are aligned to the the ones of
    * y. (only 1 grid) 2.) y=false, y2=true: y2 is the primary axis and the y ticks are aligned
    * to the the ones of y2. (only 1 grid) 3.) y=true, y2=true: Both axis are independent and
    * have their own ticks. (2 grids) 4.) y=false, y2=false: Invalid configuration causes an
    * error.
    */
  var independentTicks: js.UndefOr[Boolean] = js.native
  /**
    * Show K/M/B for thousands/millions/billions on y-axis.
    */
  var labelsKMB: js.UndefOr[Boolean] = js.native
  /**
    * Show k/M/G for kilo/Mega/Giga on y-axis. This is different than <code>labelsKMB</code> in
    * that it uses base 2, not 10.
    */
  var labelsKMG2: js.UndefOr[Boolean] = js.native
  /**
    * When set for the y-axis or x-axis, the graph shows that axis in log scale. Any values less
    * than or equal to zero are not displayed. Showing log scale with ranges that go below zero
    * will result in an unviewable graph.
    *
    * Not compatible with showZero. connectSeparatedPoints is ignored. This is ignored for
    * date-based x-axes.
    */
  var logscale: js.UndefOr[Boolean] = js.native
  /**
    * When displaying numbers in normal (not scientific) mode, large numbers will be displayed
    * with many trailing zeros (e.g. 100000000 instead of 1e9). This can lead to unwieldy y-axis
    * labels. If there are more than <code>maxNumberWidth</code> digits to the left of the
    * decimal in a number, dygraphs will switch to scientific notation, even when not operating
    * in scientific mode. If you'd like to see all those digits, set this to something large,
    * like 20 or 30.
    */
  var maxNumberWidth: js.UndefOr[Double] = js.native
  /**
    * Number of pixels to require between each x- and y-label. Larger values will yield a
    * sparser axis with fewer ticks. This is set on a <a href='per-axis.html'>per-axis</a>
    * basis.
    */
  var pixelsPerLabel: js.UndefOr[Double] = js.native
  /**
    * By default, dygraphs displays numbers with a fixed number of digits after the decimal
    * point. If you'd prefer to have a fixed number of significant figures, set this option to
    * that number of sig figs. A value of 2, for instance, would cause 1 to be display as 1.0
    * and 1234 to be displayed as 1.23e+3.
    */
  var sigFigs: js.UndefOr[Double] = js.native
  /**
    * This lets you specify an arbitrary function to generate tick marks on an axis. The tick
    * marks are an array of (value, label) pairs. The built-in functions go to great lengths to
    * choose good tick marks so, if you set this option, you'll most likely want to call one of
    * them and modify the result. See dygraph-tickers.js for an extensive discussion. This is
    * set on a <a href='per-axis.html'>per-axis</a> basis.
    */
  var ticker: js.UndefOr[
    js.Function6[
      /* min */ Double, 
      /* max */ Double, 
      /* pixels */ Double, 
      /* opts */ js.Function1[/* name */ String, _], 
      /* dygraph */ Dygraph, 
      /* vals */ js.Array[Double], 
      js.Array[AnonLabel]
    ]
  ] = js.native
  /**
    * Function to provide a custom display format for the values displayed on mouseover. This
    * does not affect the values that appear on tick marks next to the axes. To format those,
    * see axisLabelFormatter. This is usually set on a <a href='per-axis.html'>per-axis</a>
    * basis.
    */
  var valueFormatter: js.UndefOr[
    js.Function6[
      /* v */ Double, 
      /* opts */ js.Function1[/* name */ String, _], 
      /* seriesName */ String, 
      /* dygraph */ Dygraph, 
      /* row */ Double, 
      /* col */ Double, 
      _
    ]
  ] = js.native
  /**
    * Explicitly set the vertical range of the graph to [low, high]. This may be set on a
    * per-axis basis to define each y-axis separately. If either limit is unspecified, it will
    * be calculated automatically (e.g. [null, 30] to automatically calculate just the lower
    * bound)
    */
  var valueRange: js.UndefOr[js.Array[Double]] = js.native
}

object PerAxisOptions {
  @scala.inline
  def apply(): PerAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerAxisOptions]
  }
  @scala.inline
  implicit class PerAxisOptionsOps[Self <: PerAxisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisLabelColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLabelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLabelFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLabelFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLabelFormatter(
      value: (/* v */ Double | js.Date, /* granularity */ Double, /* opts */ js.Function1[/* name */ String, _], /* dygraph */ Dygraph) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelFormatter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAxisLabelFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLabelWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLabelWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabelWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisTickSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTickSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisTickSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTickSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawAxis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLinePattern(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLinePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLinePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLinePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIndependentTicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("independentTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndependentTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("independentTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsKMB(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsKMB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsKMB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsKMB")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsKMG2(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsKMG2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsKMG2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsKMG2")(js.undefined)
        ret
    }
    @scala.inline
    def withLogscale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logscale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNumberWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumberWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNumberWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumberWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelsPerLabel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsPerLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelsPerLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsPerLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSigFigs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigFigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigFigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigFigs")(js.undefined)
        ret
    }
    @scala.inline
    def withTicker(
      value: (/* min */ Double, /* max */ Double, /* pixels */ Double, /* opts */ js.Function1[/* name */ String, _], /* dygraph */ Dygraph, /* vals */ js.Array[Double]) => js.Array[AnonLabel]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticker")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutTicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticker")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFormatter(
      value: (/* v */ Double, /* opts */ js.Function1[/* name */ String, _], /* seriesName */ String, /* dygraph */ Dygraph, /* row */ Double, /* col */ Double) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatter")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutValueFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withValueRange(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRange")(js.undefined)
        ret
    }
  }
  
}

