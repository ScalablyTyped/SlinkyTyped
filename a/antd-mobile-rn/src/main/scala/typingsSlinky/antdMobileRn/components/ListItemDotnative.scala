package typingsSlinky.antdMobileRn.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.anon.Arrow
import typingsSlinky.antdMobileRn.antdMobileRnStrings._empty
import typingsSlinky.antdMobileRn.antdMobileRnStrings.android
import typingsSlinky.antdMobileRn.antdMobileRnStrings.bottom
import typingsSlinky.antdMobileRn.antdMobileRnStrings.down
import typingsSlinky.antdMobileRn.antdMobileRnStrings.empty
import typingsSlinky.antdMobileRn.antdMobileRnStrings.horizontal
import typingsSlinky.antdMobileRn.antdMobileRnStrings.ios
import typingsSlinky.antdMobileRn.antdMobileRnStrings.middle
import typingsSlinky.antdMobileRn.antdMobileRnStrings.top
import typingsSlinky.antdMobileRn.antdMobileRnStrings.up
import typingsSlinky.antdMobileRn.listItemNativeMod.ListItemProps
import typingsSlinky.antdMobileRn.listItemNativeMod.default
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemDotnative {
  @JSImport("antd-mobile-rn/lib/list/ListItem.native", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def activeStyle(value: StyleProp[ViewStyle]): this.type = set("activeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def activeStyleNull: this.type = set("activeStyle", null)
    @scala.inline
    def align(value: top | middle | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def arrow(value: horizontal | down | up | empty | _empty): this.type = set("arrow", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def multipleLine(value: Boolean): this.type = set("multipleLine", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: () => Unit): this.type = set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def onPressIn(value: () => Unit): this.type = set("onPressIn", js.Any.fromFunction0(value))
    @scala.inline
    def onPressOut(value: () => Unit): this.type = set("onPressOut", js.Any.fromFunction0(value))
    @scala.inline
    def platform(value: android | ios): this.type = set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def styles(value: Arrow): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def thumbReactElement(value: ReactElement): this.type = set("thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def thumb(value: ReactElement): this.type = set("thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def thumbNull: this.type = set("thumb", null)
    @scala.inline
    def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListItemDotnative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

