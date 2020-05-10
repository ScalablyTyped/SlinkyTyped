package typingsSlinky.dygraphs.dygraphs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.dygraphs.AnonX
import typingsSlinky.dygraphs.Dygraph
import typingsSlinky.dygraphs.dygraphsStrings.always
import typingsSlinky.dygraphs.dygraphsStrings.follow
import typingsSlinky.dygraphs.dygraphsStrings.never
import typingsSlinky.dygraphs.dygraphsStrings.onmouseover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends PerSeriesOptions
     with PerAxisOptions {
  /**
    * Set this option to animate the transition between zoom windows. Applies to programmatic
    * and interactive zooms. Note that if you also set a drawCallback, it will be called several
    * times on each zoom. If you set a zoomCallback, it will only be called after the animation
    * is complete.
    */
  var animatedZooms: js.UndefOr[Boolean] = js.native
  /**
    * If provided, this function is called whenever the user clicks on an annotation.
    */
  var annotationClickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  /**
    * If provided, this function is called whenever the user double-clicks on an annotation.
    */
  var annotationDblClickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  /**
    * If provided, this function is called whenever the user mouses out of an annotation.
    */
  var annotationMouseOutHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  /**
    * If provided, this function is called whenever the user mouses over an annotation.
    */
  var annotationMouseOverHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.native
  /**
    * Defines per-axis options. Valid keys are 'x', 'y' and 'y2'. Only some options may be set
    * on a per-axis basis. If an option may be set in this way, it will be noted on this page.
    * See also documentation on <a href='http://dygraphs.com/per-axis.html'>per-series and
    * per-axis options</a>.
    */
  var axes: js.UndefOr[AnonX] = js.native
  /**
    * A function to call when the canvas is clicked.
    */
  var clickCallback: js.UndefOr[
    js.Function3[/* e */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point], _]
  ] = js.native
  /**
    * If <strong>colors</strong> is not specified, saturation of the automatically-generated
    * data series colors. (0.0-1.0).
    */
  var colorSaturation: js.UndefOr[Double] = js.native
  /**
    * If colors is not specified, value of the data series colors, as in hue/saturation/value.
    * (0.0-1.0, default 0.5)
    */
  var colorValue: js.UndefOr[Double] = js.native
  /**
    * List of colors for the data series. These can be of the form "#AABBCC" or
    * "rgb(255,100,200)" or "yellow", etc. If not specified, equally-spaced points around a
    * color wheel are used. Overridden by the 'color' option.
    */
  var colors: js.UndefOr[js.Array[String]] = js.native
  /**
    * Usually, when Dygraphs encounters a missing value in a data series, it interprets this as
    * a gap and draws it as such. If, instead, the missing values represents an x-value for
    * which only a different series has data, then you'll want to connect the dots by setting
    * this to true. To explicitly include a gap with this option set, use a value of NaN.
    */
  var connectSeparatedPoints: js.UndefOr[Boolean] = js.native
  /**
    * When set, parse each CSV cell as "low;middle;high". Error bars will be drawn for each
    * point between low and high, with the series itself going through middle.
    */
  var customBars: js.UndefOr[Boolean] = js.native
  /**
    * Custom DataHandler. This is an advanced customization. See http://bit.ly/151E7Aq.
    */
  var dataHandler: js.UndefOr[js.Any] = js.native
  /**
    * Initially zoom in on a section of the graph. Is of the form [earliest, latest], where
    * earliest/latest are milliseconds since epoch. If the data for the x-axis is numeric, the
    * values in dateWindow must also be numbers.
    */
  var dateWindow: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The delimiter to look for when separating fields of a CSV file. Setting this to a tab is
    * not usually necessary, since tab-delimited data is auto-detected.
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * Unless it's run in scientific mode (see the <code>sigFigs</code> option), dygraphs
    * displays numbers with <code>digitsAfterDecimal</code> digits after the decimal point.
    * Trailing zeros are not displayed, so with a value of 2 you'll get '0', '0.1', '0.12',
    * '123.45' but not '123.456' (it will be rounded to '123.46'). Numbers with absolute value
    * less than 0.1^digitsAfterDecimal (i.e. those which would show up as '0.00') will be
    * displayed in scientific notation.
    */
  var digitsAfterDecimal: js.UndefOr[Double] = js.native
  /**
    * Only applies when Dygraphs is used as a GViz chart. Causes string columns following a data
    * series to be interpreted as annotations on points in that series. This is the same format
    * used by Google's AnnotatedTimeLine chart.
    */
  var displayAnnotations: js.UndefOr[Boolean] = js.native
  /**
    * When set, draw the X axis at the Y=0 position and the Y axis at the X=0 position if those
    * positions are inside the graph's visible area. Otherwise, draw the axes at the bottom or
    * left graph edge as usual.
    */
  var drawAxesAtZero: js.UndefOr[Boolean] = js.native
  /**
    * When set, this callback gets called every time the dygraph is drawn. This includes the
    * initial draw, after zooming and repeatedly while panning.
    */
  var drawCallback: js.UndefOr[js.Function2[/* dygraph */ Dygraph, /* is_initial */ Boolean, _]] = js.native
  /**
    * Draw points at the edges of gaps in the data. This improves visibility of small data
    * segments or other data irregularities.
    */
  var drawGapEdgePoints: js.UndefOr[Boolean] = js.native
  /**
    * Draw a custom item when a point is highlighted.    Default is a small dot matching the
    * series color. This method should constrain drawing to within pointSize pixels from (cx,
    * cy) Also see <a href='#drawPointCallback'>drawPointCallback</a>
    */
  var drawHighlightPointCallback: js.UndefOr[
    js.Function7[
      /* g */ Dygraph, 
      /* seriesName */ String, 
      /* canvasContext */ CanvasRenderingContext2D, 
      /* cx */ Double, 
      /* cy */ Double, 
      /* color */ String, 
      /* pointSize */ Double, 
      _
    ]
  ] = js.native
  /**
    * Draw a custom item when drawPoints is enabled. Default is a small dot matching the series
    * color. This method should constrain drawing to within pointSize pixels from (cx, cy).
    * Also see <a href='#drawHighlightPointCallback'>drawHighlightPointCallback</a>
    */
  var drawPointCallback: js.UndefOr[
    js.Function7[
      /* g */ Dygraph, 
      /* seriesName */ String, 
      /* canvasContext */ CanvasRenderingContext2D, 
      /* cx */ Double, 
      /* cy */ Double, 
      /* color */ String, 
      /* pointSize */ Double, 
      _
    ]
  ] = js.native
  /**
    * Does the data contain standard deviations? Setting this to true alters the input format.
    */
  var errorBars: js.UndefOr[Boolean] = js.native
  /**
    * Sets the data being displayed in the chart. This can only be set when calling
    * updateOptions; it cannot be set from the constructor. For a full description of valid data
    * formats, see the <a href='http://dygraphs.com/data.html'>Data Formats</a> page.
    */
  var file: js.UndefOr[Data] = js.native
  /**
    * When set, attempt to parse each cell in the CSV file as "a/b", where a and b are integers.
    * The ratio will be plotted. This allows computation of Wilson confidence intervals (see
    * below).
    */
  var fractions: js.UndefOr[Boolean] = js.native
  /**
    * Height, in pixels, of the chart. If the container div has been explicitly sized, this will
    * be ignored.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Whether to hide the legend when the mouse leaves the chart area.
    */
  var hideOverlayOnMouseOut: js.UndefOr[Boolean] = js.native
  /**
    * When set, this callback gets called every time a new point is highlighted.
    */
  var highlightCallback: js.UndefOr[
    js.Function5[
      /* event */ MouseEvent, 
      /* xval */ Double, 
      /* points */ js.Array[Point], 
      /* row */ Double, 
      /* seriesName */ String, 
      _
    ]
  ] = js.native
  /**
    * Fade the background while highlighting series. 1=fully visible background (disable
    * fading), 0=hiddden background (show highlighted series only).
    */
  var highlightSeriesBackgroundAlpha: js.UndefOr[Double] = js.native
  /**
    * Sets the background color used to fade out the series in conjunction with 'highlightSeriesBackgroundAlpha'.
    * Default: rgb(255, 255, 255)
    */
  var highlightSeriesBackgroundColor: js.UndefOr[String] = js.native
  /**
    * When set, the options from this object are applied to the timeseries closest to the mouse
    * pointer for interactive highlighting. See also 'highlightCallback'. Example:
    * highlightSeriesOpts: { strokeWidth: 3 }.
    */
  var highlightSeriesOpts: js.UndefOr[PerSeriesOptions] = js.native
  /**
    * Usually, dygraphs will use the range of the data plus some padding to set the range of the
    * y-axis. If this option is set, the y-axis will always include zero, typically as the
    * lowest value. This can be used to avoid exaggerating the variance in the data
    */
  var includeZero: js.UndefOr[Boolean] = js.native
  var interactionModel: js.UndefOr[js.Any] = js.native
  /**
    * When this option is passed to updateOptions() along with either the
    * <code>dateWindow</code> or <code>valueRange</code> options, the zoom flags are not changed
    * to reflect a zoomed state. This is primarily useful for when the display area of a chart
    * is changed programmatically and also where manual zooming is allowed and use is made of
    * the <code>isZoomed</code> method to determine this.
    */
  var isZoomedIgnoreProgrammaticZoom: js.UndefOr[Boolean] = js.native
  /**
    * A name for each data series, including the independent (X) series. For CSV files and
    * DataTable objections, this is determined by context. For raw data, this must be specified.
    * If it is not, default values are supplied and a warning is logged.
    */
  var labels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Show data labels in an external div, rather than on the graph.    This value can either be a
    * div element or a div id.
    */
  var labelsDiv: js.UndefOr[String | HTMLElement] = js.native
  /**
    * Additional styles to apply to the currently-highlighted points div. For example, {
    * 'fontWeight': 'bold' } will make the labels bold. In general, it is better to use CSS to
    * style the .dygraph-legend class than to use this property.
    */
  var labelsDivStyles: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Width (in pixels) of the div which shows information on the currently-highlighted points.
    */
  var labelsDivWidth: js.UndefOr[Double] = js.native
  /**
    * Put <code>&lt;br/&gt;</code> between lines in the label string. Often used in conjunction
    * with <strong>labelsDiv</strong>.
    */
  var labelsSeparateLines: js.UndefOr[Boolean] = js.native
  /**
    * Show zero value labels in the labelsDiv.
    */
  var labelsShowZeroValues: js.UndefOr[Boolean] = js.native
  /**
    * Show date/time labels according to UTC (instead of local time).
    */
  var labelsUTC: js.UndefOr[Boolean] = js.native
  /**
    * When to display the legend. By default, it only appears when a user mouses over the chart.
    * Set it to "always" to always display a legend of some sort. When set to "follow", legend
    * follows highlighted points. If set to 'never' then it will not appear at all.
    */
  var legend: js.UndefOr[always | follow | onmouseover | never] = js.native
  /**
    * for details see https://github.com/danvk/dygraphs/pull/683
    */
  var legendFormatter: js.UndefOr[js.Function1[/* legendData */ LegendData, String]] = js.native
  /**
    * A value representing the farthest a graph may be panned, in percent of the display. For
    * example, a value of 0.1 means that the graph can only be panned 10% pased the edges of the
    * displayed values. null means no bounds.
    */
  var panEdgeFraction: js.UndefOr[Double] = js.native
  /**
    * Defines per-graph plugins. Useful for per-graph customization
    */
  var plugins: js.UndefOr[js.Array[_]] = js.native
  /**
    * A function to call when a data point is clicked. and the point that was clicked.
    */
  var pointClickCallback: js.UndefOr[js.Function2[/* e */ MouseEvent, /* point */ Point, _]] = js.native
  /**
    * Height, in pixels, of the range selector widget. This option can only be specified at
    * Dygraph creation time.
    */
  var rangeSelectorHeight: js.UndefOr[Double] = js.native
  /**
    * The range selector mini plot fill color. This can be of the form "#AABBCC" or
    * "rgb(255,100,200)" or "yellow". You can also specify null or "" to turn off fill.
    */
  var rangeSelectorPlotFillColor: js.UndefOr[String] = js.native
  /**
    * The range selector mini plot stroke color. This can be of the form "#AABBCC" or
    * "rgb(255,100,200)" or "yellow". You can also specify null or "" to turn off stroke.
    */
  var rangeSelectorPlotStrokeColor: js.UndefOr[String] = js.native
  /**
    * Number of pixels to leave blank at the right edge of the Dygraph. This makes it easier to
    * highlight the right-most data point.
    */
  var rightGap: js.UndefOr[Double] = js.native
  /**
    * Number of days over which to average data. Discussed extensively above.
    */
  var rollPeriod: js.UndefOr[Double] = js.native
  /**
    * Defines per-series options. Its keys match the y-axis label names, and the values are
    * dictionaries themselves that contain options specific to that series. When this option is
    * missing, it falls back on the old-style of per-series options comingled with global
    * options.
    */
  var series: js.UndefOr[StringDictionary[PerSeriesOptions]] = js.native
  /**
    * Whether to show the legend upon mouseover.
    */
  var showLabelsOnHighlight: js.UndefOr[Boolean] = js.native
  /**
    * Show or hide the range selector widget.
    */
  var showRangeSelector: js.UndefOr[Boolean] = js.native
  /**
    * If the rolling average period text box should be shown.
    */
  var showRoller: js.UndefOr[Boolean] = js.native
  /**
    * When errorBars is set, shade this many standard deviations above/below each point.
    */
  var sigma: js.UndefOr[Double] = js.native
  /**
    * If set, stack series on top of one another rather than drawing them independently. The
    * first series specified in the input data will wind up on top of the chart and the last
    * will be on bottom. NaN values are drawn as white areas without a line on top, see
    * stackedGraphNaNFill for details.
    */
  var stackedGraph: js.UndefOr[Boolean] = js.native
  /**
    * Controls handling of NaN values inside a stacked graph. NaN values are
    * interpolated/extended for stacking purposes, but the actual point value remains NaN in the
    * legend display. Valid option values are "all" (interpolate internally, repeat leftmost and
    * rightmost value as needed), "inside" (interpolate internally only, use zero outside
    * leftmost and rightmost value), and "none" (treat NaN as zero everywhere).
    */
  var stackedGraphNaNFill: js.UndefOr[String] = js.native
  /**
    * Text to display above the chart. You can supply any HTML for this value, not just text. If
    * you wish to style it using CSS, use the 'dygraph-label' or 'dygraph-title' classes.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Height of the chart title, in pixels. This also controls the default font size of the
    * title. If you style the title on your own, this controls how much space is set aside above
    * the chart for the title's div.
    */
  var titleHeight: js.UndefOr[Double] = js.native
  /**
    * When set, this callback gets called before the chart is drawn. It details on how to use
    * this.
    */
  var underlayCallback: js.UndefOr[
    js.Function3[/* context */ CanvasRenderingContext2D, /* area */ Area, /* dygraph */ Dygraph, _]
  ] = js.native
  /**
    * When set, this callback gets called every time the user stops highlighting any point by
    * mousing out of the graph.
    */
  var unhighlightCallback: js.UndefOr[js.Function1[/* event */ MouseEvent, _]] = js.native
  /**
    * Which series should initially be visible? Once the Dygraph has been constructed, you can
    * access and modify the visibility of each series using the <code>visibility</code> and
    * <code>setVisibility</code> methods.
    */
  var visibility: js.UndefOr[js.Array[Boolean]] = js.native
  /**
    * Width, in pixels, of the chart. If the container div has been explicitly sized, this will
    * be ignored.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Use in conjunction with the "fractions" option. Instead of plotting +/- N standard
    * deviations, dygraphs will compute a Wilson confidence interval and plot that. This has
    * more reasonable behavior for ratios close to 0 or 1.
    */
  var wilsonInterval: js.UndefOr[Boolean] = js.native
  /**
    * Height, in pixels, of the x-axis. If not set explicitly, this is computed based on
    * axisLabelFontSize and axisTickSize.
    */
  var xAxisHeight: js.UndefOr[Double] = js.native
  /**
    * Height of the x-axis label, in pixels. This also controls the default font size of the
    * x-axis label. If you style the label on your own, this controls how much space is set
    * aside below the chart for the x-axis label's div.
    */
  var xLabelHeight: js.UndefOr[Double] = js.native
  /**
    * Add the specified amount of extra space (in pixels) around the X-axis value range to
    * ensure points at the edges remain visible.
    */
  var xRangePad: js.UndefOr[Double] = js.native
  /**
    * A function which parses x-values (i.e. the dependent series). Must return a number, even
    * when the values are dates. In this case, millis since epoch are used. This is used
    * primarily for parsing CSV data. *=Dygraphs is slightly more accepting in the dates which
    * it will parse. See code for details.
    */
  var xValueParser: js.UndefOr[js.Function1[/* val */ String, Double]] = js.native
  /**
    * Text to display below the chart's x-axis. You can supply any HTML for this value, not just
    * text. If you wish to style it using CSS, use the 'dygraph-label' or 'dygraph-xlabel'
    * classes.
    */
  var xlabel: js.UndefOr[String] = js.native
  /**
    * Text to display to the right of the chart's secondary y-axis. This label is only displayed
    * if a secondary y-axis is present. See <a
    * href='http://dygraphs.com/tests/two-axes.html'>this test</a> for an example of how to do
    * this. The comments for the 'ylabel' option generally apply here as well. This label gets a
    * 'dygraph-y2label' instead of a 'dygraph-ylabel' class.
    */
  var y2label: js.UndefOr[String] = js.native
  /**
    * Width of the div which contains the y-axis label. Since the y-axis label appears rotated
    * 90 degrees, this actually affects the height of its div.
    */
  var yLabelWidth: js.UndefOr[Double] = js.native
  /**
    * If set, add the specified amount of extra space (in pixels) around the Y-axis value range
    * to ensure points at the edges remain visible. If unset, use the traditional Y padding
    * algorithm.
    */
  var yRangePad: js.UndefOr[Double] = js.native
  /**
    * Text to display to the left of the chart's y-axis. You can supply any HTML for this value,
    * not just text. If you wish to style it using CSS, use the 'dygraph-label' or
    * 'dygraph-ylabel' classes. The text will be rotated 90 degrees by default, so CSS rules may
    * behave in unintuitive ways. No additional space is set aside for a y-axis label. If you
    * need more space, increase the width of the y-axis tick labels using the yAxisLabelWidth
    * option. If you need a wider div for the y-axis label, either style it that way with CSS
    * (but remember that it's rotated, so width is controlled by the 'height' property) or set
    * the yLabelWidth option.
    */
  var ylabel: js.UndefOr[String] = js.native
  /**
    * A function to call when the zoom window is changed (either by zooming in or out).
    */
  var zoomCallback: js.UndefOr[
    js.Function3[
      /* minDate */ Double, 
      /* maxDate */ Double, 
      /* yRanges */ js.Array[js.Tuple2[Double, Double]], 
      _
    ]
  ] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimatedZooms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedZooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimatedZooms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedZooms")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationClickHandler(
      value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationClickHandler")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAnnotationClickHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationClickHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationDblClickHandler(
      value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationDblClickHandler")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAnnotationDblClickHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationDblClickHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationMouseOutHandler(
      value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationMouseOutHandler")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAnnotationMouseOutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationMouseOutHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationMouseOverHandler(
      value: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationMouseOverHandler")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAnnotationMouseOverHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationMouseOverHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withAxes(value: AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
        ret
    }
    @scala.inline
    def withClickCallback(value: (/* e */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutClickCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSaturation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSaturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSaturation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSaturation")(js.undefined)
        ret
    }
    @scala.inline
    def withColorValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValue")(js.undefined)
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
    def withConnectSeparatedPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectSeparatedPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectSeparatedPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectSeparatedPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomBars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomBars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBars")(js.undefined)
        ret
    }
    @scala.inline
    def withDataHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withDateWindow(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDigitsAfterDecimal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digitsAfterDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigitsAfterDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digitsAfterDecimal")(js.undefined)
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
    def withDrawAxesAtZero(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawAxesAtZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawAxesAtZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawAxesAtZero")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawCallback(value: (/* dygraph */ Dygraph, /* is_initial */ Boolean) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDrawCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawGapEdgePoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawGapEdgePoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawGapEdgePoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawGapEdgePoints")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawHighlightPointCallback(
      value: (/* g */ Dygraph, /* seriesName */ String, /* canvasContext */ CanvasRenderingContext2D, /* cx */ Double, /* cy */ Double, /* color */ String, /* pointSize */ Double) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawHighlightPointCallback")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withoutDrawHighlightPointCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawHighlightPointCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawPointCallback(
      value: (/* g */ Dygraph, /* seriesName */ String, /* canvasContext */ CanvasRenderingContext2D, /* cx */ Double, /* cy */ Double, /* color */ String, /* pointSize */ Double) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPointCallback")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withoutDrawPointCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawPointCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorBars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorBars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBars")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withFractions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFractions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractions")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOverlayOnMouseOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOverlayOnMouseOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOverlayOnMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOverlayOnMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightCallback(
      value: (/* event */ MouseEvent, /* xval */ Double, /* points */ js.Array[Point], /* row */ Double, /* seriesName */ String) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCallback")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutHighlightCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSeriesBackgroundAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSeriesBackgroundAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSeriesBackgroundAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSeriesBackgroundAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSeriesBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSeriesBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSeriesBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSeriesBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSeriesOpts(value: PerSeriesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSeriesOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSeriesOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSeriesOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeZero(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeZero")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractionModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractionModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionModel")(js.undefined)
        ret
    }
    @scala.inline
    def withIsZoomedIgnoreProgrammaticZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isZoomedIgnoreProgrammaticZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsZoomedIgnoreProgrammaticZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isZoomedIgnoreProgrammaticZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsDivHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsDiv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelsDiv(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsDiv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsDiv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsDiv")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsDivStyles(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsDivStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsDivStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsDivStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsDivWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsDivWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsDivWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsDivWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsSeparateLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsSeparateLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsSeparateLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsSeparateLines")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsShowZeroValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsShowZeroValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsShowZeroValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsShowZeroValues")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsUTC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsUTC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsUTC")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: always | follow | onmouseover | never): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendFormatter(value: /* legendData */ LegendData => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLegendFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withPanEdgeFraction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panEdgeFraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanEdgeFraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panEdgeFraction")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPointClickCallback(value: (/* e */ MouseEvent, /* point */ Point) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointClickCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPointClickCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointClickCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSelectorHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSelectorHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSelectorPlotFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorPlotFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSelectorPlotFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorPlotFillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSelectorPlotStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorPlotStrokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSelectorPlotStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSelectorPlotStrokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRightGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightGap")(js.undefined)
        ret
    }
    @scala.inline
    def withRollPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: StringDictionary[PerSeriesOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLabelsOnHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabelsOnHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLabelsOnHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabelsOnHighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRangeSelector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRangeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRangeSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRangeSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoller(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoller")(js.undefined)
        ret
    }
    @scala.inline
    def withSigma(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigma")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedGraph(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedGraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedGraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedGraph")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedGraphNaNFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedGraphNaNFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedGraphNaNFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedGraphNaNFill")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlayCallback(value: (/* context */ CanvasRenderingContext2D, /* area */ Area, /* dygraph */ Dygraph) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUnderlayCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withUnhighlightCallback(value: /* event */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhighlightCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnhighlightCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhighlightCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWilsonInterval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wilsonInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWilsonInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wilsonInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withXLabelHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLabelHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXLabelHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLabelHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withXRangePad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xRangePad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXRangePad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xRangePad")(js.undefined)
        ret
    }
    @scala.inline
    def withXValueParser(value: /* val */ String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xValueParser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutXValueParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xValueParser")(js.undefined)
        ret
    }
    @scala.inline
    def withXlabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXlabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlabel")(js.undefined)
        ret
    }
    @scala.inline
    def withY2label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY2label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2label")(js.undefined)
        ret
    }
    @scala.inline
    def withYLabelWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yLabelWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYLabelWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yLabelWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withYRangePad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yRangePad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYRangePad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yRangePad")(js.undefined)
        ret
    }
    @scala.inline
    def withYlabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ylabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYlabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ylabel")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomCallback(
      value: (/* minDate */ Double, /* maxDate */ Double, /* yRanges */ js.Array[js.Tuple2[Double, Double]]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutZoomCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomCallback")(js.undefined)
        ret
    }
  }
  
}

