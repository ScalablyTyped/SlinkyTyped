package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSeriesItem extends js.Object {
  var aggregate: js.UndefOr[String | js.Function] = js.native
  var axis: js.UndefOr[String] = js.native
  var border: js.UndefOr[ChartSeriesItemBorder] = js.native
  var categoryAxis: js.UndefOr[String] = js.native
  var categoryField: js.UndefOr[String] = js.native
  var closeField: js.UndefOr[String] = js.native
  var color: js.UndefOr[String | js.Function] = js.native
  var colorField: js.UndefOr[String] = js.native
  var connectors: js.UndefOr[ChartSeriesItemConnectors] = js.native
  var currentField: js.UndefOr[String] = js.native
  var dashType: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var downColor: js.UndefOr[String | js.Function] = js.native
  var downColorField: js.UndefOr[String] = js.native
  var dynamicHeight: js.UndefOr[Boolean] = js.native
  var dynamicSlope: js.UndefOr[Boolean] = js.native
  var errorBars: js.UndefOr[ChartSeriesItemErrorBars] = js.native
  var errorHighField: js.UndefOr[String] = js.native
  var errorLowField: js.UndefOr[String] = js.native
  var explodeField: js.UndefOr[String] = js.native
  var extremes: js.UndefOr[ChartSeriesItemExtremes] = js.native
  var field: js.UndefOr[String] = js.native
  var fromField: js.UndefOr[String] = js.native
  var gap: js.UndefOr[Double] = js.native
  var highField: js.UndefOr[String] = js.native
  var highlight: js.UndefOr[ChartSeriesItemHighlight] = js.native
  var holeSize: js.UndefOr[Double] = js.native
  var labels: js.UndefOr[ChartSeriesItemLabels] = js.native
  var line: js.UndefOr[String | ChartSeriesItemLine] = js.native
  var lowField: js.UndefOr[String] = js.native
  var lowerField: js.UndefOr[String] = js.native
  var margin: js.UndefOr[Double | ChartSeriesItemMargin] = js.native
  var markers: js.UndefOr[ChartSeriesItemMarkers] = js.native
  var maxSize: js.UndefOr[Double] = js.native
  var meanField: js.UndefOr[String] = js.native
  var medianField: js.UndefOr[String] = js.native
  var minSize: js.UndefOr[Double] = js.native
  var missingValues: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var neckRatio: js.UndefOr[Double] = js.native
  var negativeColor: js.UndefOr[String] = js.native
  var negativeValues: js.UndefOr[ChartSeriesItemNegativeValues] = js.native
  var noteTextField: js.UndefOr[String] = js.native
  var notes: js.UndefOr[ChartSeriesItemNotes] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var openField: js.UndefOr[String] = js.native
  var outliers: js.UndefOr[ChartSeriesItemOutliers] = js.native
  var outliersField: js.UndefOr[String] = js.native
  var overlay: js.UndefOr[ChartSeriesItemOverlay] = js.native
  var padding: js.UndefOr[Double] = js.native
  var q1Field: js.UndefOr[String] = js.native
  var q3Field: js.UndefOr[String] = js.native
  var segmentSpacing: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var sizeField: js.UndefOr[String] = js.native
  var spacing: js.UndefOr[Double] = js.native
  var stack: js.UndefOr[Boolean | String | ChartSeriesItemStack] = js.native
  var startAngle: js.UndefOr[Double] = js.native
  var style: js.UndefOr[String] = js.native
  var summaryField: js.UndefOr[String] = js.native
  var target: js.UndefOr[ChartSeriesItemTarget] = js.native
  var targetField: js.UndefOr[String] = js.native
  var toField: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[ChartSeriesItemTooltip] = js.native
  var `type`: js.UndefOr[String] = js.native
  var upperField: js.UndefOr[String] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var visibleInLegend: js.UndefOr[Boolean] = js.native
  var visibleInLegendField: js.UndefOr[String] = js.native
  var visual: js.UndefOr[js.Function] = js.native
  var width: js.UndefOr[Double] = js.native
  var xAxis: js.UndefOr[String] = js.native
  var xErrorHighField: js.UndefOr[String] = js.native
  var xErrorLowField: js.UndefOr[String] = js.native
  var xField: js.UndefOr[String] = js.native
  var yAxis: js.UndefOr[String] = js.native
  var yErrorHighField: js.UndefOr[String] = js.native
  var yErrorLowField: js.UndefOr[String] = js.native
  var yField: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object ChartSeriesItem {
  @scala.inline
  def apply(): ChartSeriesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItem]
  }
  @scala.inline
  implicit class ChartSeriesItemOps[Self <: ChartSeriesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: String): Self = {
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
    def withBorder(value: ChartSeriesItemBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoryAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoryField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryField")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeField")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String | js.Function): Self = {
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
    def withColorField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorField")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectors(value: ChartSeriesItemConnectors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectors")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentField")(js.undefined)
        ret
    }
    @scala.inline
    def withDashType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashType")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDownColor(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDownColorField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downColorField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownColorField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downColorField")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicSlope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicSlope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicSlope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicSlope")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorBars(value: ChartSeriesItemErrorBars): Self = {
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
    def withErrorHighField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHighField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorHighField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHighField")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorLowField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLowField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorLowField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLowField")(js.undefined)
        ret
    }
    @scala.inline
    def withExplodeField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explodeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplodeField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explodeField")(js.undefined)
        ret
    }
    @scala.inline
    def withExtremes(value: ChartSeriesItemExtremes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extremes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtremes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extremes")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withFromField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromField")(js.undefined)
        ret
    }
    @scala.inline
    def withGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(js.undefined)
        ret
    }
    @scala.inline
    def withHighField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highField")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight(value: ChartSeriesItemHighlight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withHoleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: ChartSeriesItemLabels): Self = {
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
    def withLine(value: String | ChartSeriesItemLine): Self = {
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
    def withLowField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowField")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerField")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double | ChartSeriesItemMargin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkers(value: ChartSeriesItemMarkers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMeanField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeanField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanField")(js.undefined)
        ret
    }
    @scala.inline
    def withMedianField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedianField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianField")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingValues(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingValues")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNeckRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neckRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeckRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neckRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeValues(value: ChartSeriesItemNegativeValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeValues")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteTextField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteTextField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteTextField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteTextField")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: ChartSeriesItemNotes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openField")(js.undefined)
        ret
    }
    @scala.inline
    def withOutliers(value: ChartSeriesItemOutliers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outliers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutliers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outliers")(js.undefined)
        ret
    }
    @scala.inline
    def withOutliersField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outliersField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutliersField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outliersField")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: ChartSeriesItemOverlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withQ1Field(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1Field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ1Field: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q1Field")(js.undefined)
        ret
    }
    @scala.inline
    def withQ3Field(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3Field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ3Field: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q3Field")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeField")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: Boolean | String | ChartSeriesItemStack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryField")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: ChartSeriesItemTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetField")(js.undefined)
        ret
    }
    @scala.inline
    def withToField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toField")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: ChartSeriesItemTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpperField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperField")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleInLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleInLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleInLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleInLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleInLegendField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleInLegendField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleInLegendField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleInLegendField")(js.undefined)
        ret
    }
    @scala.inline
    def withVisual(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual")(js.undefined)
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
    def withXAxis(value: String): Self = {
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
    def withXErrorHighField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xErrorHighField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXErrorHighField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xErrorHighField")(js.undefined)
        ret
    }
    @scala.inline
    def withXErrorLowField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xErrorLowField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXErrorLowField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xErrorLowField")(js.undefined)
        ret
    }
    @scala.inline
    def withXField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xField")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxis(value: String): Self = {
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
    @scala.inline
    def withYErrorHighField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yErrorHighField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYErrorHighField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yErrorHighField")(js.undefined)
        ret
    }
    @scala.inline
    def withYErrorLowField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yErrorLowField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYErrorLowField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yErrorLowField")(js.undefined)
        ret
    }
    @scala.inline
    def withYField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yField")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

