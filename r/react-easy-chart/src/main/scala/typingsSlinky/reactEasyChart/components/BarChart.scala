package typingsSlinky.reactEasyChart.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactEasyChart.AnonBottom
import typingsSlinky.reactEasyChart.AnonX
import typingsSlinky.reactEasyChart.mod.BarChartProps
import typingsSlinky.reactEasyChart.mod.BarData
import typingsSlinky.reactEasyChart.mod.LineData
import typingsSlinky.reactEasyChart.reactEasyChartStrings.linear
import typingsSlinky.reactEasyChart.reactEasyChartStrings.text
import typingsSlinky.reactEasyChart.reactEasyChartStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BarChart
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactEasyChart.mod.BarChart] {
  @JSImport("react-easy-chart", "BarChart")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: js.Array[BarData],
    axes: js.UndefOr[Boolean] = js.undefined,
    axisLabels: AnonX = null,
    barWidth: Int | Double = null,
    clickHandler: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _ = null,
    colorBars: js.UndefOr[Boolean] = js.undefined,
    datePattern: String = null,
    grid: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    interpolate: String = null,
    lineData: js.Array[LineData] = null,
    margin: AnonBottom = null,
    mouseMoveHandler: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _ = null,
    mouseOutHandler: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _ = null,
    mouseOverHandler: (/* data */ BarData, /* mouseEvent */ MouseEvent) => _ = null,
    tickTimeDisplayFormat: String = null,
    width: Int | Double = null,
    xDomainRange: js.Array[js.Date | Double | String] = null,
    xTickNumber: Int | Double = null,
    xType: time | text | linear = null,
    y2Type: time | text | linear = null,
    yAxisOrientRight: js.UndefOr[Boolean] = js.undefined,
    yDomainRange: js.Array[Double] = null,
    yTickNumber: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactEasyChart.mod.BarChart] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (axisLabels != null) __obj.updateDynamic("axisLabels")(axisLabels.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction2(clickHandler))
    if (!js.isUndefined(colorBars)) __obj.updateDynamic("colorBars")(colorBars.asInstanceOf[js.Any])
    if (datePattern != null) __obj.updateDynamic("datePattern")(datePattern.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (lineData != null) __obj.updateDynamic("lineData")(lineData.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(js.Any.fromFunction2(mouseMoveHandler))
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(js.Any.fromFunction2(mouseOutHandler))
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(js.Any.fromFunction2(mouseOverHandler))
    if (tickTimeDisplayFormat != null) __obj.updateDynamic("tickTimeDisplayFormat")(tickTimeDisplayFormat.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xDomainRange != null) __obj.updateDynamic("xDomainRange")(xDomainRange.asInstanceOf[js.Any])
    if (xTickNumber != null) __obj.updateDynamic("xTickNumber")(xTickNumber.asInstanceOf[js.Any])
    if (xType != null) __obj.updateDynamic("xType")(xType.asInstanceOf[js.Any])
    if (y2Type != null) __obj.updateDynamic("y2Type")(y2Type.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisOrientRight)) __obj.updateDynamic("yAxisOrientRight")(yAxisOrientRight.asInstanceOf[js.Any])
    if (yDomainRange != null) __obj.updateDynamic("yDomainRange")(yDomainRange.asInstanceOf[js.Any])
    if (yTickNumber != null) __obj.updateDynamic("yTickNumber")(yTickNumber.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BarChartProps
}

