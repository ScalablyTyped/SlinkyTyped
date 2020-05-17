package typingsSlinky.blueprintjsCore.anon

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
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
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`additions text`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`inline`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.additions
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.all
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.ascending
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.assertive
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.both
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.copy
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.date
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.decimal
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.descending
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.dialog
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.email
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.execute
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.grammar
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.grid
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.horizontal
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.inherit
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.link
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.list
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.listbox
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.location
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.menu
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.mixed
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.move
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.no
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.none
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.numeric
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.off
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.on
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.other
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.page
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.polite
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.popup
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.removals
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.search
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.spelling
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.step
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.tel
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.text
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.time
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.tree
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.url
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.vertical
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.yes
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait About extends js.Object {
  var about: js.UndefOr[String] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: js.UndefOr[none | list | `inline` | both] = js.native
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-colcount`: js.UndefOr[Double] = js.native
  var `aria-colindex`: js.UndefOr[Double] = js.native
  var `aria-colspan`: js.UndefOr[Double] = js.native
  var `aria-controls`: js.UndefOr[String] = js.native
  var `aria-current`: js.UndefOr[Boolean | time | page | step | location | date] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-details`: js.UndefOr[String] = js.native
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  var `aria-dropeffect`: js.UndefOr[none | link | move | copy | execute | popup] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: js.UndefOr[Boolean | grid | menu | tree | dialog | listbox] = js.native
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
  var `aria-relevant`: js.UndefOr[text | additions | (`additions text`) | all | removals] = js.native
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
  var className: String = js.native
  var color: js.UndefOr[String] = js.native
  var contentEditable: js.UndefOr[Boolean | inherit] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  var datatype: js.UndefOr[String] = js.native
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var inputMode: js.UndefOr[none | search | text | tel | url | email | numeric | decimal] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var onAbort: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onAbortCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onAnimationEnd: js.UndefOr[js.Function1[/* event */ SyntheticAnimationEvent[HTMLElement], Unit]] = js.native
  var onAnimationEndCapture: js.UndefOr[js.Function1[/* event */ SyntheticAnimationEvent[HTMLElement], Unit]] = js.native
  var onAnimationIteration: js.UndefOr[js.Function1[/* event */ SyntheticAnimationEvent[HTMLElement], Unit]] = js.native
  var onAnimationIterationCapture: js.UndefOr[js.Function1[/* event */ SyntheticAnimationEvent[HTMLElement], Unit]] = js.native
  var onAnimationStart: js.UndefOr[js.Function1[/* event */ SyntheticAnimationEvent[HTMLElement], Unit]] = js.native
  var onAnimationStartCapture: js.UndefOr[js.Function1[/* event */ SyntheticAnimationEvent[HTMLElement], Unit]] = js.native
  var onAuxClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onAuxClickCapture: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onBeforeInput: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with HTMLElement, Event], Unit]] = js.native
  var onBeforeInputCapture: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with HTMLElement, Event], Unit]] = js.native
  var onBlur: js.UndefOr[js.Function1[/* event */ SyntheticFocusEvent[HTMLElement], Unit]] = js.native
  var onBlurCapture: js.UndefOr[js.Function1[/* event */ SyntheticFocusEvent[HTMLElement], Unit]] = js.native
  var onCanPlay: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onCanPlayCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onCanPlayThrough: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onCanPlayThroughCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with HTMLElement, Event], Unit]] = js.native
  var onChangeCapture: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with HTMLElement, Event], Unit]] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onClickCapture: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onCompositionEnd: js.UndefOr[js.Function1[/* event */ SyntheticCompositionEvent[HTMLElement], Unit]] = js.native
  var onCompositionEndCapture: js.UndefOr[js.Function1[/* event */ SyntheticCompositionEvent[HTMLElement], Unit]] = js.native
  var onCompositionStart: js.UndefOr[js.Function1[/* event */ SyntheticCompositionEvent[HTMLElement], Unit]] = js.native
  var onCompositionStartCapture: js.UndefOr[js.Function1[/* event */ SyntheticCompositionEvent[HTMLElement], Unit]] = js.native
  var onCompositionUpdate: js.UndefOr[js.Function1[/* event */ SyntheticCompositionEvent[HTMLElement], Unit]] = js.native
  var onCompositionUpdateCapture: js.UndefOr[js.Function1[/* event */ SyntheticCompositionEvent[HTMLElement], Unit]] = js.native
  var onContextMenu: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onContextMenuCapture: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onCopy: js.UndefOr[js.Function1[/* event */ SyntheticClipboardEvent[HTMLElement], Unit]] = js.native
  var onCopyCapture: js.UndefOr[js.Function1[/* event */ SyntheticClipboardEvent[HTMLElement], Unit]] = js.native
  var onCut: js.UndefOr[js.Function1[/* event */ SyntheticClipboardEvent[HTMLElement], Unit]] = js.native
  var onCutCapture: js.UndefOr[js.Function1[/* event */ SyntheticClipboardEvent[HTMLElement], Unit]] = js.native
  var onDoubleClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onDoubleClickCapture: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onDrag: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDragCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDragEndCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDragEnter: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDragEnterCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDragExit: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDragExitCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDragLeave: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDragLeaveCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDragOverCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDragStartCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDrop: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDropCapture: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.native
  var onDurationChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onDurationChangeCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onEmptied: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onEmptiedCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onEncrypted: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onEncryptedCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onEnded: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onEndedCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onErrorCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticFocusEvent[HTMLElement], Unit]] = js.native
  var onFocusCapture: js.UndefOr[js.Function1[/* event */ SyntheticFocusEvent[HTMLElement], Unit]] = js.native
  var onGotPointerCapture: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onGotPointerCaptureCapture: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onInput: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with HTMLElement, Event], Unit]] = js.native
  var onInputCapture: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with HTMLElement, Event], Unit]] = js.native
  var onInvalid: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with HTMLElement, Event], Unit]] = js.native
  var onInvalidCapture: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with HTMLElement, Event], Unit]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent[HTMLElement], Unit]] = js.native
  var onKeyDownCapture: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent[HTMLElement], Unit]] = js.native
  var onKeyPress: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent[HTMLElement], Unit]] = js.native
  var onKeyPressCapture: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent[HTMLElement], Unit]] = js.native
  var onKeyUp: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent[HTMLElement], Unit]] = js.native
  var onKeyUpCapture: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent[HTMLElement], Unit]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onLoadCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onLoadStart: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onLoadStartCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onLoadedData: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onLoadedDataCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onLoadedMetadata: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onLoadedMetadataCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onLostPointerCapture: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onLostPointerCaptureCapture: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onMouseDown: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onMouseDownCapture: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onMouseMove: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onMouseMoveCapture: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onMouseOut: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onMouseOutCapture: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onMouseOver: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onMouseOverCapture: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onMouseUp: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onMouseUpCapture: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
  var onPaste: js.UndefOr[js.Function1[/* event */ SyntheticClipboardEvent[HTMLElement], Unit]] = js.native
  var onPasteCapture: js.UndefOr[js.Function1[/* event */ SyntheticClipboardEvent[HTMLElement], Unit]] = js.native
  var onPause: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onPauseCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onPlay: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onPlayCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onPlaying: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onPlayingCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onPointerCancel: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerDown: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerEnter: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerLeave: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerMove: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerOut: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerOutCapture: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerOver: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerOverCapture: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerUp: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ SyntheticPointerEvent[HTMLElement], Unit]] = js.native
  var onProgress: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onProgressCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onRateChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onRateChangeCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onReset: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with HTMLElement, Event], Unit]] = js.native
  var onResetCapture: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with HTMLElement, Event], Unit]] = js.native
  var onScroll: js.UndefOr[js.Function1[/* event */ SyntheticUIEvent[HTMLElement], Unit]] = js.native
  var onScrollCapture: js.UndefOr[js.Function1[/* event */ SyntheticUIEvent[HTMLElement], Unit]] = js.native
  var onSeeked: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onSeekedCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onSeeking: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onSeekingCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onSelectCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onStalled: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onStalledCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onSubmit: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with HTMLElement, Event], Unit]] = js.native
  var onSubmitCapture: js.UndefOr[js.Function1[SyntheticEvent[EventTarget with HTMLElement, Event], Unit]] = js.native
  var onSuspend: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onSuspendCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onTimeUpdate: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onTimeUpdateCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ SyntheticTouchEvent[HTMLElement], Unit]] = js.native
  var onTouchCancelCapture: js.UndefOr[js.Function1[/* event */ SyntheticTouchEvent[HTMLElement], Unit]] = js.native
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ SyntheticTouchEvent[HTMLElement], Unit]] = js.native
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ SyntheticTouchEvent[HTMLElement], Unit]] = js.native
  var onTouchMove: js.UndefOr[js.Function1[/* event */ SyntheticTouchEvent[HTMLElement], Unit]] = js.native
  var onTouchMoveCapture: js.UndefOr[js.Function1[/* event */ SyntheticTouchEvent[HTMLElement], Unit]] = js.native
  var onTouchStart: js.UndefOr[js.Function1[/* event */ SyntheticTouchEvent[HTMLElement], Unit]] = js.native
  var onTouchStartCapture: js.UndefOr[js.Function1[/* event */ SyntheticTouchEvent[HTMLElement], Unit]] = js.native
  var onTransitionEnd: js.UndefOr[js.Function1[/* event */ SyntheticTransitionEvent[HTMLElement], Unit]] = js.native
  var onTransitionEndCapture: js.UndefOr[js.Function1[/* event */ SyntheticTransitionEvent[HTMLElement], Unit]] = js.native
  var onVolumeChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onVolumeChangeCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onWaiting: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onWaitingCapture: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLElement], Unit]] = js.native
  var onWheel: js.UndefOr[js.Function1[/* event */ SyntheticWheelEvent[HTMLElement], Unit]] = js.native
  var onWheelCapture: js.UndefOr[js.Function1[/* event */ SyntheticWheelEvent[HTMLElement], Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var role: js.UndefOr[String] = js.native
  var security: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var vocab: js.UndefOr[String] = js.native
}

object About {
  @scala.inline
  def apply(className: String): About = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[About]
  }
  @scala.inline
  implicit class AboutOps[Self <: About] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-activedescendant`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-activedescendant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-activedescendant`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-activedescendant")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-atomic`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-atomic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-atomic`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-atomic")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-autocomplete`(value: none | list | `inline` | both): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-autocomplete`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-busy`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-busy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-busy`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-busy")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-checked`(value: Boolean | mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-checked`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-checked")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-colcount`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colcount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-colcount`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colcount")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-colindex`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-colindex`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colindex")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-colspan`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-colspan`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colspan")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-controls`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-controls`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-controls")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-current`(value: Boolean | time | page | step | location | date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-current`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-current")(js.undefined)
        ret
    }
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
    def `withAria-details`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-details`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-details")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-disabled`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-disabled`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-disabled")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-dropeffect`(value: none | link | move | copy | execute | popup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-dropeffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-dropeffect`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-dropeffect")(js.undefined)
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
    def `withAria-expanded`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-expanded`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-expanded")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-flowto`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-flowto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-flowto`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-flowto")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-grabbed`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-grabbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-grabbed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-grabbed")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-haspopup`(value: Boolean | grid | menu | tree | dialog | listbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-haspopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-haspopup`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-haspopup")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-hidden`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-hidden`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-hidden")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-invalid`(value: Boolean | grammar | spelling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-invalid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-invalid")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-keyshortcuts`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-keyshortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-keyshortcuts`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-keyshortcuts")(js.undefined)
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
    def `withAria-level`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-level`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-level")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-live`(value: off | assertive | polite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-live")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-live`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-live")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-modal`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-modal`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-modal")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-multiline`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-multiline`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiline")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-multiselectable`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiselectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-multiselectable`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiselectable")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-orientation`(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-orientation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-orientation")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-owns`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-owns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-owns`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-owns")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-placeholder`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-placeholder`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-posinset`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-posinset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-posinset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-posinset")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-pressed`(value: Boolean | mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-pressed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-pressed")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-readonly`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-readonly`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-readonly")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-relevant`(value: text | additions | (`additions text`) | all | removals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-relevant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-relevant`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-relevant")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-required`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-required`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-required")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-roledescription`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-roledescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-roledescription`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-roledescription")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-rowcount`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowcount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-rowcount`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowcount")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-rowindex`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-rowindex`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowindex")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-rowspan`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-rowspan`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowspan")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-selected`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-selected`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-selected")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-setsize`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-setsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-setsize`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-setsize")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-sort`(value: none | ascending | descending | other): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-sort`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-sort")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuemax`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuemax`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemax")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuemin`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuemin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemin")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuenow`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuenow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuenow`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuenow")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuetext`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuetext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuetext`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuetext")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCapitalize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCorrect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSave")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withContentEditable(value: Boolean | inherit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withDangerouslySetInnerHTML(value: Html): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslySetInnerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDangerouslySetInnerHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslySetInnerHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withDatatype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datatype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatatype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datatype")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String | Double | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
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
    def withInlist(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlist")(js.undefined)
        ret
    }
    @scala.inline
    def withInputMode(value: none | search | text | tel | url | email | numeric | decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.undefined)
        ret
    }
    @scala.inline
    def withItemID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemID")(js.undefined)
        ret
    }
    @scala.inline
    def withItemProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProp")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRef")(js.undefined)
        ret
    }
    @scala.inline
    def withItemScope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemScope")(js.undefined)
        ret
    }
    @scala.inline
    def withItemType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbort(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbortCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbortCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAbortCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbortCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationEnd(value: /* event */ SyntheticAnimationEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationEndCapture(value: /* event */ SyntheticAnimationEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEndCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationIteration(value: /* event */ SyntheticAnimationEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIteration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIteration")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationIterationCapture(value: /* event */ SyntheticAnimationEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIterationCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationIterationCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIterationCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationStart(value: /* event */ SyntheticAnimationEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationStartCapture(value: /* event */ SyntheticAnimationEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStartCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAuxClick(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAuxClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAuxClickCapture(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClickCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAuxClickCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeInputCapture(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInputCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeInputCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInputCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* event */ SyntheticFocusEvent[HTMLElement] => Unit): Self = {
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
    def withOnBlurCapture(value: /* event */ SyntheticFocusEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlurCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlurCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlurCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlay(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlayCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayThrough(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlayThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayThroughCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThroughCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlayThroughCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThroughCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = {
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
    def withOnChangeCapture(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickCapture(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClickCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionEnd(value: /* event */ SyntheticCompositionEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionEndCapture(value: /* event */ SyntheticCompositionEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEndCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionStart(value: /* event */ SyntheticCompositionEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionStartCapture(value: /* event */ SyntheticCompositionEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStartCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionUpdate(value: /* event */ SyntheticCompositionEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionUpdateCapture(value: /* event */ SyntheticCompositionEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdateCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionUpdateCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdateCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenu(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenuCapture(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenuCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopy(value: /* event */ SyntheticClipboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopyCapture(value: /* event */ SyntheticClipboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopyCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCopyCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopyCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCut(value: /* event */ SyntheticClipboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCutCapture(value: /* event */ SyntheticClipboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCutCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCutCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleClick(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleClickCapture(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClickCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDoubleClickCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragCapture(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEndCapture(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEndCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnter(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnterCapture(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnterCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnterCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnterCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragExit(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragExitCapture(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExitCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragExitCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExitCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeave(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeaveCapture(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeaveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragLeaveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeaveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOver(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOverCapture(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOverCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragOverCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOverCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStartCapture(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStartCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropCapture(value: /* event */ DragEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDropCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDurationChange(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDurationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDurationChangeCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDurationChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEmptied(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEmptied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEmptiedCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptiedCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEmptiedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptiedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEncrypted(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncrypted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEncryptedCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncryptedCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEncryptedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncryptedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnded(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEndedCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndedCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEndedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnErrorCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnErrorCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* event */ SyntheticFocusEvent[HTMLElement] => Unit): Self = {
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
    def withOnFocusCapture(value: /* event */ SyntheticFocusEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGotPointerCapture(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotPointerCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGotPointerCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotPointerCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGotPointerCaptureCapture(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotPointerCaptureCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGotPointerCaptureCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotPointerCaptureCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInputCapture(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInputCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvalid(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvalidCapture(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalidCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInvalidCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalidCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDownCapture(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDownCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDownCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDownCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPressCapture(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPressCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPressCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPressCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUp(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUpCapture(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUpCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUpCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUpCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadStart(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadStartCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStartCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedData(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedDataCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedDataCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedDataCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedDataCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedMetadata(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedMetadataCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadataCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedMetadataCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadataCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLostPointerCapture(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLostPointerCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLostPointerCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLostPointerCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLostPointerCaptureCapture(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLostPointerCaptureCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLostPointerCaptureCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLostPointerCaptureCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDownCapture(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDownCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDownCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDownCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMoveCapture(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMoveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMoveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMoveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOut(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOutCapture(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOutCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOutCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOver(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOverCapture(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOverCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOverCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOverCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUp(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUpCapture(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUpCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUpCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUpCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaste(value: /* event */ SyntheticClipboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPasteCapture(value: /* event */ SyntheticClipboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPasteCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPasteCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPasteCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPause(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPauseCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPauseCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPauseCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPauseCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlay(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlayCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlayCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaying(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlayingCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayingCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlayingCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayingCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerCancel(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerCancelCapture(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancelCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerCancelCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancelCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerDown(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerDownCapture(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDownCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerDownCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDownCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerEnter(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerEnterCapture(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnterCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerEnterCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnterCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerLeave(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerLeaveCapture(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeaveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerLeaveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeaveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerMove(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerMoveCapture(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMoveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerMoveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMoveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOut(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOutCapture(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOutCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOutCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOver(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOverCapture(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOverCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOverCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOverCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerUp(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerUpCapture(value: /* event */ SyntheticPointerEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUpCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerUpCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUpCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgressCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgressCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgressCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgressCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRateChange(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRateChangeCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRateChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReset(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResetCapture(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResetCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResetCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResetCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* event */ SyntheticUIEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollCapture(value: /* event */ SyntheticUIEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScrollCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeeked(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeeked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeekedCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekedCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeekedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeeking(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeking")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeeking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeking")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeekingCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekingCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeekingCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekingCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStalled(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStalledCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalledCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStalledCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalledCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmitCapture(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmitCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuspend(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuspend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuspendCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspendCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuspendCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspendCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeUpdate(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTimeUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeUpdateCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdateCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTimeUpdateCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdateCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancel(value: /* event */ SyntheticTouchEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancelCapture(value: /* event */ SyntheticTouchEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancelCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchCancelCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancelCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: /* event */ SyntheticTouchEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEndCapture(value: /* event */ SyntheticTouchEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMove(value: /* event */ SyntheticTouchEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMoveCapture(value: /* event */ SyntheticTouchEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMoveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchMoveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMoveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(value: /* event */ SyntheticTouchEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStartCapture(value: /* event */ SyntheticTouchEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStartCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionEnd(value: /* event */ SyntheticTransitionEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionEndCapture(value: /* event */ SyntheticTransitionEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEndCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVolumeChange(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVolumeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVolumeChangeCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVolumeChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWaiting(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaiting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWaiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaiting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWaitingCapture(value: /* event */ SyntheticEvent[Event, HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaitingCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWaitingCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaitingCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWheel(value: /* event */ SyntheticWheelEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWheelCapture(value: /* event */ SyntheticWheelEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheelCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWheelCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheelCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
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
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadioGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(js.undefined)
        ret
    }
    @scala.inline
    def withSlot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressContentEditableWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressContentEditableWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressContentEditableWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressContentEditableWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressHydrationWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressHydrationWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressHydrationWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressHydrationWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslate(value: yes | no): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeof(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeof")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectable(value: on | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectable")(js.undefined)
        ret
    }
    @scala.inline
    def withVocab(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vocab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVocab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vocab")(js.undefined)
        ret
    }
  }
  
}

