package typingsSlinky.reactEasyChart.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactEasyChart.AnonBottom
import typingsSlinky.reactEasyChart.AnonStroke
import typingsSlinky.reactEasyChart.AnonY
import typingsSlinky.reactEasyChart.mod.ScatterplotChartProps
import typingsSlinky.reactEasyChart.mod.ScatterplotData
import typingsSlinky.reactEasyChart.reactEasyChartStrings.linear
import typingsSlinky.reactEasyChart.reactEasyChartStrings.text
import typingsSlinky.reactEasyChart.reactEasyChartStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScatterplotChart
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactEasyChart.mod.ScatterplotChart] {
  @JSImport("react-easy-chart", "ScatterplotChart")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: js.Array[ScatterplotData],
    axes: js.UndefOr[Boolean] = js.undefined,
    axisLabels: AnonY = null,
    clickHandler: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _ = null,
    config: js.Array[AnonStroke] = null,
    dotRadius: Int | Double = null,
    grid: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    margin: AnonBottom = null,
    mouseMoveHandler: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _ = null,
    mouseOutHandler: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _ = null,
    mouseOverHandler: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => _ = null,
    verticalGrid: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    xDomainRange: js.Array[js.Date | Double | String] = null,
    xType: time | text | linear = null,
    yAxisOrientRight: js.UndefOr[Boolean] = js.undefined,
    yDomainRange: js.Array[js.Date | Double | String] = null,
    yType: time | text | linear = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactEasyChart.mod.ScatterplotChart] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (axisLabels != null) __obj.updateDynamic("axisLabels")(axisLabels.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction2(clickHandler))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (dotRadius != null) __obj.updateDynamic("dotRadius")(dotRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(js.Any.fromFunction2(mouseMoveHandler))
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(js.Any.fromFunction2(mouseOutHandler))
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(js.Any.fromFunction2(mouseOverHandler))
    if (!js.isUndefined(verticalGrid)) __obj.updateDynamic("verticalGrid")(verticalGrid.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xDomainRange != null) __obj.updateDynamic("xDomainRange")(xDomainRange.asInstanceOf[js.Any])
    if (xType != null) __obj.updateDynamic("xType")(xType.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisOrientRight)) __obj.updateDynamic("yAxisOrientRight")(yAxisOrientRight.asInstanceOf[js.Any])
    if (yDomainRange != null) __obj.updateDynamic("yDomainRange")(yDomainRange.asInstanceOf[js.Any])
    if (yType != null) __obj.updateDynamic("yType")(yType.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ScatterplotChartProps
}

