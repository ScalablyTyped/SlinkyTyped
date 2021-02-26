package typingsSlinky.fundamentalReact.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fundamentalReact.buttonMod.ButtonOptions
import typingsSlinky.fundamentalReact.buttonMod.ButtonTypes
import typingsSlinky.fundamentalReact.fundamentalReactStrings.`additions removals`
import typingsSlinky.fundamentalReact.fundamentalReactStrings.`additions text`
import typingsSlinky.fundamentalReact.fundamentalReactStrings.`inline`
import typingsSlinky.fundamentalReact.fundamentalReactStrings.`removals additions`
import typingsSlinky.fundamentalReact.fundamentalReactStrings.`removals text`
import typingsSlinky.fundamentalReact.fundamentalReactStrings.`text additions`
import typingsSlinky.fundamentalReact.fundamentalReactStrings.`text removals`
import typingsSlinky.fundamentalReact.fundamentalReactStrings.additions
import typingsSlinky.fundamentalReact.fundamentalReactStrings.all
import typingsSlinky.fundamentalReact.fundamentalReactStrings.ascending
import typingsSlinky.fundamentalReact.fundamentalReactStrings.assertive
import typingsSlinky.fundamentalReact.fundamentalReactStrings.both
import typingsSlinky.fundamentalReact.fundamentalReactStrings.button_
import typingsSlinky.fundamentalReact.fundamentalReactStrings.copy
import typingsSlinky.fundamentalReact.fundamentalReactStrings.date
import typingsSlinky.fundamentalReact.fundamentalReactStrings.decimal
import typingsSlinky.fundamentalReact.fundamentalReactStrings.descending
import typingsSlinky.fundamentalReact.fundamentalReactStrings.dialog
import typingsSlinky.fundamentalReact.fundamentalReactStrings.email
import typingsSlinky.fundamentalReact.fundamentalReactStrings.execute
import typingsSlinky.fundamentalReact.fundamentalReactStrings.grammar
import typingsSlinky.fundamentalReact.fundamentalReactStrings.grid
import typingsSlinky.fundamentalReact.fundamentalReactStrings.horizontal
import typingsSlinky.fundamentalReact.fundamentalReactStrings.inherit
import typingsSlinky.fundamentalReact.fundamentalReactStrings.link_
import typingsSlinky.fundamentalReact.fundamentalReactStrings.list_
import typingsSlinky.fundamentalReact.fundamentalReactStrings.listbox
import typingsSlinky.fundamentalReact.fundamentalReactStrings.location
import typingsSlinky.fundamentalReact.fundamentalReactStrings.menu_
import typingsSlinky.fundamentalReact.fundamentalReactStrings.mixed
import typingsSlinky.fundamentalReact.fundamentalReactStrings.move
import typingsSlinky.fundamentalReact.fundamentalReactStrings.no
import typingsSlinky.fundamentalReact.fundamentalReactStrings.none
import typingsSlinky.fundamentalReact.fundamentalReactStrings.numeric
import typingsSlinky.fundamentalReact.fundamentalReactStrings.off
import typingsSlinky.fundamentalReact.fundamentalReactStrings.on
import typingsSlinky.fundamentalReact.fundamentalReactStrings.other
import typingsSlinky.fundamentalReact.fundamentalReactStrings.page
import typingsSlinky.fundamentalReact.fundamentalReactStrings.polite
import typingsSlinky.fundamentalReact.fundamentalReactStrings.popup
import typingsSlinky.fundamentalReact.fundamentalReactStrings.removals
import typingsSlinky.fundamentalReact.fundamentalReactStrings.reset
import typingsSlinky.fundamentalReact.fundamentalReactStrings.search
import typingsSlinky.fundamentalReact.fundamentalReactStrings.spelling
import typingsSlinky.fundamentalReact.fundamentalReactStrings.step
import typingsSlinky.fundamentalReact.fundamentalReactStrings.submit
import typingsSlinky.fundamentalReact.fundamentalReactStrings.tel
import typingsSlinky.fundamentalReact.fundamentalReactStrings.text
import typingsSlinky.fundamentalReact.fundamentalReactStrings.time_
import typingsSlinky.fundamentalReact.fundamentalReactStrings.tree
import typingsSlinky.fundamentalReact.fundamentalReactStrings.url
import typingsSlinky.fundamentalReact.fundamentalReactStrings.vertical
import typingsSlinky.fundamentalReact.fundamentalReactStrings.yes
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.CompositionEventHandler
import typingsSlinky.react.mod.DragEventHandler
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.Validator
import typingsSlinky.react.mod.WheelEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Button/Button.ButtonProps> */
@js.native
trait WeakValidationMapButtonPr extends StObject {
  
