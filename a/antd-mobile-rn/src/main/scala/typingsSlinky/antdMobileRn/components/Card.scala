package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.cardIndexNativeMod.CardNativeProps
import typingsSlinky.antdMobileRn.cardStyleIndexNativeMod.ICardStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  @JSImport("antd-mobile-rn", "Card")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Card] {
    
    @scala.inline
    def full(value: Boolean): this.type = set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: ICardStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
