package typingsSlinky.reactNativeIndicators.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeIndicators.mod.PacmanIndicatorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PacmanIndicator {
  
  @JSImport("react-native-indicators", "PacmanIndicator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeIndicators.mod.PacmanIndicator] {
    
    @scala.inline
    def animating(value: Boolean): this.type = set("animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationEasing(value: /* value */ Double => Double): this.type = set("animationEasing", js.Any.fromFunction1(value))
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidesWhenStopped(value: Boolean): this.type = set("hidesWhenStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def interaction(value: Boolean): this.type = set("interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: PacmanIndicator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PacmanIndicatorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
