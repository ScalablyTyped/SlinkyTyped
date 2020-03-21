package typingsSlinky.reactNativeSvgCharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeSvgCharts.mod.Decorators.Tooltip
import typingsSlinky.reactNativeSvgCharts.mod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DecoratorsTooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, Tooltip] {
  @JSImport("react-native-svg-charts", "Decorators.Tooltip")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    text: String,
    height: Int | Double = null,
    index: Int | Double = null,
    pointStroke: String = null,
    stroke: String = null,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Tooltip] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (pointStroke != null) __obj.updateDynamic("pointStroke")(pointStroke.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TooltipProps
}

