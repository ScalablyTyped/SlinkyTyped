package typingsSlinky.officeUiFabricReact.anon

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
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
import typingsSlinky.officeUiFabricReact.focusTrapZoneTypesMod.IFocusTrapZoneProps
import typingsSlinky.officeUiFabricReact.layerTypesMod.ILayerProps
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
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.copy
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.date
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.decimal
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.descending
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.dialog
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.email
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
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.search
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.spelling
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.step
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.tel
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.text
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.time
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.tree
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.url
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.vertical
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.yes
import typingsSlinky.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typingsSlinky.officeUiFabricReact.panelBaseMod.PanelBase
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanel
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanelHeaderRenderer
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanelProps
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanelStyleProps
import typingsSlinky.officeUiFabricReact.panelTypesMod.IPanelStyles
import typingsSlinky.officeUiFabricReact.panelTypesMod.PanelType
import typingsSlinky.officeUiFabricReact.popupTypesMod.IPopupProps
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
import typingsSlinky.react.mod.HTMLAttributes
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Panel/Panel.types.IPanelProps> */
@js.native
trait ReadonlyIPanelProps extends StObject {
  
  val about: js.UndefOr[String] = js.native
  
  val accessKey: js.UndefOr[String] = js.native
  
  val allowTouchBodyScroll: js.UndefOr[Boolean] = js.native
  
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
  
  val autoCapitalize: js.UndefOr[String] = js.native
  
  val autoCorrect: js.UndefOr[String] = js.native
  
  val autoSave: js.UndefOr[String] = js.native
  
  val children: js.UndefOr[ReactElement] = js.native
  
  val className: js.UndefOr[String] = js.native
  
  val closeButtonAriaLabel: js.UndefOr[String] = js.native
  
  val color: js.UndefOr[String] = js.native
  
  val componentId: js.UndefOr[String] = js.native
  
  val componentRef: js.UndefOr[IRefObject[IPanel]] = js.native
  
  val contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  
  val contextMenu: js.UndefOr[String] = js.native
  
  val customWidth: js.UndefOr[String] = js.native
  
  val dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  
  val datatype: js.UndefOr[String] = js.native
  
  val defaultChecked: js.UndefOr[Boolean] = js.native
  
  val defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  
  val dir: js.UndefOr[String] = js.native
  
  val draggable: js.UndefOr[Booleanish] = js.native
  
  val elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.native
  
  val firstFocusableSelector: js.UndefOr[String] = js.native
  
  val focusTrapZoneProps: js.UndefOr[IFocusTrapZoneProps] = js.native
  
  val forceFocusInsideTrap: js.UndefOr[Boolean] = js.native
  
  val hasCloseButton: js.UndefOr[Boolean] = js.native
  
  val headerClassName: js.UndefOr[String] = js.native
  
  val headerText: js.UndefOr[String] = js.native
  
  val headerTextProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  
  val hidden: js.UndefOr[Boolean] = js.native
  
  val id: js.UndefOr[String] = js.native
  
  val ignoreExternalFocusing: js.UndefOr[Boolean] = js.native
  
  val inlist: js.UndefOr[js.Any] = js.native
  
  val inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  
  val is: js.UndefOr[String] = js.native
  
  val isBlocking: js.UndefOr[Boolean] = js.native
  
  val isFooterAtBottom: js.UndefOr[Boolean] = js.native
  
  val isHiddenOnDismiss: js.UndefOr[Boolean] = js.native
  
  val isLightDismiss: js.UndefOr[Boolean] = js.native
  
  val isOpen: js.UndefOr[Boolean] = js.native
  
  val itemID: js.UndefOr[String] = js.native
  
  val itemProp: js.UndefOr[String] = js.native
  
  val itemRef: js.UndefOr[String] = js.native
  
  val itemScope: js.UndefOr[Boolean] = js.native
  
  val itemType: js.UndefOr[String] = js.native
  
  val lang: js.UndefOr[String] = js.native
  
  val layerProps: js.UndefOr[ILayerProps] = js.native
  
