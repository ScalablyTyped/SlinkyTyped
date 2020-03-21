package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
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
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.PartialIButtonStyles
import typingsSlinky.officeUiFabricReact.PartialIComboBoxOptionSty
import typingsSlinky.officeUiFabricReact.PartialIComboBoxStyles
import typingsSlinky.officeUiFabricReact.autofillTypesMod.IAutofillProps
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.comboBoxClassNamesMod.IComboBoxClassNames
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBox
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxOption
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps
import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IOnRenderComboBoxLabelProps
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.on
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanelProps
import typingsSlinky.officeUiFabricReact.selectableDroppableTextTypesMod.ISelectableDroppableTextProps
import typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import typingsSlinky.react.mod.DragEvent
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
import typingsSlinky.std.Event_
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IComboBoxProps382753916[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, contentEditable, dangerouslySetInnerHTML, defaultChecked, defaultValue, dir, disabled, draggable, hidden, id, label, lang, placeholder, required, spellCheck, style, suppressContentEditableWarning, tabIndex, title */
  def apply(
    options: js.Array[IComboBoxOption],
    about: String = null,
    accessKey: String = null,
    allowFreeform: js.UndefOr[Boolean] = js.undefined,
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
    ariaDescribedBy: String = null,
    ariaLabel: String = null,
    autoCapitalize: String = null,
    autoComplete: on | typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.off = null,
    autoCorrect: String = null,
    autoSave: String = null,
    autofill: IAutofillProps = null,
    buttonIconProps: IIconProps = null,
    calloutProps: ICalloutProps = null,
    caretDownButtonStyles: PartialIButtonStyles = null,
    color: String = null,
    comboBoxOptionStyles: PartialIComboBoxOptionSty = null,
    componentRef: IRefObject[IComboBox] = null,
    contextMenu: String = null,
    datatype: String = null,
    defaultSelectedKey: String | Double | (js.Array[Double | String]) = null,
    dropdownMaxWidth: Int | Double = null,
    dropdownWidth: Int | Double = null,
    errorMessage: String = null,
    getClassNames: (/* theme */ ITheme, /* isOpen */ Boolean, /* disabled */ Boolean, /* required */ Boolean, /* focused */ Boolean, /* allowFreeForm */ Boolean, /* hasErrorMessage */ Boolean, /* className */ js.UndefOr[String]) => IComboBoxClassNames = null,
    iconButtonProps: IButtonProps = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    isButtonAriaHidden: js.UndefOr[Boolean] = js.undefined,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    keytipProps: IKeytipProps = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    onAbort: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[IComboBox] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[IComboBox] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[IComboBox] => Unit = null,
    onAuxClick: SyntheticMouseEvent[IComboBox] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with IComboBox, Event_] => Unit = null,
    onBlur: SyntheticFocusEvent[IComboBox] => Unit = null,
    onCanPlay: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onChange: (SyntheticEvent[EventTarget with IComboBox, Event_], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Unit = null,
    onClick: SyntheticMouseEvent[IComboBox] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[IComboBox] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[IComboBox] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[IComboBox] => Unit = null,
    onContextMenu: SyntheticMouseEvent[IComboBox] => Unit = null,
    onCopy: SyntheticClipboardEvent[IComboBox] => Unit = null,
    onCut: SyntheticClipboardEvent[IComboBox] => Unit = null,
    onDismiss: () => Unit = null,
    onDoubleClick: SyntheticMouseEvent[IComboBox] => Unit = null,
    onDrag: DragEvent[IComboBox] => Unit = null,
    onDragEnd: DragEvent[IComboBox] => Unit = null,
    onDragEnter: DragEvent[IComboBox] => Unit = null,
    onDragExit: DragEvent[IComboBox] => Unit = null,
    onDragLeave: DragEvent[IComboBox] => Unit = null,
    onDragOver: DragEvent[IComboBox] => Unit = null,
    onDragStart: DragEvent[IComboBox] => Unit = null,
    onDrop: DragEvent[IComboBox] => Unit = null,
    onDurationChange: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onEmptied: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onEncrypted: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onEnded: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onError: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onFocus: SyntheticFocusEvent[IComboBox] => Unit = null,
    onInput: SyntheticEvent[EventTarget with IComboBox, Event_] => Unit = null,
    onInvalid: SyntheticEvent[EventTarget with IComboBox, Event_] => Unit = null,
    onItemClick: (SyntheticEvent[EventTarget with IComboBox, Event_], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double]) => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[IComboBox] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[IComboBox] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[IComboBox] => Unit = null,
    onLoad: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onLoadStart: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onLoadedData: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onMenuDismiss: () => Unit = null,
    onMenuDismissed: () => Unit = null,
    onMenuOpen: () => Unit = null,
    onMouseDown: SyntheticMouseEvent[IComboBox] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[IComboBox] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[IComboBox] => Unit = null,
    onMouseMove: SyntheticMouseEvent[IComboBox] => Unit = null,
    onMouseOut: SyntheticMouseEvent[IComboBox] => Unit = null,
    onMouseOver: SyntheticMouseEvent[IComboBox] => Unit = null,
    onMouseUp: SyntheticMouseEvent[IComboBox] => Unit = null,
    onPaste: SyntheticClipboardEvent[IComboBox] => Unit = null,
    onPause: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onPendingValueChanged: (/* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Unit = null,
    onPlay: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onPlaying: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[IComboBox] => Unit = null,
    onPointerDown: SyntheticPointerEvent[IComboBox] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[IComboBox] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[IComboBox] => Unit = null,
    onPointerMove: SyntheticPointerEvent[IComboBox] => Unit = null,
    onPointerOut: SyntheticPointerEvent[IComboBox] => Unit = null,
    onPointerOver: SyntheticPointerEvent[IComboBox] => Unit = null,
    onPointerUp: SyntheticPointerEvent[IComboBox] => Unit = null,
    onProgress: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onRateChange: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onRenderContainer: (/* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], 
        ReactElement | Null
      ]
    ]) => ReactElement | Null = null,
    onRenderItem: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ISelectableOption], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderLabel: (/* props */ js.UndefOr[IOnRenderComboBoxLabelProps], /* defaultRender */ js.UndefOr[
      js.Function1[/* props */ js.UndefOr[IOnRenderComboBoxLabelProps], ReactElement | Null]
    ]) => ReactElement | Null = null,
    onRenderList: (/* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[ISelectableDroppableTextProps[IComboBox, IComboBox]], 
        ReactElement | Null
      ]
    ]) => ReactElement | Null = null,
    onRenderLowerContent: (/* props */ js.UndefOr[IComboBoxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IComboBoxProps], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderOption: (/* props */ js.UndefOr[ISelectableOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ISelectableOption], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderUpperContent: (/* props */ js.UndefOr[IComboBoxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IComboBoxProps], ReactElement | Null]]) => ReactElement | Null = null,
    onReset: SyntheticEvent[EventTarget with IComboBox, Event_] => Unit = null,
    onResolveOptions: /* options */ js.Array[IComboBoxOption] => js.Array[IComboBoxOption] | js.Thenable[js.Array[IComboBoxOption]] = null,
    onScroll: SyntheticUIEvent[IComboBox] => Unit = null,
    onScrollToItem: /* itemIndex */ Double => Unit = null,
    onSeeked: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onSeeking: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onSelect: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onStalled: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onSubmit: SyntheticEvent[EventTarget with IComboBox, Event_] => Unit = null,
    onSuspend: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[IComboBox] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[IComboBox] => Unit = null,
    onTouchMove: SyntheticTouchEvent[IComboBox] => Unit = null,
    onTouchStart: SyntheticTouchEvent[IComboBox] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[IComboBox] => Unit = null,
    onVolumeChange: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onWaiting: SyntheticEvent[Event_, IComboBox] => Unit = null,
    onWheel: SyntheticWheelEvent[IComboBox] => Unit = null,
    openOnKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    panelProps: IPanelProps = null,
    persistMenu: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    scrollSelectedToTop: js.UndefOr[Boolean] = js.undefined,
    security: String = null,
    selectedKey: String | Double | (js.Array[Double | String]) = null,
    shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    styles: PartialIComboBoxStyles = null,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    theme: ITheme = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: typingsSlinky.react.reactStrings.on | off = null,
    useComboBoxAsMenuWidth: js.UndefOr[Boolean] = js.undefined,
    vocab: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFreeform)) __obj.updateDynamic("allowFreeform")(allowFreeform.asInstanceOf[js.Any])
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
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (autofill != null) __obj.updateDynamic("autofill")(autofill.asInstanceOf[js.Any])
    if (buttonIconProps != null) __obj.updateDynamic("buttonIconProps")(buttonIconProps.asInstanceOf[js.Any])
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps.asInstanceOf[js.Any])
    if (caretDownButtonStyles != null) __obj.updateDynamic("caretDownButtonStyles")(caretDownButtonStyles.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (comboBoxOptionStyles != null) __obj.updateDynamic("comboBoxOptionStyles")(comboBoxOptionStyles.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (defaultSelectedKey != null) __obj.updateDynamic("defaultSelectedKey")(defaultSelectedKey.asInstanceOf[js.Any])
    if (dropdownMaxWidth != null) __obj.updateDynamic("dropdownMaxWidth")(dropdownMaxWidth.asInstanceOf[js.Any])
    if (dropdownWidth != null) __obj.updateDynamic("dropdownWidth")(dropdownWidth.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction8(getClassNames))
    if (iconButtonProps != null) __obj.updateDynamic("iconButtonProps")(iconButtonProps.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (!js.isUndefined(isButtonAriaHidden)) __obj.updateDynamic("isButtonAriaHidden")(isButtonAriaHidden.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
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
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction3(onItemClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMenuDismiss != null) __obj.updateDynamic("onMenuDismiss")(js.Any.fromFunction0(onMenuDismiss))
    if (onMenuDismissed != null) __obj.updateDynamic("onMenuDismissed")(js.Any.fromFunction0(onMenuDismissed))
    if (onMenuOpen != null) __obj.updateDynamic("onMenuOpen")(js.Any.fromFunction0(onMenuOpen))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPendingValueChanged != null) __obj.updateDynamic("onPendingValueChanged")(js.Any.fromFunction3(onPendingValueChanged))
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
    if (onRenderContainer != null) __obj.updateDynamic("onRenderContainer")(js.Any.fromFunction2(onRenderContainer))
    if (onRenderItem != null) __obj.updateDynamic("onRenderItem")(js.Any.fromFunction2(onRenderItem))
    if (onRenderLabel != null) __obj.updateDynamic("onRenderLabel")(js.Any.fromFunction2(onRenderLabel))
    if (onRenderList != null) __obj.updateDynamic("onRenderList")(js.Any.fromFunction2(onRenderList))
    if (onRenderLowerContent != null) __obj.updateDynamic("onRenderLowerContent")(js.Any.fromFunction2(onRenderLowerContent))
    if (onRenderOption != null) __obj.updateDynamic("onRenderOption")(js.Any.fromFunction2(onRenderOption))
    if (onRenderUpperContent != null) __obj.updateDynamic("onRenderUpperContent")(js.Any.fromFunction2(onRenderUpperContent))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onResolveOptions != null) __obj.updateDynamic("onResolveOptions")(js.Any.fromFunction1(onResolveOptions))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollToItem != null) __obj.updateDynamic("onScrollToItem")(js.Any.fromFunction1(onScrollToItem))
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
    if (!js.isUndefined(openOnKeyboardFocus)) __obj.updateDynamic("openOnKeyboardFocus")(openOnKeyboardFocus.asInstanceOf[js.Any])
    if (panelProps != null) __obj.updateDynamic("panelProps")(panelProps.asInstanceOf[js.Any])
    if (!js.isUndefined(persistMenu)) __obj.updateDynamic("persistMenu")(persistMenu.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSelectedToTop)) __obj.updateDynamic("scrollSelectedToTop")(scrollSelectedToTop.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (selectedKey != null) __obj.updateDynamic("selectedKey")(selectedKey.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRestoreFocus)) __obj.updateDynamic("shouldRestoreFocus")(shouldRestoreFocus.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (!js.isUndefined(useComboBoxAsMenuWidth)) __obj.updateDynamic("useComboBoxAsMenuWidth")(useComboBoxAsMenuWidth.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IComboBoxProps
}

