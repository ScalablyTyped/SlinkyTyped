package typingsSlinky.ionicReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.CompositionEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.ionicReact.ionicReactStrings.`additions text`
import typingsSlinky.ionicReact.ionicReactStrings.`inline`
import typingsSlinky.ionicReact.ionicReactStrings.additions
import typingsSlinky.ionicReact.ionicReactStrings.all
import typingsSlinky.ionicReact.ionicReactStrings.ascending
import typingsSlinky.ionicReact.ionicReactStrings.assertive
import typingsSlinky.ionicReact.ionicReactStrings.both
import typingsSlinky.ionicReact.ionicReactStrings.copy
import typingsSlinky.ionicReact.ionicReactStrings.date
import typingsSlinky.ionicReact.ionicReactStrings.descending
import typingsSlinky.ionicReact.ionicReactStrings.dialog
import typingsSlinky.ionicReact.ionicReactStrings.execute
import typingsSlinky.ionicReact.ionicReactStrings.grammar
import typingsSlinky.ionicReact.ionicReactStrings.grid
import typingsSlinky.ionicReact.ionicReactStrings.horizontal
import typingsSlinky.ionicReact.ionicReactStrings.ios
import typingsSlinky.ionicReact.ionicReactStrings.link
import typingsSlinky.ionicReact.ionicReactStrings.list
import typingsSlinky.ionicReact.ionicReactStrings.listbox
import typingsSlinky.ionicReact.ionicReactStrings.location
import typingsSlinky.ionicReact.ionicReactStrings.md
import typingsSlinky.ionicReact.ionicReactStrings.menu
import typingsSlinky.ionicReact.ionicReactStrings.mixed
import typingsSlinky.ionicReact.ionicReactStrings.move
import typingsSlinky.ionicReact.ionicReactStrings.no
import typingsSlinky.ionicReact.ionicReactStrings.none
import typingsSlinky.ionicReact.ionicReactStrings.off
import typingsSlinky.ionicReact.ionicReactStrings.other
import typingsSlinky.ionicReact.ionicReactStrings.page
import typingsSlinky.ionicReact.ionicReactStrings.polite
import typingsSlinky.ionicReact.ionicReactStrings.popup
import typingsSlinky.ionicReact.ionicReactStrings.removals
import typingsSlinky.ionicReact.ionicReactStrings.spelling
import typingsSlinky.ionicReact.ionicReactStrings.step
import typingsSlinky.ionicReact.ionicReactStrings.text
import typingsSlinky.ionicReact.ionicReactStrings.time
import typingsSlinky.ionicReact.ionicReactStrings.tree
import typingsSlinky.ionicReact.ionicReactStrings.vertical
import typingsSlinky.ionicReact.ionicReactStrings.yes
import typingsSlinky.ionicons.componentsMod.global.HTMLIonIconElement
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@ionic/react.@ionic/react/dist/types/components/utils.IonicReactExternalProps<ionicons.ionicons.JSX.IonIcon, ionicons.ionicons/dist/types/components.<global>.HTMLIonIconElement>, 'hidden' | 'dir' | 'slot' | 'style' | 'title' | 'contextmenu' | 'color' | 'size' | 'icon' | 'key' | 'children' | 'lazy' | 'ios' | 'md' | 'name' | 'accessKey' | 'autocapitalize' | 'draggable' | 'lang' | 'spellcheck' | 'translate' | 'className' | 'id' | 'prefix' | 'innerHTML' | 'contentEditable' | 'inputMode' | 'tabIndex' | 'mode' | 'class' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'contextMenu' | 'placeholder' | 'spellCheck' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'src' | 'autocorrect' | 'inputmode' | 'ariaLabel' | 'flipRtl' | 'contenteditable' | 'tabindex' | 'radiogroup' | 'part' | 'autosave' | 'itemprop' | 'itemscope' | 'itemtype' | 'itemid' | 'itemref' | 'onDblClick' | 'onDblClickCapture'> & react.react.RefAttributes<ionicons.ionicons/dist/types/components.<global>.HTMLIonIconElement> */
@js.native
trait PickIonicReactExternalProAbout extends js.Object {
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
  var ariaLabel: js.UndefOr[String] = js.native
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var autocapitalize: js.UndefOr[String] = js.native
  var autocorrect: js.UndefOr[String] = js.native
  var autosave: js.UndefOr[String] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var `class`: js.UndefOr[String | StringDictionary[Boolean]] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var contentEditable: js.UndefOr[Boolean | String] = js.native
  var contenteditable: js.UndefOr[Boolean | String] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var contextmenu: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  var datatype: js.UndefOr[String] = js.native
  var defaultChecked: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  var dir: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var flipRtl: js.UndefOr[Boolean] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[js.Any] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var innerHTML: js.UndefOr[String] = js.native
  var inputMode: js.UndefOr[String] = js.native
  var inputmode: js.UndefOr[String] = js.native
  var ios: js.UndefOr[String] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var itemid: js.UndefOr[String] = js.native
  var itemprop: js.UndefOr[String] = js.native
  var itemref: js.UndefOr[String] = js.native
  var itemscope: js.UndefOr[Boolean] = js.native
  var itemtype: js.UndefOr[String] = js.native
  var key: js.UndefOr[(String | Double) with Key] = js.native
  var lang: js.UndefOr[String] = js.native
  var `lazy`: js.UndefOr[Boolean] = js.native
  var md: js.UndefOr[String] = js.native
  var mode: js.UndefOr[ios | md] = js.native
  var name: js.UndefOr[String] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onAbortCapture: js.UndefOr[js.Any] = js.native
  var onAnimationEnd: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.native
  var onAnimationEndCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.native
  var onAnimationIteration: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.native
  var onAnimationIterationCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.native
  var onAnimationStart: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.native
  var onAnimationStartCapture: js.UndefOr[js.Function1[/* event */ AnimationEvent, Unit]] = js.native
  var onAuxClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onAuxClickCapture: js.UndefOr[js.Any] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLIonIconElement]] = js.native
  var onBeforeInputCapture: js.UndefOr[js.Any] = js.native
  var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.native
  var onBlurCapture: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onCanPlayCapture: js.UndefOr[js.Any] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onCanPlayThroughCapture: js.UndefOr[js.Any] = js.native
  var onChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onChangeCapture: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onClickCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onCompositionEnd: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.native
  var onCompositionEndCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.native
  var onCompositionStart: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.native
  var onCompositionStartCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.native
  var onCompositionUpdate: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.native
  var onCompositionUpdateCapture: js.UndefOr[js.Function1[/* event */ CompositionEvent, Unit]] = js.native
  var onContextMenu: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onContextMenuCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onCopy: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.native
  var onCopyCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.native
  var onCut: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.native
  var onCutCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.native
  var onDblClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onDblClickCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLIonIconElement]] = js.native
  var onDoubleClickCapture: js.UndefOr[js.Any] = js.native
  var onDrag: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragEndCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragEnter: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragEnterCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragExit: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragExitCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragLeave: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragLeaveCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragOverCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDragStartCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDrop: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDropCapture: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onDurationChangeCapture: js.UndefOr[js.Any] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onEmptiedCapture: js.UndefOr[js.Any] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onEncryptedCapture: js.UndefOr[js.Any] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onEndedCapture: js.UndefOr[js.Any] = js.native
  var onError: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onErrorCapture: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.native
  var onFocusCapture: js.UndefOr[js.Function1[/* event */ FocusEvent, Unit]] = js.native
  var onGotPointerCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onGotPointerCaptureCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onInput: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onInputCapture: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onInvalid: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onInvalidCapture: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var onKeyDownCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var onKeyPressCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var onKeyUp: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var onKeyUpCapture: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onLoadCapture: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onLoadStartCapture: js.UndefOr[js.Any] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onLoadedDataCapture: js.UndefOr[js.Any] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onLoadedMetadataCapture: js.UndefOr[js.Any] = js.native
  var onLostPointerCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onLostPointerCaptureCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseDownCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseMove: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseMoveCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseOut: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseOutCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseOver: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseOverCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseUp: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseUpCapture: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onPaste: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.native
  var onPasteCapture: js.UndefOr[js.Function1[/* event */ ClipboardEvent, Unit]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onPauseCapture: js.UndefOr[js.Any] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onPlayCapture: js.UndefOr[js.Any] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onPlayingCapture: js.UndefOr[js.Any] = js.native
  var onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerOut: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerOutCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerOver: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerOverCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onProgressCapture: js.UndefOr[js.Any] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onRateChangeCapture: js.UndefOr[js.Any] = js.native
  var onReset: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onResetCapture: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onScroll: js.UndefOr[js.Function1[/* event */ UIEvent, Unit]] = js.native
  var onScrollCapture: js.UndefOr[js.Function1[/* event */ UIEvent, Unit]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onSeekedCapture: js.UndefOr[js.Any] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onSeekingCapture: js.UndefOr[js.Any] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onSelectCapture: js.UndefOr[js.Any] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onStalledCapture: js.UndefOr[js.Any] = js.native
  var onSubmit: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onSubmitCapture: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onSuspendCapture: js.UndefOr[js.Any] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onTimeUpdateCapture: js.UndefOr[js.Any] = js.native
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTouchCancelCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTouchMove: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTouchMoveCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTouchStart: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTouchStartCapture: js.UndefOr[js.Function1[/* event */ TouchEvent, Unit]] = js.native
  var onTransitionEnd: js.UndefOr[js.Function1[/* event */ TransitionEvent, Unit]] = js.native
  var onTransitionEndCapture: js.UndefOr[js.Function1[/* event */ TransitionEvent, Unit]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onVolumeChangeCapture: js.UndefOr[js.Any] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLIonIconElement]] = js.native
  var onWaitingCapture: js.UndefOr[js.Any] = js.native
  var onWheel: js.UndefOr[js.Function1[/* event */ WheelEvent, Unit]] = js.native
  var onWheelCapture: js.UndefOr[js.Function1[/* event */ WheelEvent, Unit]] = js.native
  var part: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var radiogroup: js.UndefOr[String] = js.native
  var ref: js.UndefOr[Ref[HTMLIonIconElement]] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var role: js.UndefOr[String] = js.native
  var security: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var spellCheck: js.UndefOr[Boolean] = js.native
  var spellcheck: js.UndefOr[Boolean | String] = js.native
  var src: js.UndefOr[String] = js.native
  var style: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var tabindex: js.UndefOr[Double | String] = js.native
  var title: js.UndefOr[String] = js.native
  var translate: js.UndefOr[yes | no] = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[Boolean] = js.native
  var vocab: js.UndefOr[String] = js.native
}