  val onAbort: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onAnimationEnd: js.UndefOr[AnimationEventHandler[PanelBase]] = js.native
  
  val onAnimationIteration: js.UndefOr[AnimationEventHandler[PanelBase]] = js.native
  
  val onAnimationStart: js.UndefOr[AnimationEventHandler[PanelBase]] = js.native
  
  val onAuxClick: js.UndefOr[MouseEventHandler[PanelBase]] = js.native
  
  val onBeforeInput: js.UndefOr[FormEventHandler[PanelBase]] = js.native
  
  val onBlur: js.UndefOr[FocusEventHandler[PanelBase]] = js.native
  
  val onCanPlay: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onCanPlayThrough: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onChange: js.UndefOr[FormEventHandler[PanelBase]] = js.native
  
  val onClick: js.UndefOr[MouseEventHandler[PanelBase]] = js.native
  
  val onCompositionEnd: js.UndefOr[CompositionEventHandler[PanelBase]] = js.native
  
  val onCompositionStart: js.UndefOr[CompositionEventHandler[PanelBase]] = js.native
  
  val onCompositionUpdate: js.UndefOr[CompositionEventHandler[PanelBase]] = js.native
  
  val onContextMenu: js.UndefOr[MouseEventHandler[PanelBase]] = js.native
  
  val onCopy: js.UndefOr[ClipboardEventHandler[PanelBase]] = js.native
  
  val onCut: js.UndefOr[ClipboardEventHandler[PanelBase]] = js.native
  
  val onDismiss: js.UndefOr[
    js.Function1[/* ev */ js.UndefOr[SyntheticEvent[Event, HTMLElement]], scala.Unit]
  ] = js.native
  
  val onDismissed: js.UndefOr[js.Function0[scala.Unit]] = js.native
  
  val onDoubleClick: js.UndefOr[MouseEventHandler[PanelBase]] = js.native
  
  val onDrag: js.UndefOr[DragEventHandler[PanelBase]] = js.native
  
  val onDragEnd: js.UndefOr[DragEventHandler[PanelBase]] = js.native
  
  val onDragEnter: js.UndefOr[DragEventHandler[PanelBase]] = js.native
  
  val onDragExit: js.UndefOr[DragEventHandler[PanelBase]] = js.native
  
  val onDragLeave: js.UndefOr[DragEventHandler[PanelBase]] = js.native
  
  val onDragOver: js.UndefOr[DragEventHandler[PanelBase]] = js.native
  
  val onDragStart: js.UndefOr[DragEventHandler[PanelBase]] = js.native
  
  val onDrop: js.UndefOr[DragEventHandler[PanelBase]] = js.native
  
  val onDurationChange: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onEmptied: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onEncrypted: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onEnded: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onError: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onFocus: js.UndefOr[FocusEventHandler[PanelBase]] = js.native
  
  val onInput: js.UndefOr[FormEventHandler[PanelBase]] = js.native
  
  val onInvalid: js.UndefOr[FormEventHandler[PanelBase]] = js.native
  
  val onKeyDown: js.UndefOr[KeyboardEventHandler[PanelBase]] = js.native
  
  val onKeyPress: js.UndefOr[KeyboardEventHandler[PanelBase]] = js.native
  
  val onKeyUp: js.UndefOr[KeyboardEventHandler[PanelBase]] = js.native
  
  val onLightDismissClick: js.UndefOr[js.Function0[scala.Unit]] = js.native
  
  val onLoad: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onLoadStart: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onLoadedData: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onLoadedMetadata: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onMouseDown: js.UndefOr[MouseEventHandler[PanelBase]] = js.native
  
  val onMouseEnter: js.UndefOr[MouseEventHandler[PanelBase]] = js.native
  
  val onMouseLeave: js.UndefOr[MouseEventHandler[PanelBase]] = js.native
  
  val onMouseMove: js.UndefOr[MouseEventHandler[PanelBase]] = js.native
  
  val onMouseOut: js.UndefOr[MouseEventHandler[PanelBase]] = js.native
  
  val onMouseOver: js.UndefOr[MouseEventHandler[PanelBase]] = js.native
  
