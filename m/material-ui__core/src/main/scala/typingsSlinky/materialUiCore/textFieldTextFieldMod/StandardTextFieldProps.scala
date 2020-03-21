package typingsSlinky.materialUiCore.textFieldTextFieldMod

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import typingsSlinky.materialUiCore.PartialClassNameMapTextFi
import typingsSlinky.materialUiCore.PartialFormHelperTextProp
import typingsSlinky.materialUiCore.PartialInputLabelProps
import typingsSlinky.materialUiCore.PartialInputProps
import typingsSlinky.materialUiCore.PartialSelectProps
import typingsSlinky.materialUiCore.formControlFormControlMod.FormControlProps
import typingsSlinky.materialUiCore.inputBaseInputBaseMod.InputBaseComponentProps
import typingsSlinky.materialUiCore.materialUiCoreStrings.`additions text`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`inline`
import typingsSlinky.materialUiCore.materialUiCoreStrings.additions
import typingsSlinky.materialUiCore.materialUiCoreStrings.all
import typingsSlinky.materialUiCore.materialUiCoreStrings.ascending
import typingsSlinky.materialUiCore.materialUiCoreStrings.assertive
import typingsSlinky.materialUiCore.materialUiCoreStrings.both
import typingsSlinky.materialUiCore.materialUiCoreStrings.copy
import typingsSlinky.materialUiCore.materialUiCoreStrings.date
import typingsSlinky.materialUiCore.materialUiCoreStrings.decimal
import typingsSlinky.materialUiCore.materialUiCoreStrings.descending
import typingsSlinky.materialUiCore.materialUiCoreStrings.dialog
import typingsSlinky.materialUiCore.materialUiCoreStrings.email
import typingsSlinky.materialUiCore.materialUiCoreStrings.execute
import typingsSlinky.materialUiCore.materialUiCoreStrings.grammar
import typingsSlinky.materialUiCore.materialUiCoreStrings.grid
import typingsSlinky.materialUiCore.materialUiCoreStrings.horizontal
import typingsSlinky.materialUiCore.materialUiCoreStrings.inherit
import typingsSlinky.materialUiCore.materialUiCoreStrings.link
import typingsSlinky.materialUiCore.materialUiCoreStrings.list
import typingsSlinky.materialUiCore.materialUiCoreStrings.listbox
import typingsSlinky.materialUiCore.materialUiCoreStrings.location
import typingsSlinky.materialUiCore.materialUiCoreStrings.menu
import typingsSlinky.materialUiCore.materialUiCoreStrings.mixed
import typingsSlinky.materialUiCore.materialUiCoreStrings.move
import typingsSlinky.materialUiCore.materialUiCoreStrings.no
import typingsSlinky.materialUiCore.materialUiCoreStrings.none
import typingsSlinky.materialUiCore.materialUiCoreStrings.numeric
import typingsSlinky.materialUiCore.materialUiCoreStrings.off
import typingsSlinky.materialUiCore.materialUiCoreStrings.on
import typingsSlinky.materialUiCore.materialUiCoreStrings.other
import typingsSlinky.materialUiCore.materialUiCoreStrings.page
import typingsSlinky.materialUiCore.materialUiCoreStrings.polite
import typingsSlinky.materialUiCore.materialUiCoreStrings.popup
import typingsSlinky.materialUiCore.materialUiCoreStrings.removals
import typingsSlinky.materialUiCore.materialUiCoreStrings.search
import typingsSlinky.materialUiCore.materialUiCoreStrings.spelling
import typingsSlinky.materialUiCore.materialUiCoreStrings.standard
import typingsSlinky.materialUiCore.materialUiCoreStrings.step
import typingsSlinky.materialUiCore.materialUiCoreStrings.tel
import typingsSlinky.materialUiCore.materialUiCoreStrings.text
import typingsSlinky.materialUiCore.materialUiCoreStrings.time
import typingsSlinky.materialUiCore.materialUiCoreStrings.tree
import typingsSlinky.materialUiCore.materialUiCoreStrings.url
import typingsSlinky.materialUiCore.materialUiCoreStrings.vertical
import typingsSlinky.materialUiCore.materialUiCoreStrings.yes
import typingsSlinky.materialUiCore.mod.PropTypes.Margin
import typingsSlinky.react.AnonHtml
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardTextFieldProps
  extends BaseTextFieldProps
     with TextFieldProps {
  var InputProps: js.UndefOr[PartialInputProps] = js.native
  var inputProps: js.UndefOr[InputBaseComponentProps] = js.native
  @JSName("variant")
  var variant_StandardTextFieldProps: js.UndefOr[standard] = js.native
}