object PickIonicReactExternalProAbout {
  @scala.inline
  def apply(): PickIonicReactExternalProAbout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIonicReactExternalProAbout]
  }
  @scala.inline
  implicit class PickIonicReactExternalProAboutOps[Self <: PickIonicReactExternalProAbout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def `withAria-autocomplete`(value: none | `inline` | list | both): Self = {
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
    def `withAria-current`(value: Boolean | page | step | location | date | time): Self = {
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
    def `withAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = {
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
    def `withAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = {
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
    def `withAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = {
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
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
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
    def withClass(value: String | StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
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
    def withContentEditable(value: Boolean | String): Self = {
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
    def withFlipRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipRtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipRtl")(js.undefined)
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
    def withIcon(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
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
    def withInnerHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withInputMode(value: String): Self = {
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
    def withIos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(js.undefined)
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
    def withKey(value: (String | Double) with Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
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
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
    @scala.inline
    def withMd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: ios | md): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbort(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnAbortCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbortCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAbortCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbortCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationEnd(value: /* event */ AnimationEvent => Unit): Self = {
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
    def withOnAnimationEndCapture(value: /* event */ AnimationEvent => Unit): Self = {
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
    def withOnAnimationIteration(value: /* event */ AnimationEvent => Unit): Self = {
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
    def withOnAnimationIterationCapture(value: /* event */ AnimationEvent => Unit): Self = {
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
    def withOnAnimationStart(value: /* event */ AnimationEvent => Unit): Self = {
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
    def withOnAnimationStartCapture(value: /* event */ AnimationEvent => Unit): Self = {
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
    def withOnAuxClick(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnAuxClickCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClickCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAuxClickCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLIonIconElement, Event] => Unit): Self = {
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
    def withOnBeforeInputCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInputCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBeforeInputCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInputCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* event */ FocusEvent => Unit): Self = {
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
    def withOnBlurCapture(value: /* event */ FocusEvent => Unit): Self = {
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
    def withOnCanPlay(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnCanPlayCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCanPlayCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayThrough(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnCanPlayThroughCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThroughCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCanPlayThroughCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThroughCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* event */ Event => Unit): Self = {
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
    def withOnChangeCapture(value: /* event */ Event => Unit): Self = {
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
    def withOnClick(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnClickCapture(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnCompositionEnd(value: /* event */ CompositionEvent => Unit): Self = {
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
    def withOnCompositionEndCapture(value: /* event */ CompositionEvent => Unit): Self = {
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
    def withOnCompositionStart(value: /* event */ CompositionEvent => Unit): Self = {
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
    def withOnCompositionStartCapture(value: /* event */ CompositionEvent => Unit): Self = {
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
    def withOnCompositionUpdate(value: /* event */ CompositionEvent => Unit): Self = {
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
    def withOnCompositionUpdateCapture(value: /* event */ CompositionEvent => Unit): Self = {
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
    def withOnContextMenu(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnContextMenuCapture(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnCopy(value: /* event */ ClipboardEvent => Unit): Self = {
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
    def withOnCopyCapture(value: /* event */ ClipboardEvent => Unit): Self = {
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
    def withOnCut(value: /* event */ ClipboardEvent => Unit): Self = {
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
    def withOnCutCapture(value: /* event */ ClipboardEvent => Unit): Self = {
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
    def withOnDblClick(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDblClickCapture(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClickCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDblClickCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleClick(value: SyntheticMouseEvent[HTMLIonIconElement] => Unit): Self = {
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
    def withOnDoubleClickCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClickCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDoubleClickCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDragCapture(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDragEnd(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDragEndCapture(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDragEnter(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDragEnterCapture(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDragExit(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDragExitCapture(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDragLeave(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDragLeaveCapture(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDragOver(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDragOverCapture(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDragStart(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDragStartCapture(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDrop(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDropCapture(value: /* event */ DragEvent => Unit): Self = {
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
    def withOnDurationChange(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnDurationChangeCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChangeCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDurationChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEmptied(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnEmptiedCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptiedCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEmptiedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptiedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEncrypted(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnEncryptedCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncryptedCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEncryptedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncryptedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnded(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnEndedCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndedCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEndedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* event */ Event => Unit): Self = {
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
    def withOnErrorCapture(value: /* event */ Event => Unit): Self = {
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
    def withOnFocus(value: /* event */ FocusEvent => Unit): Self = {
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
    def withOnFocusCapture(value: /* event */ FocusEvent => Unit): Self = {
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
    def withOnGotPointerCapture(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnGotPointerCaptureCapture(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnInput(value: /* event */ Event => Unit): Self = {
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
    def withOnInputCapture(value: /* event */ Event => Unit): Self = {
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
    def withOnInvalid(value: /* event */ Event => Unit): Self = {
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
    def withOnInvalidCapture(value: /* event */ Event => Unit): Self = {
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
    def withOnKeyDown(value: /* event */ KeyboardEvent => Unit): Self = {
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
    def withOnKeyDownCapture(value: /* event */ KeyboardEvent => Unit): Self = {
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
    def withOnKeyPress(value: /* event */ KeyboardEvent => Unit): Self = {
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
    def withOnKeyPressCapture(value: /* event */ KeyboardEvent => Unit): Self = {
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
    def withOnKeyUp(value: /* event */ KeyboardEvent => Unit): Self = {
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
    def withOnKeyUpCapture(value: /* event */ KeyboardEvent => Unit): Self = {
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
    def withOnLoad(value: /* event */ Event => Unit): Self = {
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
    def withOnLoadCapture(value: /* event */ Event => Unit): Self = {
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
    def withOnLoadStart(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnLoadStartCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStartCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoadStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedData(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnLoadedDataCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedDataCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoadedDataCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedDataCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedMetadata(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnLoadedMetadataCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadataCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoadedMetadataCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadataCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLostPointerCapture(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnLostPointerCaptureCapture(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnMouseDown(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnMouseDownCapture(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnMouseEnter(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnMouseLeave(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnMouseMove(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnMouseMoveCapture(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnMouseOut(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnMouseOutCapture(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnMouseOver(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnMouseOverCapture(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnMouseUp(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnMouseUpCapture(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnPaste(value: /* event */ ClipboardEvent => Unit): Self = {
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
    def withOnPasteCapture(value: /* event */ ClipboardEvent => Unit): Self = {
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
    def withOnPause(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnPauseCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPauseCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPauseCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPauseCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlay(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnPlayCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPlayCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaying(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnPlayingCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayingCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPlayingCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayingCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerCancel(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerCancelCapture(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerDown(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerDownCapture(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerEnter(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerEnterCapture(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerLeave(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerLeaveCapture(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerMove(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerMoveCapture(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerOut(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerOutCapture(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerOver(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerOverCapture(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerUp(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnPointerUpCapture(value: /* event */ PointerEvent => Unit): Self = {
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
    def withOnProgress(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnProgressCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgressCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnProgressCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgressCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRateChange(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnRateChangeCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChangeCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRateChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReset(value: /* event */ Event => Unit): Self = {
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
    def withOnResetCapture(value: /* event */ Event => Unit): Self = {
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
    def withOnScroll(value: /* event */ UIEvent => Unit): Self = {
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
    def withOnScrollCapture(value: /* event */ UIEvent => Unit): Self = {
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
    def withOnSeeked(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnSeekedCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekedCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSeekedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeeking(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnSeekingCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekingCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSeekingCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekingCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnSelectCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelectCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStalled(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnStalledCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalledCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStalledCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalledCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(value: /* event */ Event => Unit): Self = {
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
    def withOnSubmitCapture(value: /* event */ Event => Unit): Self = {
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
    def withOnSuspend(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnSuspendCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspendCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSuspendCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspendCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeUpdate(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
    def withOnTimeUpdateCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdateCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTimeUpdateCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdateCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancel(value: /* event */ TouchEvent => Unit): Self = {
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
    def withOnTouchCancelCapture(value: /* event */ TouchEvent => Unit): Self = {
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
    def withOnTouchEnd(value: /* event */ TouchEvent => Unit): Self = {
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
    def withOnTouchEndCapture(value: /* event */ TouchEvent => Unit): Self = {
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
    def withOnTouchMove(value: /* event */ TouchEvent => Unit): Self = {
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
    def withOnTouchMoveCapture(value: /* event */ TouchEvent => Unit): Self = {
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
    def withOnTouchStart(value: /* event */ TouchEvent => Unit): Self = {
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
    def withOnTouchStartCapture(value: /* event */ TouchEvent => Unit): Self = {
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
    def withOnTransitionEnd(value: /* event */ TransitionEvent => Unit): Self = {
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
    def withOnTransitionEndCapture(value: /* event */ TransitionEvent => Unit): Self = {
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
    def withOnVolumeChange(value: SyntheticEvent[Event, HTMLIonIconElement] => Unit): Self = {
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
  }
  
}

