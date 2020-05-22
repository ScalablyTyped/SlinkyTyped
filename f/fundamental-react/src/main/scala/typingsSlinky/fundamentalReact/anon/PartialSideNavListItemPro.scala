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
import typingsSlinky.react.mod.WheelEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/SideNavigation/SideNav.SideNavListItemProps> */
trait PartialSideNavListItemPro extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list_ | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time_] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link_ | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu_ | listbox | tree | grid | dialog] = js.undefined
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `aria-level`: js.UndefOr[Double] = js.undefined
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  var `aria-owns`: js.UndefOr[String] = js.undefined
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var glyph: js.UndefOr[IconGlyph] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var isSubItem: js.UndefOr[Boolean] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[Element]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[Element]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[Element]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[Element]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[Element]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[Element]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[Element]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[Element]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[Element]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[Element]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[Element]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[Element]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[Element]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[Element]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[Element]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[Element]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[Element]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[Element]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[Element]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[Element]] = js.undefined
  var onItemSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[Element]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[Element]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[Element]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[Element]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[Element]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[Element]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[Element]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[Element]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[Element]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[Element]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[Element]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[Element]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[Element]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[Element]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[Element]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[Element]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[Element]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[Element]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[Element]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[Element]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[Element]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var selectedId: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
}

