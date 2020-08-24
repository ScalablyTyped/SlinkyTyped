package typingsSlinky.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.jsonSchema.mod.JSONSchema6
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.CompositionEventHandler
import typingsSlinky.react.mod.DragEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.WheelEventHandler
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.`additions text`
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.`inline`
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.additions
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.all
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.ascending
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.assertive
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.both
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.copy
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.date
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.decimal
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.descending
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.dialog
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.email
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.execute
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.grammar
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.grid
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.horizontal
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.inherit
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.link
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.list
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.listbox
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.location
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.menu
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.mixed
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.move
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.no
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.none
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.numeric
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.off
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.on
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.other
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.page
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.polite
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.popup
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.removals
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.search
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.spelling
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.step
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.tel
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.text
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.time
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.tree
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.url
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.vertical
import typingsSlinky.reactJsonschemaForm.reactJsonschemaFormStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react.react.HTMLAttributes<std.HTMLElement>, std.Exclude<keyof react.react.HTMLAttributes<std.HTMLElement>, 'onBlur' | 'onFocus'>> */
@js.native
trait WidgetProps extends js.Object {
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
  var autofocus: Boolean = js.native
  var children: js.UndefOr[ReactElement] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  var datatype: js.UndefOr[String] = js.native
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var disabled: Boolean = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var formContext: js.Any = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var label: String = js.native
  var lang: js.UndefOr[String] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onChange: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onInput: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  var onScroll: js.UndefOr[UIEventHandler[HTMLElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLElement]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[HTMLElement]] = js.native
  var options: StringDictionary[Boolean | Double | String | js.Object | Null] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var rawErrors: js.Array[String] = js.native
  var readonly: Boolean = js.native
  var required: Boolean = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var role: js.UndefOr[String] = js.native
  var schema: JSONSchema6 = js.native
  var security: js.UndefOr[String] = js.native
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
  var value: js.Any = js.native
  var vocab: js.UndefOr[String] = js.native
  def onBlur(id: String): Unit = js.native
  def onBlur(id: String, value: String): Unit = js.native
  def onBlur(id: String, value: Boolean): Unit = js.native
  def onBlur(id: String, value: Double): Unit = js.native
  def onChange(value: js.Any): Unit = js.native
  def onFocus(id: String): Unit = js.native
  def onFocus(id: String, value: String): Unit = js.native
  def onFocus(id: String, value: Boolean): Unit = js.native
  def onFocus(id: String, value: Double): Unit = js.native
}

