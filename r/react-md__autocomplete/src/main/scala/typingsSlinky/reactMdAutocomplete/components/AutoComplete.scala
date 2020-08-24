package typingsSlinky.reactMdAutocomplete.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.`additions text`
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.`inline`
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.additions
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.all
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.ascending
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.assertive
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.both
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.copy
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.date
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.decimal
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.descending
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.dialog
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.email
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.execute
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.grammar
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.grid
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.horizontal
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.inherit
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.link
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.list
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.listbox
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.location
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.menu
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.mixed
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.move
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.no
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.none
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.numeric
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.off
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.on
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.other
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.page
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.polite
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.popup
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.removals
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.search
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.spelling
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.step
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.tel
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.text
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.time
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.tree
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.url
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.vertical
import typingsSlinky.reactMdAutocomplete.reactMdAutocompleteStrings.yes
import typingsSlinky.reactMdAutocomplete.typesMod.AutoCompleteData
import typingsSlinky.reactMdAutocomplete.typesMod.AutoCompleteFilterFunction
import typingsSlinky.reactMdAutocomplete.typesMod.AutoCompleteProps
import typingsSlinky.reactMdAutocomplete.typesMod.AutoCompleteResult
import typingsSlinky.reactMdAutocomplete.typesMod.AutoCompletion
import typingsSlinky.reactMdAutocomplete.typesMod.FilterFunctionOptions
import typingsSlinky.reactMdForm.anon.OmitHTMLAttributesHTMLDiv
import typingsSlinky.reactMdForm.formThemeProviderMod.FormTheme
import typingsSlinky.reactMdForm.formThemeProviderMod.FormUnderlineDirection
import typingsSlinky.reactMdPortal.getContainerMod.PortalInto
import typingsSlinky.reactMdUtils.anon.PartialPositionAnchor
import typingsSlinky.reactMdUtils.typesMod.PositionWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoComplete {
  @JSImport("@react-md/autocomplete", "AutoComplete")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLInputElement] {
    @scala.inline
    def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    @scala.inline
    def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def afterResultsChildrenReactElement(value: ReactElement): this.type = set("afterResultsChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def afterResultsChildren(value: ReactElement): this.type = set("afterResultsChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def anchor(value: PartialPositionAnchor): this.type = set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-atomic`(value: Boolean): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-busy`(value: Boolean): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-disabled`(value: Boolean): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-expanded`(value: Boolean): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-grabbed`(value: Boolean): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-hidden`(value: Boolean): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-modal`(value: Boolean): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-multiline`(value: Boolean): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-multiselectable`(value: Boolean): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-readonly`(value: Boolean): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-relevant`(value: additions | (`additions text`) | all | removals | text): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-required`(value: Boolean): this.type = set("aria-required", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-selected`(value: Boolean): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    @scala.inline
    def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def autoComplete(value: AutoCompletion): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    @scala.inline
    def beforeResultsChildrenReactElement(value: ReactElement): this.type = set("beforeResultsChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def beforeResultsChildren(value: ReactElement): this.type = set("beforeResultsChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def capture(value: Boolean | String): this.type = set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def clearOnAutoComplete(value: Boolean): this.type = set("clearOnAutoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnResize(value: Boolean): this.type = set("closeOnResize", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnScroll(value: Boolean): this.type = set("closeOnScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def containerProps(value: OmitHTMLAttributesHTMLDiv): this.type = set("containerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def containerRefRefObject(value: ReactRef[HTMLDivElement]): this.type = set("containerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def containerRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): this.type = set("containerRef", js.Any.fromFunction1(value))
    @scala.inline
    def containerRef(value: Ref[HTMLDivElement]): this.type = set("containerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def containerRefNull: this.type = set("containerRef", null)
    @scala.inline
    def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def dense(value: Boolean): this.type = set("dense", value.asInstanceOf[js.Any])
    @scala.inline
    def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def disableShowOnFocus(value: Boolean): this.type = set("disableShowOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def disableSwapping(value: Boolean): this.type = set("disableSwapping", value.asInstanceOf[js.Any])
    @scala.inline
    def disableVHBounds(value: Boolean): this.type = set("disableVHBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def filterFunction3(
      value: (/* query */ String, /* data */ js.Array[AutoCompleteData], /* options */ FilterFunctionOptions[js.Object]) => js.Array[AutoCompleteData]
    ): this.type = set("filter", js.Any.fromFunction3(value))
    @scala.inline
    def filter(value: AutoCompleteFilterFunction[js.Object]): this.type = set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def filterOnNoValue(value: Boolean): this.type = set("filterOnNoValue", value.asInstanceOf[js.Any])
    @scala.inline
    def filterOptions(value: typingsSlinky.reactMdAutocomplete.anon.FilterFunctionOptions): this.type = set("filterOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def formAction(value: String): this.type = set("formAction", value.asInstanceOf[js.Any])
    @scala.inline
    def formEncType(value: String): this.type = set("formEncType", value.asInstanceOf[js.Any])
    @scala.inline
    def formMethod(value: String): this.type = set("formMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def formNoValidate(value: Boolean): this.type = set("formNoValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def formTarget(value: String): this.type = set("formTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def getResultId(value: (/* id */ String, /* index */ Double) => String): this.type = set("getResultId", js.Any.fromFunction2(value))
    @scala.inline
    def getResultLabel(value: (/* data */ AutoCompleteData, /* labelKey */ String, /* query */ String) => ReactElement): this.type = set("getResultLabel", js.Any.fromFunction3(value))
    @scala.inline
    def getResultValue(value: (/* datum */ AutoCompleteData, /* valueKey */ String) => String): this.type = set("getResultValue", js.Any.fromFunction2(value))
    @scala.inline
    def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def highlight(value: Boolean): this.type = set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def highlightClassName(value: String): this.type = set("highlightClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def highlightReapeating(value: Boolean): this.type = set("highlightReapeating", value.asInstanceOf[js.Any])
    @scala.inline
    def highlightStyle(value: CSSProperties): this.type = set("highlightStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def initialX(value: Double): this.type = set("initialX", value.asInstanceOf[js.Any])
    @scala.inline
    def initialY(value: Double): this.type = set("initialY", value.asInstanceOf[js.Any])
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def inlist(value: js.Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    @scala.inline
    def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def inputStyle(value: CSSProperties): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def isLeftAddon(value: Boolean): this.type = set("isLeftAddon", value.asInstanceOf[js.Any])
    @scala.inline
    def isRightAddon(value: Boolean): this.type = set("isRightAddon", value.asInstanceOf[js.Any])
    @scala.inline
    def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    @scala.inline
    def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    @scala.inline
    def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    @scala.inline
    def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    @scala.inline
    def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def labelClassName(value: String): this.type = set("labelClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def labelKey(value: String): this.type = set("labelKey", value.asInstanceOf[js.Any])
    @scala.inline
    def labelStyle(value: CSSProperties): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def leftChildrenReactElement(value: ReactElement): this.type = set("leftChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def leftChildren(value: ReactElement): this.type = set("leftChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def list(value: String): this.type = set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def listboxClassName(value: String): this.type = set("listboxClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def listboxStyle(value: CSSProperties): this.type = set("listboxStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def listboxWidth(value: PositionWidth): this.type = set("listboxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double | String): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double | String): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def omitKeysVarargs(value: String*): this.type = set("omitKeys", js.Array(value :_*))
    @scala.inline
    def omitKeys(value: js.Array[String]): this.type = set("omitKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def onAbort(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationEnd(value: SyntheticAnimationEvent[HTMLInputElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationIteration(value: SyntheticAnimationEvent[HTMLInputElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationStart(value: SyntheticAnimationEvent[HTMLInputElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    @scala.inline
    def onAutoComplete(value: /* result */ AutoCompleteResult => Unit): this.type = set("onAutoComplete", js.Any.fromFunction1(value))
    @scala.inline
    def onAuxClick(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
    @scala.inline
    def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onCanPlay(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    @scala.inline
    def onCanPlayThrough(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionEnd(value: SyntheticCompositionEvent[HTMLInputElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionStart(value: SyntheticCompositionEvent[HTMLInputElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLInputElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def onContextMenu(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def onCopy(value: SyntheticClipboardEvent[HTMLInputElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def onCut(value: SyntheticClipboardEvent[HTMLInputElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
    @scala.inline
    def onDoubleClick(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDrag(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnd(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnter(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onDragExit(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
    @scala.inline
    def onDragLeave(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onDragOver(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def onDragStart(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def onDrop(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def onDurationChange(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    @scala.inline
    def onEmptied(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
    @scala.inline
    def onEncrypted(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
    @scala.inline
    def onEnded(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    @scala.inline
    def onError(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onInput(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    @scala.inline
    def onInvalid(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def onLoad(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadStart(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadedData(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadedMetadata(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseMove(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseOut(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseOver(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def onPaste(value: SyntheticClipboardEvent[HTMLInputElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def onPause(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def onPlay(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def onPlaying(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerCancel(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerDown(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerEnter(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerLeave(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerMove(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerOut(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerOver(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerUp(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    @scala.inline
    def onProgress(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def onRateChange(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def onReset(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
    @scala.inline
    def onScroll(value: SyntheticUIEvent[HTMLInputElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def onSeeked(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def onSeeking(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def onStalled(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
    @scala.inline
    def onSubmit(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def onSuspend(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
    @scala.inline
    def onTimeUpdate(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchCancel(value: SyntheticTouchEvent[HTMLInputElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchEnd(value: SyntheticTouchEvent[HTMLInputElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchMove(value: SyntheticTouchEvent[HTMLInputElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchStart(value: SyntheticTouchEvent[HTMLInputElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def onTransitionEnd(value: SyntheticTransitionEvent[HTMLInputElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onVolumeChange(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def onWaiting(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
    @scala.inline
    def onWheel(value: SyntheticWheelEvent[HTMLInputElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def portal(value: Boolean): this.type = set("portal", value.asInstanceOf[js.Any])
    @scala.inline
    def portalIntoHTMLElement(value: HTMLElement): this.type = set("portalInto", value.asInstanceOf[js.Any])
    @scala.inline
    def portalIntoFunction0(value: () => HTMLElement | Null): this.type = set("portalInto", js.Any.fromFunction0(value))
    @scala.inline
    def portalInto(value: PortalInto): this.type = set("portalInto", value.asInstanceOf[js.Any])
    @scala.inline
    def portalIntoNull: this.type = set("portalInto", null)
    @scala.inline
    def portalIntoId(value: String): this.type = set("portalIntoId", value.asInstanceOf[js.Any])
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def preventOverlap(value: Boolean): this.type = set("preventOverlap", value.asInstanceOf[js.Any])
    @scala.inline
    def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def rightChildrenReactElement(value: ReactElement): this.type = set("rightChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def rightChildren(value: ReactElement): this.type = set("rightChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: Double | String): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: FormTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def transformOrigin(value: Boolean): this.type = set("transformOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    @scala.inline
    def underlineDirection(value: FormUnderlineDirection): this.type = set("underlineDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueKey(value: String): this.type = set("valueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def vhMargin(value: Double): this.type = set("vhMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    @scala.inline
    def vwMargin(value: Double): this.type = set("vwMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def xMargin(value: Double): this.type = set("xMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def yMargin(value: Double): this.type = set("yMargin", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutoCompleteProps with RefAttributes[HTMLInputElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[AutoCompleteData], id: String): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AutoCompleteProps with RefAttributes[HTMLInputElement]]))
  }
}

