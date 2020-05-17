package typingsSlinky.rcMenu.components

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcMenu.anon.Open
import typingsSlinky.rcMenu.interfaceMod.BuiltinPlacements
import typingsSlinky.rcMenu.interfaceMod.MenuInfo
import typingsSlinky.rcMenu.interfaceMod.MenuMode
import typingsSlinky.rcMenu.interfaceMod.MiniStore
import typingsSlinky.rcMenu.interfaceMod.RenderIconType
import typingsSlinky.rcMenu.interfaceMod.SelectInfo
import typingsSlinky.rcMenu.interfaceMod.TriggerSubMenuAction
import typingsSlinky.rcMenu.rcMenuStrings.ltr
import typingsSlinky.rcMenu.rcMenuStrings.rtl
import typingsSlinky.rcMenu.subPopupMenuMod.SubPopupMenuProps
import typingsSlinky.rcMenu.subPopupMenuMod.default
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SubPopupMenu {
  @JSImport("rc-menu/lib/SubPopupMenu", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def activeKey(value: String): this.type = set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def builtinPlacements(value: BuiltinPlacements): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultActiveFirst(value: Boolean): this.type = set("defaultActiveFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultOpenKeys(value: js.Array[String]): this.type = set("defaultOpenKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSelectedKeys(value: js.Array[String]): this.type = set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def eventKey(value: Key): this.type = set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def expandIconReactElement(value: ReactElement): this.type = set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def expandIconFunction1(value: /* props */ js.Any => TagMod[Any]): this.type = set("expandIcon", js.Any.fromFunction1(value))
    @scala.inline
    def expandIcon(value: RenderIconType): this.type = set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def forceSubMenuRender(value: Boolean): this.type = set("forceSubMenuRender", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def inlineIndent(value: Double): this.type = set("inlineIndent", value.asInstanceOf[js.Any])
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
    def onOpenChange(value: /* keys */ js.Array[Key] | Open => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: /* info */ SelectInfo => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def openKeys(value: js.Array[String]): this.type = set("openKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowedIndicatorReactElement(value: ReactElement): this.type = set("overflowedIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowedIndicator(value: TagMod[Any]): this.type = set("overflowedIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def parentMenuElement(value: Element): this.type = set("parentMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def parentMenuComponent(value: ReactComponentClass[js.Any]): this.type = set("parentMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def parentMenu(value: ReactInstance): this.type = set("parentMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedKeys(value: js.Array[String]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def store(value: MiniStore): this.type = set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def subMenuCloseDelay(value: Double): this.type = set("subMenuCloseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def subMenuOpenDelay(value: Double): this.type = set("subMenuOpenDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def triggerSubMenuAction(value: TriggerSubMenuAction): this.type = set("triggerSubMenuAction", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SubPopupMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SubPopupMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

