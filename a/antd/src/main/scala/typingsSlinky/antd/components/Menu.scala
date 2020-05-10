package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.menuContextMod.MenuTheme
import typingsSlinky.antd.menuMod.ClickParam
import typingsSlinky.antd.menuMod.MenuMode
import typingsSlinky.antd.menuMod.MenuProps
import typingsSlinky.antd.menuMod.SelectParam
import typingsSlinky.antd.menuMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menu {
  @JSImport("antd/lib/menu", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultOpenKeys(value: js.Array[String]): this.type = set("defaultOpenKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSelectedKeys(value: js.Array[String]): this.type = set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def forceSubMenuRender(value: Boolean): this.type = set("forceSubMenuRender", value.asInstanceOf[js.Any])
    @scala.inline
    def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def inlineCollapsed(value: Boolean): this.type = set("inlineCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def inlineIndent(value: Double): this.type = set("inlineIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def mode(value: MenuMode): this.type = set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def motion(value: js.Object): this.type = set("motion", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* param */ ClickParam => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDeselect(value: /* param */ SelectParam => Unit): this.type = set("onDeselect", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: /* e */ MouseEvent => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onOpenChange(value: /* openKeys */ js.Array[String] => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: /* param */ SelectParam => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def openAnimation(value: String): this.type = set("openAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def openKeys(value: js.Array[String]): this.type = set("openKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def openTransitionName(value: String): this.type = set("openTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowedIndicatorReactElement(value: ReactElement): this.type = set("overflowedIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowedIndicator(value: TagMod[Any]): this.type = set("overflowedIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedKeys(value: js.Array[String]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def subMenuCloseDelay(value: Double): this.type = set("subMenuCloseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def subMenuOpenDelay(value: Double): this.type = set("subMenuOpenDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: MenuTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Menu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

