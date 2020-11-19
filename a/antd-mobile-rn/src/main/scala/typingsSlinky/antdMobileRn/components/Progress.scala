package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.antdMobileRnStrings.fixed
import typingsSlinky.antdMobileRn.antdMobileRnStrings.normal
import typingsSlinky.antdMobileRn.progressIndexNativeMod.ProgressProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Progress {
  
  @JSImport("antd-mobile-rn", "Progress")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Progress] {
    
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
    def styles(value: js.Any): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unfilled(value: Boolean): this.type = set("unfilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapWidth(value: Double): this.type = set("wrapWidth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProgressProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Progress.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