  var about: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var accessKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-activedescendant`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-atomic`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-autocomplete`: js.UndefOr[Validator[js.UndefOr[none | `inline` | list_ | both | Null]]] = js.native
  
  var `aria-busy`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-checked`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.native
  
  var `aria-colcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-colindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-colspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-controls`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-current`: js.UndefOr[Validator[js.UndefOr[page | step | location | date | time_ | Boolean | Null]]] = js.native
  
  var `aria-describedby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-details`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-disabled`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-dropeffect`: js.UndefOr[Validator[js.UndefOr[none | copy | execute | link_ | move | popup | Null]]] = js.native
  
  var `aria-errormessage`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-expanded`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-flowto`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-grabbed`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-haspopup`: js.UndefOr[Validator[js.UndefOr[menu_ | listbox | tree | grid | dialog | Boolean | Null]]] = js.native
  
  var `aria-hidden`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-invalid`: js.UndefOr[Validator[js.UndefOr[grammar | spelling | Boolean | Null]]] = js.native
  
  var `aria-keyshortcuts`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-labelledby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-level`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-live`: js.UndefOr[Validator[js.UndefOr[off | assertive | polite | Null]]] = js.native
  
  var `aria-modal`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-multiline`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-multiselectable`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-orientation`: js.UndefOr[Validator[js.UndefOr[horizontal | vertical | Null]]] = js.native
  
  var `aria-owns`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-placeholder`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-posinset`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-pressed`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.native
  
