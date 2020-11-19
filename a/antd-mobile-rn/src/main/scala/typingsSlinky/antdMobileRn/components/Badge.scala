package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.antdMobileRnStrings.large
import typingsSlinky.antdMobileRn.antdMobileRnStrings.small
import typingsSlinky.antdMobileRn.badgeIndexNativeMod.BadgeNativeProps
import typingsSlinky.antdMobileRn.badgeStyleIndexNativeMod.IBadgeStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Badge {
  
  @JSImport("antd-mobile-rn", "Badge")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Badge] {
    
    @scala.inline
    def corner(value: Boolean): this.type = set("corner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dot(value: Boolean): this.type = set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowCount(value: Double): this.type = set("overflowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: large | small): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: IBadgeStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: js.Any): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BadgeNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Badge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
