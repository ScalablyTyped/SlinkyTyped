package typingsSlinky.materialUiCore.anon

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
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
import typingsSlinky.materialUiCore.buttonBaseButtonBaseMod.ButtonBaseActions
import typingsSlinky.materialUiCore.listItemListItemMod.ListItemProps
import typingsSlinky.materialUiCore.materialUiCoreStrings.`additions removals`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`additions text`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`flex-start`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`inline`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`removals additions`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`removals text`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`text additions`
import typingsSlinky.materialUiCore.materialUiCoreStrings.`text removals`
import typingsSlinky.materialUiCore.materialUiCoreStrings.additions
import typingsSlinky.materialUiCore.materialUiCoreStrings.all
import typingsSlinky.materialUiCore.materialUiCoreStrings.ascending
import typingsSlinky.materialUiCore.materialUiCoreStrings.assertive
import typingsSlinky.materialUiCore.materialUiCoreStrings.both
import typingsSlinky.materialUiCore.materialUiCoreStrings.center
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
import typingsSlinky.materialUiCore.materialUiCoreStrings.step
import typingsSlinky.materialUiCore.materialUiCoreStrings.tel
import typingsSlinky.materialUiCore.materialUiCoreStrings.text
import typingsSlinky.materialUiCore.materialUiCoreStrings.time
import typingsSlinky.materialUiCore.materialUiCoreStrings.tree
import typingsSlinky.materialUiCore.materialUiCoreStrings.url
import typingsSlinky.materialUiCore.materialUiCoreStrings.vertical
import typingsSlinky.materialUiCore.materialUiCoreStrings.yes
import typingsSlinky.materialUiCore.touchRippleMod.TouchRippleProps
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.CompositionEventHandler
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.DragEventHandler
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.HTMLAttributeReferrerPolicy
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.ReactType
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.WheelEventHandler
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ListItem.ListItemProps> */
@js.native
trait PartialListItemProps extends StObject {
  
  var ContainerComponent: js.UndefOr[ReactType[HTMLAttributes[HTMLDivElement]]] = js.native
  
  var ContainerProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  
  var TouchRippleProps: js.UndefOr[Partial[typingsSlinky.materialUiCore.touchRippleMod.TouchRippleProps]] = js.native
  
  var about: js.UndefOr[String] = js.native
  
  var accessKey: js.UndefOr[String] = js.native
  
  var action: js.UndefOr[js.Function1[/* actions */ ButtonBaseActions, Unit]] = js.native
  
  var alignItems: js.UndefOr[`flex-start` | center] = js.native
  
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
  
  var `aria-relevant`: js.UndefOr[
    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
  ] = js.native
  
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
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var autoSave: js.UndefOr[String] = js.native
  
  var button: js.UndefOr[Boolean] = js.native
  
  var buttonRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
  
  var centerRipple: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classes: js.UndefOr[PartialClassNameMapListIt] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var component: js.UndefOr[ReactType[ListItemProps]] = js.native
  
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  
  var contextMenu: js.UndefOr[String] = js.native
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  
  var datatype: js.UndefOr[String] = js.native
  
  var defaultChecked: js.UndefOr[Boolean] = js.native
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  
  var dense: js.UndefOr[Boolean] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  var disableGutters: js.UndefOr[Boolean] = js.native
  
  var disableRipple: js.UndefOr[Boolean] = js.native
  
  var disableTouchRipple: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var divider: js.UndefOr[Boolean] = js.native
  
  var download: js.UndefOr[js.Any] = js.native
  
  var draggable: js.UndefOr[Booleanish] = js.native
  
  var focusRipple: js.UndefOr[Boolean] = js.native
  
  var focusVisibleClassName: js.UndefOr[String] = js.native
  
  var form: js.UndefOr[String] = js.native
  
  var formAction: js.UndefOr[String] = js.native
  
  var formEncType: js.UndefOr[String] = js.native
  
  var formMethod: js.UndefOr[String] = js.native
  
  var formNoValidate: js.UndefOr[Boolean] = js.native
  
  var formTarget: js.UndefOr[String] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var hrefLang: js.UndefOr[String] = js.native
  
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
  
  var media: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onAbort: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
  
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
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
  
  var onFocusVisible: js.UndefOr[FocusEventHandler[_]] = js.native
  
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
  
  var ping: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var radioGroup: js.UndefOr[String] = js.native
  
  var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy] = js.native
  
  var rel: js.UndefOr[String] = js.native
  
  var resource: js.UndefOr[String] = js.native
  
  var results: js.UndefOr[Double] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var security: js.UndefOr[String] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var slot: js.UndefOr[String] = js.native
  
  var spellCheck: js.UndefOr[Booleanish] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var translate: js.UndefOr[yes | no] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var typeof: js.UndefOr[String] = js.native
  
  var unselectable: js.UndefOr[on | off] = js.native
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
  
  var vocab: js.UndefOr[String] = js.native
}
object PartialListItemProps {
  
