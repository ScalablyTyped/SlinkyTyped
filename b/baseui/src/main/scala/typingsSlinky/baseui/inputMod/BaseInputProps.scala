package typingsSlinky.baseui.inputMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.baseui.baseuiStrings.both
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseInputProps[T] extends js.Object {
  var adjoined: js.UndefOr[none | left | right | both] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var clearable: js.UndefOr[Boolean] = js.native
  var `data-baseweb`: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inputMode: js.UndefOr[String] = js.native
  var inputRef: js.UndefOr[Ref[T]] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.native
  var onChange: js.UndefOr[FormEventHandler[T]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[T]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.native
  var overrides: js.UndefOr[BaseInputOverrides[SharedProps]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var positive: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var rows: js.UndefOr[Double] = js.native
  var size: js.UndefOr[mini | default_ | compact | large_] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object BaseInputProps {
  @scala.inline
  def apply[T](): BaseInputProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseInputProps[T]]
  }
  @scala.inline
  implicit class BaseInputPropsOps[Self[t] <: BaseInputProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdjoined(value: none | left | right | both): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjoined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjoined: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjoined")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-describedby`(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-describedby`: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-label`(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-label`: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-labelledby`(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-labelledby`: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoComplete(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoComplete: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withClearable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearable")(js.undefined)
        ret
    }
    @scala.inline
    def `withData-baseweb`(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-baseweb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutData-baseweb`: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-baseweb")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInputMode(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(js.undefined)
        ret
    }
    @scala.inline
    def withInputRefRefObject(value: ReactRef[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputRefFunction1(value: /* instance */ T | Null => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInputRef(value: Ref[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputRef: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.undefined)
        ret
    }
    @scala.inline
    def withInputRefNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(null)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: SyntheticFocusEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: SyntheticEvent[EventTarget with T, Event] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticFocusEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: SyntheticKeyboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: SyntheticKeyboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUp(value: SyntheticKeyboardEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUp: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: BaseInputOverrides[SharedProps]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPositive(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositive: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: mini | default_ | compact | large_): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String | Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

