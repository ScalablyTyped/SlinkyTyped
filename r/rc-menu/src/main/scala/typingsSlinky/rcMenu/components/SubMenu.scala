package typingsSlinky.rcMenu.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcMenu.anon.DomEvent
import typingsSlinky.rcMenu.anon.Hover
import typingsSlinky.rcMenu.anon.Open
import typingsSlinky.rcMenu.anon.ReactElementisRootMenuboo
import typingsSlinky.rcMenu.interfaceMod.BuiltinPlacements
import typingsSlinky.rcMenu.interfaceMod.MenuInfo
import typingsSlinky.rcMenu.interfaceMod.MenuMode
import typingsSlinky.rcMenu.interfaceMod.MiniStore
import typingsSlinky.rcMenu.interfaceMod.RenderIconType
import typingsSlinky.rcMenu.interfaceMod.SelectInfo
import typingsSlinky.rcMenu.interfaceMod.TriggerSubMenuAction
import typingsSlinky.rcMenu.rcMenuStrings.ltr
import typingsSlinky.rcMenu.rcMenuStrings.rtl
import typingsSlinky.rcMenu.subMenuMod.SubMenuProps
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SubMenu {
  @JSImport("rc-menu/lib/SubMenu", "SubMenu")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rcMenu.subMenuMod.SubMenu] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def builtinPlacements(value: BuiltinPlacements): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def eventKey(value: String): this.type = set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def expandIconReactElement(value: ReactElement): this.type = set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def expandIconFunction1(value: /* props */ js.Any => TagMod[Any]): this.type = set("expandIcon", js.Any.fromFunction1(value))
    @scala.inline
    def expandIcon(value: RenderIconType): this.type = set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def forceSubMenuRender(value: Boolean): this.type = set("forceSubMenuRender", value.asInstanceOf[js.Any])
    @scala.inline
    def inlineIndent(value: Double): this.type = set("inlineIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
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
    def motion(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MotionType */ js.Any
    ): this.type = set("motion", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* info */ MenuInfo => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDeselect(value: /* info */ SelectInfo => Unit): this.type = set("onDeselect", js.Any.fromFunction1(value))
    @scala.inline
    def onDestroy(value: /* key */ Key => Unit): this.type = set("onDestroy", js.Any.fromFunction1(value))
    @scala.inline
    def onItemHover(value: /* info */ Hover => Unit): this.type = set("onItemHover", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: /* info */ typingsSlinky.rcMenu.anon.Key => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: /* info */ typingsSlinky.rcMenu.anon.Key => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onOpenChange(value: /* keys */ js.Array[Key] | Open => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: /* info */ SelectInfo => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def onTitleClick(value: /* info */ DomEvent => Unit): this.type = set("onTitleClick", js.Any.fromFunction1(value))
    @scala.inline
    def onTitleMouseEnter(value: /* info */ typingsSlinky.rcMenu.anon.Key => Unit): this.type = set("onTitleMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onTitleMouseLeave(value: /* info */ typingsSlinky.rcMenu.anon.Key => Unit): this.type = set("onTitleMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def openKeys(value: js.Array[String]): this.type = set("openKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def parentMenu(value: ReactElementisRootMenuboo): this.type = set("parentMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def popupOffset(value: js.Array[Double]): this.type = set("popupOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def rootPrefixCls(value: String): this.type = set("rootPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedKeys(value: js.Array[String]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def store(value: MiniStore): this.type = set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def subMenuCloseDelay(value: Double): this.type = set("subMenuCloseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def subMenuOpenDelay(value: Double): this.type = set("subMenuOpenDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerSubMenuAction(value: TriggerSubMenuAction): this.type = set("triggerSubMenuAction", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SubMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SubMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

