package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.fixed
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.normal
import typingsSlinky.antDesignReactNative.progressMod.ProgressProps
import typingsSlinky.antDesignReactNative.progressStyleMod.ProgressStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Progress {
  
  @JSImport("@ant-design/react-native", "Progress")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.Progress] {
    
    @scala.inline
    def appearTransition(value: Boolean): this.type = set("appearTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def barStyle(value: StyleProp[ViewStyle]): this.type = set("barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def barStyleNull: this.type = set("barStyle", null)
    
    @scala.inline
    def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(value: fixed | normal): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: Partial[ProgressStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unfilled(value: Boolean): this.type = set("unfilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapWidth(value: Double): this.type = set("wrapWidth", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Progress.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProgressProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
