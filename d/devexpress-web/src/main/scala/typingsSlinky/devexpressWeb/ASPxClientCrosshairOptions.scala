package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairOptions class.
  */
@js.native
trait ASPxClientCrosshairOptions extends ASPxClientWebChartElement {
  /**
    * Gets the color of a crosshair argument line.
    */
  var argumentLineColor: String = js.native
  /**
    * Specifies the way in which the crosshair label is shown for a series on a diagram.
    */
  var crosshairLabelMode: String = js.native
  /**
    * Gets a string which represents the  pattern specifying the group header text to be displayed within the crosshair label.
    */
  var groupHeaderPattern: String = js.native
  /**
    * Gets the value specifying how the Crosshair Cursor's lines snap to points when hovering on them.
    */
  var linesMode: String = js.native
  /**
    * Gets a value that indicates whether a crosshair cursor argument line is shown for a series point on a diagram.
    */
  var showArgumentLine: Boolean = js.native
  /**
    * Gets a value indicating whether it is necessary to show a crosshair label for the X-axis.
    */
  var showAxisXLabels: Boolean = js.native
  /**
    * Gets a value indicating whether it is necessary to show a crosshair label for the Y-axis.
    */
  var showAxisYLabels: Boolean = js.native
  /**
    * Gets a value that defines whether a crosshair label of a series point indicated by a crosshair cursor is shown on a diagram.
    */
  var showCrosshairLabels: Boolean = js.native
  /**
    * Gets a value that indicates whether to show a header for each series group in crosshair cursor labels.
    */
  var showGroupHeaders: Boolean = js.native
  /**
    * Gets a value that specifies whether to show a crosshair cursor in a focused pane only.
    */
  var showOnlyInFocusedPane: Boolean = js.native
  /**
    * Gets a value that specifies whether the Crosshair cursor should show points that are out of visual range.
    */
  var showOutOfRangePoints: Boolean = js.native
  /**
    * Specifies whether to show a value line of a series point indicated by a crosshair cursor on a diagram.
    */
  var showValueLine: Boolean = js.native
  /**
    * Specifies the current snap mode of a crosshair cursor.
    */
  var snapMode: String = js.native
  /**
    * Gets the color of a crosshair value line.
    */
  var valueLineColor: String = js.native
  /**
    * Gets the identifier specifying the behavior of the selection of points shown in the crosshair label.
    */
  var valueSelectionMode: String = js.native
}

object ASPxClientCrosshairOptions {
  @scala.inline
  def apply(
    argumentLineColor: String,
    chart: ASPxClientWebChart,
    crosshairLabelMode: String,
    groupHeaderPattern: String,
    linesMode: String,
    showArgumentLine: Boolean,
    showAxisXLabels: Boolean,
    showAxisYLabels: Boolean,
    showCrosshairLabels: Boolean,
    showGroupHeaders: Boolean,
    showOnlyInFocusedPane: Boolean,
    showOutOfRangePoints: Boolean,
    showValueLine: Boolean,
    snapMode: String,
    valueLineColor: String,
    valueSelectionMode: String
  ): ASPxClientCrosshairOptions = {
    val __obj = js.Dynamic.literal(argumentLineColor = argumentLineColor.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], crosshairLabelMode = crosshairLabelMode.asInstanceOf[js.Any], groupHeaderPattern = groupHeaderPattern.asInstanceOf[js.Any], linesMode = linesMode.asInstanceOf[js.Any], showArgumentLine = showArgumentLine.asInstanceOf[js.Any], showAxisXLabels = showAxisXLabels.asInstanceOf[js.Any], showAxisYLabels = showAxisYLabels.asInstanceOf[js.Any], showCrosshairLabels = showCrosshairLabels.asInstanceOf[js.Any], showGroupHeaders = showGroupHeaders.asInstanceOf[js.Any], showOnlyInFocusedPane = showOnlyInFocusedPane.asInstanceOf[js.Any], showOutOfRangePoints = showOutOfRangePoints.asInstanceOf[js.Any], showValueLine = showValueLine.asInstanceOf[js.Any], snapMode = snapMode.asInstanceOf[js.Any], valueLineColor = valueLineColor.asInstanceOf[js.Any], valueSelectionMode = valueSelectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairOptions]
  }
  @scala.inline
  implicit class ASPxClientCrosshairOptionsOps[Self <: ASPxClientCrosshairOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrosshairLabelMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairLabelMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupHeaderPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeaderPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinesMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowArgumentLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArgumentLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowAxisXLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAxisXLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowAxisYLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAxisYLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowCrosshairLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCrosshairLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowGroupHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGroupHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowOnlyInFocusedPane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnlyInFocusedPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowOutOfRangePoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOutOfRangePoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowValueLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValueLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueSelectionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSelectionMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

