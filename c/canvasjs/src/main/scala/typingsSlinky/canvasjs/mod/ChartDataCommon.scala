package typingsSlinky.canvasjs.mod

import typingsSlinky.canvasjs.anon.DataSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartDataCommon extends js.Object {
  /**
    * Sets the click event handler for dataSeries which is triggered when user clicks on a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var click: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  /**
    * Sets the color of dataSeries. The value of tickColor can be a "HTML Color Name" or "Hex Code".
    * Default: Automatically set from Theme.
    * Example: "red", "green" ..
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Enables or Disables highlighting of dataPoints on mouse hover.
    * Default: true
    * Example: true,false
    */
  var highlightEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Instead of setting string values for all indexLabels, you can also use keywords like x, y, etc that will automatically show corresponding properties as indexLabel.
    * This will allow you to define indexLabel at the series level once. While setting indexLabel you specify a keyword by enclosing it in flower brackets like {x}, {y}, {color}, etc.
    * Range Charts have two indexLabels – one for each y value. This requires the use of a special keyword #index to show index label on either sides of the column/bar/area.
    * eg: indexLabel: "{x}: {y[#index]}"
    * Important keywords to keep in mind are. {x}, {y}, {name}, {label}.
    * Default: null
    * Example: "{label}", "Win", "x: {x}, y: {y} "
    */
  var indexLabel: js.UndefOr[String] = js.native
  /**
    * Sets the Background color of Index Labels. The value of indexLabelBackgroundColor can be a "HTML Color Name" or "Hex Code".
    * Default: null
    * Example: "red", "#FAC003" ..
    */
  var indexLabelBackgroundColor: js.UndefOr[String] = js.native
  /**
    * Sets the Index Label’s Font color. The value of IndexLabelFontColor can be a "HTML Color Name" or "Hex Code".
    * Default: "grey"
    * Example: "red", "#FAC003" ..
    */
  var indexLabelFontColor: js.UndefOr[String] = js.native
  /**
    * Sets the Index Label’s Font Family.
    * Default: "Calibri, Optima, Candara, Verdana, Geneva, sans-serif"
    * Example: "calibri", "tahoma", "verdana"..
    */
  var indexLabelFontFamily: js.UndefOr[String] = js.native
  /**
    * Sets the Index Label’s Font Size in pixels.
    * Default: 18
    * Example: 12, 16, 22..
    */
  var indexLabelFontSize: js.UndefOr[Double] = js.native
  /**
    * Sets the Index Label’s Font Style. It can be set to one of the below options.
    * Default: "normal"
    * Options: "italic", "oblique", "normal"
    */
  var indexLabelFontStyle: js.UndefOr[String] = js.native
  /**
    * Sets the Index Label’s Font Weight. It can be set to one of the below options.
    * Default: "normal"
    * Example: "lighter", "normal" ,"bold" , "bolder"
    */
  var indexLabelFontWeight: js.UndefOr[String] = js.native
  /**
    * A custom formatter function which returns the text to be displayed as indexLabel on dataPoints.
    * @param e event object
    */
  var indexLabelFormatter: js.UndefOr[js.Function1[/* e */ DataSeries, String]] = js.native
  /**
    * Sets the color of line connecting index labels with their dataPoint. It is only applicable for pie and doughnut chart when indexLabelPlacment is outside.
    * The value of indexLineColor can be a "HTML Color Name" or "Hex Code".
    * Default: "lightgrey"
    * Example: "red", "#FAC003" ..
    */
  var indexLabelLineColor: js.UndefOr[String] = js.native
  /**
    * Sets the Dash Type for indexLabel’s line. It is applicable only for pie and doughnut charts when indexLabelPlacement is set to “outside”.
    * For other chart-types, indexLabelLineThickness should be set greater than zero.
    * Default: solid
    */
  var indexLabelLineDashType: js.UndefOr[DashType] = js.native
  /**
    * Sets the thickness of line connecting indexLabel with its corresponding dataPoint.
    * It is only applicable for pie and doughnut chart when indexLabelPlacement is set to "outside".
    * Default: 2
    * Example: 4, 6
    */
  var indexLabelLineThickness: js.UndefOr[Double] = js.native
  /**
    * Sets the Orientation of indexLabel to "horizontal" or "vertical".
    * Default: "horizontal"
    * Options: "horizontal", "vertical"
    */
  var indexLabelOrientation: js.UndefOr[String] = js.native
  /**
    * Using this property you can define whether to render indexLabel "inside" or "outside" the dataPoint.
    * Default: "outside"
    * Example: "outside", "inside"
    */
  var indexLabelPlacement: js.UndefOr[String] = js.native
  /**
    * Sets the border color around the legend marker. Value of legendMarkerBorderColor can be “color names” or “hex code”.
    * Default: dataSeries color.
    * Example: “red”, “#008000” ..
    */
  var legendMarkerBorderColor: js.UndefOr[String] = js.native
  /**
    * Sets the thickness of the legend’s Marker Border in pixels.
    * Default: 0
    * Example: 2, 4 ..
    */
  var legendMarkerBorderThickness: js.UndefOr[Double] = js.native
  /**
    * Sets the color of marker that is displayed on legend. This property overrides default Marker’s Color in Legend, which is same as dataSeries Marker Color.
    * Value of legendMarkerColor can be "HTML Color Name" or "hex code".
    * Default: dataSeries marker color
    * Example: "red", "#008000" ..
    */
  var legendMarkerColor: js.UndefOr[String] = js.native
  /**
    * Sets the Legend Marker to one of the options below. This property is used to override the default marker in legend, which is same as dataSeries Marker Type.
    * Default: same as markerType
    * Options: "circle", "square", "cross" and "triangle"
    */
  var legendMarkerType: js.UndefOr[String] = js.native
  /**
    * Sets the text that describes the dataSeries in legend.
    * Default: "DataSeries 1", "DataSeries 2" ..etc
    * Example: "2010", "2011"..
    */
  var legendText: js.UndefOr[String] = js.native
  /**
    * Sets the border color around marker. Value of markerBorderColor can be "HTML Color Name" or "hex code".
    * Default: dataSeries color.
    * Example: "red", "#008000" ..
    */
  var markerBorderColor: js.UndefOr[String] = js.native
  /**
    * Sets the thickness of the Marker’s Border in pixels.
    * Default: 1
    * Example: 2,4 ..
    */
  var markerBorderThickness: js.UndefOr[Double] = js.native
  /**
    * Sets the color of marker that is displayed on the Chart. Legend Marker for the series uses the same Color as set here unless overridden using legendMarkerColor property.
    * Default: dataSeries Color
    * Example: "red", "#008000" ..
    */
  var markerColor: js.UndefOr[String] = js.native
  /**
    * Sets the Size of the marker that is drawn. To display marker in area Chart, set markerSize to a value greater than zero.
    * For line, scatter chart, size it is automatically set unless overridden.
    * Default: auto. Zero for area chart
    * Example: 5, 10..
    */
  var markerSize: js.UndefOr[Double] = js.native
  /**
    * Sets marker type to be rendered at each dataPoint. While markers are helpful in highlighting individual dataPoints, they do not help much when the dataPoints are crowded.
    * In case of large number of dataPoints it is recommended to disable markers in order to improve the appearance and performance of chart.
    * Same marker type is also used in legend unless overridden by legendMarkerType property.
    * Default: "circle"
    * Options: "none", "circle", "square", "triangle" and "cross"
    */
  var markerType: js.UndefOr[String] = js.native
  /**
    * Sets the mousemove event handler for dataSeries which is triggered when user Moves mouse on a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mousemove: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  /**
    * Sets the mouseout event handler for dataSeries which is triggered when user moves mouse out of a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mouseout: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  /**
    * Sets the mouseover event handler for dataSeries which is triggered when user moves Mouse Over a dataSeries.
    * Upon event, a parameter that contains event related data is sent to the assigned event handler.
    * Parameter includes dataPoint and dataSeries corresponding to the event.
    * Default: null
    */
  var mouseover: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  /**
    * Sets the dataPoint Name. dataPoint name is shown in various places like toolTip & legend unless overridden.
    * Default: Automatically Named ("dataPoint 1", "dataPoint 2" .. )
    * Example: "apple", "mango" ..
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Default Tooltip can be modified at dataSeries or dataPoint level. You can add content to be displayed in toolTip using toolTipContent.
    * toolTipContent set at dataPoint will override toolTipContent set at dataSeries level.
    * Default: auto set depending on chart type.
    */
  var toolTipContent: js.UndefOr[String] = js.native
}

