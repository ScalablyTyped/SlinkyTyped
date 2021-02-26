package typingsSlinky.reactNativeSvgCharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeSvgCharts.mod.HorizontalLineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HorizontalLine {
  
  @scala.inline
  def apply(stroke: String): Default[tag.type, typingsSlinky.reactNativeSvgCharts.mod.Decorators.HorizontalLine] = {
    val __props = js.Dynamic.literal(stroke = stroke.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactNativeSvgCharts.mod.Decorators.HorizontalLine](js.Array(this.component, __props.asInstanceOf[HorizontalLineProps]))
  }
  
  @JSImport("react-native-svg-charts", "Decorators.HorizontalLine")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: HorizontalLineProps): Default[tag.type, typingsSlinky.reactNativeSvgCharts.mod.Decorators.HorizontalLine] = new Default[tag.type, typingsSlinky.reactNativeSvgCharts.mod.Decorators.HorizontalLine](js.Array(this.component, p.asInstanceOf[js.Any]))
}
