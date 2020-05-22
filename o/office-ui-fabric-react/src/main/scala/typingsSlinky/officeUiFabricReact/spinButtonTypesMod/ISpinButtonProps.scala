package typingsSlinky.officeUiFabricReact.spinButtonTypesMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
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
import typingsSlinky.officeUiFabricReact.anon.PartialIButtonStyles
import typingsSlinky.officeUiFabricReact.anon.PartialISpinButtonStyles
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.positioningTypesMod.Position
import typingsSlinky.officeUiFabricReact.spinButtonClassNamesMod.ISpinButtonClassNames
import typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.reactStrings.`additions text`
import typingsSlinky.react.reactStrings.`inline`
import typingsSlinky.react.reactStrings.additions
import typingsSlinky.react.reactStrings.all
import typingsSlinky.react.reactStrings.ascending
import typingsSlinky.react.reactStrings.assertive
import typingsSlinky.react.reactStrings.both
import typingsSlinky.react.reactStrings.copy
import typingsSlinky.react.reactStrings.date
import typingsSlinky.react.reactStrings.decimal
import typingsSlinky.react.reactStrings.descending
import typingsSlinky.react.reactStrings.dialog
import typingsSlinky.react.reactStrings.email
import typingsSlinky.react.reactStrings.execute
import typingsSlinky.react.reactStrings.grammar
import typingsSlinky.react.reactStrings.grid
import typingsSlinky.react.reactStrings.horizontal
import typingsSlinky.react.reactStrings.inherit
import typingsSlinky.react.reactStrings.link
import typingsSlinky.react.reactStrings.list
import typingsSlinky.react.reactStrings.listbox
import typingsSlinky.react.reactStrings.location
import typingsSlinky.react.reactStrings.menu
import typingsSlinky.react.reactStrings.mixed
import typingsSlinky.react.reactStrings.move
import typingsSlinky.react.reactStrings.no
import typingsSlinky.react.reactStrings.none
import typingsSlinky.react.reactStrings.numeric
import typingsSlinky.react.reactStrings.off
import typingsSlinky.react.reactStrings.on
import typingsSlinky.react.reactStrings.other
import typingsSlinky.react.reactStrings.page
import typingsSlinky.react.reactStrings.polite
import typingsSlinky.react.reactStrings.popup
import typingsSlinky.react.reactStrings.removals
import typingsSlinky.react.reactStrings.search
import typingsSlinky.react.reactStrings.spelling
import typingsSlinky.react.reactStrings.step
import typingsSlinky.react.reactStrings.tel
import typingsSlinky.react.reactStrings.text
import typingsSlinky.react.reactStrings.time
import typingsSlinky.react.reactStrings.tree
import typingsSlinky.react.reactStrings.url
import typingsSlinky.react.reactStrings.vertical
import typingsSlinky.react.reactStrings.yes
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinButtonProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * ID of a label which describes the control, if not using the default label.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  /**
    * A description of the control for the benefit of screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * The position in the parent set (if in a set).
    */
  var ariaPositionInSet: js.UndefOr[Double] = js.undefined
  /**
    * The total size of the parent set (if in a set).
    */
  var ariaSetSize: js.UndefOr[Double] = js.undefined
  /**
    * Sets the control's aria-valuenow. This is the numeric form of `value`.
    * Providing this only makes sense when using as a controlled component.
    */
  var ariaValueNow: js.UndefOr[Double] = js.undefined
  var ariaValueText: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[ISpinButton]] = js.undefined
  /**
    * Accessible label text for the decrement button (for screen reader users).
    */
  var decrementButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Custom props for the decrement button.
    */
  var decrementButtonIcon: js.UndefOr[IIconProps] = js.undefined
  /**
    * Initial value of the control. Updates to this prop will not be respected.
    *
    * Use this if you intend for the SpinButton to be an uncontrolled component which maintains its own value.
    * Mutually exclusive with `value`.
    * @defaultvalue 0
    */
  @JSName("defaultValue")
  var defaultValue_ISpinButtonProps: js.UndefOr[String] = js.undefined
  /**
    * Whether or not the control is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom styles for the down arrow button.
    *
    * Note: The buttons are in a checked state when arrow keys are used to incremenent/decrement
    * the SpinButton. Use `rootChecked` instead of `rootPressed` for styling when that is the case.
    */
  var downArrowButtonStyles: js.UndefOr[PartialIButtonStyles] = js.undefined
  /**
    * Custom function for providing the classNames for the control. Can be used to provide
    * all styles for the component instead of applying them on top of the default styles.
    */
  var getClassNames: js.UndefOr[
    js.Function6[
      /* theme */ ITheme, 
      /* disabled */ Boolean, 
      /* isFocused */ Boolean, 
      /* keyboardSpinDirection */ KeyboardSpinDirection, 
      /* labelPosition */ js.UndefOr[Position], 
      /* className */ js.UndefOr[String], 
      ISpinButtonClassNames
    ]
  ] = js.undefined
  /**
    * Additional props for the up and down arrow buttons.
    */
  var iconButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /**
    * Props for an icon to display alongside the control's label.
    */
  var iconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * Accessible label text for the increment button (for screen reader users).
    */
  var incrementButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Custom props for the increment button.
    */
  var incrementButtonIcon: js.UndefOr[IIconProps] = js.undefined
  /**
    * Additional props for the input field.
    */
  var inputProps: js.UndefOr[InputHTMLAttributes[HTMLElement | HTMLInputElement]] = js.undefined
  /**
    * Keytip for the control.
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  /**
    * Descriptive label for the control.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Where to position the control's label.
    * @defaultvalue Left
    */
  var labelPosition: js.UndefOr[Position] = js.undefined
  /**
    * Max value of the control.
    * @defaultvalue 100
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Min value of the control.
    * @defaultvalue 0
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Callback for when the control loses focus.
    */
  @JSName("onBlur")
  var onBlur_ISpinButtonProps: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  /**
    * Callback for when the decrement button or down arrow key is pressed.
    * @returns If a string is returned, it will be used as the new value
    */
  var onDecrement: js.UndefOr[js.Function1[/* value */ String, String | Unit]] = js.undefined
  /**
    * Callback for when the user focuses the control.
    */
  @JSName("onFocus")
  var onFocus_ISpinButtonProps: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  /**
    * Callback for when the increment button or up arrow key is pressed.
    * @returns If a string is returned, it will be used as the new value
    */
  var onIncrement: js.UndefOr[js.Function1[/* value */ String, String | Unit]] = js.undefined
  /**
    * Callback for when the entered value should be validated.
    * @param value - The entered value to validate
    * @param event - The event that triggered this validate, if any (for accessibility)
    * @returns If a string is returned, it will be used as the new value
    */
  var onValidate: js.UndefOr[
    js.Function2[
      /* value */ String, 
      /* event */ js.UndefOr[SyntheticEvent[Event, HTMLElement]], 
      String | Unit
    ]
  ] = js.undefined
  /**
    * How many decimal places the value should be rounded to.
    *
    * The default is calculated based on the precision of `step`: i.e. if step = 1, precision = 0.
    * step = 0.0089, precision = 4. step = 300, precision = 2. step = 23.00, precision = 2.
    */
  var precision: js.UndefOr[Double] = js.undefined
  /**
    * Difference between two adjacent values of the control.
    * This value is used to calculate the precision of the input if no `precision` is given.
    * The precision calculated this way will always be \>= 0.
    * @defaultvalue 1
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * Custom styling for individual elements within the control.
    */
  var styles: js.UndefOr[PartialISpinButtonStyles] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Custom styles for the up arrow button.
    *
    * Note: The buttons are in a checked state when arrow keys are used to incremenent/decrement
    * the SpinButton. Use `rootChecked` instead of `rootPressed` for styling when that is the case.
    */
  var upArrowButtonStyles: js.UndefOr[PartialIButtonStyles] = js.undefined
  /**
    * Current value of the control.
    *
    * Use this if you intend to pass in a new value as a result of change events.
    * Mutually exclusive with `defaultValue`.
    */
  var value: js.UndefOr[String] = js.undefined
}

object ISpinButtonProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: js.UndefOr[Double] = js.undefined,
    `aria-colindex`: js.UndefOr[Double] = js.undefined,
    `aria-colspan`: js.UndefOr[Double] = js.undefined,
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
    `aria-level`: js.UndefOr[Double] = js.undefined,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: js.UndefOr[Double] = js.undefined,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: js.UndefOr[Double] = js.undefined,
    `aria-rowindex`: js.UndefOr[Double] = js.undefined,
    `aria-rowspan`: js.UndefOr[Double] = js.undefined,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: js.UndefOr[Double] = js.undefined,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: js.UndefOr[Double] = js.undefined,
    `aria-valuemin`: js.UndefOr[Double] = js.undefined,
    `aria-valuenow`: js.UndefOr[Double] = js.undefined,
    `aria-valuetext`: String = null,
    ariaDescribedBy: String = null,
    ariaLabel: String = null,
    ariaPositionInSet: js.UndefOr[Double] = js.undefined,
    ariaSetSize: js.UndefOr[Double] = js.undefined,
    ariaValueNow: js.UndefOr[Double] = js.undefined,
    ariaValueText: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    children: TagMod[Any] = null,
    className: String = null,
    color: String = null,
    componentRef: IRefObject[ISpinButton] = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: Html = null,
    datatype: String = null,
    decrementButtonAriaLabel: String = null,
    decrementButtonIcon: IIconProps = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    downArrowButtonStyles: PartialIButtonStyles = null,
    draggable: js.UndefOr[Booleanish] = js.undefined,
    getClassNames: (/* theme */ ITheme, /* disabled */ Boolean, /* isFocused */ Boolean, /* keyboardSpinDirection */ KeyboardSpinDirection, /* labelPosition */ js.UndefOr[Position], /* className */ js.UndefOr[String]) => ISpinButtonClassNames = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    iconButtonProps: IButtonProps = null,
    iconProps: IIconProps = null,
    id: String = null,
    incrementButtonAriaLabel: String = null,
    incrementButtonIcon: IIconProps = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    inputProps: InputHTMLAttributes[HTMLElement | HTMLInputElement] = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    keytipProps: IKeytipProps = null,
    label: String = null,
    labelPosition: Position = null,
    lang: String = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onAbort: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[HTMLDivElement] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[HTMLDivElement] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[HTMLDivElement] => Unit = null,
    onAuxClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit = null,
    onBlur: SyntheticFocusEvent[HTMLInputElement] => Unit = null,
    onCanPlay: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onChange: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit = null,
    onClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[HTMLDivElement] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[HTMLDivElement] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[HTMLDivElement] => Unit = null,
    onContextMenu: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onCopy: SyntheticClipboardEvent[HTMLDivElement] => Unit = null,
    onCut: SyntheticClipboardEvent[HTMLDivElement] => Unit = null,
    onDecrement: /* value */ String => String | Unit = null,
    onDoubleClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onDrag: DragEvent[HTMLDivElement] => Unit = null,
    onDragEnd: DragEvent[HTMLDivElement] => Unit = null,
    onDragEnter: DragEvent[HTMLDivElement] => Unit = null,
    onDragExit: DragEvent[HTMLDivElement] => Unit = null,
    onDragLeave: DragEvent[HTMLDivElement] => Unit = null,
    onDragOver: DragEvent[HTMLDivElement] => Unit = null,
    onDragStart: DragEvent[HTMLDivElement] => Unit = null,
    onDrop: DragEvent[HTMLDivElement] => Unit = null,
    onDurationChange: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onEmptied: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onEncrypted: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onEnded: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onError: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onFocus: SyntheticFocusEvent[HTMLInputElement] => Unit = null,
    onIncrement: /* value */ String => String | Unit = null,
    onInput: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit = null,
    onInvalid: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[HTMLDivElement] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[HTMLDivElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[HTMLDivElement] => Unit = null,
    onLoad: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onLoadStart: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onLoadedData: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onMouseDown: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onMouseMove: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onMouseOut: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onMouseOver: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onMouseUp: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onPaste: SyntheticClipboardEvent[HTMLDivElement] => Unit = null,
    onPause: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onPlay: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onPlaying: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onPointerDown: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onPointerMove: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onPointerOut: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onPointerOver: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onPointerUp: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onProgress: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onRateChange: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onReset: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit = null,
    onScroll: SyntheticUIEvent[HTMLDivElement] => Unit = null,
    onSeeked: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onSeeking: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onSelect: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onStalled: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onSubmit: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit = null,
    onSuspend: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[HTMLDivElement] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[HTMLDivElement] => Unit = null,
    onTouchMove: SyntheticTouchEvent[HTMLDivElement] => Unit = null,
    onTouchStart: SyntheticTouchEvent[HTMLDivElement] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[HTMLDivElement] => Unit = null,
    onValidate: (/* value */ String, /* event */ js.UndefOr[SyntheticEvent[Event, HTMLElement]]) => String | Unit = null,
    onVolumeChange: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onWaiting: SyntheticEvent[Event, HTMLDivElement] => Unit = null,
    onWheel: SyntheticWheelEvent[HTMLDivElement] => Unit = null,
    placeholder: String = null,
    precision: js.UndefOr[Double] = js.undefined,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: js.UndefOr[Double] = js.undefined,
    role: String = null,
    security: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Booleanish] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    styles: PartialISpinButtonStyles = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    theme: ITheme = null,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    upArrowButtonStyles: PartialIButtonStyles = null,
    value: String = null,
    vocab: String = null
  ): ISpinButtonProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.get.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.get.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colcount`)) __obj.updateDynamic("aria-colcount")(`aria-colcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colindex`)) __obj.updateDynamic("aria-colindex")(`aria-colindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colspan`)) __obj.updateDynamic("aria-colspan")(`aria-colspan`.get.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.get.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.get.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.get.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.get.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-level`)) __obj.updateDynamic("aria-level")(`aria-level`.get.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.get.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-posinset`)) __obj.updateDynamic("aria-posinset")(`aria-posinset`.get.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.get.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.get.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowcount`)) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowindex`)) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowspan`)) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-setsize`)) __obj.updateDynamic("aria-setsize")(`aria-setsize`.get.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemax`)) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemin`)) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuenow`)) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.get.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaPositionInSet)) __obj.updateDynamic("ariaPositionInSet")(ariaPositionInSet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaSetSize)) __obj.updateDynamic("ariaSetSize")(ariaSetSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaValueNow)) __obj.updateDynamic("ariaValueNow")(ariaValueNow.get.asInstanceOf[js.Any])
    if (ariaValueText != null) __obj.updateDynamic("ariaValueText")(ariaValueText.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (decrementButtonAriaLabel != null) __obj.updateDynamic("decrementButtonAriaLabel")(decrementButtonAriaLabel.asInstanceOf[js.Any])
    if (decrementButtonIcon != null) __obj.updateDynamic("decrementButtonIcon")(decrementButtonIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (downArrowButtonStyles != null) __obj.updateDynamic("downArrowButtonStyles")(downArrowButtonStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction6(getClassNames))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (iconButtonProps != null) __obj.updateDynamic("iconButtonProps")(iconButtonProps.asInstanceOf[js.Any])
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (incrementButtonAriaLabel != null) __obj.updateDynamic("incrementButtonAriaLabel")(incrementButtonAriaLabel.asInstanceOf[js.Any])
    if (incrementButtonIcon != null) __obj.updateDynamic("incrementButtonIcon")(incrementButtonIcon.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.get.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDecrement != null) __obj.updateDynamic("onDecrement")(js.Any.fromFunction1(onDecrement))
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
    if (onIncrement != null) __obj.updateDynamic("onIncrement")(js.Any.fromFunction1(onIncrement))
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
    if (onValidate != null) __obj.updateDynamic("onValidate")(js.Any.fromFunction2(onValidate))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (upArrowButtonStyles != null) __obj.updateDynamic("upArrowButtonStyles")(upArrowButtonStyles.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinButtonProps]
  }
}