  val onMouseUp: js.UndefOr[MouseEventHandler[PanelBase]] = js.native
  
  val onOpen: js.UndefOr[js.Function0[scala.Unit]] = js.native
  
  val onOpened: js.UndefOr[js.Function0[scala.Unit]] = js.native
  
  val onOuterClick: js.UndefOr[js.Function0[scala.Unit]] = js.native
  
  val onPaste: js.UndefOr[ClipboardEventHandler[PanelBase]] = js.native
  
  val onPause: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onPlay: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onPlaying: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onPointerCancel: js.UndefOr[PointerEventHandler[PanelBase]] = js.native
  
  val onPointerDown: js.UndefOr[PointerEventHandler[PanelBase]] = js.native
  
  val onPointerEnter: js.UndefOr[PointerEventHandler[PanelBase]] = js.native
  
  val onPointerLeave: js.UndefOr[PointerEventHandler[PanelBase]] = js.native
  
  val onPointerMove: js.UndefOr[PointerEventHandler[PanelBase]] = js.native
  
  val onPointerOut: js.UndefOr[PointerEventHandler[PanelBase]] = js.native
  
  val onPointerOver: js.UndefOr[PointerEventHandler[PanelBase]] = js.native
  
  val onPointerUp: js.UndefOr[PointerEventHandler[PanelBase]] = js.native
  
  val onProgress: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onRateChange: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onRenderBody: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  
  val onRenderFooter: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  
  val onRenderFooterContent: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  
  val onRenderHeader: js.UndefOr[IPanelHeaderRenderer] = js.native
  
  val onRenderNavigation: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  
  val onRenderNavigationContent: js.UndefOr[IRenderFunction[IPanelProps]] = js.native
  
  val onReset: js.UndefOr[FormEventHandler[PanelBase]] = js.native
  
  val onScroll: js.UndefOr[UIEventHandler[PanelBase]] = js.native
  
  val onSeeked: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onSeeking: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onSelect: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onStalled: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onSubmit: js.UndefOr[FormEventHandler[PanelBase]] = js.native
  
  val onSuspend: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onTimeUpdate: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onTouchCancel: js.UndefOr[TouchEventHandler[PanelBase]] = js.native
  
  val onTouchEnd: js.UndefOr[TouchEventHandler[PanelBase]] = js.native
  
  val onTouchMove: js.UndefOr[TouchEventHandler[PanelBase]] = js.native
  
  val onTouchStart: js.UndefOr[TouchEventHandler[PanelBase]] = js.native
  
  val onTransitionEnd: js.UndefOr[TransitionEventHandler[PanelBase]] = js.native
  
  val onVolumeChange: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onWaiting: js.UndefOr[ReactEventHandler[PanelBase]] = js.native
  
  val onWheel: js.UndefOr[WheelEventHandler[PanelBase]] = js.native
  
  val overlayProps: js.UndefOr[IOverlayProps] = js.native
  
  val placeholder: js.UndefOr[String] = js.native
  
  val popupProps: js.UndefOr[IPopupProps] = js.native
  
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
  
  val styles: js.UndefOr[IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]] = js.native
  
  val suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  
  val suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  
  val tabIndex: js.UndefOr[Double] = js.native
  
  val theme: js.UndefOr[ITheme] = js.native
  
  val title: js.UndefOr[String] = js.native
  
  val translate: js.UndefOr[yes | no] = js.native
  
  val `type`: js.UndefOr[PanelType] = js.native
  
  val typeof: js.UndefOr[String] = js.native
  
  val unselectable: js.UndefOr[on | off] = js.native
  
  val vocab: js.UndefOr[String] = js.native
}
object ReadonlyIPanelProps {
  
