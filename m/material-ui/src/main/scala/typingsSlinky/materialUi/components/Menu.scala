package typingsSlinky.materialUi.components

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Menus.MenuItemProps
import typingsSlinky.materialUi.MaterialUI.Menus.MenuProps
import typingsSlinky.materialUi.MaterialUI.ReactLink
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Menu {
  
  @JSImport("material-ui", "Menu")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.Menu] {
    
    @scala.inline
    def autoWidth(value: Boolean): this.type = set("autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def desktop(value: Boolean): this.type = set("desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableAutoFocus(value: Boolean): this.type = set("disableAutoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initiallyKeyboardFocused(value: Boolean): this.type = set("initiallyKeyboardFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listStyle(value: CSSProperties): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (/* e */ SyntheticEvent[org.scalajs.dom.raw.Event, js.Object], /* itemValue */ js.Any | js.Array[_]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onEscKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onEscKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onItemClick(
      value: (/* e */ SyntheticEvent[org.scalajs.dom.raw.Event, js.Object], ReactComponentClass[MenuItemProps]) => Unit
    ): this.type = set("onItemClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[js.Object] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectedMenuItemStyle(value: CSSProperties): this.type = set("selectedMenuItemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: js.Any*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def value(value: js.Any | js.Array[_]): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueLink(value: ReactLink[_ | js.Array[_]]): this.type = set("valueLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Menu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