object ChartDataCommon {
  @scala.inline
  def apply(): ChartDataCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataCommon]
  }
  @scala.inline
  implicit class ChartDataCommonOps[Self <: ChartDataCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: /* event */ ChartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
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
    def withHighlightEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLabelBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLabelBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLabelFontColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLabelFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelFontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLabelFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLabelFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLabelFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLabelFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLabelFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLabelFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelFontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLabelFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelFontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLabelFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelFontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLabelFormatter(value: /* e */ DataSeries => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIndexLabelFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLabelLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLabelLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLabelLineDashType(value: DashType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelLineDashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLabelLineDashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelLineDashType")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLabelLineThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelLineThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLabelLineThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelLineThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLabelOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLabelOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLabelPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLabelPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLabelPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendMarkerBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendMarkerBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendMarkerBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendMarkerBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendMarkerBorderThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendMarkerBorderThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendMarkerBorderThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendMarkerBorderThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendMarkerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendMarkerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendMarkerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendMarkerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendMarkerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendMarkerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendMarkerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendMarkerType")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendText")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerBorderThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerBorderThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerBorderThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerBorderThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerType")(js.undefined)
        ret
    }
    @scala.inline
    def withMousemove(value: /* event */ ChartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseout(value: /* event */ ChartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseover(value: /* event */ ChartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(js.undefined)
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
    def withToolTipContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTipContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolTipContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTipContent")(js.undefined)
        ret
    }
  }
  
}

