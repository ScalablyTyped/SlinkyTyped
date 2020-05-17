package typingsSlinky.antd.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.ul.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anon.PartialTransferLocale
import typingsSlinky.antd.transferListMod.TransferListProps
import typingsSlinky.antd.transferMod.ListStyle
import typingsSlinky.antd.transferMod.RenderResult
import typingsSlinky.antd.transferMod.SelectAllLabel
import typingsSlinky.antd.transferMod.TransferDirection
import typingsSlinky.antd.transferMod.TransferItem
import typingsSlinky.antd.transferMod.TransferProps
import typingsSlinky.antd.transferMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Transfer {
  @JSImport("antd/lib/transfer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def filterOption(value: (/* inputValue */ String, /* item */ TransferItem) => Boolean): this.type = set("filterOption", js.Any.fromFunction2(value))
    @scala.inline
    def footer(value: /* props */ TransferListProps => TagMod[Any]): this.type = set("footer", js.Any.fromFunction1(value))
    @scala.inline
    def locale(value: PartialTransferLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(
      value: (/* targetKeys */ js.Array[String], /* direction */ String, /* moveKeys */ js.Array[String]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction3(value))
    @scala.inline
    def onScroll(
      value: (/* direction */ TransferDirection, /* e */ SyntheticEvent[Event, HTMLUListElement]) => Unit
    ): this.type = set("onScroll", js.Any.fromFunction2(value))
    @scala.inline
    def onSearch(value: (/* direction */ TransferDirection, /* value */ String) => Unit): this.type = set("onSearch", js.Any.fromFunction2(value))
    @scala.inline
    def onSelectChange(
      value: (/* sourceSelectedKeys */ js.Array[String], /* targetSelectedKeys */ js.Array[String]) => Unit
    ): this.type = set("onSelectChange", js.Any.fromFunction2(value))
    @scala.inline
    def operationStyle(value: CSSProperties): this.type = set("operationStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def operations(value: js.Array[String]): this.type = set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def render(value: /* item */ TransferItem => RenderResult): this.type = set("render", js.Any.fromFunction1(value))
    @scala.inline
    def rowKey(value: /* record */ TransferItem => String): this.type = set("rowKey", js.Any.fromFunction1(value))
    @scala.inline
    def selectAllLabels(value: js.Array[SelectAllLabel]): this.type = set("selectAllLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedKeys(value: js.Array[String]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def showSelectAll(value: Boolean): this.type = set("showSelectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def targetKeys(value: js.Array[String]): this.type = set("targetKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def titles(value: js.Array[String]): this.type = set("titles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TransferProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    dataSource: js.Array[TransferItem],
    listStyle: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties
  ): Builder = {
    val __props = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], listStyle = listStyle.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TransferProps]))
  }
}

