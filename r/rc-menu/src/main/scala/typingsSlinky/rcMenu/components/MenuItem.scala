package typingsSlinky.rcMenu.components

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcMenu.AnonHover
import typingsSlinky.rcMenu.AnonKey
import typingsSlinky.rcMenu.interfaceMod.MenuInfo
import typingsSlinky.rcMenu.interfaceMod.MenuMode
import typingsSlinky.rcMenu.interfaceMod.RenderIconType
import typingsSlinky.rcMenu.interfaceMod.SelectInfo
import typingsSlinky.rcMenu.menuItemMod.MenuItemProps
import typingsSlinky.rcMenu.rcMenuStrings.ltr
import typingsSlinky.rcMenu.rcMenuStrings.rtl
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItem {
  @JSImport("rc-menu/lib/MenuItem", "MenuItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rcMenu.menuItemMod.MenuItem] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def attribute(value: Record[String, String]): this.type = set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def eventKey(value: Key): this.type = set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def inlineIndent(value: Double): this.type = set("inlineIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def itemIconReactElement(value: ReactElement): this.type = set("itemIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def itemIconFunction1(value: /* props */ js.Any => TagMod[Any]): this.type = set("itemIcon", js.Any.fromFunction1(value))
    @scala.inline
    def itemIcon(value: RenderIconType): this.type = set("itemIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def level(value: Double): this.type = set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def manualRef(value: /* node */ ReactInstance => Unit): this.type = set("manualRef", js.Any.fromFunction1(value))
    @scala.inline
    def mode(value: MenuMode): this.type = set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* info */ MenuInfo => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDeselect(value: /* info */ SelectInfo => Unit): this.type = set("onDeselect", js.Any.fromFunction1(value))
    @scala.inline
    def onDestroy(value: /* key */ Key => Unit): this.type = set("onDestroy", js.Any.fromFunction1(value))
    @scala.inline
    def onItemHover(value: /* info */ AnonHover => Unit): this.type = set("onItemHover", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: /* info */ AnonKey => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: /* info */ AnonKey => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: /* info */ SelectInfo => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def parentMenuElement(value: Element): this.type = set("parentMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def parentMenuComponent(value: ReactComponentClass[js.Any]): this.type = set("parentMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def parentMenu(value: ReactInstance): this.type = set("parentMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def rootPrefixCls(value: String): this.type = set("rootPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedKeys(value: js.Array[String]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MenuItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

