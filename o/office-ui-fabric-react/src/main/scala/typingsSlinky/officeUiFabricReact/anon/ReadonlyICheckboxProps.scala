package typingsSlinky.officeUiFabricReact.anon

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
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
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.checkboxTypesMod.ICheckbox
import typingsSlinky.officeUiFabricReact.checkboxTypesMod.ICheckboxProps
import typingsSlinky.officeUiFabricReact.checkboxTypesMod.ICheckboxStyleProps
import typingsSlinky.officeUiFabricReact.checkboxTypesMod.ICheckboxStyles
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`additions removals`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`additions text`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`inline`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`removals additions`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`removals text`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`text additions`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`text removals`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.additions
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.all
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.ascending
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.assertive
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.both
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.button
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.copy
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.date
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.decimal
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.descending
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.dialog
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.email
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.end
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.execute
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.grammar
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.grid
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.horizontal
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.inherit
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.link
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.list
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.listbox
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.location
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.menu
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.mixed
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.move
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.no
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.none
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.numeric
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.off
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.on
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.other
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.page
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.polite
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.popup
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.removals
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.reset
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.search
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.spelling
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.start
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.step
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.submit
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.tel
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.text
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.time
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.tree
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.url
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.vertical
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.yes
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.ButtonHTMLAttributes
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
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.WheelEventHandler
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Checkbox/Checkbox.types.ICheckboxProps> */
@js.native
trait ReadonlyICheckboxProps extends js.Object {
  
  val about: js.UndefOr[String] = js.native
  
  val accessKey: js.UndefOr[String] = js.native
  
  val `aria-activedescendant`: js.UndefOr[String] = js.native
  
  val `aria-atomic`: js.UndefOr[Boolean] = js.native
  
  val `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  
  val `aria-busy`: js.UndefOr[Boolean] = js.native
  
  val `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  
  val `aria-colcount`: js.UndefOr[Double] = js.native
  
  val `aria-colindex`: js.UndefOr[Double] = js.native
  
  val `aria-colspan`: js.UndefOr[Double] = js.native
  
  val `aria-controls`: js.UndefOr[String] = js.native
  
  val `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  
  val `aria-describedby`: js.UndefOr[String] = js.native
  
  val `aria-details`: js.UndefOr[String] = js.native
  
  val `aria-disabled`: js.UndefOr[Boolean] = js.native
  
  val `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  
  val `aria-errormessage`: js.UndefOr[String] = js.native
  
  val `aria-expanded`: js.UndefOr[Boolean] = js.native
  
  val `aria-flowto`: js.UndefOr[String] = js.native
  
  val `aria-grabbed`: js.UndefOr[Boolean] = js.native
  
  val `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  
  val `aria-hidden`: js.UndefOr[Boolean] = js.native
  
  val `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  
  val `aria-keyshortcuts`: js.UndefOr[String] = js.native
  
  val `aria-label`: js.UndefOr[String] = js.native
  
  val `aria-labelledby`: js.UndefOr[String] = js.native
  
  val `aria-level`: js.UndefOr[Double] = js.native
  
  val `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  
  val `aria-modal`: js.UndefOr[Boolean] = js.native
  
  val `aria-multiline`: js.UndefOr[Boolean] = js.native
  
  val `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  
  val `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  
  val `aria-owns`: js.UndefOr[String] = js.native
  
  val `aria-placeholder`: js.UndefOr[String] = js.native
  
  val `aria-posinset`: js.UndefOr[Double] = js.native
  
  val `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  
  val `aria-readonly`: js.UndefOr[Boolean] = js.native
  
  val `aria-relevant`: js.UndefOr[
    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
  ] = js.native
  
  val `aria-required`: js.UndefOr[Boolean] = js.native
  
  val `aria-roledescription`: js.UndefOr[String] = js.native
  
  val `aria-rowcount`: js.UndefOr[Double] = js.native
  
  val `aria-rowindex`: js.UndefOr[Double] = js.native
  
  val `aria-rowspan`: js.UndefOr[Double] = js.native
  
  val `aria-selected`: js.UndefOr[Boolean] = js.native
  
  val `aria-setsize`: js.UndefOr[Double] = js.native
  
