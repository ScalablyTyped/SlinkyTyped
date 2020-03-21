package typingsSlinky.reactEasyChart.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactEasyChart.AnonColor
import typingsSlinky.reactEasyChart.mod.PieChartProps
import typingsSlinky.reactEasyChart.mod.PieData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PieChart
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactEasyChart.mod.PieChart] {
  @JSImport("react-easy-chart", "PieChart")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: size */
  def apply(
    data: js.Array[AnonColor],
    clickHandler: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _ = null,
    innerHoleSize: Int | Double = null,
    labels: js.UndefOr[Boolean] = js.undefined,
    mouseMoveHandler: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _ = null,
    mouseOutHandler: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _ = null,
    mouseOverHandler: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _ = null,
    padding: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactEasyChart.mod.PieChart] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction2(clickHandler))
    if (innerHoleSize != null) __obj.updateDynamic("innerHoleSize")(innerHoleSize.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(js.Any.fromFunction2(mouseMoveHandler))
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(js.Any.fromFunction2(mouseOutHandler))
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(js.Any.fromFunction2(mouseOverHandler))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PieChartProps
}

