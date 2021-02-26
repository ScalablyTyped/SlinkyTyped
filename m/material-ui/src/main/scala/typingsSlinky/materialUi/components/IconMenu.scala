package typingsSlinky.materialUi.components

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Menus.IconMenuProps
import typingsSlinky.materialUi.MaterialUI.Menus.MenuItemProps
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsSlinky.materialUi.MaterialUI.propTypes.origin
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconMenu {
  
  @scala.inline
  def apply(iconButtonElement: ReactElement): Builder = {
    val __props = js.Dynamic.literal(iconButtonElement = iconButtonElement.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IconMenuProps]))
  }
  
  @JSImport("material-ui", "IconMenu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.IconMenu] {
    
    @scala.inline
    def anchorOrigin(value: origin): this.type = set("anchorOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animation(value: ReactComponentClass[PopoverAnimationProps]): this.type = set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoWidth(value: Boolean): this.type = set("autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clickCloseDelay(value: Double): this.type = set("clickCloseDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def desktop(value: Boolean): this.type = set("desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableAutoFocus(value: Boolean): this.type = set("disableAutoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconStyle(value: CSSProperties): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initiallyKeyboardFocused(value: Boolean): this.type = set("initiallyKeyboardFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listStyle(value: CSSProperties): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuStyle(value: CSSProperties): this.type = set("menuStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (/* e */ SyntheticEvent[org.scalajs.dom.raw.Event, js.Object], /* itemValue */ js.Any | js.Array[_]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onClick(value: /* e */ SyntheticEvent[org.scalajs.dom.raw.Event, js.Object] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onItemClick(
      value: (/* e */ SyntheticEvent[org.scalajs.dom.raw.Event, js.Object], ReactComponentClass[MenuItemProps]) => Unit
    ): this.type = set("onItemClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onKeyboardFocus(value: (/* e */ SyntheticFocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): this.type = set("onKeyboardFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRequestChange(value: (/* opening */ Boolean, /* reason */ String) => Unit): this.type = set("onRequestChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetOrigin(value: origin): this.type = set("targetOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useLayerForClickAway(value: Boolean): this.type = set("useLayerForClickAway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Any | js.Array[_]): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: js.Any*): this.type = set("value", js.Array(value :_*))
  }
  
  def withProps(p: IconMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