  val `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  
  val `aria-valuemax`: js.UndefOr[Double] = js.native
  
  val `aria-valuemin`: js.UndefOr[Double] = js.native
  
  val `aria-valuenow`: js.UndefOr[Double] = js.native
  
  val `aria-valuetext`: js.UndefOr[String] = js.native
  
  val ariaDescribedBy: js.UndefOr[String] = js.native
  
  val ariaLabel: js.UndefOr[String] = js.native
  
  val ariaLabelledBy: js.UndefOr[String] = js.native
  
  val ariaPositionInSet: js.UndefOr[Double] = js.native
  
  val ariaSetSize: js.UndefOr[Double] = js.native
  
  val autoCapitalize: js.UndefOr[String] = js.native
  
  val autoCorrect: js.UndefOr[String] = js.native
  
  val autoFocus: js.UndefOr[Boolean] = js.native
  
  val autoSave: js.UndefOr[String] = js.native
  
  val boxSide: js.UndefOr[start | end] = js.native
  
  val checked: js.UndefOr[Boolean] = js.native
  
  val checkmarkIconProps: js.UndefOr[IIconProps] = js.native
  
  val children: js.UndefOr[ReactElement] = js.native
  
  val className: js.UndefOr[String] = js.native
  
  val color: js.UndefOr[String] = js.native
  
  val componentRef: js.UndefOr[IRefObject[ICheckbox]] = js.native
  
  val contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  
  val contextMenu: js.UndefOr[String] = js.native
  
  val dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  
  val datatype: js.UndefOr[String] = js.native
  
  val defaultChecked: js.UndefOr[Boolean] = js.native
  
  val defaultIndeterminate: js.UndefOr[Boolean] = js.native
  
  val defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  
  val dir: js.UndefOr[String] = js.native
  
  val disabled: js.UndefOr[Boolean] = js.native
  
  val draggable: js.UndefOr[Booleanish] = js.native
  
  val form: js.UndefOr[String] = js.native
  
  val formAction: js.UndefOr[String] = js.native
  
  val formEncType: js.UndefOr[String] = js.native
  
  val formMethod: js.UndefOr[String] = js.native
  
  val formNoValidate: js.UndefOr[Boolean] = js.native
  
  val formTarget: js.UndefOr[String] = js.native
  
  val hidden: js.UndefOr[Boolean] = js.native
  
  val id: js.UndefOr[String] = js.native
  
  val indeterminate: js.UndefOr[Boolean] = js.native
  
  val inlist: js.UndefOr[js.Any] = js.native
  
  val inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  
  val inputProps: js.UndefOr[ButtonHTMLAttributes[HTMLElement | HTMLButtonElement]] = js.native
  
  val is: js.UndefOr[String] = js.native
  
  val itemID: js.UndefOr[String] = js.native
  
  val itemProp: js.UndefOr[String] = js.native
  
  val itemRef: js.UndefOr[String] = js.native
  
  val itemScope: js.UndefOr[Boolean] = js.native
  
  val itemType: js.UndefOr[String] = js.native
  
  val keytipProps: js.UndefOr[IKeytipProps] = js.native
  
  val label: js.UndefOr[String] = js.native
  
  val lang: js.UndefOr[String] = js.native
  
  val name: js.UndefOr[String] = js.native
  
  val onAbort: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onAuxClick: js.UndefOr[MouseEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onBeforeInput: js.UndefOr[FormEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onBlur: js.UndefOr[FocusEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onCanPlay: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onChange: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event]], 
      /* checked */ js.UndefOr[Boolean], 
      scala.Unit
    ]
  ] = js.native
  
  val onClick: js.UndefOr[MouseEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onCopy: js.UndefOr[ClipboardEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onCut: js.UndefOr[ClipboardEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onDoubleClick: js.UndefOr[MouseEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onDrag: js.UndefOr[DragEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onDragEnd: js.UndefOr[DragEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onDragEnter: js.UndefOr[DragEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onDragExit: js.UndefOr[DragEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onDragLeave: js.UndefOr[DragEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onDragOver: js.UndefOr[DragEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onDragStart: js.UndefOr[DragEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onDrop: js.UndefOr[DragEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onDurationChange: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onEmptied: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onEncrypted: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onEnded: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onError: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onFocus: js.UndefOr[FocusEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onInput: js.UndefOr[FormEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onInvalid: js.UndefOr[FormEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onLoad: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onLoadStart: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onLoadedData: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onMouseDown: js.UndefOr[MouseEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onMouseMove: js.UndefOr[MouseEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onMouseOut: js.UndefOr[MouseEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onMouseOver: js.UndefOr[MouseEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onMouseUp: js.UndefOr[MouseEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onPaste: js.UndefOr[ClipboardEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onPause: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onPlay: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onPlaying: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onPointerCancel: js.UndefOr[PointerEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onPointerDown: js.UndefOr[PointerEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onPointerEnter: js.UndefOr[PointerEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onPointerLeave: js.UndefOr[PointerEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onPointerMove: js.UndefOr[PointerEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onPointerOut: js.UndefOr[PointerEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onPointerOver: js.UndefOr[PointerEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onPointerUp: js.UndefOr[PointerEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onProgress: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onRateChange: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onRenderLabel: js.UndefOr[IRenderFunction[ICheckboxProps]] = js.native
  
  val onReset: js.UndefOr[FormEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onScroll: js.UndefOr[UIEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onSeeked: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onSeeking: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onSelect: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onStalled: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onSubmit: js.UndefOr[FormEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onSuspend: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onTouchCancel: js.UndefOr[TouchEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onTouchEnd: js.UndefOr[TouchEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onVolumeChange: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onWaiting: js.UndefOr[ReactEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val onWheel: js.UndefOr[WheelEventHandler[HTMLElement | HTMLInputElement]] = js.native
  
  val placeholder: js.UndefOr[String] = js.native
  
  val prefix: js.UndefOr[String] = js.native
  
  val property: js.UndefOr[String] = js.native
  
  val radioGroup: js.UndefOr[String] = js.native
  
  val resource: js.UndefOr[String] = js.native
  
  val results: js.UndefOr[Double] = js.native
  
  val role: js.UndefOr[String] = js.native
  
  val security: js.UndefOr[String] = js.native
  
  val slot: js.UndefOr[String] = js.native
  
  val spellCheck: js.UndefOr[Booleanish] = js.native
  
  val style: js.UndefOr[CSSProperties] = js.native
  
  val styles: js.UndefOr[IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]] = js.native
  
  val suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  
  val suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  
  val tabIndex: js.UndefOr[Double] = js.native
  
  val theme: js.UndefOr[ITheme] = js.native
  
  val title: js.UndefOr[String] = js.native
  
  val translate: js.UndefOr[yes | no] = js.native
  
  val `type`: js.UndefOr[submit | reset | button] = js.native
  
  val typeof: js.UndefOr[String] = js.native
  
  val unselectable: js.UndefOr[on | off] = js.native
  
  val value: js.UndefOr[String | js.Array[String] | Double] = js.native
  
  val vocab: js.UndefOr[String] = js.native
}
object ReadonlyICheckboxProps {
  
  @scala.inline
  def apply(): ReadonlyICheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyICheckboxProps]
  }
  
  @scala.inline
  implicit class ReadonlyICheckboxPropsOps[Self <: ReadonlyICheckboxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbout(value: String): Self = this.set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    
    @scala.inline
    def `setAria-colcount`(value: Double): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    
    @scala.inline
    def `setAria-colindex`(value: Double): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    
    @scala.inline
    def `setAria-colspan`(value: Double): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    
    @scala.inline
    def `setAria-controls`(value: String): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-details`(value: String): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    
    @scala.inline
    def `setAria-flowto`(value: String): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    
    @scala.inline
    def `setAria-level`(value: Double): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    
    @scala.inline
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    
    @scala.inline
    def `setAria-placeholder`(value: String): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    
    @scala.inline
    def `setAria-posinset`(value: Double): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    
    @scala.inline
    def `setAria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    
    @scala.inline
    def `setAria-required`(value: Boolean): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    
    @scala.inline
    def `setAria-roledescription`(value: String): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    
    @scala.inline
    def `setAria-setsize`(value: Double): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    
    @scala.inline
    def `setAria-valuetext`(value: String): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    
    @scala.inline
    def setAriaDescribedBy(value: String): Self = this.set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDescribedBy: Self = this.set("ariaDescribedBy", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    
    @scala.inline
    def setAriaPositionInSet(value: Double): Self = this.set("ariaPositionInSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaPositionInSet: Self = this.set("ariaPositionInSet", js.undefined)
    
    @scala.inline
    def setAriaSetSize(value: Double): Self = this.set("ariaSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaSetSize: Self = this.set("ariaSetSize", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: String): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: String): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setAutoSave(value: String): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    
    @scala.inline
    def setBoxSide(value: start | end): Self = this.set("boxSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxSide: Self = this.set("boxSide", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setCheckmarkIconProps(value: IIconProps): Self = this.set("checkmarkIconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckmarkIconProps: Self = this.set("checkmarkIconProps", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ICheckbox | Null => scala.Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRefRefObject(value: ReactRef[ICheckbox]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRef(value: IRefObject[ICheckbox]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    
    @scala.inline
    def setDefaultChecked(value: Boolean): Self = this.set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultChecked: Self = this.set("defaultChecked", js.undefined)
    
    @scala.inline
    def setDefaultIndeterminate(value: Boolean): Self = this.set("defaultIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultIndeterminate: Self = this.set("defaultIndeterminate", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: String | Double | js.Array[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDraggable(value: Booleanish): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setFormAction(value: String): Self = this.set("formAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormAction: Self = this.set("formAction", js.undefined)
    
    @scala.inline
    def setFormEncType(value: String): Self = this.set("formEncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormEncType: Self = this.set("formEncType", js.undefined)
    
    @scala.inline
    def setFormMethod(value: String): Self = this.set("formMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormMethod: Self = this.set("formMethod", js.undefined)
    
    @scala.inline
    def setFormNoValidate(value: Boolean): Self = this.set("formNoValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormNoValidate: Self = this.set("formNoValidate", js.undefined)
    
    @scala.inline
    def setFormTarget(value: String): Self = this.set("formTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormTarget: Self = this.set("formTarget", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndeterminate(value: Boolean): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndeterminate: Self = this.set("indeterminate", js.undefined)
    
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    
    @scala.inline
    def setInputProps(value: ButtonHTMLAttributes[HTMLElement | HTMLButtonElement]): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    
    @scala.inline
    def setItemID(value: String): Self = this.set("itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemID: Self = this.set("itemID", js.undefined)
    
    @scala.inline
    def setItemProp(value: String): Self = this.set("itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemProp: Self = this.set("itemProp", js.undefined)
    
    @scala.inline
    def setItemRef(value: String): Self = this.set("itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemRef: Self = this.set("itemRef", js.undefined)
    
    @scala.inline
    def setItemScope(value: Boolean): Self = this.set("itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemScope: Self = this.set("itemScope", js.undefined)
    
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    
    @scala.inline
    def setKeytipProps(value: IKeytipProps): Self = this.set("keytipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeytipProps: Self = this.set("keytipProps", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnAbort(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: SyntheticAnimationEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: SyntheticAnimationEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: SyntheticAnimationEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAuxClick(value: SyntheticMouseEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", js.undefined)
    
    @scala.inline
    def setOnBeforeInput(value: SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event] => scala.Unit): Self = this.set("onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticFocusEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* ev */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event]], /* checked */ js.UndefOr[Boolean]) => scala.Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: SyntheticMouseEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnCopy(value: SyntheticClipboardEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    
    @scala.inline
    def setOnCut(value: SyntheticClipboardEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: SyntheticMouseEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDrag(value: DragEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: DragEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: DragEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: DragEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: DragEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: DragEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: DragEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDrop(value: DragEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEnded(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    
    @scala.inline
    def setOnError(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnInput(value: SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event] => scala.Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event] => scala.Unit): Self = this.set("onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnLoad(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: SyntheticMouseEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: SyntheticMouseEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: SyntheticMouseEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnPaste(value: SyntheticClipboardEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    
    @scala.inline
    def setOnPause(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: SyntheticPointerEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: SyntheticPointerEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: SyntheticPointerEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: SyntheticPointerEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: SyntheticPointerEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: SyntheticPointerEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: SyntheticPointerEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: SyntheticPointerEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    
    @scala.inline
    def setOnProgress(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    
    @scala.inline
    def setOnRenderLabel(
      value: (/* props */ js.UndefOr[ICheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ICheckboxProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = this.set("onRenderLabel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderLabel: Self = this.set("onRenderLabel", js.undefined)
    
    @scala.inline
    def setOnReset(value: SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event] => scala.Unit): Self = this.set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    
    @scala.inline
    def setOnScroll(value: SyntheticUIEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnStalled(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event] => scala.Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: SyntheticTouchEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticTouchEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: SyntheticTouchEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: SyntheticTransitionEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[Event, HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    
    @scala.inline
    def setOnWheel(value: SyntheticWheelEvent[HTMLElement | HTMLInputElement] => scala.Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setRadioGroup(value: String): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSecurity(value: String): Self = this.set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Booleanish): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: ICheckboxStyleProps => DeepPartial[ICheckboxStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setSuppressContentEditableWarning(value: Boolean): Self = this.set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressContentEditableWarning: Self = this.set("suppressContentEditableWarning", js.undefined)
    
    @scala.inline
    def setSuppressHydrationWarning(value: Boolean): Self = this.set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressHydrationWarning: Self = this.set("suppressHydrationWarning", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTranslate(value: yes | no): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setType(value: submit | reset | button): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeof(value: String): Self = this.set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", js.undefined)
    
    @scala.inline
    def setUnselectable(value: on | off): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVocab(value: String): Self = this.set("vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
  }
}
