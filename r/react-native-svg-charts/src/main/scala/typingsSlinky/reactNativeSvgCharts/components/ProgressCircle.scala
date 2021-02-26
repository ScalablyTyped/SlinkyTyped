package typingsSlinky.reactNativeSvgCharts.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSvgCharts.mod.ProgressCircleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProgressCircle {
  
  @scala.inline
  def apply(progress: Double): Builder = {
    val __props = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ProgressCircleProps]))
  }
  
  @JSImport("react-native-svg-charts", "ProgressCircle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeSvgCharts.mod.ProgressCircle] {
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animateDuration(value: Double): this.type = set("animateDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endAngle(value: Double): this.type = set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressColor(value: String): this.type = set("progressColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startAngle(value: Double): this.type = set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: ProgressCircleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
