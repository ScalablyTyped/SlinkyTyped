package typingsSlinky.baseui.selectMod

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.baseui.AnonLabelKey
import typingsSlinky.baseui.AnonOption
import typingsSlinky.baseui.AnonOptionOption
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.search
import typingsSlinky.baseui.baseuiStrings.select
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectProps extends js.Object {
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var backspaceRemoves: js.UndefOr[Boolean] = js.native
  var clearable: js.UndefOr[Boolean] = js.native
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  var creatable: js.UndefOr[Boolean] = js.native
  var deleteRemoves: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var escapeClearsValue: js.UndefOr[Boolean] = js.native
  var filterOptions: js.UndefOr[
    js.Function4[
      /* options */ Value, 
      /* filterValue */ String, 
      /* excludeOptions */ js.UndefOr[Value], 
      /* newProps */ js.UndefOr[AnonLabelKey], 
      Value
    ]
  ] = js.native
  var filterOutSelected: js.UndefOr[Boolean] = js.native
  var getOptionLabel: js.UndefOr[js.Function1[/* args */ AnonOption, TagMod[Any]]] = js.native
  var getValueLabel: js.UndefOr[js.Function1[/* args */ AnonOptionOption, TagMod[Any]]] = js.native
  var id: js.UndefOr[String] = js.native
  var isLoading: js.UndefOr[Boolean] = js.native
  var labelKey: js.UndefOr[String] = js.native
  var maxDropdownHeight: js.UndefOr[String] = js.native
  var mountNode: js.UndefOr[HTMLElement] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var noResultsMsg: js.UndefOr[TagMod[Any]] = js.native
  var onBlur: js.UndefOr[js.Function1[/* e */ Event_, _]] = js.native
  var onBlurResetsInput: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* params */ OnChangeParams, _]] = js.native
  var onClose: js.UndefOr[js.Function0[_]] = js.native
  var onCloseResetsInput: js.UndefOr[Boolean] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
  var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  var onOpen: js.UndefOr[js.Function0[_]] = js.native
  var onSelectResetsInput: js.UndefOr[Boolean] = js.native
  var openOnClick: js.UndefOr[Boolean] = js.native
  var options: js.UndefOr[OptionsT] = js.native
  var overrides: js.UndefOr[SelectOverrides] = js.native
  var placeholder: js.UndefOr[TagMod[Any]] = js.native
  var positive: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var searchable: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[mini | default_ | compact | large_] = js.native
  var startOpen: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[select | search] = js.native
  var value: js.UndefOr[Value] = js.native
  var valueKey: js.UndefOr[String] = js.native
}

object SelectProps {
  @scala.inline
  def apply(): SelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectProps]
  }
  @scala.inline
  implicit class SelectPropsOps[Self <: SelectProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-describedby`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-describedby`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-errormessage`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-errormessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-errormessage`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-errormessage")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-label`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-labelledby`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-labelledby`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBackspaceRemoves(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backspaceRemoves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackspaceRemoves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backspaceRemoves")(js.undefined)
        ret
    }
    @scala.inline
    def withClearable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearable")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatable")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteRemoves(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRemoves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteRemoves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRemoves")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeClearsValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeClearsValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeClearsValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeClearsValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOptions(
      value: (/* options */ Value, /* filterValue */ String, /* excludeOptions */ js.UndefOr[Value], /* newProps */ js.UndefOr[AnonLabelKey]) => Value
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFilterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOutSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOutSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOutSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOptionLabel(value: /* args */ AnonOption => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetOptionLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValueLabel(value: /* args */ AnonOptionOption => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetValueLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDropdownHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDropdownHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDropdownHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDropdownHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMountNode(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(js.undefined)
        ret
    }
    @scala.inline
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResultsMsgReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoResultsMsg(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResultsMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResultsMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* e */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlurResetsInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlurResetsInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBlurResetsInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlurResetsInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* params */ OnChangeParams => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCloseResetsInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseResetsInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCloseResetsInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseResetsInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInputChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInputChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectResetsInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectResetsInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelectResetsInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectResetsInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: OptionsT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: SelectOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPositive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: mini | default_ | compact | large_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: select | search): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(js.undefined)
        ret
    }
  }
  
}

