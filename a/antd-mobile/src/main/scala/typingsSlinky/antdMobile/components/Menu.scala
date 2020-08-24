package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.antdMobileNumbers.`1`
import typingsSlinky.antdMobile.antdMobileNumbers.`2`
import typingsSlinky.antdMobile.menuPropsTypeMod.DataItem
import typingsSlinky.antdMobile.menuPropsTypeMod.MenuProps
import typingsSlinky.antdMobile.menuPropsTypeMod.ValueType
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menu {
  @JSImport("antd-mobile", "Menu")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobile.mod.Menu] {
    @scala.inline
    def MenuSelectContanerPrefixCls(value: String): this.type = set("MenuSelectContanerPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def dataVarargs(value: DataItem*): this.type = set("data", js.Array(value :_*))
    @scala.inline
    def data(value: js.Array[DataItem]): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValueVarargs(value: (String | js.Array[String])*): this.type = set("defaultValue", js.Array(value :_*))
    @scala.inline
    def defaultValue(value: ValueType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def level(value: `1` | `2`): this.type = set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def multiSelect(value: Boolean): this.type = set("multiSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def multiSelectMenuBtnsCls(value: String): this.type = set("multiSelectMenuBtnsCls", value.asInstanceOf[js.Any])
    @scala.inline
    def onCancel(value: () => Unit): this.type = set("onCancel", js.Any.fromFunction0(value))
    @scala.inline
    def onChange(value: /* value */ js.UndefOr[ValueType] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onOk(value: /* value */ js.UndefOr[ValueType] => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def radioPrefixCls(value: String): this.type = set("radioPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def subMenuPrefixCls(value: String): this.type = set("subMenuPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def valueVarargs(value: (String | js.Array[String])*): this.type = set("value", js.Array(value :_*))
    @scala.inline
    def value(value: ValueType): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Menu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

