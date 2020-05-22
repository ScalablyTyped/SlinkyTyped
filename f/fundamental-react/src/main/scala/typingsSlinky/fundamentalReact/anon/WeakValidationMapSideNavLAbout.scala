package typingsSlinky.fundamentalReact.anon

import org.scalajs.dom.raw.Element
import slinky.core.TagMod
import typingsSlinky.fundamentalReact.fundamentalReactStrings.`additions text`
import typingsSlinky.fundamentalReact.fundamentalReactStrings.`inline`
import typingsSlinky.fundamentalReact.fundamentalReactStrings.additions
import typingsSlinky.fundamentalReact.fundamentalReactStrings.all
import typingsSlinky.fundamentalReact.fundamentalReactStrings.ascending
import typingsSlinky.fundamentalReact.fundamentalReactStrings.assertive
import typingsSlinky.fundamentalReact.fundamentalReactStrings.both
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
import typingsSlinky.fundamentalReact.fundamentalReactStrings.search
import typingsSlinky.fundamentalReact.fundamentalReactStrings.spelling
import typingsSlinky.fundamentalReact.fundamentalReactStrings.step
import typingsSlinky.fundamentalReact.fundamentalReactStrings.tel
import typingsSlinky.fundamentalReact.fundamentalReactStrings.text
import typingsSlinky.fundamentalReact.fundamentalReactStrings.time_
import typingsSlinky.fundamentalReact.fundamentalReactStrings.tree
import typingsSlinky.fundamentalReact.fundamentalReactStrings.url
import typingsSlinky.fundamentalReact.fundamentalReactStrings.vertical
import typingsSlinky.fundamentalReact.fundamentalReactStrings.yes
import typingsSlinky.fundamentalReact.iconMod.IconGlyph
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/SideNavigation/SideNav.SideNavListItemProps> */
trait WeakValidationMapSideNavLAbout extends js.Object {
  var about: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var accessKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-activedescendant`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-atomic`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-autocomplete`: js.UndefOr[Validator[js.UndefOr[none | `inline` | list_ | both | Null]]] = js.undefined
  var `aria-busy`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-checked`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.undefined
  var `aria-colcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-colindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-colspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-controls`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-current`: js.UndefOr[Validator[js.UndefOr[page | step | location | date | time_ | Boolean | Null]]] = js.undefined
  var `aria-describedby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-details`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-disabled`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-dropeffect`: js.UndefOr[Validator[js.UndefOr[none | copy | execute | link_ | move | popup | Null]]] = js.undefined
  var `aria-errormessage`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-expanded`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-flowto`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-grabbed`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-haspopup`: js.UndefOr[Validator[js.UndefOr[menu_ | listbox | tree | grid | dialog | Boolean | Null]]] = js.undefined
  var `aria-hidden`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-invalid`: js.UndefOr[Validator[js.UndefOr[grammar | spelling | Boolean | Null]]] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-labelledby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-level`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-live`: js.UndefOr[Validator[js.UndefOr[off | assertive | polite | Null]]] = js.undefined
  var `aria-modal`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-multiline`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-orientation`: js.UndefOr[Validator[js.UndefOr[horizontal | vertical | Null]]] = js.undefined
  var `aria-owns`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-placeholder`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-posinset`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-pressed`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.undefined
  var `aria-readonly`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-relevant`: js.UndefOr[
    Validator[js.UndefOr[additions | (`additions text`) | all | removals | text | Null]]
  ] = js.undefined
  var `aria-required`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-roledescription`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-rowcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-rowindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-rowspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-selected`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-setsize`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-sort`: js.UndefOr[Validator[js.UndefOr[none | ascending | descending | other | Null]]] = js.undefined
  var `aria-valuemax`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-valuemin`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-valuenow`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-valuetext`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var autoCapitalize: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var autoCorrect: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var autoSave: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var children: js.UndefOr[Validator[js.UndefOr[Null | TagMod[Any]]]] = js.undefined
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var color: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var contentEditable: js.UndefOr[Validator[js.UndefOr[inherit | Booleanish | Null]]] = js.undefined
  var contextMenu: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Validator[js.UndefOr[Html | Null]]] = js.undefined
  var datatype: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var defaultChecked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var defaultValue: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Double | Null | String]]] = js.undefined
  var dir: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var draggable: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  var expanded: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var glyph: js.UndefOr[Validator[js.UndefOr[IconGlyph | Null]]] = js.undefined
  var hidden: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var inlist: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.undefined
  var inputMode: js.UndefOr[
    Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]]
  ] = js.undefined
  var is: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var isSubItem: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var itemID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var itemProp: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var itemRef: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var itemScope: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var itemType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var lang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var name: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var onAbort: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onAnimationEnd: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[Element] | Null]]] = js.undefined
  var onAnimationIteration: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[Element] | Null]]] = js.undefined
  var onAnimationStart: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[Element] | Null]]] = js.undefined
  var onAuxClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[Element] | Null]]] = js.undefined
  var onBeforeInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[Element] | Null]]] = js.undefined
  var onBlur: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[Element] | Null]]] = js.undefined
  var onCanPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onCanPlayThrough: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onChange: js.UndefOr[Validator[js.UndefOr[FormEventHandler[Element] | Null]]] = js.undefined
  var onClick: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.undefined
  var onCompositionEnd: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[Element] | Null]]] = js.undefined
  var onCompositionStart: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[Element] | Null]]] = js.undefined
  var onCompositionUpdate: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[Element] | Null]]] = js.undefined
  var onContextMenu: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[Element] | Null]]] = js.undefined
  var onCopy: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[Element] | Null]]] = js.undefined
  var onCut: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[Element] | Null]]] = js.undefined
  var onDoubleClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[Element] | Null]]] = js.undefined
  var onDrag: js.UndefOr[Validator[js.UndefOr[DragEventHandler[Element] | Null]]] = js.undefined
  var onDragEnd: js.UndefOr[Validator[js.UndefOr[DragEventHandler[Element] | Null]]] = js.undefined
  var onDragEnter: js.UndefOr[Validator[js.UndefOr[DragEventHandler[Element] | Null]]] = js.undefined
  var onDragExit: js.UndefOr[Validator[js.UndefOr[DragEventHandler[Element] | Null]]] = js.undefined
  var onDragLeave: js.UndefOr[Validator[js.UndefOr[DragEventHandler[Element] | Null]]] = js.undefined
  var onDragOver: js.UndefOr[Validator[js.UndefOr[DragEventHandler[Element] | Null]]] = js.undefined
  var onDragStart: js.UndefOr[Validator[js.UndefOr[DragEventHandler[Element] | Null]]] = js.undefined
  var onDrop: js.UndefOr[Validator[js.UndefOr[DragEventHandler[Element] | Null]]] = js.undefined
  var onDurationChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onEmptied: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onEncrypted: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onEnded: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onError: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onFocus: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[Element] | Null]]] = js.undefined
  var onInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[Element] | Null]]] = js.undefined
  var onInvalid: js.UndefOr[Validator[js.UndefOr[FormEventHandler[Element] | Null]]] = js.undefined
  var onItemSelect: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.undefined
  var onKeyDown: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[Element] | Null]]] = js.undefined
  var onKeyPress: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[Element] | Null]]] = js.undefined
  var onKeyUp: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[Element] | Null]]] = js.undefined
  var onLoad: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onLoadStart: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onLoadedData: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onLoadedMetadata: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onMouseDown: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[Element] | Null]]] = js.undefined
  var onMouseEnter: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[Element] | Null]]] = js.undefined
  var onMouseLeave: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[Element] | Null]]] = js.undefined
  var onMouseMove: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[Element] | Null]]] = js.undefined
  var onMouseOut: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[Element] | Null]]] = js.undefined
  var onMouseOver: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[Element] | Null]]] = js.undefined
  var onMouseUp: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[Element] | Null]]] = js.undefined
  var onPaste: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[Element] | Null]]] = js.undefined
  var onPause: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onPlaying: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onPointerCancel: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[Element]]]] = js.undefined
  var onPointerDown: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[Element]]]] = js.undefined
  var onPointerEnter: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[Element]]]] = js.undefined
  var onPointerLeave: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[Element]]]] = js.undefined
  var onPointerMove: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[Element]]]] = js.undefined
  var onPointerOut: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[Element]]]] = js.undefined
  var onPointerOver: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[Element]]]] = js.undefined
  var onPointerUp: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[Element]]]] = js.undefined
  var onProgress: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onRateChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onReset: js.UndefOr[Validator[js.UndefOr[FormEventHandler[Element] | Null]]] = js.undefined
  var onScroll: js.UndefOr[Validator[js.UndefOr[Null | UIEventHandler[Element]]]] = js.undefined
  var onSeeked: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onSeeking: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onSelect: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onStalled: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onSubmit: js.UndefOr[Validator[js.UndefOr[FormEventHandler[Element] | Null]]] = js.undefined
  var onSuspend: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onTimeUpdate: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onTouchCancel: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[Element]]]] = js.undefined
  var onTouchEnd: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[Element]]]] = js.undefined
  var onTouchMove: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[Element]]]] = js.undefined
  var onTouchStart: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[Element]]]] = js.undefined
  var onTransitionEnd: js.UndefOr[Validator[js.UndefOr[Null | TransitionEventHandler[Element]]]] = js.undefined
  var onVolumeChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onWaiting: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[Element]]]] = js.undefined
  var onWheel: js.UndefOr[Validator[js.UndefOr[Null | WheelEventHandler[Element]]]] = js.undefined
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var prefix: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var property: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var radioGroup: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var resource: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var results: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var security: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var selected: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var selectedId: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var slot: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var spellCheck: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.undefined
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var translate: js.UndefOr[Validator[js.UndefOr[yes | no | Null]]] = js.undefined
  var typeof: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var unselectable: js.UndefOr[Validator[js.UndefOr[on | off | Null]]] = js.undefined
  var url: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var vocab: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
}

