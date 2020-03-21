package typingsSlinky.materialUiCore

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLLabelElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
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
import typingsSlinky.materialUiCore.formLabelFormLabelMod.FormLabelBaseProps
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
import typingsSlinky.materialUiCore.materialUiCoreStrings.filled
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
import typingsSlinky.materialUiCore.materialUiCoreStrings.outlined
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
import typingsSlinky.react.AnonHtml
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.CompositionEventHandler
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.DragEventHandler
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.WheelEventHandler
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/InputLabel.InputLabelProps> */
@js.native
trait PartialInputLabelProps extends js.Object {
  var FormLabelClasses: js.UndefOr[PartialClassNameMapFormLa] = js.native
  var about: js.UndefOr[String] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-colcount`: js.UndefOr[Double] = js.native
  var `aria-colindex`: js.UndefOr[Double] = js.native
  var `aria-colspan`: js.UndefOr[Double] = js.native
  var `aria-controls`: js.UndefOr[String] = js.native
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-details`: js.UndefOr[String] = js.native
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var `aria-level`: js.UndefOr[Double] = js.native
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  var `aria-owns`: js.UndefOr[String] = js.native
  var `aria-placeholder`: js.UndefOr[String] = js.native
  var `aria-posinset`: js.UndefOr[Double] = js.native
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  var `aria-required`: js.UndefOr[Boolean] = js.native
  var `aria-roledescription`: js.UndefOr[String] = js.native
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  var `aria-setsize`: js.UndefOr[Double] = js.native
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  var `aria-valuetext`: js.UndefOr[String] = js.native
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[PartialClassNameMapInputL] = js.native
  var color: js.UndefOr[String] = js.native
  var component: js.UndefOr[ReactComponentClass[FormLabelBaseProps]] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.native
  var datatype: js.UndefOr[String] = js.native
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var disableAnimation: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var filled: js.UndefOr[Boolean] = js.native
  var focused: js.UndefOr[Boolean] = js.native
  var form: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var htmlFor: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLLabelElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLLabelElement]] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLLabelElement]] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLLabelElement]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLLabelElement]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onChange: js.UndefOr[FormEventHandler[HTMLLabelElement]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLLabelElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLLabelElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLLabelElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLLabelElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLLabelElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLLabelElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLLabelElement]] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLLabelElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLLabelElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLLabelElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLLabelElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLLabelElement]] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLLabelElement]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLLabelElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLLabelElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLLabelElement]] = js.native
  var onScroll: js.UndefOr[UIEventHandler[HTMLLabelElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[HTMLLabelElement]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLLabelElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLLabelElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLLabelElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLLabelElement]] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLLabelElement]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLLabelElement]] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[HTMLLabelElement]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var role: js.UndefOr[String] = js.native
  var security: js.UndefOr[String] = js.native
  var shrink: js.UndefOr[Boolean] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Booleanish] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var variant: js.UndefOr[standard | outlined | filled] = js.native
  var vocab: js.UndefOr[String] = js.native
}