object StandardTextFieldProps {
  @scala.inline
  def apply(
    FormHelperTextProps: PartialFormHelperTextProp = null,
    InputLabelProps: PartialInputLabelProps = null,
    InputProps: PartialInputProps = null,
    SelectProps: PartialSelectProps = null,
    about: String = null,
    accessKey: String = null,
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
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    children: TagMod[Any] = null,
    className: String = null,
    classes: PartialClassNameMapTextFi = null,
    color: String = null,
    component: ReactComponentClass[FormControlProps] = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    helperText: TagMod[Any] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    inputProps: InputBaseComponentProps = null,
    inputRef: Ref[_] | ReactRef[_] = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    label: TagMod[Any] = null,
    lang: String = null,
    manifest: String = null,
    margin: Margin = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onAbort: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[HTMLDivElement] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[HTMLDivElement] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[HTMLDivElement] => Unit = null,
    onAuxClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with HTMLDivElement, Event_] => Unit = null,
    onBlur: _ => Unit = null,
    onCanPlay: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onChange: ChangeEvent[HTMLInputElement | HTMLTextAreaElement | HTMLSelectElement] => Unit = null,
    onClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[HTMLDivElement] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[HTMLDivElement] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[HTMLDivElement] => Unit = null,
    onContextMenu: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onCopy: SyntheticClipboardEvent[HTMLDivElement] => Unit = null,
    onCut: SyntheticClipboardEvent[HTMLDivElement] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onDrag: DragEvent[HTMLDivElement] => Unit = null,
    onDragEnd: DragEvent[HTMLDivElement] => Unit = null,
    onDragEnter: DragEvent[HTMLDivElement] => Unit = null,
    onDragExit: DragEvent[HTMLDivElement] => Unit = null,
    onDragLeave: DragEvent[HTMLDivElement] => Unit = null,
    onDragOver: DragEvent[HTMLDivElement] => Unit = null,
    onDragStart: DragEvent[HTMLDivElement] => Unit = null,
    onDrop: DragEvent[HTMLDivElement] => Unit = null,
    onDurationChange: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onEmptied: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onEncrypted: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onEnded: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onError: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onFocus: _ => Unit = null,
    onInput: SyntheticEvent[EventTarget with HTMLDivElement, Event_] => Unit = null,
    onInvalid: SyntheticEvent[EventTarget with HTMLDivElement, Event_] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[HTMLDivElement] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[HTMLDivElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[HTMLDivElement] => Unit = null,
    onLoad: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onLoadStart: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onLoadedData: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onMouseDown: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onMouseMove: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onMouseOut: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onMouseOver: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onMouseUp: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onPaste: SyntheticClipboardEvent[HTMLDivElement] => Unit = null,
    onPause: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onPlay: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onPlaying: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onPointerDown: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onPointerMove: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onPointerOut: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onPointerOver: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onPointerUp: SyntheticPointerEvent[HTMLDivElement] => Unit = null,
    onProgress: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onRateChange: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onReset: SyntheticEvent[EventTarget with HTMLDivElement, Event_] => Unit = null,
    onScroll: SyntheticUIEvent[HTMLDivElement] => Unit = null,
    onSeeked: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onSeeking: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onSelect: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onStalled: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onSubmit: SyntheticEvent[EventTarget with HTMLDivElement, Event_] => Unit = null,
    onSuspend: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[HTMLDivElement] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[HTMLDivElement] => Unit = null,
    onTouchMove: SyntheticTouchEvent[HTMLDivElement] => Unit = null,
    onTouchStart: SyntheticTouchEvent[HTMLDivElement] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[HTMLDivElement] => Unit = null,
    onVolumeChange: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onWaiting: SyntheticEvent[Event_, HTMLDivElement] => Unit = null,
    onWheel: SyntheticWheelEvent[HTMLDivElement] => Unit = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    rows: String | Double = null,
    rowsMax: String | Double = null,
    security: String = null,
    select: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    title: String = null,
    translate: yes | no = null,
    `type`: String = null,
    typeof: String = null,
    unselectable: on | off = null,
    value: (js.Array[String | Double | Boolean]) | String | Double | Boolean = null,
    variant: standard = null,
    vocab: String = null
  ): StandardTextFieldProps = {
    val __obj = js.Dynamic.literal()
    if (FormHelperTextProps != null) __obj.updateDynamic("FormHelperTextProps")(FormHelperTextProps.asInstanceOf[js.Any])
    if (InputLabelProps != null) __obj.updateDynamic("InputLabelProps")(InputLabelProps.asInstanceOf[js.Any])
    if (InputProps != null) __obj.updateDynamic("InputProps")(InputProps.asInstanceOf[js.Any])
    if (SelectProps != null) __obj.updateDynamic("SelectProps")(SelectProps.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
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
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
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
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardTextFieldProps]
  }
}

