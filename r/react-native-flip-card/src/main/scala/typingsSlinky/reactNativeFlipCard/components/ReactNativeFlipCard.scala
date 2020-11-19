package typingsSlinky.reactNativeFlipCard.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeFlipCard.mod.FlipCardProps
import typingsSlinky.reactNativeFlipCard.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeFlipCard {
  
  @JSImport("react-native-flip-card", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def alignHeight(value: Boolean): this.type = set("alignHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignWidth(value: Boolean): this.type = set("alignWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clickable(value: Boolean): this.type = set("clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flipHorizontal(value: Boolean): this.type = set("flipHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flipVertical(value: Boolean): this.type = set("flipVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def friction(value: Double): this.type = set("friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onFlipEnd(value: () => Unit): this.type = set("onFlipEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def onFlipStart(value: () => Unit): this.type = set("onFlipStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def perspective(value: Double): this.type = set("perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FlipCardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactNativeFlipCard.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
