package typingsSlinky.reactDashNativeDashSvgDashCharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashSvgDashCharts.reactDashNativeDashSvgDashChartsMod.Decorators.HorizontalLine
import typingsSlinky.reactDashNativeDashSvgDashCharts.reactDashNativeDashSvgDashChartsMod.HorizontalLineProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DecoratorsHorizontalLine
  extends ExternalComponentWithAttributesWithRefType[tag.type, HorizontalLine] {
  @JSImport("react-native-svg-charts", "Decorators.HorizontalLine")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(stroke: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, HorizontalLine] = {
    val __obj = js.Dynamic.literal(stroke = stroke.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HorizontalLineProps
}

