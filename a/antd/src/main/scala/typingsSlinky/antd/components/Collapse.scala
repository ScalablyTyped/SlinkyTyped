package typingsSlinky.antd.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.collapseCollapseMod.CollapseProps
import typingsSlinky.antd.collapseCollapseMod.ExpandIconPosition
import typingsSlinky.antd.collapseCollapseMod.PanelProps
import typingsSlinky.antd.collapseMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collapse {
  @JSImport("antd/lib/collapse", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def accordion(value: Boolean): this.type = set("accordion", value.asInstanceOf[js.Any])
    @scala.inline
    def activeKey(value: (js.Array[String | Double]) | String | Double): this.type = set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultActiveKey(value: (js.Array[String | Double]) | String | Double): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    @scala.inline
    def destroyInactivePanel(value: Boolean): this.type = set("destroyInactivePanel", value.asInstanceOf[js.Any])
    @scala.inline
    def expandIcon(value: /* panelProps */ PanelProps => TagMod[Any]): this.type = set("expandIcon", js.Any.fromFunction1(value))
    @scala.inline
    def expandIconPosition(value: ExpandIconPosition): this.type = set("expandIconPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* key */ String | js.Array[String] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CollapseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Collapse.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

