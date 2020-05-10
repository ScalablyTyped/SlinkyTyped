package typingsSlinky.dygraphs.dygraphs

import typingsSlinky.dygraphs.dygraphsStrings.y1
import typingsSlinky.dygraphs.dygraphsStrings.y2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerSeriesOptions extends js.Object {
  /**
    * Set to either 'y1' or 'y2' to assign a series to a y-axis (primary or secondary). Must be
    * set per-series.
    */
  var axis: js.UndefOr[y1 | y2] = js.native
  /**
    * A per-series color definition. Used in conjunction with, and overrides, the colors option.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Draw a small dot at each point, in addition to a line going through the point. This makes
    * the individual data points easier to see, but can increase visual clutter in the chart.
    * The small dot can be replaced with a custom rendering by supplying a <a
    * href='#drawPointCallback'>drawPointCallback</a>.
    */
  var drawPoints: js.UndefOr[Boolean] = js.native
  /**
    * Error bars (or custom bars) for each series are drawn in the same color as the series, but
    * with partial transparency. This sets the transparency. A value of 0.0 means that the error
    * bars will not be drawn, whereas a value of 1.0 means that the error bars will be as dark
    * as the line for the series itself. This can be used to produce chart lines whose thickness
    * varies at each point.
    */
  var fillAlpha: js.UndefOr[Double] = js.native
  /**
    * Should the area underneath the graph be filled? This option is not compatible with error
    * bars. This may be set on a <a href='per-axis.html'>per-series</a> basis.
    */
  var fillGraph: js.UndefOr[Boolean] = js.native
  /**
    * The size in pixels of the dot drawn over highlighted points.
    */
  var highlightCircleSize: js.UndefOr[Double] = js.native
  /**
    * A function which plot data for this series on the chart.         
    */
  var plotter: js.UndefOr[js.Any] = js.native
  /**
    * The size of the dot to draw on each point in pixels (see drawPoints). A dot is always
    * drawn when a point is "isolated", i.e. there is a missing point on either side of it. This
    * also controls the size of those dots.
    */
  var pointSize: js.UndefOr[Double] = js.native
  /**
    * Mark this series for inclusion in the range selector. The mini plot curve will be an
    * average of all such series. If this is not specified for any series, the default behavior
    * is to average all the series. Setting it for one series will result in that series being
    * charted alone in the range selector.
    */
  var showInRangeSelector: js.UndefOr[Boolean] = js.native
  /**
    * When set, display the graph as a step plot instead of a line plot. This option may either
    * be set for the whole graph or for single series.
    */
  var stepPlot: js.UndefOr[Boolean] = js.native
  /**
    * Color for the line border used if strokeBorderWidth is set.
    */
  var strokeBorderColor: js.UndefOr[String] = js.native
  /**
    * Draw a border around graph lines to make crossing lines more easily distinguishable.
    * Useful for graphs with many lines.
    */
  var strokeBorderWidth: js.UndefOr[Double] = js.native
  /**
    * A custom pattern array where the even index is a draw and odd is a space in pixels. If
    * null then it draws a solid line. The array should have a even length as any odd lengthed
    * array could be expressed as a smaller even length array. This is used to create dashed
    * lines.
    */
  var strokePattern: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The width of the lines connecting data points. This can be used to increase the contrast
    * or some graphs.
    */
  var strokeWidth: js.UndefOr[Double] = js.native
}

object PerSeriesOptions {
  @scala.inline
  def apply(): PerSeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerSeriesOptions]
  }
  @scala.inline
  implicit class PerSeriesOptionsOps[Self <: PerSeriesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: y1 | y2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withFillAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withFillGraph(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillGraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillGraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillGraph")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightCircleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCircleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightCircleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCircleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPlotter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlotter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotter")(js.undefined)
        ret
    }
    @scala.inline
    def withPointSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInRangeSelector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInRangeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInRangeSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInRangeSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withStepPlot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepPlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepPlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepPlot")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokePattern(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
  }
  
}

