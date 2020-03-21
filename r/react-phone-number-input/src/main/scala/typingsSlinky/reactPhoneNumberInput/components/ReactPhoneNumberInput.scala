package typingsSlinky.reactPhoneNumberInput.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
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
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactPhoneNumberInput.AnonCountry
import typingsSlinky.reactPhoneNumberInput.mod.CountrySelectComponentProps
import typingsSlinky.reactPhoneNumberInput.mod.FlagsMap
import typingsSlinky.reactPhoneNumberInput.mod.PhoneInputProps
import typingsSlinky.reactPhoneNumberInput.mod.default
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.`additions text`
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.`inline`
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.additions
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.all
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.ascending
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.assertive
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.both
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.copy
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.date
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.decimal
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.descending
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.dialog
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.email
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.execute
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.grammar
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.grid
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.horizontal
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.inherit
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.link
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.list
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.listbox
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.location
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.menu
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.mixed
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.move
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.no
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.none
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.numeric
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.off
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.on
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.other
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.page
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.polite
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.popup
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.removals
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.search
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.spelling
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.step
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.tel
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.text
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.time
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.tree
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.url
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.vertical
import typingsSlinky.reactPhoneNumberInput.reactPhoneNumberInputStrings.yes
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactPhoneNumberInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-phone-number-input", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: accept, autoComplete, autoFocus, capture, checked, className, dangerouslySetInnerHTML, defaultChecked, defaultValue, dir, disabled, draggable, form, height, hidden, id, lang, list, max, min, multiple, name, pattern, placeholder, readOnly, required, size, spellCheck, src, step, style, suppressContentEditableWarning, tabIndex, title, type, width */
  def apply(
    onChange: String => Unit,
    value: String,
    about: String = null,
    accessKey: String = null,
    addInternationalOption: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    color: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    countries: js.Array[String] = null,
    countryOptionsOrder: js.Array[String] = null,
    countrySelectComponent: ReactComponentClass[CountrySelectComponentProps] = null,
    countrySelectProps: Int | Double = null,
    crossOrigin: String = null,
    datatype: String = null,
    defaultCountry: String = null,
    displayInitialValueAsLocalNumber: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    flagComponent: ReactComponentClass[AnonCountry] = null,
    flagUrl: String = null,
    flags: FlagsMap = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    inlist: js.Any = null,
    inputClassName: String = null,
    inputComponent: ForwardRefExoticComponent[InputHTMLAttributes[HTMLInputElement] with RefAttributes[_]] = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    internationalIcon: ReactComponentClass[js.Object] = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    limitMaxLength: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    metadata: js.Object = null,
    minLength: Int | Double = null,
    numberInputProps: js.Object = null,
    onAbort: SyntheticEvent[Event_, String] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[String] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[String] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[String] => Unit = null,
    onAuxClick: SyntheticMouseEvent[String] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with String, Event_] => Unit = null,
    onBlur: SyntheticFocusEvent[String] => Unit = null,
    onCanPlay: SyntheticEvent[Event_, String] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event_, String] => Unit = null,
    onClick: SyntheticMouseEvent[String] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[String] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[String] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[String] => Unit = null,
    onContextMenu: SyntheticMouseEvent[String] => Unit = null,
    onCopy: SyntheticClipboardEvent[String] => Unit = null,
    onCountryChange: /* countryCode */ js.UndefOr[String] => Unit = null,
    onCut: SyntheticClipboardEvent[String] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[String] => Unit = null,
    onDrag: DragEvent[String] => Unit = null,
    onDragEnd: DragEvent[String] => Unit = null,
    onDragEnter: DragEvent[String] => Unit = null,
    onDragExit: DragEvent[String] => Unit = null,
    onDragLeave: DragEvent[String] => Unit = null,
    onDragOver: DragEvent[String] => Unit = null,
    onDragStart: DragEvent[String] => Unit = null,
    onDrop: DragEvent[String] => Unit = null,
    onDurationChange: SyntheticEvent[Event_, String] => Unit = null,
    onEmptied: SyntheticEvent[Event_, String] => Unit = null,
    onEncrypted: SyntheticEvent[Event_, String] => Unit = null,
    onEnded: SyntheticEvent[Event_, String] => Unit = null,
    onError: SyntheticEvent[Event_, String] => Unit = null,
    onFocus: SyntheticFocusEvent[String] => Unit = null,
    onInput: SyntheticEvent[EventTarget with String, Event_] => Unit = null,
    onInvalid: SyntheticEvent[EventTarget with String, Event_] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[String] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[String] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[String] => Unit = null,
    onLoad: SyntheticEvent[Event_, String] => Unit = null,
    onLoadStart: SyntheticEvent[Event_, String] => Unit = null,
    onLoadedData: SyntheticEvent[Event_, String] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event_, String] => Unit = null,
    onMouseDown: SyntheticMouseEvent[String] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[String] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[String] => Unit = null,
    onMouseMove: SyntheticMouseEvent[String] => Unit = null,
    onMouseOut: SyntheticMouseEvent[String] => Unit = null,
    onMouseOver: SyntheticMouseEvent[String] => Unit = null,
    onMouseUp: SyntheticMouseEvent[String] => Unit = null,
    onPaste: SyntheticClipboardEvent[String] => Unit = null,
    onPause: SyntheticEvent[Event_, String] => Unit = null,
    onPlay: SyntheticEvent[Event_, String] => Unit = null,
    onPlaying: SyntheticEvent[Event_, String] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[String] => Unit = null,
    onPointerDown: SyntheticPointerEvent[String] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[String] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[String] => Unit = null,
    onPointerMove: SyntheticPointerEvent[String] => Unit = null,
    onPointerOut: SyntheticPointerEvent[String] => Unit = null,
    onPointerOver: SyntheticPointerEvent[String] => Unit = null,
    onPointerUp: SyntheticPointerEvent[String] => Unit = null,
    onProgress: SyntheticEvent[Event_, String] => Unit = null,
    onRateChange: SyntheticEvent[Event_, String] => Unit = null,
    onReset: SyntheticEvent[EventTarget with String, Event_] => Unit = null,
    onScroll: SyntheticUIEvent[String] => Unit = null,
    onSeeked: SyntheticEvent[Event_, String] => Unit = null,
    onSeeking: SyntheticEvent[Event_, String] => Unit = null,
    onSelect: SyntheticEvent[Event_, String] => Unit = null,
    onStalled: SyntheticEvent[Event_, String] => Unit = null,
    onSubmit: SyntheticEvent[EventTarget with String, Event_] => Unit = null,
    onSuspend: SyntheticEvent[Event_, String] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event_, String] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[String] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[String] => Unit = null,
    onTouchMove: SyntheticTouchEvent[String] => Unit = null,
    onTouchStart: SyntheticTouchEvent[String] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[String] => Unit = null,
    onVolumeChange: SyntheticEvent[Event_, String] => Unit = null,
    onWaiting: SyntheticEvent[Event_, String] => Unit = null,
    onWheel: SyntheticWheelEvent[String] => Unit = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    showCountrySelect: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    smartCaret: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    useNationalFormatForDefaultCountryValue: js.UndefOr[Boolean] = js.undefined,
    vocab: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(addInternationalOption)) __obj.updateDynamic("addInternationalOption")(addInternationalOption.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (countryOptionsOrder != null) __obj.updateDynamic("countryOptionsOrder")(countryOptionsOrder.asInstanceOf[js.Any])
    if (countrySelectComponent != null) __obj.updateDynamic("countrySelectComponent")(countrySelectComponent.asInstanceOf[js.Any])
    if (countrySelectProps != null) __obj.updateDynamic("countrySelectProps")(countrySelectProps.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    if (!js.isUndefined(displayInitialValueAsLocalNumber)) __obj.updateDynamic("displayInitialValueAsLocalNumber")(displayInitialValueAsLocalNumber.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (flagComponent != null) __obj.updateDynamic("flagComponent")(flagComponent.asInstanceOf[js.Any])
    if (flagUrl != null) __obj.updateDynamic("flagUrl")(flagUrl.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputComponent != null) __obj.updateDynamic("inputComponent")(inputComponent.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (internationalIcon != null) __obj.updateDynamic("internationalIcon")(internationalIcon.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (!js.isUndefined(limitMaxLength)) __obj.updateDynamic("limitMaxLength")(limitMaxLength.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (numberInputProps != null) __obj.updateDynamic("numberInputProps")(numberInputProps.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1(onCountryChange))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(showCountrySelect)) __obj.updateDynamic("showCountrySelect")(showCountrySelect.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(smartCaret)) __obj.updateDynamic("smartCaret")(smartCaret.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (!js.isUndefined(useNationalFormatForDefaultCountryValue)) __obj.updateDynamic("useNationalFormatForDefaultCountryValue")(useNationalFormatForDefaultCountryValue.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PhoneInputProps
}