  var `aria-readonly`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-relevant`: js.UndefOr[
    Validator[
      js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`) | Null
      ]
    ]
  ] = js.native
  
  var `aria-required`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-roledescription`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-rowcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-rowindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-rowspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-selected`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-setsize`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-sort`: js.UndefOr[Validator[js.UndefOr[none | ascending | descending | other | Null]]] = js.native
  
  var `aria-valuemax`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-valuemin`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-valuenow`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-valuetext`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var autoCapitalize: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var autoCorrect: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var autoSave: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactElement]]] = js.native
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var color: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var compact: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var contentEditable: js.UndefOr[Validator[js.UndefOr[inherit | Booleanish | Null]]] = js.native
  
  var contextMenu: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var dangerouslySetInnerHTML: js.UndefOr[Validator[js.UndefOr[Html | Null]]] = js.native
  
  var datatype: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var defaultChecked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var defaultValue: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Double | Null | String]]] = js.native
  
  var dir: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var draggable: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.native
  
  var glyph: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var hidden: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var inlist: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  
  var inputMode: js.UndefOr[
    Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]]
  ] = js.native
  
  var is: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var itemID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var itemProp: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var itemRef: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var itemScope: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var itemType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var lang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var onAbort: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onAnimationEnd: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onAnimationIteration: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onAnimationStart: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onAuxClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onBeforeInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onBlur: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onCanPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onCanPlayThrough: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onChange: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onClick: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], Unit]) | Null]
    ]
  ] = js.native
  
  var onCompositionEnd: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onCompositionStart: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onCompositionUpdate: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onContextMenu: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onCopy: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onCut: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onDoubleClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onDrag: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onDragEnd: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onDragEnter: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onDragExit: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onDragLeave: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onDragOver: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onDragStart: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onDrop: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onDurationChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onEmptied: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onEncrypted: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onEnded: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onError: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onFocus: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onInvalid: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onKeyDown: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onKeyPress: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onKeyUp: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onLoad: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onLoadStart: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onLoadedData: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onLoadedMetadata: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onMouseDown: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onMouseEnter: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onMouseLeave: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onMouseMove: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onMouseOut: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onMouseOver: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onMouseUp: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onPaste: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onPause: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onPlaying: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onPointerCancel: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]] = js.native
  
  var onPointerDown: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]] = js.native
  
  var onPointerEnter: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]] = js.native
  
  var onPointerLeave: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]] = js.native
  
  var onPointerMove: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]] = js.native
  
  var onPointerOut: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]] = js.native
  
  var onPointerOver: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]] = js.native
  
  var onPointerUp: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]] = js.native
  
  var onProgress: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onRateChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onReset: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onScroll: js.UndefOr[Validator[js.UndefOr[Null | UIEventHandler[HTMLButtonElement]]]] = js.native
  
  var onSeeked: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onSeeking: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onSelect: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onStalled: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onSubmit: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLButtonElement] | Null]]] = js.native
  
  var onSuspend: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onTimeUpdate: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onTouchCancel: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLButtonElement]]]] = js.native
  
  var onTouchEnd: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLButtonElement]]]] = js.native
  
  var onTouchMove: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLButtonElement]]]] = js.native
  
  var onTouchStart: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLButtonElement]]]] = js.native
  
  var onTransitionEnd: js.UndefOr[Validator[js.UndefOr[Null | TransitionEventHandler[HTMLButtonElement]]]] = js.native
  
  var onVolumeChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onWaiting: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]] = js.native
  
  var onWheel: js.UndefOr[Validator[js.UndefOr[Null | WheelEventHandler[HTMLButtonElement]]]] = js.native
  
  var option: js.UndefOr[Validator[js.UndefOr[ButtonOptions | Null]]] = js.native
  
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var prefix: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var property: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var radioGroup: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var ref: js.UndefOr[Validator[js.UndefOr[Null | ReactRef[HTMLButtonElement]]]] = js.native
  
  var resource: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var results: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var security: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var selected: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var slot: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var spellCheck: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.native
  
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  
  var suppressContentEditableWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var suppressHydrationWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var translate: js.UndefOr[Validator[js.UndefOr[yes | no | Null]]] = js.native
  
  var `type`: js.UndefOr[Validator[js.UndefOr[ButtonTypes | Null]]] = js.native
  
  var typeAttr: js.UndefOr[Validator[js.UndefOr[submit | reset | button_ | Null]]] = js.native
  
  var typeof: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var unselectable: js.UndefOr[Validator[js.UndefOr[on | off | Null]]] = js.native
  
  var vocab: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
}
object WeakValidationMapButtonPr {
  
  @scala.inline
  def apply(): WeakValidationMapButtonPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapButtonPr]
  }
  
  @scala.inline
  implicit class WeakValidationMapButtonPrMutableBuilder[Self <: WeakValidationMapButtonPr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbout(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    @scala.inline
    def setAccessKey(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    @scala.inline
    def `setAria-activedescendant`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    @scala.inline
    def `setAria-atomic`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    @scala.inline
    def `setAria-autocomplete`(value: Validator[js.UndefOr[none | `inline` | list_ | both | Null]]): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
    
    @scala.inline
    def `setAria-busy`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
    
    @scala.inline
    def `setAria-checked`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
    
    @scala.inline
    def `setAria-colcount`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
    
    @scala.inline
    def `setAria-colindex`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
    
    @scala.inline
    def `setAria-colspan`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
    
    @scala.inline
    def `setAria-controls`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    @scala.inline
    def `setAria-current`(value: Validator[js.UndefOr[page | step | location | date | time_ | Boolean | Null]]): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
    
    @scala.inline
    def `setAria-describedby`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-details`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
    
    @scala.inline
    def `setAria-disabled`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    @scala.inline
    def `setAria-dropeffect`(value: Validator[js.UndefOr[none | copy | execute | link_ | move | popup | Null]]): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-expanded`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    @scala.inline
    def `setAria-flowto`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
    
    @scala.inline
    def `setAria-grabbed`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
    
    @scala.inline
    def `setAria-haspopup`(value: Validator[js.UndefOr[menu_ | listbox | tree | grid | dialog | Boolean | Null]]): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    @scala.inline
    def `setAria-hidden`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
    
    @scala.inline
    def `setAria-invalid`(value: Validator[js.UndefOr[grammar | spelling | Boolean | Null]]): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    @scala.inline
    def `setAria-keyshortcuts`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    @scala.inline
    def `setAria-level`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
    
    @scala.inline
    def `setAria-live`(value: Validator[js.UndefOr[off | assertive | polite | Null]]): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
    
    @scala.inline
    def `setAria-modal`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
    
    @scala.inline
    def `setAria-multiline`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
    
    @scala.inline
    def `setAria-multiselectable`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
    
    @scala.inline
    def `setAria-orientation`(value: Validator[js.UndefOr[horizontal | vertical | Null]]): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
    
    @scala.inline
    def `setAria-owns`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
    
    @scala.inline
    def `setAria-placeholder`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
    
    @scala.inline
    def `setAria-posinset`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
    
    @scala.inline
    def `setAria-pressed`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    @scala.inline
    def `setAria-relevant`(
      value: Validator[
          js.UndefOr[
            additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`) | Null
          ]
        ]
    ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    @scala.inline
    def `setAria-required`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    @scala.inline
    def `setAria-roledescription`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    @scala.inline
    def `setAria-rowcount`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    @scala.inline
    def `setAria-rowindex`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    @scala.inline
    def `setAria-rowspan`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    @scala.inline
    def `setAria-selected`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    @scala.inline
    def `setAria-setsize`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
    
    @scala.inline
    def `setAria-sort`(value: Validator[js.UndefOr[none | ascending | descending | other | Null]]): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
    
    @scala.inline
    def `setAria-valuemax`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
    
    @scala.inline
    def `setAria-valuemin`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
    
    @scala.inline
    def `setAria-valuenow`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
    
    @scala.inline
    def `setAria-valuetext`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoSave(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    @scala.inline
    def setChildren(value: Validator[js.UndefOr[Null | ReactElement]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCompact(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    @scala.inline
    def setContentEditable(value: Validator[js.UndefOr[inherit | Booleanish | Null]]): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    @scala.inline
    def setContextMenu(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Validator[js.UndefOr[Html | Null]]): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setDatatype(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    @scala.inline
    def setDefaultChecked(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Validator[js.UndefOr[js.Array[String] | Double | Null | String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDir(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    
    @scala.inline
    def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDraggable(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setGlyph(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
    
    @scala.inline
    def setHidden(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setId(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInlist(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    @scala.inline
    def setInputMode(value: Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]]): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
    @scala.inline
    def setIs(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    @scala.inline
    def setItemID(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
    
    @scala.inline
    def setItemProp(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
    
    @scala.inline
    def setItemRef(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
    
    @scala.inline
    def setItemScope(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
    
    @scala.inline
    def setItemType(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    @scala.inline
    def setLang(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setOnAbort(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: Validator[js.UndefOr[AnimationEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: Validator[js.UndefOr[AnimationEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onAnimationIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: Validator[js.UndefOr[AnimationEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onAnimationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAuxClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onAuxClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    @scala.inline
    def setOnBeforeInput(value: Validator[js.UndefOr[FormEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onBeforeInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    @scala.inline
    def setOnBlur(value: Validator[js.UndefOr[FocusEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onCanPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCanPlayThrough(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onCanPlayThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    @scala.inline
    def setOnChange(value: Validator[js.UndefOr[FormEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(
      value: Validator[
          js.UndefOr[(js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], Unit]) | Null]
        ]
    ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: Validator[js.UndefOr[CompositionEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onCompositionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: Validator[js.UndefOr[CompositionEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onCompositionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: Validator[js.UndefOr[CompositionEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onCompositionUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnCopy(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    @scala.inline
    def setOnCut(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDrag(value: Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragEnd(value: Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onDragExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    @scala.inline
    def setOnDrop(value: Validator[js.UndefOr[DragEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onDurationChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEnded(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    @scala.inline
    def setOnError(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: Validator[js.UndefOr[FocusEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnInput(value: Validator[js.UndefOr[FormEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: Validator[js.UndefOr[FormEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnLoad(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadStart(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onLoadedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onLoadedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: Validator[js.UndefOr[MouseEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnPaste(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    @scala.inline
    def setOnPause(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onPointerOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onPointerOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    @scala.inline
    def setOnProgress(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onRateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    @scala.inline
    def setOnReset(value: Validator[js.UndefOr[FormEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    @scala.inline
    def setOnScroll(value: Validator[js.UndefOr[Null | UIEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    @scala.inline
    def setOnSelect(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOnStalled(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: Validator[js.UndefOr[FormEventHandler[HTMLButtonElement] | Null]]): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onTimeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: Validator[js.UndefOr[Null | TransitionEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onTransitionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onVolumeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    @scala.inline
    def setOnWheel(value: Validator[js.UndefOr[Null | WheelEventHandler[HTMLButtonElement]]]): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    @scala.inline
    def setOption(value: Validator[js.UndefOr[ButtonOptions | Null]]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPrefix(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setProperty(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setRadioGroup(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    @scala.inline
    def setRef(value: Validator[js.UndefOr[Null | ReactRef[HTMLButtonElement]]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setResource(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setResults(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setRole(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSecurity(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def setSelected(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSlot(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Validator[js.UndefOr[Booleanish | Null]]): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    @scala.inline
    def setStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSuppressContentEditableWarning(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
    
    @scala.inline
    def setSuppressHydrationWarning(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTitle(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTranslate(value: Validator[js.UndefOr[yes | no | Null]]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    @scala.inline
    def setType(value: Validator[js.UndefOr[ButtonTypes | Null]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAttr(value: Validator[js.UndefOr[submit | reset | button_ | Null]]): Self = StObject.set(x, "typeAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAttrUndefined: Self = StObject.set(x, "typeAttr", js.undefined)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeof(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    @scala.inline
    def setUnselectable(value: Validator[js.UndefOr[on | off | Null]]): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    @scala.inline
    def setVocab(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
  }
}