object PartialInputLabelProps {
  @scala.inline
  def apply(
    FormLabelClasses: PartialClassNameMapFormLa = null,
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
    autoCorrect: String = null,
    autoSave: String = null,
    children: TagMod[Any] = null,
    className: String = null,
    classes: PartialClassNameMapInputL = null,
    color: String = null,
    component: ReactComponentClass[FormLabelBaseProps] = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    filled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    form: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    htmlFor: String = null,
    id: String = null,
    inlist: js.Any = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    onAbort: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[HTMLLabelElement] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[HTMLLabelElement] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[HTMLLabelElement] => Unit = null,
    onAuxClick: SyntheticMouseEvent[HTMLLabelElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with HTMLLabelElement, Event_] => Unit = null,
    onBlur: SyntheticFocusEvent[HTMLLabelElement] => Unit = null,
    onCanPlay: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onChange: SyntheticEvent[EventTarget with HTMLLabelElement, Event_] => Unit = null,
    onClick: SyntheticMouseEvent[HTMLLabelElement] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[HTMLLabelElement] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[HTMLLabelElement] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[HTMLLabelElement] => Unit = null,
    onContextMenu: SyntheticMouseEvent[HTMLLabelElement] => Unit = null,
    onCopy: SyntheticClipboardEvent[HTMLLabelElement] => Unit = null,
    onCut: SyntheticClipboardEvent[HTMLLabelElement] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[HTMLLabelElement] => Unit = null,
    onDrag: DragEvent[HTMLLabelElement] => Unit = null,
    onDragEnd: DragEvent[HTMLLabelElement] => Unit = null,
    onDragEnter: DragEvent[HTMLLabelElement] => Unit = null,
    onDragExit: DragEvent[HTMLLabelElement] => Unit = null,
    onDragLeave: DragEvent[HTMLLabelElement] => Unit = null,
    onDragOver: DragEvent[HTMLLabelElement] => Unit = null,
    onDragStart: DragEvent[HTMLLabelElement] => Unit = null,
    onDrop: DragEvent[HTMLLabelElement] => Unit = null,
    onDurationChange: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onEmptied: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onEncrypted: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onEnded: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onError: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onFocus: SyntheticFocusEvent[HTMLLabelElement] => Unit = null,
    onInput: SyntheticEvent[EventTarget with HTMLLabelElement, Event_] => Unit = null,
    onInvalid: SyntheticEvent[EventTarget with HTMLLabelElement, Event_] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[HTMLLabelElement] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[HTMLLabelElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[HTMLLabelElement] => Unit = null,
    onLoad: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onLoadStart: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onLoadedData: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onMouseDown: SyntheticMouseEvent[HTMLLabelElement] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[HTMLLabelElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[HTMLLabelElement] => Unit = null,
    onMouseMove: SyntheticMouseEvent[HTMLLabelElement] => Unit = null,
    onMouseOut: SyntheticMouseEvent[HTMLLabelElement] => Unit = null,
    onMouseOver: SyntheticMouseEvent[HTMLLabelElement] => Unit = null,
    onMouseUp: SyntheticMouseEvent[HTMLLabelElement] => Unit = null,
    onPaste: SyntheticClipboardEvent[HTMLLabelElement] => Unit = null,
    onPause: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onPlay: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onPlaying: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[HTMLLabelElement] => Unit = null,
    onPointerDown: SyntheticPointerEvent[HTMLLabelElement] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[HTMLLabelElement] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[HTMLLabelElement] => Unit = null,
    onPointerMove: SyntheticPointerEvent[HTMLLabelElement] => Unit = null,
    onPointerOut: SyntheticPointerEvent[HTMLLabelElement] => Unit = null,
    onPointerOver: SyntheticPointerEvent[HTMLLabelElement] => Unit = null,
    onPointerUp: SyntheticPointerEvent[HTMLLabelElement] => Unit = null,
    onProgress: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onRateChange: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onReset: SyntheticEvent[EventTarget with HTMLLabelElement, Event_] => Unit = null,
    onScroll: SyntheticUIEvent[HTMLLabelElement] => Unit = null,
    onSeeked: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onSeeking: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onSelect: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onStalled: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onSubmit: SyntheticEvent[EventTarget with HTMLLabelElement, Event_] => Unit = null,
    onSuspend: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[HTMLLabelElement] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[HTMLLabelElement] => Unit = null,
    onTouchMove: SyntheticTouchEvent[HTMLLabelElement] => Unit = null,
    onTouchStart: SyntheticTouchEvent[HTMLLabelElement] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[HTMLLabelElement] => Unit = null,
    onVolumeChange: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onWaiting: SyntheticEvent[Event_, HTMLLabelElement] => Unit = null,
    onWheel: SyntheticWheelEvent[HTMLLabelElement] => Unit = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    shrink: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    variant: standard | outlined | filled = null,
    vocab: String = null
  ): PartialInputLabelProps = {
    val __obj = js.Dynamic.literal()
    if (FormLabelClasses != null) __obj.updateDynamic("FormLabelClasses")(FormLabelClasses.asInstanceOf[js.Any])
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
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
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
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(filled)) __obj.updateDynamic("filled")(filled.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
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
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(shrink)) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialInputLabelProps]
  }
}

