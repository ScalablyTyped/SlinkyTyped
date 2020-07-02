package typingsSlinky.materialUi.components

import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.BottomNavigation.BottomNavigationItemProps
import typingsSlinky.materialUi.bottomNavigationItemMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BottomNavigationItem {
  @JSImport("material-ui/BottomNavigation/BottomNavigationItem", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def centerRipple(value: Boolean): this.type = set("centerRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def containerElementReactElement(value: ReactElement): this.type = set("containerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def containerElement(value: ReactElement | String): this.type = set("containerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def disableFocusRipple(value: Boolean): this.type = set("disableFocusRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def disableKeyboardFocus(value: Boolean): this.type = set("disableKeyboardFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def disableTouchRipple(value: Boolean): this.type = set("disableTouchRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def focusRippleColor(value: String): this.type = set("focusRippleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def focusRippleOpacity(value: Double): this.type = set("focusRippleOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def keyboardFocused(value: Boolean): this.type = set("keyboardFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[js.Object] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyboardFocus(value: (/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): this.type = set("onKeyboardFocus", js.Any.fromFunction2(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def touchRippleColor(value: String): this.type = set("touchRippleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def touchRippleOpacity(value: Double): this.type = set("touchRippleOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BottomNavigationItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BottomNavigationItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

