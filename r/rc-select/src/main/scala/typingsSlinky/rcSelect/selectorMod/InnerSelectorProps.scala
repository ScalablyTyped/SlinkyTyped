package typingsSlinky.rcSelect.selectorMod

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcSelect.generatorMod.LabelValueType
import typingsSlinky.rcSelect.interfaceMod.Mode
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.ChangeEventHandler
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.CompositionEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerSelectorProps extends js.Object {
  var accessibilityIndex: Double
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: String
  var inputRef: Ref[HTMLInputElement | HTMLTextAreaElement]
  var mode: Mode
  var onInputChange: ChangeEventHandler[HTMLInputElement | HTMLTextAreaElement]
  var onInputCompositionEnd: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement]
  var onInputCompositionStart: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement]
  var onInputKeyDown: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement]
  var onInputMouseDown: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement]
  var onInputPaste: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement]
  var open: Boolean
  var placeholder: js.UndefOr[ReactElement] = js.undefined
  var prefixCls: String
  var searchValue: String
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var values: js.Array[LabelValueType]
}

object InnerSelectorProps {
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
    open: Boolean,
    prefixCls: String,
    searchValue: String,
    values: js.Array[LabelValueType]
  ): InnerSelectorProps = {
    val __obj = js.Dynamic.literal(accessibilityIndex = accessibilityIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1(onInputChange), onInputCompositionEnd = js.Any.fromFunction1(onInputCompositionEnd), onInputCompositionStart = js.Any.fromFunction1(onInputCompositionStart), onInputKeyDown = js.Any.fromFunction1(onInputKeyDown), onInputMouseDown = js.Any.fromFunction1(onInputMouseDown), onInputPaste = js.Any.fromFunction1(onInputPaste), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerSelectorProps]
  }
  @scala.inline
  implicit class InnerSelectorPropsOps[Self <: InnerSelectorProps] (val x: Self) extends AnyVal {
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
    def setAccessibilityIndex(value: Double): Self = this.set("accessibilityIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnInputChange(value: ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = this.set("onInputChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOnInputCompositionEnd(value: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = this.set("onInputCompositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setOnInputCompositionStart(value: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = this.set("onInputCompositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def setOnInputKeyDown(value: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = this.set("onInputKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnInputMouseDown(value: SyntheticMouseEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = this.set("onInputMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnInputPaste(value: SyntheticClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = this.set("onInputPaste", js.Any.fromFunction1(value))
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchValue(value: String): Self = this.set("searchValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: LabelValueType*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[LabelValueType]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInputRefRefObject(value: ReactRef[HTMLInputElement | HTMLTextAreaElement]): Self = this.set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputRefFunction1(value: /* instance */ HTMLInputElement | HTMLTextAreaElement | Null => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInputRef(value: Ref[HTMLInputElement | HTMLTextAreaElement]): Self = this.set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputRefNull: Self = this.set("inputRef", null)
    @scala.inline
    def setPlaceholderReactElement(value: ReactElement): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholder(value: ReactElement): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setShowSearch(value: Boolean): Self = this.set("showSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSearch: Self = this.set("showSearch", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
  
}

