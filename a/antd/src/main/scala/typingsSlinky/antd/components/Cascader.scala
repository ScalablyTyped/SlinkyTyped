package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.cascaderMod.CascaderExpandTrigger
import typingsSlinky.antd.cascaderMod.CascaderOptionType
import typingsSlinky.antd.cascaderMod.CascaderProps
import typingsSlinky.antd.cascaderMod.CascaderValueType
import typingsSlinky.antd.cascaderMod.FieldNamesType
import typingsSlinky.antd.cascaderMod.ShowSearchType
import typingsSlinky.antd.configProviderSizeContextMod.SizeType
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cascader {
  
  @scala.inline
  def apply(options: js.Array[CascaderOptionType]): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CascaderProps]))
  }
  
  @JSImport("antd", "Cascader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antd.mod.Cascader] {
    
    @scala.inline
    def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def changeOnSelect(value: Boolean): this.type = set("changeOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: CascaderValueType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: (String | Double)*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayRender(
      value: (/* label */ js.Array[String], /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => ReactElement
    ): this.type = set("displayRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def dropdownRender(value: /* menus */ ReactElement => ReactElement): this.type = set("dropdownRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def expandIcon(value: ReactElement): this.type = set("expandIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandIconReactElement(value: ReactElement): this.type = set("expandIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandTrigger(value: CascaderExpandTrigger): this.type = set("expandTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fieldNames(value: FieldNamesType): this.type = set("fieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputPrefixCls(value: String): this.type = set("inputPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadData(value: /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]] => Unit): this.type = set("loadData", js.Any.fromFunction1(value))
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def notFoundContent(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def notFoundContentReactElement(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (/* value */ CascaderValueType, /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onPopupVisibleChange(value: /* popupVisible */ Boolean => Unit): this.type = set("onPopupVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupPlacement(value: String): this.type = set("popupPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupVisible(value: Boolean): this.type = set("popupVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSearch(value: Boolean | ShowSearchType): this.type = set("showSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: CascaderValueType): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: (String | Double)*): this.type = set("value", js.Array(value :_*))
  }
  
  def withProps(p: CascaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