  @scala.inline
  def apply(): ReadonlyIPanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyIPanelProps]
  }
  
  @scala.inline
  implicit class ReadonlyIPanelPropsMutableBuilder[Self <: ReadonlyIPanelProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    @scala.inline
    def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    @scala.inline
    def setAllowTouchBodyScroll(value: Boolean): Self = StObject.set(x, "allowTouchBodyScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTouchBodyScrollUndefined: Self = StObject.set(x, "allowTouchBodyScroll", js.undefined)
    
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
    def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
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
    def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
    
    @scala.inline
    def setComponentRef(value: IRefObject[IPanel]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IPanel | Null => scala.Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRefRefObject(value: ReactRef[IPanel]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    @scala.inline
    def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    @scala.inline
    def setCustomWidth(value: String): Self = StObject.set(x, "customWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomWidthUndefined: Self = StObject.set(x, "customWidth", js.undefined)
    
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
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setElementToFocusOnDismiss(value: HTMLElement): Self = StObject.set(x, "elementToFocusOnDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementToFocusOnDismissUndefined: Self = StObject.set(x, "elementToFocusOnDismiss", js.undefined)
    
    @scala.inline
    def setFirstFocusableSelector(value: String): Self = StObject.set(x, "firstFocusableSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstFocusableSelectorUndefined: Self = StObject.set(x, "firstFocusableSelector", js.undefined)
    
    @scala.inline
    def setFocusTrapZoneProps(value: IFocusTrapZoneProps): Self = StObject.set(x, "focusTrapZoneProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusTrapZonePropsUndefined: Self = StObject.set(x, "focusTrapZoneProps", js.undefined)
    
    @scala.inline
    def setForceFocusInsideTrap(value: Boolean): Self = StObject.set(x, "forceFocusInsideTrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceFocusInsideTrapUndefined: Self = StObject.set(x, "forceFocusInsideTrap", js.undefined)
    
    @scala.inline
    def setHasCloseButton(value: Boolean): Self = StObject.set(x, "hasCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCloseButtonUndefined: Self = StObject.set(x, "hasCloseButton", js.undefined)
    
    @scala.inline
    def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
    
    @scala.inline
    def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTextProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "headerTextProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTextPropsUndefined: Self = StObject.set(x, "headerTextProps", js.undefined)
    
    @scala.inline
    def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIgnoreExternalFocusing(value: Boolean): Self = StObject.set(x, "ignoreExternalFocusing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreExternalFocusingUndefined: Self = StObject.set(x, "ignoreExternalFocusing", js.undefined)
    
    @scala.inline
    def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
    @scala.inline
    def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBlocking(value: Boolean): Self = StObject.set(x, "isBlocking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBlockingUndefined: Self = StObject.set(x, "isBlocking", js.undefined)
    
    @scala.inline
    def setIsFooterAtBottom(value: Boolean): Self = StObject.set(x, "isFooterAtBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFooterAtBottomUndefined: Self = StObject.set(x, "isFooterAtBottom", js.undefined)
    
    @scala.inline
    def setIsHiddenOnDismiss(value: Boolean): Self = StObject.set(x, "isHiddenOnDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHiddenOnDismissUndefined: Self = StObject.set(x, "isHiddenOnDismiss", js.undefined)
    
    @scala.inline
    def setIsLightDismiss(value: Boolean): Self = StObject.set(x, "isLightDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLightDismissUndefined: Self = StObject.set(x, "isLightDismiss", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
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
    def setLayerProps(value: ILayerProps): Self = StObject.set(x, "layerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerPropsUndefined: Self = StObject.set(x, "layerProps", js.undefined)
    
    @scala.inline
    def setOnAbort(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: SyntheticAnimationEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: SyntheticAnimationEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: SyntheticAnimationEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAuxClick(value: SyntheticMouseEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    @scala.inline
    def setOnBeforeInput(value: SyntheticEvent[EventTarget with PanelBase, Event] => scala.Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticFocusEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    @scala.inline
    def setOnChange(value: SyntheticEvent[EventTarget with PanelBase, Event] => scala.Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: SyntheticCompositionEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: SyntheticCompositionEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: SyntheticCompositionEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: SyntheticMouseEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnCopy(value: SyntheticClipboardEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    @scala.inline
    def setOnCut(value: SyntheticClipboardEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: /* ev */ js.UndefOr[SyntheticEvent[Event, HTMLElement]] => scala.Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    @scala.inline
    def setOnDismissed(value: () => scala.Unit): Self = StObject.set(x, "onDismissed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDismissedUndefined: Self = StObject.set(x, "onDismissed", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: SyntheticMouseEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDrag(value: DragEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnd(value: DragEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: DragEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: DragEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: DragEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: DragEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: DragEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    @scala.inline
    def setOnDrop(value: DragEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEnded(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    @scala.inline
    def setOnError(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnInput(value: SyntheticEvent[EventTarget with PanelBase, Event] => scala.Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: SyntheticEvent[EventTarget with PanelBase, Event] => scala.Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: SyntheticKeyboardEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: SyntheticKeyboardEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnLightDismissClick(value: () => scala.Unit): Self = StObject.set(x, "onLightDismissClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLightDismissClickUndefined: Self = StObject.set(x, "onLightDismissClick", js.undefined)
    
    @scala.inline
    def setOnLoad(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: SyntheticMouseEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: SyntheticMouseEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: SyntheticMouseEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => scala.Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    @scala.inline
    def setOnOpened(value: () => scala.Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
    
    @scala.inline
    def setOnOuterClick(value: () => scala.Unit): Self = StObject.set(x, "onOuterClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOuterClickUndefined: Self = StObject.set(x, "onOuterClick", js.undefined)
    
    @scala.inline
    def setOnPaste(value: SyntheticClipboardEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    @scala.inline
    def setOnPause(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: SyntheticPointerEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: SyntheticPointerEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: SyntheticPointerEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: SyntheticPointerEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: SyntheticPointerEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: SyntheticPointerEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: SyntheticPointerEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: SyntheticPointerEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    @scala.inline
    def setOnProgress(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    @scala.inline
    def setOnRenderBody(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = StObject.set(x, "onRenderBody", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderBodyUndefined: Self = StObject.set(x, "onRenderBody", js.undefined)
    
    @scala.inline
    def setOnRenderFooter(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = StObject.set(x, "onRenderFooter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderFooterContent(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = StObject.set(x, "onRenderFooterContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderFooterContentUndefined: Self = StObject.set(x, "onRenderFooterContent", js.undefined)
    
    @scala.inline
    def setOnRenderFooterUndefined: Self = StObject.set(x, "onRenderFooter", js.undefined)
    
    @scala.inline
    def setOnRenderHeader(value: IPanelHeaderRenderer): Self = StObject.set(x, "onRenderHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRenderHeaderUndefined: Self = StObject.set(x, "onRenderHeader", js.undefined)
    
    @scala.inline
    def setOnRenderNavigation(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = StObject.set(x, "onRenderNavigation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderNavigationContent(
      value: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = StObject.set(x, "onRenderNavigationContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderNavigationContentUndefined: Self = StObject.set(x, "onRenderNavigationContent", js.undefined)
    
    @scala.inline
    def setOnRenderNavigationUndefined: Self = StObject.set(x, "onRenderNavigation", js.undefined)
    
    @scala.inline
    def setOnReset(value: SyntheticEvent[EventTarget with PanelBase, Event] => scala.Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    @scala.inline
    def setOnScroll(value: SyntheticUIEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOnStalled(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: SyntheticEvent[EventTarget with PanelBase, Event] => scala.Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: SyntheticTouchEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticTouchEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: SyntheticTouchEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: SyntheticTransitionEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[Event, PanelBase] => scala.Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    @scala.inline
    def setOnWheel(value: SyntheticWheelEvent[PanelBase] => scala.Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    @scala.inline
    def setOverlayProps(value: IOverlayProps): Self = StObject.set(x, "overlayProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayPropsUndefined: Self = StObject.set(x, "overlayProps", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPopupProps(value: IPopupProps): Self = StObject.set(x, "popupProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupPropsUndefined: Self = StObject.set(x, "popupProps", js.undefined)
    
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
    def setStyles(value: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesFunction1(value: IPanelStyleProps => DeepPartial[IPanelStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
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
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    @scala.inline
    def setType(value: PanelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
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
    def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
  }
}
