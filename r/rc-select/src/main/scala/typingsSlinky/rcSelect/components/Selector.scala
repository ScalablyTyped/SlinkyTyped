package typingsSlinky.rcSelect.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.textarea.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSelect.anon.Selected
import typingsSlinky.rcSelect.generatorMod.CustomTagProps
import typingsSlinky.rcSelect.generatorMod.LabelValueType
import typingsSlinky.rcSelect.generatorMod.RawValueType
import typingsSlinky.rcSelect.interfaceMod.Mode
import typingsSlinky.rcSelect.interfaceMod.RenderNode
import typingsSlinky.rcSelect.selectorMod.RefSelectorProps
import typingsSlinky.rcSelect.selectorMod.SelectorProps
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Selector {
  @JSImport("rc-select/lib/Selector", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, RefSelectorProps] {
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def choiceTransitionName(value: String): this.type = set("choiceTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def domRefRefObject(value: ReactRef[HTMLDivElement]): this.type = set("domRef", value.asInstanceOf[js.Any])
    @scala.inline
    def domRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): this.type = set("domRef", js.Any.fromFunction1(value))
    @scala.inline
    def domRef(value: Ref[HTMLDivElement]): this.type = set("domRef", value.asInstanceOf[js.Any])
    @scala.inline
    def domRefNull: this.type = set("domRef", null)
    @scala.inline
    def maxTagCount(value: Double): this.type = set("maxTagCount", value.asInstanceOf[js.Any])
    @scala.inline
    def maxTagPlaceholderReactElement(value: ReactElement): this.type = set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def maxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[LabelValueType] => ReactElement): this.type = set("maxTagPlaceholder", js.Any.fromFunction1(value))
    @scala.inline
    def maxTagPlaceholder(value: ReactElement | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactElement])): this.type = set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def maxTagTextLength(value: Double): this.type = set("maxTagTextLength", value.asInstanceOf[js.Any])
    @scala.inline
    def onInputKeyDown(value: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): this.type = set("onInputKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def placeholderReactElement(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def removeIconReactElement(value: ReactElement): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def removeIconFunction1(value: /* props */ js.Any => ReactElement): this.type = set("removeIcon", js.Any.fromFunction1(value))
    @scala.inline
    def removeIcon(value: RenderNode): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def tagRender(value: /* props */ CustomTagProps => ReactElement): this.type = set("tagRender", js.Any.fromFunction1(value))
    @scala.inline
    def tokenWithEnter(value: Boolean): this.type = set("tokenWithEnter", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectorProps with RefAttributes[RefSelectorProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    accessibilityIndex: Double,
    activeValue: String,
    id: String,
    inputElement: ReactElement,
    mode: Mode,
    multiple: Boolean,
    onSearch: (String, Boolean, Boolean) => Boolean,
    onSearchSubmit: String => Unit,
    onSelect: (RawValueType, Selected) => Unit,
    onToggleOpen: js.UndefOr[Boolean] => Unit,
    open: Boolean,
    prefixCls: String,
    searchValue: String,
    values: js.Array[LabelValueType]
  ): Builder = {
    val __props = js.Dynamic.literal(accessibilityIndex = accessibilityIndex.asInstanceOf[js.Any], activeValue = activeValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], onSearch = js.Any.fromFunction3(onSearch), onSearchSubmit = js.Any.fromFunction1(onSearchSubmit), onSelect = js.Any.fromFunction2(onSelect), onToggleOpen = js.Any.fromFunction1(onToggleOpen), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectorProps with RefAttributes[RefSelectorProps]]))
  }
}