  @scala.inline
  def apply(): PartialListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemProps]
  }
  
  @scala.inline
  implicit class PartialListItemPropsMutableBuilder[Self <: PartialListItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    @scala.inline
    def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    @scala.inline
    def setAction(value: /* actions */ ButtonBaseActions => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAlignItems(value: `flex-start` | center): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
    
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
    
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
    
    @scala.inline
    def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
    
    @scala.inline
    def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
    
    @scala.inline
    def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
    
    @scala.inline
    def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
    
    @scala.inline
    def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
    
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    @scala.inline
    def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
    
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
    
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
    
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    @scala.inline
    def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
    
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
    
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
    
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
    
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
    
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
    
    @scala.inline
    def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
    
    @scala.inline
    def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
    
    @scala.inline
    def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
    
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    @scala.inline
    def `setAria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    @scala.inline
    def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    @scala.inline
    def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    @scala.inline
    def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
    
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
    
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
    
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
    
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
    
    @scala.inline
    def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    @scala.inline
    def setButton(value: Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonRef(value: Ref[_] | ReactRef[_]): Self = StObject.set(x, "buttonRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "buttonRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setButtonRefNull: Self = StObject.set(x, "buttonRef", null)
    
    @scala.inline
    def setButtonRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "buttonRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonRefUndefined: Self = StObject.set(x, "buttonRef", js.undefined)
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setCenterRipple(value: Boolean): Self = StObject.set(x, "centerRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterRippleUndefined: Self = StObject.set(x, "centerRipple", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClasses(value: PartialClassNameMapListIt): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setComponent(value: ReactType[ListItemProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentComponentClass(value: ReactComponentClass[ListItemProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentFunctionComponent(value: ReactComponentClass[ListItemProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setContainerComponent(value: ReactType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "ContainerComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerComponentComponentClass(value: ReactComponentClass[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "ContainerComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerComponentFunctionComponent(value: ReactComponentClass[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "ContainerComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerComponentUndefined: Self = StObject.set(x, "ContainerComponent", js.undefined)
    
    @scala.inline
    def setContainerProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "ContainerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPropsUndefined: Self = StObject.set(x, "ContainerProps", js.undefined)
    
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    @scala.inline
    def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    @scala.inline
    def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDisableGutters(value: Boolean): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
    
    @scala.inline
    def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
    
    @scala.inline
    def setDisableTouchRipple(value: Boolean): Self = StObject.set(x, "disableTouchRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTouchRippleUndefined: Self = StObject.set(x, "disableTouchRipple", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
    
    @scala.inline
    def setDownload(value: js.Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setFocusRipple(value: Boolean): Self = StObject.set(x, "focusRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusRippleUndefined: Self = StObject.set(x, "focusRipple", js.undefined)
    
    @scala.inline
    def setFocusVisibleClassName(value: String): Self = StObject.set(x, "focusVisibleClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusVisibleClassNameUndefined: Self = StObject.set(x, "focusVisibleClassName", js.undefined)
    
    @scala.inline
    def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
    
    @scala.inline
    def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    @scala.inline
    def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
    
    @scala.inline
    def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
    
    @scala.inline
    def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    @scala.inline
    def setInnerRef(value: Ref[_] | ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    @scala.inline
    def setInnerRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
    @scala.inline
    def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    @scala.inline
    def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
    
    @scala.inline
    def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
    
    @scala.inline
    def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
    
    @scala.inline
    def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
    
    @scala.inline
    def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnAbort(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: SyntheticAnimationEvent[HTMLElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: SyntheticAnimationEvent[HTMLElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: SyntheticAnimationEvent[HTMLElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAuxClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    @scala.inline
    def setOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    @scala.inline
    def setOnChange(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnCopy(value: SyntheticClipboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    @scala.inline
    def setOnCut(value: SyntheticClipboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDrag(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnd(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    @scala.inline
    def setOnDrop(value: DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEnded(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    @scala.inline
    def setOnError(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnFocusVisible(value: SyntheticFocusEvent[_] => Unit): Self = StObject.set(x, "onFocusVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusVisibleUndefined: Self = StObject.set(x, "onFocusVisible", js.undefined)
    
    @scala.inline
    def setOnInput(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnLoad(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnPaste(value: SyntheticClipboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    @scala.inline
    def setOnPause(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: SyntheticPointerEvent[HTMLElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: SyntheticPointerEvent[HTMLElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: SyntheticPointerEvent[HTMLElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: SyntheticPointerEvent[HTMLElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: SyntheticPointerEvent[HTMLElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: SyntheticPointerEvent[HTMLElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: SyntheticPointerEvent[HTMLElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: SyntheticPointerEvent[HTMLElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    @scala.inline
    def setOnProgress(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    @scala.inline
    def setOnReset(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    @scala.inline
    def setOnScroll(value: SyntheticUIEvent[HTMLElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOnStalled(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: SyntheticTouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticTouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: SyntheticTouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: SyntheticTransitionEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[Event, HTMLElement] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    @scala.inline
    def setOnWheel(value: SyntheticWheelEvent[HTMLElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    @scala.inline
    def setPing(value: String): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPingUndefined: Self = StObject.set(x, "ping", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    @scala.inline
    def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    @scala.inline
    def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
    
    @scala.inline
    def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTouchRippleProps(value: Partial[TouchRippleProps]): Self = StObject.set(x, "TouchRippleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchRipplePropsUndefined: Self = StObject.set(x, "TouchRippleProps", js.undefined)
    
    @scala.inline
    def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    @scala.inline
    def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    
    @scala.inline
    def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
  }
}
