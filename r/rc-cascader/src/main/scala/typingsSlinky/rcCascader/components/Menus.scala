package typingsSlinky.rcCascader.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcCascader.cascaderMod.CascaderFieldNames
import typingsSlinky.rcCascader.cascaderMod.CascaderOption
import typingsSlinky.rcCascader.menusMod.MenusProps
import typingsSlinky.rcCascader.menusMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menus {
  @JSImport("rc-cascader/es/Menus", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def activeValueVarargs(value: (String | Double)*): this.type = set("activeValue", js.Array(value :_*))
    @scala.inline
    def activeValue(value: js.Array[String | Double]): this.type = set("activeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultFieldNames(value: CascaderFieldNames): this.type = set("defaultFieldNames", value.asInstanceOf[js.Any])
    @scala.inline
    def dropdownMenuColumnStyle(value: CSSProperties): this.type = set("dropdownMenuColumnStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def expandIconReactElement(value: ReactElement): this.type = set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def expandIcon(value: ReactElement): this.type = set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def expandTrigger(value: String): this.type = set("expandTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def fieldNames(value: CascaderFieldNames): this.type = set("fieldNames", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingIconReactElement(value: ReactElement): this.type = set("loadingIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingIcon(value: ReactElement): this.type = set("loadingIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def onItemDoubleClick(
      value: (/* targetOption */ js.Array[String], /* index */ Double, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): this.type = set("onItemDoubleClick", js.Any.fromFunction3(value))
    @scala.inline
    def onSelect(
      value: (/* targetOption */ js.Array[String], /* index */ Double, /* e */ SyntheticKeyboardEvent[HTMLElement]) => Unit
    ): this.type = set("onSelect", js.Any.fromFunction3(value))
    @scala.inline
    def optionsVarargs(value: CascaderOption*): this.type = set("options", js.Array(value :_*))
    @scala.inline
    def options(value: js.Array[CascaderOption]): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def valueVarargs(value: (String | Double)*): this.type = set("value", js.Array(value :_*))
    @scala.inline
    def value(value: js.Array[String | Double]): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenusProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Menus.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

