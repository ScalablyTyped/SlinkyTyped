package typingsSlinky.rcSelect.multipleSelectorMod

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcSelect.anon.Selected
import typingsSlinky.rcSelect.generatorMod.CustomTagProps
import typingsSlinky.rcSelect.generatorMod.LabelValueType
import typingsSlinky.rcSelect.generatorMod.RawValueType
import typingsSlinky.rcSelect.interfaceMod.Mode
import typingsSlinky.rcSelect.interfaceMod.RenderNode
import typingsSlinky.rcSelect.selectorMod.InnerSelectorProps
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectorProps extends InnerSelectorProps {
  var choiceTransitionName: js.UndefOr[String] = js.undefined
  var maxTagCount: js.UndefOr[Double] = js.undefined
  var maxTagPlaceholder: js.UndefOr[
    ReactElement | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactElement])
  ] = js.undefined
  var maxTagTextLength: js.UndefOr[Double] = js.undefined
  var removeIcon: js.UndefOr[RenderNode] = js.undefined
  var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.undefined
  var tokenSeparators: js.UndefOr[js.Array[String]] = js.undefined
  def onSelect(value: RawValueType, option: Selected): Unit
}

object SelectorProps {
  @scala.inline
  def apply(
    accessibilityIndex: Double,
    id: String,
    mode: Mode,
    onInputChange: ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onInputCompositionEnd: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onInputCompositionStart: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onInputKeyDown: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onInputMouseDown: SyntheticMouseEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onInputPaste: SyntheticClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
    onSelect: (RawValueType, Selected) => Unit,
    open: Boolean,
    prefixCls: String,
    searchValue: String,
    values: js.Array[LabelValueType]
  ): SelectorProps = {
    val __obj = js.Dynamic.literal(accessibilityIndex = accessibilityIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1(onInputChange), onInputCompositionEnd = js.Any.fromFunction1(onInputCompositionEnd), onInputCompositionStart = js.Any.fromFunction1(onInputCompositionStart), onInputKeyDown = js.Any.fromFunction1(onInputKeyDown), onInputMouseDown = js.Any.fromFunction1(onInputMouseDown), onInputPaste = js.Any.fromFunction1(onInputPaste), onSelect = js.Any.fromFunction2(onSelect), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorProps]
  }
  @scala.inline
  implicit class SelectorPropsOps[Self <: SelectorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnSelect(value: (RawValueType, Selected) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def setChoiceTransitionName(value: String): Self = this.set("choiceTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChoiceTransitionName: Self = this.set("choiceTransitionName", js.undefined)
    @scala.inline
    def setMaxTagCount(value: Double): Self = this.set("maxTagCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTagCount: Self = this.set("maxTagCount", js.undefined)
    @scala.inline
    def setMaxTagPlaceholderReactElement(value: ReactElement): Self = this.set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[LabelValueType] => ReactElement): Self = this.set("maxTagPlaceholder", js.Any.fromFunction1(value))
    @scala.inline
    def setMaxTagPlaceholder(value: ReactElement | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactElement])): Self = this.set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTagPlaceholder: Self = this.set("maxTagPlaceholder", js.undefined)
    @scala.inline
    def setMaxTagTextLength(value: Double): Self = this.set("maxTagTextLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTagTextLength: Self = this.set("maxTagTextLength", js.undefined)
    @scala.inline
    def setRemoveIconReactElement(value: ReactElement): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveIconFunction1(value: /* props */ js.Any => ReactElement): Self = this.set("removeIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveIcon(value: RenderNode): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveIcon: Self = this.set("removeIcon", js.undefined)
    @scala.inline
    def setTagRender(value: /* props */ CustomTagProps => ReactElement): Self = this.set("tagRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTagRender: Self = this.set("tagRender", js.undefined)
    @scala.inline
    def setTokenSeparatorsVarargs(value: String*): Self = this.set("tokenSeparators", js.Array(value :_*))
    @scala.inline
    def setTokenSeparators(value: js.Array[String]): Self = this.set("tokenSeparators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenSeparators: Self = this.set("tokenSeparators", js.undefined)
  }
  
}

