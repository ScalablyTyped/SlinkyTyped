package typingsSlinky.baseui.selectMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import typingsSlinky.baseui.anon.LabelKey
import typingsSlinky.baseui.anon.OptionOption
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.search
import typingsSlinky.baseui.baseuiStrings.select
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/select.SelectProps & {  initialState :baseui.baseui/select.State | undefined,   stateReducer :baseui.baseui/select.StateReducer | undefined} */
@js.native
trait StatefulSelectProps extends js.Object {
  
  var `aria-describedby`: js.UndefOr[String] = js.native
  
  var `aria-errormessage`: js.UndefOr[String] = js.native
  
  var `aria-label`: js.UndefOr[String] = js.native
  
  var `aria-labelledby`: js.UndefOr[String] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var backspaceClearsInputValue: js.UndefOr[Boolean] = js.native
  
  var backspaceRemoves: js.UndefOr[Boolean] = js.native
  
  var clearable: js.UndefOr[Boolean] = js.native
  
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  
  var controlRef: js.UndefOr[Ref[HTMLInputElement | HTMLDivElement]] = js.native
  
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
      /* newProps */ js.UndefOr[LabelKey], 
      Value
    ]
  ] = js.native
  
  var filterOutSelected: js.UndefOr[Boolean] = js.native
  
  var getOptionLabel: js.UndefOr[js.Function1[/* args */ typingsSlinky.baseui.anon.Option, ReactElement]] = js.native
  
  var getValueLabel: js.UndefOr[js.Function1[/* args */ OptionOption, ReactElement]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var initialState: js.UndefOr[State] = js.native
  
  var isLoading: js.UndefOr[Boolean] = js.native
  
  var labelKey: js.UndefOr[String] = js.native
  
  var maxDropdownHeight: js.UndefOr[String] = js.native
  
  var mountNode: js.UndefOr[HTMLElement] = js.native
  
  var multi: js.UndefOr[Boolean] = js.native
  
  var noResultsMsg: js.UndefOr[ReactElement] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
  
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
  
  var placeholder: js.UndefOr[ReactElement] = js.native
  
  var positive: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var searchable: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[mini | default_ | compact | large_] = js.native
  
  var startOpen: js.UndefOr[Boolean] = js.native
  
  var stateReducer: js.UndefOr[StateReducer] = js.native
  
  var `type`: js.UndefOr[select | search] = js.native
  
  var value: js.UndefOr[Value] = js.native
  
  var valueKey: js.UndefOr[String] = js.native
}
object StatefulSelectProps {
  
  @scala.inline
  def apply(): StatefulSelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulSelectProps]
  }
  
  @scala.inline
  implicit class StatefulSelectPropsOps[Self <: StatefulSelectProps] (val x: Self) extends AnyVal {
    
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
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setBackspaceClearsInputValue(value: Boolean): Self = this.set("backspaceClearsInputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackspaceClearsInputValue: Self = this.set("backspaceClearsInputValue", js.undefined)
    
    @scala.inline
    def setBackspaceRemoves(value: Boolean): Self = this.set("backspaceRemoves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackspaceRemoves: Self = this.set("backspaceRemoves", js.undefined)
    
    @scala.inline
    def setClearable(value: Boolean): Self = this.set("clearable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearable: Self = this.set("clearable", js.undefined)
    
    @scala.inline
    def setCloseOnSelect(value: Boolean): Self = this.set("closeOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnSelect: Self = this.set("closeOnSelect", js.undefined)
    
    @scala.inline
    def setControlRefRefObject(value: ReactRef[HTMLInputElement | HTMLDivElement]): Self = this.set("controlRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlRefFunction1(value: /* instance */ HTMLInputElement | HTMLDivElement | Null => Unit): Self = this.set("controlRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setControlRef(value: Ref[HTMLInputElement | HTMLDivElement]): Self = this.set("controlRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlRef: Self = this.set("controlRef", js.undefined)
    
    @scala.inline
    def setControlRefNull: Self = this.set("controlRef", null)
    
    @scala.inline
    def setCreatable(value: Boolean): Self = this.set("creatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatable: Self = this.set("creatable", js.undefined)
    
    @scala.inline
    def setDeleteRemoves(value: Boolean): Self = this.set("deleteRemoves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteRemoves: Self = this.set("deleteRemoves", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setEscapeClearsValue(value: Boolean): Self = this.set("escapeClearsValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeClearsValue: Self = this.set("escapeClearsValue", js.undefined)
    
    @scala.inline
    def setFilterOptions(
      value: (/* options */ Value, /* filterValue */ String, /* excludeOptions */ js.UndefOr[Value], /* newProps */ js.UndefOr[LabelKey]) => Value
    ): Self = this.set("filterOptions", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteFilterOptions: Self = this.set("filterOptions", js.undefined)
    
    @scala.inline
    def setFilterOutSelected(value: Boolean): Self = this.set("filterOutSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOutSelected: Self = this.set("filterOutSelected", js.undefined)
    
    @scala.inline
    def setGetOptionLabel(value: /* args */ typingsSlinky.baseui.anon.Option => ReactElement): Self = this.set("getOptionLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOptionLabel: Self = this.set("getOptionLabel", js.undefined)
    
    @scala.inline
    def setGetValueLabel(value: /* args */ OptionOption => ReactElement): Self = this.set("getValueLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetValueLabel: Self = this.set("getValueLabel", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInitialState(value: State): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLoading: Self = this.set("isLoading", js.undefined)
    
    @scala.inline
    def setLabelKey(value: String): Self = this.set("labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelKey: Self = this.set("labelKey", js.undefined)
    
    @scala.inline
    def setMaxDropdownHeight(value: String): Self = this.set("maxDropdownHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDropdownHeight: Self = this.set("maxDropdownHeight", js.undefined)
    
    @scala.inline
    def setMountNode(value: HTMLElement): Self = this.set("mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountNode: Self = this.set("mountNode", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    
    @scala.inline
    def setNoResultsMsgReactElement(value: ReactElement): Self = this.set("noResultsMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoResultsMsg(value: ReactElement): Self = this.set("noResultsMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResultsMsg: Self = this.set("noResultsMsg", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ Event => _): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnBlurResetsInput(value: Boolean): Self = this.set("onBlurResetsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlurResetsInput: Self = this.set("onBlurResetsInput", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* params */ OnChangeParams => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => _): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnCloseResetsInput(value: Boolean): Self = this.set("onCloseResetsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCloseResetsInput: Self = this.set("onCloseResetsInput", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnInputChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = this.set("onInputChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInputChange: Self = this.set("onInputChange", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => _): Self = this.set("onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnSelectResetsInput(value: Boolean): Self = this.set("onSelectResetsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelectResetsInput: Self = this.set("onSelectResetsInput", js.undefined)
    
    @scala.inline
    def setOpenOnClick(value: Boolean): Self = this.set("openOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenOnClick: Self = this.set("openOnClick", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: OptionsT): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setOverrides(value: SelectOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setPlaceholderReactElement(value: ReactElement): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: ReactElement): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPositive(value: Boolean): Self = this.set("positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositive: Self = this.set("positive", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchable: Self = this.set("searchable", js.undefined)
    
    @scala.inline
    def setSize(value: mini | default_ | compact | large_): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStartOpen(value: Boolean): Self = this.set("startOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOpen: Self = this.set("startOpen", js.undefined)
    
    @scala.inline
    def setStateReducer(value: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State): Self = this.set("stateReducer", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
    
    @scala.inline
    def setType(value: select | search): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Option*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
  }
}
