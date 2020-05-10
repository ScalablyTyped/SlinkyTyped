package typingsSlinky.morrisJs.morris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILineOptions extends IGridChartOptions {
  /** Define how null and undefined values are handled (see documentation). */
  var continuousLine: js.UndefOr[Boolean] = js.native
  /** A function that accepts millisecond timestamps and formats them for display as chart labels. */
  var dateFormat: js.UndefOr[js.Function1[/* timestamp */ Double, String]] = js.native
  /** Array of color values to use for the event line colors. If you list fewer colors here than you have lines in events, then the values will be cycled. */
  var eventLineColors: js.UndefOr[js.Array[String]] = js.native
  /** Width, in pixels, of the event lines. */
  var eventStrokeWidth: js.UndefOr[Double] = js.native
  /** A list of x-values to draw as vertical 'event' lines on the chart. */
  var events: js.UndefOr[js.Array[String]] = js.native
  /** Change the opacity of the area fill colour. Accepts values between 0.0 (for completely transparent) and 1.0 (for completely opaque). */
  var fillOpacity: js.UndefOr[Double] = js.native
  /** Array of color values to use for the goal line colors. If you list fewer colors here than you have lines in goals, then the values will be cycled. */
  var goalLineColors: js.UndefOr[js.Array[String]] = js.native
  /** Width, in pixels, of the goal lines. */
  var goalStrokeWidth: js.UndefOr[Double] = js.native
  /** A list of y-values to draw as horizontal 'goal' lines on the chart. */
  var goals: js.UndefOr[js.Array[Double]] = js.native
  /** Provide a function on this option to generate custom hover legends. */
  var hoverCallback: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* options */ ILineOptions, 
      /* content */ String, 
      /* row */ js.Any, 
      String
    ]
  ] = js.native
  /** Array containing colors for the series lines/points. */
  var lineColors: js.UndefOr[js.Array[String]] = js.native
  /** Width of the series lines, in pixels. */
  var lineWidth: js.UndefOr[Double] = js.native
  /** Set to false to skip time/date parsing for X values, instead treating them as an equally-spaced series. */
  var parseTime: js.UndefOr[Boolean] = js.native
  /** Colors for the series points. By default uses the same values as lineColors */
  var pointFillColors: js.UndefOr[js.Array[String]] = js.native
  /** Diameter of the series points, in pixels. */
  var pointSize: js.UndefOr[Double] = js.native
  /** Colors for the outlines of the series points. (#ffffff by default). */
  var pointStrokeColors: js.UndefOr[js.Array[String]] = js.native
  /** Set to a string value (eg: '%') to add a label suffix all y-labels. */
  var postUnits: js.UndefOr[String] = js.native
  /** Set to a string value (eg: '$') to add a label prefix all y-labels. */
  var preUnits: js.UndefOr[String] = js.native
  /** Set to false to disable line smoothing. */
  var smooth: js.UndefOr[Boolean] = js.native
  /** The angle in degrees from horizontal to draw x-axis labels. */
  var xLabelAngle: js.UndefOr[Double] = js.native
  /** A function that accepts Date objects and formats them for display as x-axis labels. Overrides the default formatter chosen by the automatic labeller or the xLabels option. */
  var xLabelFormat: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.native
  /** Sets the x axis labelling interval. By default the interval will be automatically computed. */
  var xLabels: js.UndefOr[Interval] = js.native
  /** A function that accepts y-values and formats them for display as y-axis labels. */
  var yLabelFormat: js.UndefOr[js.Function1[/* val */ js.Any, String]] = js.native
  /** Max. bound for Y-values. Alternatively, set this to 'auto' to compute automatically, or 'auto [num]' to automatically compute and ensure that the max y-value is at least [num]. */
  var ymax: js.UndefOr[Double | String] = js.native
  /** Min. bound for Y-values. Alternatively, set this to 'auto' to compute automatically, or 'auto [num]' to automatically compute and ensure that the min y-value is at most [num]. */
  var ymin: js.UndefOr[Double | String] = js.native
}

object ILineOptions {
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[String],
    xkey: String,
    ykeys: js.Array[String]
  ): ILineOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILineOptions]
  }
  @scala.inline
  implicit class ILineOptionsOps[Self <: ILineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinuousLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuousLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuousLine")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: /* timestamp */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withEventLineColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLineColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventLineColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLineColors")(js.undefined)
        ret
    }
    @scala.inline
    def withEventStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventStrokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventStrokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withGoalLineColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalLineColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoalLineColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalLineColors")(js.undefined)
        ret
    }
    @scala.inline
    def withGoalStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalStrokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoalStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalStrokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGoals(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goals")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverCallback(
      value: (/* index */ Double, /* options */ ILineOptions, /* content */ String, /* row */ js.Any) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCallback")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutHoverCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withLineColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColors")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withParseTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPointFillColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointFillColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointFillColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointFillColors")(js.undefined)
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
    def withPointStrokeColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointStrokeColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointStrokeColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointStrokeColors")(js.undefined)
        ret
    }
    @scala.inline
    def withPostUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withPreUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withSmooth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(js.undefined)
        ret
    }
    @scala.inline
    def withXLabelAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLabelAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXLabelAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLabelAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withXLabelFormat(value: /* date */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLabelFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutXLabelFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLabelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withXLabels(value: Interval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withYLabelFormat(value: /* val */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yLabelFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutYLabelFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yLabelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withYmax(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ymax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYmax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ymax")(js.undefined)
        ret
    }
    @scala.inline
    def withYmin(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ymin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ymin")(js.undefined)
        ret
    }
  }
  
}

