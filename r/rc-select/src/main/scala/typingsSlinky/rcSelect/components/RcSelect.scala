package typingsSlinky.rcSelect.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Node
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSelect.mod.RcSelect.OptionProps
import typingsSlinky.rcSelect.mod.RcSelect.SelectProps
import typingsSlinky.rcSelect.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcSelect {
  @JSImport("rc-select", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def animation(value: String): this.type = set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def choiceTransitionName(value: String): this.type = set("choiceTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def combobox(value: Boolean): this.type = set("combobox", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultActiveFirstOption(value: Boolean): this.type = set("defaultActiveFirstOption", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultLabel(value: String | js.Array[String]): this.type = set("defaultLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: String | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def dropdownMatchSelectWidth(value: Boolean): this.type = set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def filterOption(value: Boolean): this.type = set("filterOption", value.asInstanceOf[js.Any])
    @scala.inline
    def getInputElement(value: () => Node): this.type = set("getInputElement", js.Any.fromFunction0(value))
    @scala.inline
    def getPopupContainer(value: /* trigger */ Node => Node): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def labelInValue(value: Boolean): this.type = set("labelInValue", value.asInstanceOf[js.Any])
    @scala.inline
    def maxTagCount(value: Double): this.type = set("maxTagCount", value.asInstanceOf[js.Any])
    @scala.inline
    def maxTagPlaceholderReactElement(value: ReactElement): this.type = set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def maxTagPlaceholder(value: ReactElement | js.Function): this.type = set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def maxTagTextLength(value: Double): this.type = set("maxTagTextLength", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def notFoundContent(value: String): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: () => Unit): this.type = set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def onChange(value: (/* value */ String, /* label */ String) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onDeselect(value: (/* value */ String, ReactComponentClass[OptionProps]) => Unit): this.type = set("onDeselect", js.Any.fromFunction2(value))
    @scala.inline
    def onFocus(value: () => Unit): this.type = set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def onInputKeyDown(value: /* e */ Event => Unit): this.type = set("onInputKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onPopupScroll(value: () => Unit): this.type = set("onPopupScroll", js.Any.fromFunction0(value))
    @scala.inline
    def onSearch(value: () => Unit): this.type = set("onSearch", js.Any.fromFunction0(value))
    @scala.inline
    def onSelect(value: (/* value */ String, ReactComponentClass[OptionProps]) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def optionFilterProp(value: String): this.type = set("optionFilterProp", value.asInstanceOf[js.Any])
    @scala.inline
    def optionLabelProp(value: String): this.type = set("optionLabelProp", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholderReactElement(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def showAction(value: js.Array[String]): this.type = set("showAction", value.asInstanceOf[js.Any])
    @scala.inline
    def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def tags(value: Boolean): this.type = set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def tokenSeparators(value: js.Array[String]): this.type = set("tokenSeparators", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String | js.Array[String]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RcSelect.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

