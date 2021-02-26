package typingsSlinky.preact.mod

import org.scalajs.dom.raw.DataTransfer
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLAreaElement
import org.scalajs.dom.raw.HTMLAudioElement
import org.scalajs.dom.raw.HTMLBRElement
import org.scalajs.dom.raw.HTMLBaseElement
import org.scalajs.dom.raw.HTMLBodyElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLDListElement
import org.scalajs.dom.raw.HTMLDataListElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLEmbedElement
import org.scalajs.dom.raw.HTMLFieldSetElement
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLHRElement
import org.scalajs.dom.raw.HTMLHeadElement
import org.scalajs.dom.raw.HTMLHeadingElement
import org.scalajs.dom.raw.HTMLHtmlElement
import org.scalajs.dom.raw.HTMLIFrameElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLLIElement
import org.scalajs.dom.raw.HTMLLabelElement
import org.scalajs.dom.raw.HTMLLegendElement
import org.scalajs.dom.raw.HTMLLinkElement
import org.scalajs.dom.raw.HTMLMapElement
import org.scalajs.dom.raw.HTMLMenuElement
import org.scalajs.dom.raw.HTMLMetaElement
import org.scalajs.dom.raw.HTMLModElement
import org.scalajs.dom.raw.HTMLOListElement
import org.scalajs.dom.raw.HTMLObjectElement
import org.scalajs.dom.raw.HTMLOptGroupElement
import org.scalajs.dom.raw.HTMLOptionElement
import org.scalajs.dom.raw.HTMLParagraphElement
import org.scalajs.dom.raw.HTMLParamElement
import org.scalajs.dom.raw.HTMLPreElement
import org.scalajs.dom.raw.HTMLProgressElement
import org.scalajs.dom.raw.HTMLQuoteElement
import org.scalajs.dom.raw.HTMLScriptElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.HTMLSourceElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.HTMLStyleElement
import org.scalajs.dom.raw.HTMLTableCaptionElement
import org.scalajs.dom.raw.HTMLTableCellElement
import org.scalajs.dom.raw.HTMLTableColElement
import org.scalajs.dom.raw.HTMLTableElement
import org.scalajs.dom.raw.HTMLTableRowElement
import org.scalajs.dom.raw.HTMLTableSectionElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import org.scalajs.dom.raw.HTMLTitleElement
import org.scalajs.dom.raw.HTMLTrackElement
import org.scalajs.dom.raw.HTMLUListElement
import org.scalajs.dom.raw.HTMLUnknownElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.SVGCircleElement
import org.scalajs.dom.raw.SVGClipPathElement
import org.scalajs.dom.raw.SVGDefsElement
import org.scalajs.dom.raw.SVGDescElement
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGEllipseElement
import org.scalajs.dom.raw.SVGFEBlendElement
import org.scalajs.dom.raw.SVGFEColorMatrixElement
import org.scalajs.dom.raw.SVGFEComponentTransferElement
import org.scalajs.dom.raw.SVGFECompositeElement
import org.scalajs.dom.raw.SVGFEConvolveMatrixElement
import org.scalajs.dom.raw.SVGFEDiffuseLightingElement
import org.scalajs.dom.raw.SVGFEDisplacementMapElement
import org.scalajs.dom.raw.SVGFEFloodElement
import org.scalajs.dom.raw.SVGFEGaussianBlurElement
import org.scalajs.dom.raw.SVGFEImageElement
import org.scalajs.dom.raw.SVGFEMergeElement
import org.scalajs.dom.raw.SVGFEMergeNodeElement
import org.scalajs.dom.raw.SVGFEMorphologyElement
import org.scalajs.dom.raw.SVGFEOffsetElement
import org.scalajs.dom.raw.SVGFESpecularLightingElement
import org.scalajs.dom.raw.SVGFETileElement
import org.scalajs.dom.raw.SVGFETurbulenceElement
import org.scalajs.dom.raw.SVGFilterElement
import org.scalajs.dom.raw.SVGGElement
import org.scalajs.dom.raw.SVGImageElement
import org.scalajs.dom.raw.SVGLineElement
import org.scalajs.dom.raw.SVGLinearGradientElement
import org.scalajs.dom.raw.SVGMarkerElement
import org.scalajs.dom.raw.SVGMaskElement
import org.scalajs.dom.raw.SVGPathElement
import org.scalajs.dom.raw.SVGPatternElement
import org.scalajs.dom.raw.SVGPolygonElement
import org.scalajs.dom.raw.SVGPolylineElement
import org.scalajs.dom.raw.SVGRadialGradientElement
import org.scalajs.dom.raw.SVGRectElement
import org.scalajs.dom.raw.SVGSVGElement
import org.scalajs.dom.raw.SVGStopElement
import org.scalajs.dom.raw.SVGSymbolElement
import org.scalajs.dom.raw.SVGTSpanElement
import org.scalajs.dom.raw.SVGTextElement
import org.scalajs.dom.raw.SVGUseElement
import org.scalajs.dom.raw.TouchList
import org.scalajs.dom.raw.Window
import typingsSlinky.preact.anon.CurrentTarget
import typingsSlinky.preact.anon.TargetedEventEventTargetE
import typingsSlinky.preact.jsxCsstypeMod.Properties
import typingsSlinky.preact.jsxMod.Defaultize
import typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes
import typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes
import typingsSlinky.preact.preactStrings.`after-edge`
import typingsSlinky.preact.preactStrings.`before-edge`
import typingsSlinky.preact.preactStrings.`lazy`
import typingsSlinky.preact.preactStrings.`text-after-edge`
import typingsSlinky.preact.preactStrings.`text-before-edge`
import typingsSlinky.preact.preactStrings.alphabetic
import typingsSlinky.preact.preactStrings.alternate
import typingsSlinky.preact.preactStrings.auto
import typingsSlinky.preact.preactStrings.baseline
import typingsSlinky.preact.preactStrings.bevel
import typingsSlinky.preact.preactStrings.butt
import typingsSlinky.preact.preactStrings.central
import typingsSlinky.preact.preactStrings.currentTarget
import typingsSlinky.preact.preactStrings.down
import typingsSlinky.preact.preactStrings.eager
import typingsSlinky.preact.preactStrings.evenodd
import typingsSlinky.preact.preactStrings.hanging
import typingsSlinky.preact.preactStrings.ideographic
import typingsSlinky.preact.preactStrings.inherit
import typingsSlinky.preact.preactStrings.initial
import typingsSlinky.preact.preactStrings.isolated
import typingsSlinky.preact.preactStrings.left
import typingsSlinky.preact.preactStrings.linearRGB
import typingsSlinky.preact.preactStrings.ltr
import typingsSlinky.preact.preactStrings.mathematical
import typingsSlinky.preact.preactStrings.medial
import typingsSlinky.preact.preactStrings.middle
import typingsSlinky.preact.preactStrings.miter
import typingsSlinky.preact.preactStrings.no
import typingsSlinky.preact.preactStrings.none
import typingsSlinky.preact.preactStrings.nonzero
import typingsSlinky.preact.preactStrings.replace
import typingsSlinky.preact.preactStrings.right
import typingsSlinky.preact.preactStrings.round
import typingsSlinky.preact.preactStrings.rtl
import typingsSlinky.preact.preactStrings.sRGB
import typingsSlinky.preact.preactStrings.scroll
import typingsSlinky.preact.preactStrings.slide
import typingsSlinky.preact.preactStrings.square
import typingsSlinky.preact.preactStrings.sum
import typingsSlinky.preact.preactStrings.terminal
import typingsSlinky.preact.preactStrings.up
import typingsSlinky.preact.preactStrings.yes
import typingsSlinky.std.HTMLDataElement
import typingsSlinky.std.HTMLDetailsElement
import typingsSlinky.std.HTMLDialogElement
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.HTMLMeterElement
import typingsSlinky.std.HTMLOutputElement
import typingsSlinky.std.HTMLPictureElement
import typingsSlinky.std.HTMLSlotElement
import typingsSlinky.std.HTMLTimeElement
import typingsSlinky.std.Omit
import typingsSlinky.std.Record
import typingsSlinky.std.SVGAnimateElement
import typingsSlinky.std.SVGFEDropShadowElement
import typingsSlinky.std.SVGForeignObjectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createElement {
  
  //
  // Preact createElement
  // -----------------------------------
  @JSImport("preact", "createElement")
  @js.native
  def apply(
    `type`: String,
    props: HTMLAttributes[EventTarget] with SVGAttributes[SVGElement] with (Record[String, _]),
    children: ComponentChildren*
  ): VNode[_] = js.native
  @JSImport("preact", "createElement")
  @js.native
  def apply(`type`: String, props: Null, children: ComponentChildren*): VNode[_] = js.native
  @JSImport("preact", "createElement")
  @js.native
  def apply[P](`type`: ComponentType[P], props: Attributes with P, children: ComponentChildren*): VNode[_] = js.native
  @JSImport("preact", "createElement")
  @js.native
  def apply[P](`type`: ComponentType[P], props: Null, children: ComponentChildren*): VNode[_] = js.native
  
  object JSX {
    
    type AnimationEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedAnimationEvent[Target]]
    
    type CSSProperties = Properties[String | Double]
    
    type ClipboardEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedClipboardEvent[Target]]
    
    type CompositionEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedCompositionEvent[Target]]
    
    @js.native
    trait DOMAttributes[Target /* <: EventTarget */] extends PreactDOMAttributes {
      
      // Media Events
      var onAbort: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onAbortCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onAnimationEnd: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.AnimationEventHandler[Target]] = js.native
      
      var onAnimationEndCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.AnimationEventHandler[Target]] = js.native
      
      var onAnimationIteration: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.AnimationEventHandler[Target]] = js.native
      
      var onAnimationIterationCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.AnimationEventHandler[Target]] = js.native
      
      // Animation Events
      var onAnimationStart: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.AnimationEventHandler[Target]] = js.native
      
      var onAnimationStartCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.AnimationEventHandler[Target]] = js.native
      
      var onBlur: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.FocusEventHandler[Target]] = js.native
      
      var onBlurCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.FocusEventHandler[Target]] = js.native
      
      var onCanPlay: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onCanPlayCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onCanPlayThrough: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onCanPlayThroughCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      // Form Events
      var onChange: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onChangeCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      // MouseEvents
      var onClick: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onClickCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      // Composition Events
      var onCompositionEnd: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.CompositionEventHandler[Target]] = js.native
      
      var onCompositionEndCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.CompositionEventHandler[Target]] = js.native
      
      var onCompositionStart: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.CompositionEventHandler[Target]] = js.native
      
      var onCompositionStartCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.CompositionEventHandler[Target]] = js.native
      
      var onCompositionUpdate: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.CompositionEventHandler[Target]] = js.native
      
      var onCompositionUpdateCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.CompositionEventHandler[Target]] = js.native
      
      var onContextMenu: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onContextMenuCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      // Clipboard Events
      var onCopy: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.ClipboardEventHandler[Target]] = js.native
      
      var onCopyCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.ClipboardEventHandler[Target]] = js.native
      
      var onCut: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.ClipboardEventHandler[Target]] = js.native
      
      var onCutCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.ClipboardEventHandler[Target]] = js.native
      
      var onDblClick: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onDblClickCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onDrag: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDragCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDragEnd: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDragEndCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDragEnter: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDragEnterCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDragExit: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDragExitCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDragLeave: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDragLeaveCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDragOver: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDragOverCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDragStart: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDragStartCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDrop: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDropCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]] = js.native
      
      var onDurationChange: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onDurationChangeCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onEmptied: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onEmptiedCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onEncrypted: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onEncryptedCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onEnded: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onEndedCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onError: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onErrorCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      // Focus Events
      var onFocus: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.FocusEventHandler[Target]] = js.native
      
      var onFocusCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.FocusEventHandler[Target]] = js.native
      
      var onFormData: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onFormDataCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onGotPointerCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onGotPointerCaptureCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onInput: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onInputCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onInvalid: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onInvalidCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      // Keyboard Events
      var onKeyDown: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.KeyboardEventHandler[Target]] = js.native
      
      var onKeyDownCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.KeyboardEventHandler[Target]] = js.native
      
      var onKeyPress: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.KeyboardEventHandler[Target]] = js.native
      
      var onKeyPressCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.KeyboardEventHandler[Target]] = js.native
      
      var onKeyUp: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.KeyboardEventHandler[Target]] = js.native
      
      var onKeyUpCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.KeyboardEventHandler[Target]] = js.native
      
      // Image Events
      var onLoad: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onLoadCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onLoadStart: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onLoadStartCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onLoadedData: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onLoadedDataCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onLoadedMetadata: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onLoadedMetadataCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onLostPointerCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onLostPointerCaptureCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onMouseDown: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onMouseDownCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onMouseEnter: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onMouseEnterCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onMouseLeave: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onMouseLeaveCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onMouseMove: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onMouseMoveCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onMouseOut: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onMouseOutCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onMouseOver: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onMouseOverCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onMouseUp: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onMouseUpCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]] = js.native
      
      var onPaste: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.ClipboardEventHandler[Target]] = js.native
      
      var onPasteCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.ClipboardEventHandler[Target]] = js.native
      
      var onPause: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onPauseCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onPlay: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onPlayCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onPlaying: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onPlayingCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onPointerCancel: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onPointerCancelCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onPointerDown: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onPointerDownCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onPointerEnter: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onPointerEnterCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onPointerLeave: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onPointerLeaveCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onPointerMove: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onPointerMoveCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onPointerOut: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onPointerOutCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      // Pointer Events
      var onPointerOver: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onPointerOverCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onPointerUp: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onPointerUpCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]] = js.native
      
      var onProgress: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onProgressCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onRateChange: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onRateChangeCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onReset: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onResetCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      // UI Events
      var onScroll: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.UIEventHandler[Target]] = js.native
      
      var onScrollCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.UIEventHandler[Target]] = js.native
      
      var onSearch: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onSearchCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onSeeked: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onSeekedCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onSeeking: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onSeekingCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      // Selection Events
      var onSelect: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onSelectCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onStalled: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onStalledCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onSubmit: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onSubmitCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onSuspend: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onSuspendCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onTimeUpdate: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onTimeUpdateCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      // Details Events
      var onToggle: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      // Touch Events
      var onTouchCancel: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]] = js.native
      
      var onTouchCancelCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]] = js.native
      
      var onTouchEnd: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]] = js.native
      
      var onTouchEndCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]] = js.native
      
      var onTouchMove: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]] = js.native
      
      var onTouchMoveCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]] = js.native
      
      var onTouchStart: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]] = js.native
      
      var onTouchStartCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]] = js.native
      
      // Transition Events
      var onTransitionEnd: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.TransitionEventHandler[Target]] = js.native
      
      var onTransitionEndCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.TransitionEventHandler[Target]] = js.native
      
      var onVolumeChange: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onVolumeChangeCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onWaiting: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      var onWaitingCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]] = js.native
      
      // Wheel Events
      var onWheel: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.WheelEventHandler[Target]] = js.native
      
      var onWheelCapture: js.UndefOr[typingsSlinky.preact.jsxMod.JSXInternal.WheelEventHandler[Target]] = js.native
    }
    object DOMAttributes {
      
      @scala.inline
      def apply[Target /* <: EventTarget */](): DOMAttributes[Target] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DOMAttributes[Target]]
      }
      
      @scala.inline
      implicit class DOMAttributesMutableBuilder[Self <: DOMAttributes[_], Target /* <: EventTarget */] (val x: Self with DOMAttributes[Target]) extends AnyVal {
        
        @scala.inline
        def setOnAbort(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnAbortCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onAbortCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
        
        @scala.inline
        def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
        
        @scala.inline
        def setOnAnimationEnd(value: typingsSlinky.preact.jsxMod.JSXInternal.AnimationEventHandler[Target]): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnAnimationEndCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.AnimationEventHandler[Target]): Self = StObject.set(x, "onAnimationEndCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
        
        @scala.inline
        def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
        
        @scala.inline
        def setOnAnimationIteration(value: typingsSlinky.preact.jsxMod.JSXInternal.AnimationEventHandler[Target]): Self = StObject.set(x, "onAnimationIteration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnAnimationIterationCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.AnimationEventHandler[Target]): Self = StObject.set(x, "onAnimationIterationCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
        
        @scala.inline
        def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
        
        @scala.inline
        def setOnAnimationStart(value: typingsSlinky.preact.jsxMod.JSXInternal.AnimationEventHandler[Target]): Self = StObject.set(x, "onAnimationStart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnAnimationStartCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.AnimationEventHandler[Target]): Self = StObject.set(x, "onAnimationStartCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
        
        @scala.inline
        def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
        
        @scala.inline
        def setOnBlur(value: typingsSlinky.preact.jsxMod.JSXInternal.FocusEventHandler[Target]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnBlurCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.FocusEventHandler[Target]): Self = StObject.set(x, "onBlurCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
        
        @scala.inline
        def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
        
        @scala.inline
        def setOnCanPlay(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onCanPlay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCanPlayCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onCanPlayCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
        
        @scala.inline
        def setOnCanPlayThrough(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onCanPlayThrough", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCanPlayThroughCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onCanPlayThroughCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
        
        @scala.inline
        def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
        
        @scala.inline
        def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
        
        @scala.inline
        def setOnChange(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnChangeCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onChangeCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
        
        @scala.inline
        def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
        
        @scala.inline
        def setOnClick(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnClickCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onClickCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
        
        @scala.inline
        def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
        
        @scala.inline
        def setOnCompositionEnd(value: typingsSlinky.preact.jsxMod.JSXInternal.CompositionEventHandler[Target]): Self = StObject.set(x, "onCompositionEnd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCompositionEndCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.CompositionEventHandler[Target]): Self = StObject.set(x, "onCompositionEndCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCompositionEndCaptureUndefined: Self = StObject.set(x, "onCompositionEndCapture", js.undefined)
        
        @scala.inline
        def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
        
        @scala.inline
        def setOnCompositionStart(value: typingsSlinky.preact.jsxMod.JSXInternal.CompositionEventHandler[Target]): Self = StObject.set(x, "onCompositionStart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCompositionStartCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.CompositionEventHandler[Target]): Self = StObject.set(x, "onCompositionStartCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCompositionStartCaptureUndefined: Self = StObject.set(x, "onCompositionStartCapture", js.undefined)
        
        @scala.inline
        def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
        
        @scala.inline
        def setOnCompositionUpdate(value: typingsSlinky.preact.jsxMod.JSXInternal.CompositionEventHandler[Target]): Self = StObject.set(x, "onCompositionUpdate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCompositionUpdateCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.CompositionEventHandler[Target]): Self = StObject.set(x, "onCompositionUpdateCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCompositionUpdateCaptureUndefined: Self = StObject.set(x, "onCompositionUpdateCapture", js.undefined)
        
        @scala.inline
        def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
        
        @scala.inline
        def setOnContextMenu(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnContextMenuCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onContextMenuCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
        
        @scala.inline
        def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
        
        @scala.inline
        def setOnCopy(value: typingsSlinky.preact.jsxMod.JSXInternal.ClipboardEventHandler[Target]): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCopyCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.ClipboardEventHandler[Target]): Self = StObject.set(x, "onCopyCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCopyCaptureUndefined: Self = StObject.set(x, "onCopyCapture", js.undefined)
        
        @scala.inline
        def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
        
        @scala.inline
        def setOnCut(value: typingsSlinky.preact.jsxMod.JSXInternal.ClipboardEventHandler[Target]): Self = StObject.set(x, "onCut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCutCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.ClipboardEventHandler[Target]): Self = StObject.set(x, "onCutCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCutCaptureUndefined: Self = StObject.set(x, "onCutCapture", js.undefined)
        
        @scala.inline
        def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
        
        @scala.inline
        def setOnDblClick(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onDblClick", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDblClickCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onDblClickCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDblClickCaptureUndefined: Self = StObject.set(x, "onDblClickCapture", js.undefined)
        
        @scala.inline
        def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
        
        @scala.inline
        def setOnDrag(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDragCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDragCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
        
        @scala.inline
        def setOnDragEnd(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDragEndCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDragEndCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
        
        @scala.inline
        def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
        
        @scala.inline
        def setOnDragEnter(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDragEnterCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDragEnterCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
        
        @scala.inline
        def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
        
        @scala.inline
        def setOnDragExit(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDragExit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDragExitCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDragExitCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
        
        @scala.inline
        def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
        
        @scala.inline
        def setOnDragLeave(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDragLeaveCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDragLeaveCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
        
        @scala.inline
        def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
        
        @scala.inline
        def setOnDragOver(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDragOverCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDragOverCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
        
        @scala.inline
        def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
        
        @scala.inline
        def setOnDragStart(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDragStartCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDragStartCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
        
        @scala.inline
        def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
        
        @scala.inline
        def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
        
        @scala.inline
        def setOnDrop(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDropCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.DragEventHandler[Target]): Self = StObject.set(x, "onDropCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
        
        @scala.inline
        def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
        
        @scala.inline
        def setOnDurationChange(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onDurationChange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDurationChangeCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onDurationChangeCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
        
        @scala.inline
        def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
        
        @scala.inline
        def setOnEmptied(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnEmptiedCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onEmptiedCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
        
        @scala.inline
        def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
        
        @scala.inline
        def setOnEncrypted(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onEncrypted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnEncryptedCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onEncryptedCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnEncryptedCaptureUndefined: Self = StObject.set(x, "onEncryptedCapture", js.undefined)
        
        @scala.inline
        def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
        
        @scala.inline
        def setOnEnded(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnEndedCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onEndedCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
        
        @scala.inline
        def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
        
        @scala.inline
        def setOnError(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnErrorCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onErrorCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
        
        @scala.inline
        def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
        
        @scala.inline
        def setOnFocus(value: typingsSlinky.preact.jsxMod.JSXInternal.FocusEventHandler[Target]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnFocusCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.FocusEventHandler[Target]): Self = StObject.set(x, "onFocusCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
        
        @scala.inline
        def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
        
        @scala.inline
        def setOnFormData(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onFormData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnFormDataCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onFormDataCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnFormDataCaptureUndefined: Self = StObject.set(x, "onFormDataCapture", js.undefined)
        
        @scala.inline
        def setOnFormDataUndefined: Self = StObject.set(x, "onFormData", js.undefined)
        
        @scala.inline
        def setOnGotPointerCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onGotPointerCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnGotPointerCaptureCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
        
        @scala.inline
        def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
        
        @scala.inline
        def setOnInput(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnInputCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onInputCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
        
        @scala.inline
        def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
        
        @scala.inline
        def setOnInvalid(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnInvalidCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onInvalidCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnInvalidCaptureUndefined: Self = StObject.set(x, "onInvalidCapture", js.undefined)
        
        @scala.inline
        def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
        
        @scala.inline
        def setOnKeyDown(value: typingsSlinky.preact.jsxMod.JSXInternal.KeyboardEventHandler[Target]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnKeyDownCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.KeyboardEventHandler[Target]): Self = StObject.set(x, "onKeyDownCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
        
        @scala.inline
        def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
        
        @scala.inline
        def setOnKeyPress(value: typingsSlinky.preact.jsxMod.JSXInternal.KeyboardEventHandler[Target]): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnKeyPressCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.KeyboardEventHandler[Target]): Self = StObject.set(x, "onKeyPressCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
        
        @scala.inline
        def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
        
        @scala.inline
        def setOnKeyUp(value: typingsSlinky.preact.jsxMod.JSXInternal.KeyboardEventHandler[Target]): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnKeyUpCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.KeyboardEventHandler[Target]): Self = StObject.set(x, "onKeyUpCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
        
        @scala.inline
        def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
        
        @scala.inline
        def setOnLoad(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnLoadCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onLoadCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
        
        @scala.inline
        def setOnLoadStart(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnLoadStartCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onLoadStartCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
        
        @scala.inline
        def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
        
        @scala.inline
        def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
        
        @scala.inline
        def setOnLoadedData(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onLoadedData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnLoadedDataCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onLoadedDataCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
        
        @scala.inline
        def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
        
        @scala.inline
        def setOnLoadedMetadata(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onLoadedMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnLoadedMetadataCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onLoadedMetadataCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
        
        @scala.inline
        def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
        
        @scala.inline
        def setOnLostPointerCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onLostPointerCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnLostPointerCaptureCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
        
        @scala.inline
        def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
        
        @scala.inline
        def setOnMouseDown(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseDownCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onMouseDownCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
        
        @scala.inline
        def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
        
        @scala.inline
        def setOnMouseEnter(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseEnterCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onMouseEnterCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseEnterCaptureUndefined: Self = StObject.set(x, "onMouseEnterCapture", js.undefined)
        
        @scala.inline
        def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
        
        @scala.inline
        def setOnMouseLeave(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseLeaveCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onMouseLeaveCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseLeaveCaptureUndefined: Self = StObject.set(x, "onMouseLeaveCapture", js.undefined)
        
        @scala.inline
        def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
        
        @scala.inline
        def setOnMouseMove(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseMoveCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onMouseMoveCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
        
        @scala.inline
        def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
        
        @scala.inline
        def setOnMouseOut(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseOutCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onMouseOutCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
        
        @scala.inline
        def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
        
        @scala.inline
        def setOnMouseOver(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseOverCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onMouseOverCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
        
        @scala.inline
        def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
        
        @scala.inline
        def setOnMouseUp(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseUpCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.MouseEventHandler[Target]): Self = StObject.set(x, "onMouseUpCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
        
        @scala.inline
        def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
        
        @scala.inline
        def setOnPaste(value: typingsSlinky.preact.jsxMod.JSXInternal.ClipboardEventHandler[Target]): Self = StObject.set(x, "onPaste", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPasteCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.ClipboardEventHandler[Target]): Self = StObject.set(x, "onPasteCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPasteCaptureUndefined: Self = StObject.set(x, "onPasteCapture", js.undefined)
        
        @scala.inline
        def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
        
        @scala.inline
        def setOnPause(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPauseCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onPauseCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
        
        @scala.inline
        def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
        
        @scala.inline
        def setOnPlay(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPlayCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onPlayCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
        
        @scala.inline
        def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
        
        @scala.inline
        def setOnPlaying(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPlayingCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onPlayingCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
        
        @scala.inline
        def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
        
        @scala.inline
        def setOnPointerCancel(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerCancelCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerCancelCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
        
        @scala.inline
        def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
        
        @scala.inline
        def setOnPointerDown(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerDownCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerDownCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
        
        @scala.inline
        def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
        
        @scala.inline
        def setOnPointerEnter(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerEnterCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerEnterCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
        
        @scala.inline
        def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
        
        @scala.inline
        def setOnPointerLeave(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerLeaveCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerLeaveCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
        
        @scala.inline
        def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
        
        @scala.inline
        def setOnPointerMove(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerMoveCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerMoveCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
        
        @scala.inline
        def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
        
        @scala.inline
        def setOnPointerOut(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerOut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerOutCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerOutCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
        
        @scala.inline
        def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
        
        @scala.inline
        def setOnPointerOver(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerOver", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerOverCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerOverCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
        
        @scala.inline
        def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
        
        @scala.inline
        def setOnPointerUp(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerUpCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.PointerEventHandler[Target]): Self = StObject.set(x, "onPointerUpCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
        
        @scala.inline
        def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
        
        @scala.inline
        def setOnProgress(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnProgressCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onProgressCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
        
        @scala.inline
        def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
        
        @scala.inline
        def setOnRateChange(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onRateChange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnRateChangeCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onRateChangeCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
        
        @scala.inline
        def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
        
        @scala.inline
        def setOnReset(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnResetCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onResetCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
        
        @scala.inline
        def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
        
        @scala.inline
        def setOnScroll(value: typingsSlinky.preact.jsxMod.JSXInternal.UIEventHandler[Target]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnScrollCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.UIEventHandler[Target]): Self = StObject.set(x, "onScrollCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
        
        @scala.inline
        def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
        
        @scala.inline
        def setOnSearch(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onSearch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnSearchCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onSearchCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnSearchCaptureUndefined: Self = StObject.set(x, "onSearchCapture", js.undefined)
        
        @scala.inline
        def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
        
        @scala.inline
        def setOnSeeked(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnSeekedCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onSeekedCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
        
        @scala.inline
        def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
        
        @scala.inline
        def setOnSeeking(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnSeekingCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onSeekingCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
        
        @scala.inline
        def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
        
        @scala.inline
        def setOnSelect(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnSelectCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onSelectCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
        
        @scala.inline
        def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
        
        @scala.inline
        def setOnStalled(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnStalledCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onStalledCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
        
        @scala.inline
        def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
        
        @scala.inline
        def setOnSubmit(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnSubmitCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onSubmitCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
        
        @scala.inline
        def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
        
        @scala.inline
        def setOnSuspend(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnSuspendCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onSuspendCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
        
        @scala.inline
        def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
        
        @scala.inline
        def setOnTimeUpdate(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onTimeUpdate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTimeUpdateCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onTimeUpdateCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
        
        @scala.inline
        def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
        
        @scala.inline
        def setOnToggle(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onToggle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
        
        @scala.inline
        def setOnTouchCancel(value: typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchCancelCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]): Self = StObject.set(x, "onTouchCancelCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
        
        @scala.inline
        def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
        
        @scala.inline
        def setOnTouchEnd(value: typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchEndCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
        
        @scala.inline
        def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
        
        @scala.inline
        def setOnTouchMove(value: typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchMoveCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]): Self = StObject.set(x, "onTouchMoveCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
        
        @scala.inline
        def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
        
        @scala.inline
        def setOnTouchStart(value: typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchStartCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.TouchEventHandler[Target]): Self = StObject.set(x, "onTouchStartCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
        
        @scala.inline
        def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
        
        @scala.inline
        def setOnTransitionEnd(value: typingsSlinky.preact.jsxMod.JSXInternal.TransitionEventHandler[Target]): Self = StObject.set(x, "onTransitionEnd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTransitionEndCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.TransitionEventHandler[Target]): Self = StObject.set(x, "onTransitionEndCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
        
        @scala.inline
        def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
        
        @scala.inline
        def setOnVolumeChange(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onVolumeChange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnVolumeChangeCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onVolumeChangeCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
        
        @scala.inline
        def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
        
        @scala.inline
        def setOnWaiting(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnWaitingCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.GenericEventHandler[Target]): Self = StObject.set(x, "onWaitingCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
        
        @scala.inline
        def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
        
        @scala.inline
        def setOnWheel(value: typingsSlinky.preact.jsxMod.JSXInternal.WheelEventHandler[Target]): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnWheelCapture(value: typingsSlinky.preact.jsxMod.JSXInternal.WheelEventHandler[Target]): Self = StObject.set(x, "onWheelCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
        
        @scala.inline
        def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      }
    }
    
    type DragEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedDragEvent[Target]]
    
    type Element = VNode[js.Any]
    
    @js.native
    trait ElementAttributesProperty extends StObject {
      
      var props: js.Any = js.native
    }
    object ElementAttributesProperty {
      
      @scala.inline
      def apply(props: js.Any): ElementAttributesProperty = {
        val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementAttributesProperty]
      }
      
      @scala.inline
      implicit class ElementAttributesPropertyMutableBuilder[Self <: ElementAttributesProperty] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ElementChildrenAttribute extends StObject {
      
      var children: js.Any = js.native
    }
    object ElementChildrenAttribute {
      
      @scala.inline
      def apply(children: js.Any): ElementChildrenAttribute = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementChildrenAttribute]
      }
      
      @scala.inline
      implicit class ElementChildrenAttributeMutableBuilder[Self <: ElementChildrenAttribute] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      }
    }
    
    type ElementClass = Component[js.Any, js.Any]
    
    type EventHandler[E /* <: TargetedEventEventTargetE */] = js.ThisFunction1[
        /* import warning: importer.ImportType#apply Failed type conversion: E['currentTarget'] */ /* this */ js.Any, 
        /* event */ E, 
        Unit
      ]
    
    type FocusEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedFocusEvent[Target]]
    
    type GenericEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedEvent[Target, Event]]
    
    @js.native
    trait HTMLAttributes[RefType /* <: EventTarget */]
      extends ClassAttributes[RefType]
         with typingsSlinky.preact.jsxMod.JSXInternal.DOMAttributes[RefType] {
      
      var default: js.UndefOr[Boolean] = js.native
      
      // RDFa Attributes
      var about: js.UndefOr[String] = js.native
      
      // Standard HTML Attributes
      var accept: js.UndefOr[String] = js.native
      
      var acceptCharset: js.UndefOr[String] = js.native
      
      var accessKey: js.UndefOr[String] = js.native
      
      var action: js.UndefOr[String] = js.native
      
      var allowFullScreen: js.UndefOr[Boolean] = js.native
      
      var allowTransparency: js.UndefOr[Boolean] = js.native
      
      var alt: js.UndefOr[String] = js.native
      
      var as: js.UndefOr[String] = js.native
      
      var async: js.UndefOr[Boolean] = js.native
      
      var autoComplete: js.UndefOr[String] = js.native
      
      var autoCorrect: js.UndefOr[String] = js.native
      
      var autoFocus: js.UndefOr[Boolean] = js.native
      
      var autoPlay: js.UndefOr[Boolean] = js.native
      
      var autocomplete: js.UndefOr[String] = js.native
      
      var autocorrect: js.UndefOr[String] = js.native
      
      var autofocus: js.UndefOr[Boolean] = js.native
      
      var capture: js.UndefOr[Boolean | String] = js.native
      
      var cellPadding: js.UndefOr[Double | String] = js.native
      
      var cellSpacing: js.UndefOr[Double | String] = js.native
      
      var challenge: js.UndefOr[String] = js.native
      
      var charSet: js.UndefOr[String] = js.native
      
      var checked: js.UndefOr[Boolean] = js.native
      
      var `class`: js.UndefOr[String] = js.native
      
      var className: js.UndefOr[String] = js.native
      
      var colSpan: js.UndefOr[Double] = js.native
      
      var cols: js.UndefOr[Double] = js.native
      
      var content: js.UndefOr[String] = js.native
      
      var contentEditable: js.UndefOr[Boolean] = js.native
      
      var contextMenu: js.UndefOr[String] = js.native
      
      var controls: js.UndefOr[Boolean] = js.native
      
      var controlsList: js.UndefOr[String] = js.native
      
      var coords: js.UndefOr[String] = js.native
      
      var crossOrigin: js.UndefOr[String] = js.native
      
      var data: js.UndefOr[String] = js.native
      
      var datatype: js.UndefOr[String] = js.native
      
      var dateTime: js.UndefOr[String] = js.native
      
      var defer: js.UndefOr[Boolean] = js.native
      
      var dir: js.UndefOr[auto | rtl | ltr] = js.native
      
      var disableRemotePlayback: js.UndefOr[Boolean] = js.native
      
      var disabled: js.UndefOr[Boolean] = js.native
      
      var download: js.UndefOr[js.Any] = js.native
      
      var draggable: js.UndefOr[Boolean] = js.native
      
      var encType: js.UndefOr[String] = js.native
      
      var `for`: js.UndefOr[String] = js.native
      
      var form: js.UndefOr[String] = js.native
      
      var formAction: js.UndefOr[String] = js.native
      
      var formEncType: js.UndefOr[String] = js.native
      
      var formMethod: js.UndefOr[String] = js.native
      
      var formNoValidate: js.UndefOr[Boolean] = js.native
      
      var formTarget: js.UndefOr[String] = js.native
      
      var frameBorder: js.UndefOr[Double | String] = js.native
      
      var headers: js.UndefOr[String] = js.native
      
      var height: js.UndefOr[Double | String] = js.native
      
      var hidden: js.UndefOr[Boolean] = js.native
      
      var high: js.UndefOr[Double] = js.native
      
      var href: js.UndefOr[String] = js.native
      
      var hrefLang: js.UndefOr[String] = js.native
      
      var htmlFor: js.UndefOr[String] = js.native
      
      var httpEquiv: js.UndefOr[String] = js.native
      
      var icon: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var inlist: js.UndefOr[js.Any] = js.native
      
      var inputMode: js.UndefOr[String] = js.native
      
      var integrity: js.UndefOr[String] = js.native
      
      var is: js.UndefOr[String] = js.native
      
      var itemID: js.UndefOr[String] = js.native
      
      // Microdata Attributes
      var itemProp: js.UndefOr[String] = js.native
      
      var itemRef: js.UndefOr[String] = js.native
      
      var itemScope: js.UndefOr[Boolean] = js.native
      
      var itemType: js.UndefOr[String] = js.native
      
      var keyParams: js.UndefOr[String] = js.native
      
      var keyType: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var label: js.UndefOr[String] = js.native
      
      var lang: js.UndefOr[String] = js.native
      
      var list: js.UndefOr[String] = js.native
      
      var loading: js.UndefOr[eager | `lazy`] = js.native
      
      var loop: js.UndefOr[Boolean] = js.native
      
      var low: js.UndefOr[Double] = js.native
      
      var manifest: js.UndefOr[String] = js.native
      
      var marginHeight: js.UndefOr[Double] = js.native
      
      var marginWidth: js.UndefOr[Double] = js.native
      
      var max: js.UndefOr[Double | String] = js.native
      
      var maxLength: js.UndefOr[Double] = js.native
      
      var media: js.UndefOr[String] = js.native
      
      var mediaGroup: js.UndefOr[String] = js.native
      
      var method: js.UndefOr[String] = js.native
      
      var min: js.UndefOr[Double | String] = js.native
      
      var minLength: js.UndefOr[Double] = js.native
      
      var multiple: js.UndefOr[Boolean] = js.native
      
      var muted: js.UndefOr[Boolean] = js.native
      
      var name: js.UndefOr[String] = js.native
      
      var noValidate: js.UndefOr[Boolean] = js.native
      
      var nonce: js.UndefOr[String] = js.native
      
      var open: js.UndefOr[Boolean] = js.native
      
      var optimum: js.UndefOr[Double] = js.native
      
      var pattern: js.UndefOr[String] = js.native
      
      var placeholder: js.UndefOr[String] = js.native
      
      var playsInline: js.UndefOr[Boolean] = js.native
      
      var poster: js.UndefOr[String] = js.native
      
      var prefix: js.UndefOr[String] = js.native
      
      var preload: js.UndefOr[String] = js.native
      
      var property: js.UndefOr[String] = js.native
      
      var radioGroup: js.UndefOr[String] = js.native
      
      var readOnly: js.UndefOr[Boolean] = js.native
      
      var rel: js.UndefOr[String] = js.native
      
      var required: js.UndefOr[Boolean] = js.native
      
      var resource: js.UndefOr[String] = js.native
      
      var role: js.UndefOr[String] = js.native
      
      var rowSpan: js.UndefOr[Double] = js.native
      
      var rows: js.UndefOr[Double] = js.native
      
      var sandbox: js.UndefOr[String] = js.native
      
      var scope: js.UndefOr[String] = js.native
      
      var scoped: js.UndefOr[Boolean] = js.native
      
      var scrolling: js.UndefOr[String] = js.native
      
      var seamless: js.UndefOr[Boolean] = js.native
      
      var selected: js.UndefOr[Boolean] = js.native
      
      var shape: js.UndefOr[String] = js.native
      
      var size: js.UndefOr[Double] = js.native
      
      var sizes: js.UndefOr[String] = js.native
      
      var slot: js.UndefOr[String] = js.native
      
      var span: js.UndefOr[Double] = js.native
      
      var spellcheck: js.UndefOr[Boolean] = js.native
      
      var src: js.UndefOr[String] = js.native
      
      var srcDoc: js.UndefOr[String] = js.native
      
      var srcLang: js.UndefOr[String] = js.native
      
      var srcSet: js.UndefOr[String] = js.native
      
      var srcset: js.UndefOr[String] = js.native
      
      var start: js.UndefOr[Double] = js.native
      
      var step: js.UndefOr[Double | String] = js.native
      
      var style: js.UndefOr[String | typingsSlinky.preact.jsxMod.JSXInternal.CSSProperties] = js.native
      
      var summary: js.UndefOr[String] = js.native
      
      var tabIndex: js.UndefOr[Double] = js.native
      
      var target: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var typeof: js.UndefOr[String] = js.native
      
      var useMap: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String | js.Array[String] | Double] = js.native
      
      var vocab: js.UndefOr[String] = js.native
      
      var volume: js.UndefOr[String | Double] = js.native
      
      var width: js.UndefOr[Double | String] = js.native
      
      var wmode: js.UndefOr[String] = js.native
      
      var wrap: js.UndefOr[String] = js.native
    }
    object HTMLAttributes {
      
      @scala.inline
      def apply[RefType /* <: EventTarget */](): typingsSlinky.preact.mod.createElement.JSX.HTMLAttributes[RefType] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.preact.mod.createElement.JSX.HTMLAttributes[RefType]]
      }
      
      @scala.inline
      implicit class HTMLAttributesMutableBuilder[Self <: typingsSlinky.preact.mod.createElement.JSX.HTMLAttributes[_], RefType /* <: EventTarget */] (val x: Self with typingsSlinky.preact.mod.createElement.JSX.HTMLAttributes[RefType]) extends AnyVal {
        
        @scala.inline
        def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
        
        @scala.inline
        def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
        
        @scala.inline
        def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
        
        @scala.inline
        def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
        
        @scala.inline
        def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        @scala.inline
        def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
        
        @scala.inline
        def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
        
        @scala.inline
        def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        @scala.inline
        def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
        
        @scala.inline
        def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
        
        @scala.inline
        def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
        
        @scala.inline
        def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
        
        @scala.inline
        def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
        
        @scala.inline
        def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
        
        @scala.inline
        def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
        
        @scala.inline
        def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
        
        @scala.inline
        def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
        
        @scala.inline
        def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
        
        @scala.inline
        def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
        
        @scala.inline
        def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
        
        @scala.inline
        def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
        
        @scala.inline
        def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
        
        @scala.inline
        def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
        
        @scala.inline
        def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentEditable(value: Boolean): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
        
        @scala.inline
        def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        @scala.inline
        def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
        
        @scala.inline
        def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setControlsList(value: String): Self = StObject.set(x, "controlsList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setControlsListUndefined: Self = StObject.set(x, "controlsList", js.undefined)
        
        @scala.inline
        def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
        
        @scala.inline
        def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
        
        @scala.inline
        def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
        
        @scala.inline
        def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
        
        @scala.inline
        def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
        
        @scala.inline
        def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
        
        @scala.inline
        def setDir(value: auto | rtl | ltr): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
        
        @scala.inline
        def setDisableRemotePlayback(value: Boolean): Self = StObject.set(x, "disableRemotePlayback", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisableRemotePlaybackUndefined: Self = StObject.set(x, "disableRemotePlayback", js.undefined)
        
        @scala.inline
        def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        @scala.inline
        def setDownload(value: js.Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
        
        @scala.inline
        def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
        
        @scala.inline
        def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
        
        @scala.inline
        def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForUndefined: Self = StObject.set(x, "for", js.undefined)
        
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
        def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
        
        @scala.inline
        def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        @scala.inline
        def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
        
        @scala.inline
        def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
        
        @scala.inline
        def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
        
        @scala.inline
        def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
        
        @scala.inline
        def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
        
        @scala.inline
        def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
        
        @scala.inline
        def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
        
        @scala.inline
        def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
        
        @scala.inline
        def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
        
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
        def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
        
        @scala.inline
        def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
        
        @scala.inline
        def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setListUndefined: Self = StObject.set(x, "list", js.undefined)
        
        @scala.inline
        def setLoading(value: eager | `lazy`): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
        
        @scala.inline
        def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
        
        @scala.inline
        def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
        
        @scala.inline
        def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
        
        @scala.inline
        def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
        
        @scala.inline
        def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
        
        @scala.inline
        def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
        
        @scala.inline
        def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        @scala.inline
        def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
        
        @scala.inline
        def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        @scala.inline
        def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
        
        @scala.inline
        def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        @scala.inline
        def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
        
        @scala.inline
        def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
        
        @scala.inline
        def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
        
        @scala.inline
        def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
        
        @scala.inline
        def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
        
        @scala.inline
        def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        
        @scala.inline
        def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        @scala.inline
        def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
        
        @scala.inline
        def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
        
        @scala.inline
        def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        @scala.inline
        def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
        
        @scala.inline
        def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
        
        @scala.inline
        def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
        
        @scala.inline
        def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
        
        @scala.inline
        def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
        
        @scala.inline
        def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
        
        @scala.inline
        def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
        
        @scala.inline
        def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        @scala.inline
        def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
        
        @scala.inline
        def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        @scala.inline
        def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
        
        @scala.inline
        def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        @scala.inline
        def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
        
        @scala.inline
        def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
        
        @scala.inline
        def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
        
        @scala.inline
        def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
        
        @scala.inline
        def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
        
        @scala.inline
        def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        @scala.inline
        def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
        
        @scala.inline
        def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
        
        @scala.inline
        def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
        
        @scala.inline
        def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
        
        @scala.inline
        def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
        
        @scala.inline
        def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
        
        @scala.inline
        def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
        
        @scala.inline
        def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
        
        @scala.inline
        def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        
        @scala.inline
        def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
        
        @scala.inline
        def setStyle(value: String | typingsSlinky.preact.jsxMod.JSXInternal.CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        @scala.inline
        def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
        
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
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
        
        @scala.inline
        def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
        
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
        
        @scala.inline
        def setVolume(value: String | Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
        
        @scala.inline
        def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        @scala.inline
        def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
        
        @scala.inline
        def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
      }
    }
    
    @js.native
    trait HTMLMarqueeElement extends HTMLElement {
      
      var behavior: js.UndefOr[scroll | slide | alternate] = js.native
      
      var bgColor: js.UndefOr[String] = js.native
      
      var direction: js.UndefOr[left | right | up | down] = js.native
      
      var height: js.UndefOr[Double | String] = js.native
      
      var hspace: js.UndefOr[Double | String] = js.native
      
      var loop: js.UndefOr[Double | String] = js.native
      
      var scrollAmount: js.UndefOr[Double | String] = js.native
      
      var scrollDelay: js.UndefOr[Double | String] = js.native
      
      var trueSpeed: js.UndefOr[Boolean] = js.native
      
      var vspace: js.UndefOr[Double | String] = js.native
      
      var width: js.UndefOr[Double | String] = js.native
    }
    
    @js.native
    trait IntrinsicAttributes extends StObject {
      
      var key: js.UndefOr[js.Any] = js.native
    }
    object IntrinsicAttributes {
      
      @scala.inline
      def apply(): IntrinsicAttributes = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IntrinsicAttributes]
      }
      
      @scala.inline
      implicit class IntrinsicAttributesMutableBuilder[Self <: IntrinsicAttributes] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      }
    }
    
    @js.native
    trait IntrinsicElements extends StObject {
      
      // HTML
      var a: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLAnchorElement] = js.native
      
      var abbr: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var address: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var animate: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGAnimateElement] = js.native
      
      var animateTransform: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGAnimateElement] = js.native
      
      var area: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLAreaElement] = js.native
      
      var article: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var aside: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var audio: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLAudioElement] = js.native
      
      var b: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var base: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLBaseElement] = js.native
      
      var bdi: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var bdo: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var big: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var blockquote: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLQuoteElement] = js.native
      
      var body: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLBodyElement] = js.native
      
      var br: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLBRElement] = js.native
      
      var button: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLButtonElement] = js.native
      
      var canvas: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLCanvasElement] = js.native
      
      var caption: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableCaptionElement] = js.native
      
      var circle: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGCircleElement] = js.native
      
      var cite: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var clipPath: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGClipPathElement] = js.native
      
      var code: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var col: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableColElement] = js.native
      
      var colgroup: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableColElement] = js.native
      
      var data: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDataElement] = js.native
      
      var datalist: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDataListElement] = js.native
      
      var dd: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var defs: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGDefsElement] = js.native
      
      var del: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLModElement] = js.native
      
      var desc: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGDescElement] = js.native
      
      var details: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDetailsElement] = js.native
      
      var dfn: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var dialog: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDialogElement] = js.native
      
      var div: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDivElement] = js.native
      
      var dl: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDListElement] = js.native
      
      var dt: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var ellipse: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGEllipseElement] = js.native
      
      var em: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var embed: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLEmbedElement] = js.native
      
      var feBlend: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEBlendElement] = js.native
      
      var feColorMatrix: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEColorMatrixElement] = js.native
      
      var feComponentTransfer: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEComponentTransferElement] = js.native
      
      var feComposite: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFECompositeElement] = js.native
      
      var feConvolveMatrix: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEConvolveMatrixElement] = js.native
      
      var feDiffuseLighting: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEDiffuseLightingElement] = js.native
      
      var feDisplacementMap: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEDisplacementMapElement] = js.native
      
      var feDropShadow: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEDropShadowElement] = js.native
      
      var feFlood: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEFloodElement] = js.native
      
      var feGaussianBlur: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEGaussianBlurElement] = js.native
      
      var feImage: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEImageElement] = js.native
      
      var feMerge: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEMergeElement] = js.native
      
      var feMergeNode: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEMergeNodeElement] = js.native
      
      var feMorphology: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEMorphologyElement] = js.native
      
      var feOffset: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEOffsetElement] = js.native
      
      var feSpecularLighting: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFESpecularLightingElement] = js.native
      
      var feTile: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFETileElement] = js.native
      
      var feTurbulence: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFETurbulenceElement] = js.native
      
      var fieldset: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLFieldSetElement] = js.native
      
      var figcaption: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var figure: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var filter: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFilterElement] = js.native
      
      var footer: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var foreignObject: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGForeignObjectElement] = js.native
      
      var form: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLFormElement] = js.native
      
      var g: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGGElement] = js.native
      
      var h1: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement] = js.native
      
      var h2: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement] = js.native
      
      var h3: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement] = js.native
      
      var h4: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement] = js.native
      
      var h5: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement] = js.native
      
      var h6: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement] = js.native
      
      var head: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadElement] = js.native
      
      var header: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var hgroup: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var hr: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHRElement] = js.native
      
      var html: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHtmlElement] = js.native
      
      var i: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var iframe: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLIFrameElement] = js.native
      
      var image: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGImageElement] = js.native
      
      var img: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLImageElement] = js.native
      
      var input: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLInputElement] = js.native
      
      var ins: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLModElement] = js.native
      
      var kbd: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var keygen: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLUnknownElement] = js.native
      
      var label: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLLabelElement] = js.native
      
      var legend: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLLegendElement] = js.native
      
      var li: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLLIElement] = js.native
      
      var line: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGLineElement] = js.native
      
      var linearGradient: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGLinearGradientElement] = js.native
      
      var link: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLLinkElement] = js.native
      
      var main: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var map: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLMapElement] = js.native
      
      var mark: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var marker: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGMarkerElement] = js.native
      
      var marquee: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[typingsSlinky.preact.jsxMod.JSXInternal.HTMLMarqueeElement] = js.native
      
      var mask: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGMaskElement] = js.native
      
      var menu: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLMenuElement] = js.native
      
      var menuitem: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLUnknownElement] = js.native
      
      var meta: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLMetaElement] = js.native
      
      var meter: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLMeterElement] = js.native
      
      var nav: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var noscript: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var `object`: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLObjectElement] = js.native
      
      var ol: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLOListElement] = js.native
      
      var optgroup: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLOptGroupElement] = js.native
      
      var option: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLOptionElement] = js.native
      
      var output: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLOutputElement] = js.native
      
      var p: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLParagraphElement] = js.native
      
      var param: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLParamElement] = js.native
      
      var path: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGPathElement] = js.native
      
      var pattern: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGPatternElement] = js.native
      
      var picture: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLPictureElement] = js.native
      
      var polygon: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGPolygonElement] = js.native
      
      var polyline: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGPolylineElement] = js.native
      
      var pre: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLPreElement] = js.native
      
      var progress: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLProgressElement] = js.native
      
      var q: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLQuoteElement] = js.native
      
      var radialGradient: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGRadialGradientElement] = js.native
      
      var rect: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGRectElement] = js.native
      
      var rp: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var rt: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var ruby: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var s: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var samp: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var script: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLScriptElement] = js.native
      
      var section: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var select: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLSelectElement] = js.native
      
      var slot: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLSlotElement] = js.native
      
      var small: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var source: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLSourceElement] = js.native
      
      var span: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLSpanElement] = js.native
      
      var stop: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGStopElement] = js.native
      
      var strong: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var style: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLStyleElement] = js.native
      
      var sub: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var summary: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var sup: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      //SVG
      var svg: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGSVGElement] = js.native
      
      var symbol: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGSymbolElement] = js.native
      
      var table: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableElement] = js.native
      
      var tbody: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableSectionElement] = js.native
      
      var td: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableCellElement] = js.native
      
      var text: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGTextElement] = js.native
      
      var textarea: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTextAreaElement] = js.native
      
      var tfoot: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableSectionElement] = js.native
      
      var th: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableCellElement] = js.native
      
      var thead: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableSectionElement] = js.native
      
      var time: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTimeElement] = js.native
      
      var title: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTitleElement] = js.native
      
      var tr: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableRowElement] = js.native
      
      var track: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTrackElement] = js.native
      
      var tspan: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGTSpanElement] = js.native
      
      var u: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var ul: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLUListElement] = js.native
      
      var use: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGUseElement] = js.native
      
      var `var`: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
      
      var video: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLVideoElement] = js.native
      
      var wbr: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] = js.native
    }
    object IntrinsicElements {
      
      @scala.inline
      def apply(
        a: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLAnchorElement],
        abbr: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        address: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        animate: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGAnimateElement],
        animateTransform: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGAnimateElement],
        area: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLAreaElement],
        article: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        aside: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        audio: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLAudioElement],
        b: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        base: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLBaseElement],
        bdi: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        bdo: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        big: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        blockquote: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLQuoteElement],
        body: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLBodyElement],
        br: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLBRElement],
        button: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLButtonElement],
        canvas: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLCanvasElement],
        caption: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableCaptionElement],
        circle: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGCircleElement],
        cite: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        clipPath: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGClipPathElement],
        code: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        col: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableColElement],
        colgroup: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableColElement],
        data: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDataElement],
        datalist: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDataListElement],
        dd: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        defs: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGDefsElement],
        del: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLModElement],
        desc: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGDescElement],
        details: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDetailsElement],
        dfn: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        dialog: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDialogElement],
        div: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDivElement],
        dl: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDListElement],
        dt: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        ellipse: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGEllipseElement],
        em: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        embed: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLEmbedElement],
        feBlend: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEBlendElement],
        feColorMatrix: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEColorMatrixElement],
        feComponentTransfer: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEComponentTransferElement],
        feComposite: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFECompositeElement],
        feConvolveMatrix: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEConvolveMatrixElement],
        feDiffuseLighting: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEDiffuseLightingElement],
        feDisplacementMap: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEDisplacementMapElement],
        feDropShadow: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEDropShadowElement],
        feFlood: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEFloodElement],
        feGaussianBlur: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEGaussianBlurElement],
        feImage: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEImageElement],
        feMerge: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEMergeElement],
        feMergeNode: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEMergeNodeElement],
        feMorphology: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEMorphologyElement],
        feOffset: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEOffsetElement],
        feSpecularLighting: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFESpecularLightingElement],
        feTile: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFETileElement],
        feTurbulence: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFETurbulenceElement],
        fieldset: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLFieldSetElement],
        figcaption: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        figure: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        filter: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFilterElement],
        footer: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        foreignObject: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGForeignObjectElement],
        form: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLFormElement],
        g: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGGElement],
        h1: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement],
        h2: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement],
        h3: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement],
        h4: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement],
        h5: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement],
        h6: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement],
        head: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadElement],
        header: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        hgroup: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        hr: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHRElement],
        html: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHtmlElement],
        i: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        iframe: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLIFrameElement],
        image: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGImageElement],
        img: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLImageElement],
        input: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLInputElement],
        ins: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLModElement],
        kbd: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        keygen: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLUnknownElement],
        label: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLLabelElement],
        legend: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLLegendElement],
        li: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLLIElement],
        line: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGLineElement],
        linearGradient: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGLinearGradientElement],
        link: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLLinkElement],
        main: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        map: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLMapElement],
        mark: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        marker: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGMarkerElement],
        marquee: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[typingsSlinky.preact.jsxMod.JSXInternal.HTMLMarqueeElement],
        mask: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGMaskElement],
        menu: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLMenuElement],
        menuitem: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLUnknownElement],
        meta: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLMetaElement],
        meter: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLMeterElement],
        nav: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        noscript: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        `object`: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLObjectElement],
        ol: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLOListElement],
        optgroup: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLOptGroupElement],
        option: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLOptionElement],
        output: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLOutputElement],
        p: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLParagraphElement],
        param: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLParamElement],
        path: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGPathElement],
        pattern: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGPatternElement],
        picture: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLPictureElement],
        polygon: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGPolygonElement],
        polyline: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGPolylineElement],
        pre: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLPreElement],
        progress: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLProgressElement],
        q: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLQuoteElement],
        radialGradient: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGRadialGradientElement],
        rect: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGRectElement],
        rp: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        rt: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        ruby: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        s: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        samp: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        script: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLScriptElement],
        section: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        select: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLSelectElement],
        slot: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLSlotElement],
        small: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        source: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLSourceElement],
        span: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLSpanElement],
        stop: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGStopElement],
        strong: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        style: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLStyleElement],
        sub: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        summary: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        sup: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        svg: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGSVGElement],
        symbol: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGSymbolElement],
        table: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableElement],
        tbody: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableSectionElement],
        td: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableCellElement],
        text: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGTextElement],
        textarea: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTextAreaElement],
        tfoot: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableSectionElement],
        th: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableCellElement],
        thead: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableSectionElement],
        time: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTimeElement],
        title: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTitleElement],
        tr: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableRowElement],
        track: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTrackElement],
        tspan: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGTSpanElement],
        u: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        ul: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLUListElement],
        use: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGUseElement],
        `var`: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement],
        video: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLVideoElement],
        wbr: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]
      ): IntrinsicElements = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], animateTransform = animateTransform.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], bdi = bdi.asInstanceOf[js.Any], bdo = bdo.asInstanceOf[js.Any], big = big.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], cite = cite.asInstanceOf[js.Any], clipPath = clipPath.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], colgroup = colgroup.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], datalist = datalist.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], defs = defs.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dfn = dfn.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], dl = dl.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], ellipse = ellipse.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], feBlend = feBlend.asInstanceOf[js.Any], feColorMatrix = feColorMatrix.asInstanceOf[js.Any], feComponentTransfer = feComponentTransfer.asInstanceOf[js.Any], feComposite = feComposite.asInstanceOf[js.Any], feConvolveMatrix = feConvolveMatrix.asInstanceOf[js.Any], feDiffuseLighting = feDiffuseLighting.asInstanceOf[js.Any], feDisplacementMap = feDisplacementMap.asInstanceOf[js.Any], feDropShadow = feDropShadow.asInstanceOf[js.Any], feFlood = feFlood.asInstanceOf[js.Any], feGaussianBlur = feGaussianBlur.asInstanceOf[js.Any], feImage = feImage.asInstanceOf[js.Any], feMerge = feMerge.asInstanceOf[js.Any], feMergeNode = feMergeNode.asInstanceOf[js.Any], feMorphology = feMorphology.asInstanceOf[js.Any], feOffset = feOffset.asInstanceOf[js.Any], feSpecularLighting = feSpecularLighting.asInstanceOf[js.Any], feTile = feTile.asInstanceOf[js.Any], feTurbulence = feTurbulence.asInstanceOf[js.Any], fieldset = fieldset.asInstanceOf[js.Any], figcaption = figcaption.asInstanceOf[js.Any], figure = figure.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], foreignObject = foreignObject.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hgroup = hgroup.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], kbd = kbd.asInstanceOf[js.Any], keygen = keygen.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], linearGradient = linearGradient.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], marquee = marquee.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuitem = menuitem.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], meter = meter.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], optgroup = optgroup.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], radialGradient = radialGradient.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], ruby = ruby.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], samp = samp.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tbody = tbody.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], tfoot = tfoot.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thead = thead.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], tspan = tspan.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any])
        __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
        __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IntrinsicElements]
      }
      
      @scala.inline
      implicit class IntrinsicElementsMutableBuilder[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setA(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLAnchorElement]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAbbr(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddress(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimate(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGAnimateElement]): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimateTransform(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGAnimateElement]): Self = StObject.set(x, "animateTransform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArea(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLAreaElement]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArticle(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAside(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAudio(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLAudioElement]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setB(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBase(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLBaseElement]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBdi(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBdo(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBig(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockquote(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLQuoteElement]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBody(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLBodyElement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBr(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLBRElement]): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButton(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLButtonElement]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCanvas(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLCanvasElement]): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaption(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableCaptionElement]): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCircle(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGCircleElement]): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCite(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClipPath(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGClipPathElement]): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCode(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCol(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableColElement]): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColgroup(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableColElement]): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setData(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDataElement]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatalist(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDataListElement]): Self = StObject.set(x, "datalist", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDd(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefs(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGDefsElement]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDel(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLModElement]): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDesc(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGDescElement]): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetails(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDetailsElement]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDfn(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "dfn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDialog(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDialogElement]): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDiv(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDl(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLDListElement]): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDt(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEllipse(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGEllipseElement]): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEm(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmbed(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLEmbedElement]): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeBlend(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEBlendElement]): Self = StObject.set(x, "feBlend", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeColorMatrix(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEColorMatrixElement]): Self = StObject.set(x, "feColorMatrix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeComponentTransfer(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEComponentTransferElement]): Self = StObject.set(x, "feComponentTransfer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeComposite(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFECompositeElement]): Self = StObject.set(x, "feComposite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeConvolveMatrix(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEConvolveMatrixElement]): Self = StObject.set(x, "feConvolveMatrix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDiffuseLighting(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEDiffuseLightingElement]): Self = StObject.set(x, "feDiffuseLighting", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDisplacementMap(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEDisplacementMapElement]): Self = StObject.set(x, "feDisplacementMap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDropShadow(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEDropShadowElement]): Self = StObject.set(x, "feDropShadow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFlood(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEFloodElement]): Self = StObject.set(x, "feFlood", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeGaussianBlur(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEGaussianBlurElement]): Self = StObject.set(x, "feGaussianBlur", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeImage(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEImageElement]): Self = StObject.set(x, "feImage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeMerge(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEMergeElement]): Self = StObject.set(x, "feMerge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeMergeNode(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEMergeNodeElement]): Self = StObject.set(x, "feMergeNode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeMorphology(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEMorphologyElement]): Self = StObject.set(x, "feMorphology", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeOffset(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFEOffsetElement]): Self = StObject.set(x, "feOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeSpecularLighting(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFESpecularLightingElement]): Self = StObject.set(x, "feSpecularLighting", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeTile(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFETileElement]): Self = StObject.set(x, "feTile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeTurbulence(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFETurbulenceElement]): Self = StObject.set(x, "feTurbulence", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldset(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLFieldSetElement]): Self = StObject.set(x, "fieldset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFigcaption(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "figcaption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFigure(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "figure", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilter(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGFilterElement]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFooter(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForeignObject(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGForeignObjectElement]): Self = StObject.set(x, "foreignObject", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForm(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLFormElement]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setG(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGGElement]): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH1(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH2(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH3(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH4(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH5(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH6(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadingElement]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHead(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHeadElement]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeader(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHgroup(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "hgroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHr(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHRElement]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtml(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLHtmlElement]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setI(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIframe(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLIFrameElement]): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImage(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGImageElement]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImg(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLImageElement]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInput(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLInputElement]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIns(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLModElement]): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKbd(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "kbd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeygen(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLUnknownElement]): Self = StObject.set(x, "keygen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabel(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLLabelElement]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLegend(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLLegendElement]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLi(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLLIElement]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLine(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGLineElement]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinearGradient(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGLinearGradientElement]): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLink(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLLinkElement]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMain(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMap(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLMapElement]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMark(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarker(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGMarkerElement]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarquee(
          value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[typingsSlinky.preact.jsxMod.JSXInternal.HTMLMarqueeElement]
        ): Self = StObject.set(x, "marquee", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMask(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGMaskElement]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenu(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLMenuElement]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenuitem(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLUnknownElement]): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMeta(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLMetaElement]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMeter(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLMeterElement]): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNav(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoscript(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObject(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLObjectElement]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOl(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLOListElement]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptgroup(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLOptGroupElement]): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOption(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLOptionElement]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutput(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLOutputElement]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setP(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLParagraphElement]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParam(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLParamElement]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPath(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGPathElement]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPattern(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGPatternElement]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPicture(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLPictureElement]): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPolygon(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGPolygonElement]): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPolyline(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGPolylineElement]): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPre(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLPreElement]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProgress(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLProgressElement]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQ(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLQuoteElement]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRadialGradient(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGRadialGradientElement]): Self = StObject.set(x, "radialGradient", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRect(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGRectElement]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRp(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRt(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuby(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "ruby", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setS(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSamp(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "samp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScript(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLScriptElement]): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSection(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelect(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLSelectElement]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlot(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLSlotElement]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSmall(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLSourceElement]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpan(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLSpanElement]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStop(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGStopElement]): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrong(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyle(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLStyleElement]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSub(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSummary(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSup(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSvg(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGSVGElement]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSymbol(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGSymbolElement]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTable(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableElement]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTbody(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableSectionElement]): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTd(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableCellElement]): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGTextElement]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextarea(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTextAreaElement]): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTfoot(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableSectionElement]): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTh(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableCellElement]): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThead(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableSectionElement]): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTime(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTimeElement]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTitleElement]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTr(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTableRowElement]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrack(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLTrackElement]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTspan(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGTSpanElement]): Self = StObject.set(x, "tspan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setU(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUl(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLUListElement]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUse(value: typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes[SVGUseElement]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVar(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVideo(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[HTMLVideoElement]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWbr(value: typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
      }
    }
    
    type KeyboardEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedKeyboardEvent[Target]]
    
    type LibraryManagedAttributes[Component, Props] = Props | (Defaultize[Props, js.Any])
    
    type MouseEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedMouseEvent[Target]]
    
    @js.native
    trait PathAttributes extends StObject {
      
      var d: String = js.native
    }
    object PathAttributes {
      
      @scala.inline
      def apply(d: String): PathAttributes = {
        val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
        __obj.asInstanceOf[PathAttributes]
      }
      
      @scala.inline
      implicit class PathAttributesMutableBuilder[Self <: PathAttributes] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      }
    }
    
    type PointerEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedPointerEvent[Target]]
    
    @js.native
    trait SVGAttributes[Target /* <: EventTarget */]
      extends typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes[Target] {
      
      var accentHeight: js.UndefOr[Double | String] = js.native
      
      var accumulate: js.UndefOr[none | sum] = js.native
      
      var additive: js.UndefOr[replace | sum] = js.native
      
      var alignmentBaseline: js.UndefOr[
            auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
          ] = js.native
      
      var allowReorder: js.UndefOr[no | yes] = js.native
      
      var alphabetic: js.UndefOr[Double | String] = js.native
      
      var amplitude: js.UndefOr[Double | String] = js.native
      
      var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.native
      
      var ascent: js.UndefOr[Double | String] = js.native
      
      var attributeName: js.UndefOr[String] = js.native
      
      var attributeType: js.UndefOr[String] = js.native
      
      var autoReverse: js.UndefOr[Double | String] = js.native
      
      var azimuth: js.UndefOr[Double | String] = js.native
      
      var baseFrequency: js.UndefOr[Double | String] = js.native
      
      var baseProfile: js.UndefOr[Double | String] = js.native
      
      var baselineShift: js.UndefOr[Double | String] = js.native
      
      var bbox: js.UndefOr[Double | String] = js.native
      
      var begin: js.UndefOr[Double | String] = js.native
      
      var bias: js.UndefOr[Double | String] = js.native
      
      var by: js.UndefOr[Double | String] = js.native
      
      var calcMode: js.UndefOr[Double | String] = js.native
      
      var capHeight: js.UndefOr[Double | String] = js.native
      
      var clip: js.UndefOr[Double | String] = js.native
      
      var clipPath: js.UndefOr[String] = js.native
      
      var clipPathUnits: js.UndefOr[Double | String] = js.native
      
      var clipRule: js.UndefOr[Double | String] = js.native
      
      var colorInterpolation: js.UndefOr[Double | String] = js.native
      
      var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.native
      
      var colorProfile: js.UndefOr[Double | String] = js.native
      
      var colorRendering: js.UndefOr[Double | String] = js.native
      
      var contentScriptType: js.UndefOr[Double | String] = js.native
      
      var contentStyleType: js.UndefOr[Double | String] = js.native
      
      var cursor: js.UndefOr[Double | String] = js.native
      
      var cx: js.UndefOr[Double | String] = js.native
      
      var cy: js.UndefOr[Double | String] = js.native
      
      var d: js.UndefOr[String] = js.native
      
      var decelerate: js.UndefOr[Double | String] = js.native
      
      var descent: js.UndefOr[Double | String] = js.native
      
      var diffuseConstant: js.UndefOr[Double | String] = js.native
      
      var direction: js.UndefOr[Double | String] = js.native
      
      var display: js.UndefOr[Double | String] = js.native
      
      var divisor: js.UndefOr[Double | String] = js.native
      
      var dominantBaseline: js.UndefOr[Double | String] = js.native
      
      var dur: js.UndefOr[Double | String] = js.native
      
      var dx: js.UndefOr[Double | String] = js.native
      
      var dy: js.UndefOr[Double | String] = js.native
      
      var edgeMode: js.UndefOr[Double | String] = js.native
      
      var elevation: js.UndefOr[Double | String] = js.native
      
      var enableBackground: js.UndefOr[Double | String] = js.native
      
      var end: js.UndefOr[Double | String] = js.native
      
      var exponent: js.UndefOr[Double | String] = js.native
      
      var externalResourcesRequired: js.UndefOr[Double | String] = js.native
      
      var fill: js.UndefOr[String] = js.native
      
      var fillOpacity: js.UndefOr[Double | String] = js.native
      
      var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.native
      
      var filter: js.UndefOr[String] = js.native
      
      var filterRes: js.UndefOr[Double | String] = js.native
      
      var filterUnits: js.UndefOr[Double | String] = js.native
      
      var floodColor: js.UndefOr[Double | String] = js.native
      
      var floodOpacity: js.UndefOr[Double | String] = js.native
      
      var focusable: js.UndefOr[Double | String] = js.native
      
      var fontFamily: js.UndefOr[String] = js.native
      
      var fontSize: js.UndefOr[Double | String] = js.native
      
      var fontSizeAdjust: js.UndefOr[Double | String] = js.native
      
      var fontStretch: js.UndefOr[Double | String] = js.native
      
      var fontStyle: js.UndefOr[Double | String] = js.native
      
      var fontVariant: js.UndefOr[Double | String] = js.native
      
      var fontWeight: js.UndefOr[Double | String] = js.native
      
      var format: js.UndefOr[Double | String] = js.native
      
      var from: js.UndefOr[Double | String] = js.native
      
      var fx: js.UndefOr[Double | String] = js.native
      
      var fy: js.UndefOr[Double | String] = js.native
      
      var g1: js.UndefOr[Double | String] = js.native
      
      var g2: js.UndefOr[Double | String] = js.native
      
      var glyphName: js.UndefOr[Double | String] = js.native
      
      var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.native
      
      var glyphOrientationVertical: js.UndefOr[Double | String] = js.native
      
      var glyphRef: js.UndefOr[Double | String] = js.native
      
      var gradientTransform: js.UndefOr[String] = js.native
      
      var gradientUnits: js.UndefOr[String] = js.native
      
      var hanging: js.UndefOr[Double | String] = js.native
      
      var horizAdvX: js.UndefOr[Double | String] = js.native
      
      var horizOriginX: js.UndefOr[Double | String] = js.native
      
      var ideographic: js.UndefOr[Double | String] = js.native
      
      var imageRendering: js.UndefOr[Double | String] = js.native
      
      var in: js.UndefOr[String] = js.native
      
      var in2: js.UndefOr[Double | String] = js.native
      
      var intercept: js.UndefOr[Double | String] = js.native
      
      var k: js.UndefOr[Double | String] = js.native
      
      var k1: js.UndefOr[Double | String] = js.native
      
      var k2: js.UndefOr[Double | String] = js.native
      
      var k3: js.UndefOr[Double | String] = js.native
      
      var k4: js.UndefOr[Double | String] = js.native
      
      var kernelMatrix: js.UndefOr[Double | String] = js.native
      
      var kernelUnitLength: js.UndefOr[Double | String] = js.native
      
      var kerning: js.UndefOr[Double | String] = js.native
      
      var keyPoints: js.UndefOr[Double | String] = js.native
      
      var keySplines: js.UndefOr[Double | String] = js.native
      
      var keyTimes: js.UndefOr[Double | String] = js.native
      
      var lengthAdjust: js.UndefOr[Double | String] = js.native
      
      var letterSpacing: js.UndefOr[Double | String] = js.native
      
      var lightingColor: js.UndefOr[Double | String] = js.native
      
      var limitingConeAngle: js.UndefOr[Double | String] = js.native
      
      var local: js.UndefOr[Double | String] = js.native
      
      var markerEnd: js.UndefOr[String] = js.native
      
      var markerHeight: js.UndefOr[Double | String] = js.native
      
      var markerMid: js.UndefOr[String] = js.native
      
      var markerStart: js.UndefOr[String] = js.native
      
      var markerUnits: js.UndefOr[Double | String] = js.native
      
      var markerWidth: js.UndefOr[Double | String] = js.native
      
      var mask: js.UndefOr[String] = js.native
      
      var maskContentUnits: js.UndefOr[Double | String] = js.native
      
      var maskUnits: js.UndefOr[Double | String] = js.native
      
      var mathematical: js.UndefOr[Double | String] = js.native
      
      var mode: js.UndefOr[Double | String] = js.native
      
      var numOctaves: js.UndefOr[Double | String] = js.native
      
      var offset: js.UndefOr[Double | String] = js.native
      
      var opacity: js.UndefOr[Double | String] = js.native
      
      var operator: js.UndefOr[Double | String] = js.native
      
      var order: js.UndefOr[Double | String] = js.native
      
      var orient: js.UndefOr[Double | String] = js.native
      
      var orientation: js.UndefOr[Double | String] = js.native
      
      var origin: js.UndefOr[Double | String] = js.native
      
      var overflow: js.UndefOr[Double | String] = js.native
      
      var overlinePosition: js.UndefOr[Double | String] = js.native
      
      var overlineThickness: js.UndefOr[Double | String] = js.native
      
      var paintOrder: js.UndefOr[Double | String] = js.native
      
      var panose1: js.UndefOr[Double | String] = js.native
      
      var pathLength: js.UndefOr[Double | String] = js.native
      
      var patternContentUnits: js.UndefOr[String] = js.native
      
      var patternTransform: js.UndefOr[Double | String] = js.native
      
      var patternUnits: js.UndefOr[String] = js.native
      
      var pointerEvents: js.UndefOr[Double | String] = js.native
      
      var points: js.UndefOr[String] = js.native
      
      var pointsAtX: js.UndefOr[Double | String] = js.native
      
      var pointsAtY: js.UndefOr[Double | String] = js.native
      
      var pointsAtZ: js.UndefOr[Double | String] = js.native
      
      var preserveAlpha: js.UndefOr[Double | String] = js.native
      
      var preserveAspectRatio: js.UndefOr[String] = js.native
      
      var primitiveUnits: js.UndefOr[Double | String] = js.native
      
      var r: js.UndefOr[Double | String] = js.native
      
      var radius: js.UndefOr[Double | String] = js.native
      
      var refX: js.UndefOr[Double | String] = js.native
      
      var refY: js.UndefOr[Double | String] = js.native
      
      var renderingIntent: js.UndefOr[Double | String] = js.native
      
      var repeatCount: js.UndefOr[Double | String] = js.native
      
      var repeatDur: js.UndefOr[Double | String] = js.native
      
      var requiredExtensions: js.UndefOr[Double | String] = js.native
      
      var requiredFeatures: js.UndefOr[Double | String] = js.native
      
      var restart: js.UndefOr[Double | String] = js.native
      
      var result: js.UndefOr[String] = js.native
      
      var rotate: js.UndefOr[Double | String] = js.native
      
      var rx: js.UndefOr[Double | String] = js.native
      
      var ry: js.UndefOr[Double | String] = js.native
      
      var scale: js.UndefOr[Double | String] = js.native
      
      var seed: js.UndefOr[Double | String] = js.native
      
      var shapeRendering: js.UndefOr[Double | String] = js.native
      
      var slope: js.UndefOr[Double | String] = js.native
      
      var spacing: js.UndefOr[Double | String] = js.native
      
      var specularConstant: js.UndefOr[Double | String] = js.native
      
      var specularExponent: js.UndefOr[Double | String] = js.native
      
      var speed: js.UndefOr[Double | String] = js.native
      
      var spreadMethod: js.UndefOr[String] = js.native
      
      var startOffset: js.UndefOr[Double | String] = js.native
      
      var stdDeviation: js.UndefOr[Double | String] = js.native
      
      var stemh: js.UndefOr[Double | String] = js.native
      
      var stemv: js.UndefOr[Double | String] = js.native
      
      var stitchTiles: js.UndefOr[Double | String] = js.native
      
      var stopColor: js.UndefOr[String] = js.native
      
      var stopOpacity: js.UndefOr[Double | String] = js.native
      
      var strikethroughPosition: js.UndefOr[Double | String] = js.native
      
      var strikethroughThickness: js.UndefOr[Double | String] = js.native
      
      var string: js.UndefOr[Double | String] = js.native
      
      var stroke: js.UndefOr[String] = js.native
      
      var strokeDasharray: js.UndefOr[String | Double] = js.native
      
      var strokeDashoffset: js.UndefOr[String | Double] = js.native
      
      var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.native
      
      var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.native
      
      var strokeMiterlimit: js.UndefOr[String | Double] = js.native
      
      var strokeOpacity: js.UndefOr[Double | String] = js.native
      
      var strokeWidth: js.UndefOr[Double | String] = js.native
      
      var surfaceScale: js.UndefOr[Double | String] = js.native
      
      var systemLanguage: js.UndefOr[Double | String] = js.native
      
      var tableValues: js.UndefOr[Double | String] = js.native
      
      var targetX: js.UndefOr[Double | String] = js.native
      
      var targetY: js.UndefOr[Double | String] = js.native
      
      var textAnchor: js.UndefOr[String] = js.native
      
      var textDecoration: js.UndefOr[Double | String] = js.native
      
      var textLength: js.UndefOr[Double | String] = js.native
      
      var textRendering: js.UndefOr[Double | String] = js.native
      
      var to: js.UndefOr[Double | String] = js.native
      
      var transform: js.UndefOr[String] = js.native
      
      var u1: js.UndefOr[Double | String] = js.native
      
      var u2: js.UndefOr[Double | String] = js.native
      
      var underlinePosition: js.UndefOr[Double | String] = js.native
      
      var underlineThickness: js.UndefOr[Double | String] = js.native
      
      var unicode: js.UndefOr[Double | String] = js.native
      
      var unicodeBidi: js.UndefOr[Double | String] = js.native
      
      var unicodeRange: js.UndefOr[Double | String] = js.native
      
      var unitsPerEm: js.UndefOr[Double | String] = js.native
      
      var vAlphabetic: js.UndefOr[Double | String] = js.native
      
      var vHanging: js.UndefOr[Double | String] = js.native
      
      var vIdeographic: js.UndefOr[Double | String] = js.native
      
      var vMathematical: js.UndefOr[Double | String] = js.native
      
      var values: js.UndefOr[String] = js.native
      
      var vectorEffect: js.UndefOr[Double | String] = js.native
      
      var version: js.UndefOr[String] = js.native
      
      var vertAdvY: js.UndefOr[Double | String] = js.native
      
      var vertOriginX: js.UndefOr[Double | String] = js.native
      
      var vertOriginY: js.UndefOr[Double | String] = js.native
      
      var viewBox: js.UndefOr[String] = js.native
      
      var viewTarget: js.UndefOr[Double | String] = js.native
      
      var visibility: js.UndefOr[Double | String] = js.native
      
      var widths: js.UndefOr[Double | String] = js.native
      
      var wordSpacing: js.UndefOr[Double | String] = js.native
      
      var writingMode: js.UndefOr[Double | String] = js.native
      
      var x: js.UndefOr[Double | String] = js.native
      
      var x1: js.UndefOr[Double | String] = js.native
      
      var x2: js.UndefOr[Double | String] = js.native
      
      var xChannelSelector: js.UndefOr[String] = js.native
      
      var xHeight: js.UndefOr[Double | String] = js.native
      
      var xlinkActuate: js.UndefOr[String] = js.native
      
      var xlinkArcrole: js.UndefOr[String] = js.native
      
      var xlinkHref: js.UndefOr[String] = js.native
      
      var xlinkRole: js.UndefOr[String] = js.native
      
      var xlinkShow: js.UndefOr[String] = js.native
      
      var xlinkTitle: js.UndefOr[String] = js.native
      
      var xlinkType: js.UndefOr[String] = js.native
      
      var xmlBase: js.UndefOr[String] = js.native
      
      var xmlLang: js.UndefOr[String] = js.native
      
      var xmlSpace: js.UndefOr[String] = js.native
      
      var xmlns: js.UndefOr[String] = js.native
      
      var xmlnsXlink: js.UndefOr[String] = js.native
      
      var y: js.UndefOr[Double | String] = js.native
      
      var y1: js.UndefOr[Double | String] = js.native
      
      var y2: js.UndefOr[Double | String] = js.native
      
      var yChannelSelector: js.UndefOr[String] = js.native
      
      var z: js.UndefOr[Double | String] = js.native
      
      var zoomAndPan: js.UndefOr[String] = js.native
    }
    object SVGAttributes {
      
      @scala.inline
      def apply[Target /* <: EventTarget */](): typingsSlinky.preact.mod.createElement.JSX.SVGAttributes[Target] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.preact.mod.createElement.JSX.SVGAttributes[Target]]
      }
      
      @scala.inline
      implicit class SVGAttributesMutableBuilder[Self <: typingsSlinky.preact.mod.createElement.JSX.SVGAttributes[_], Target /* <: EventTarget */] (val x: Self with typingsSlinky.preact.mod.createElement.JSX.SVGAttributes[Target]) extends AnyVal {
        
        @scala.inline
        def setAccentHeight(value: Double | String): Self = StObject.set(x, "accentHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccentHeightUndefined: Self = StObject.set(x, "accentHeight", js.undefined)
        
        @scala.inline
        def setAccumulate(value: none | sum): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
        
        @scala.inline
        def setAdditive(value: replace | sum): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
        
        @scala.inline
        def setAlignmentBaseline(
          value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
        ): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
        
        @scala.inline
        def setAllowReorder(value: no | yes): Self = StObject.set(x, "allowReorder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowReorderUndefined: Self = StObject.set(x, "allowReorder", js.undefined)
        
        @scala.inline
        def setAlphabetic(value: Double | String): Self = StObject.set(x, "alphabetic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlphabeticUndefined: Self = StObject.set(x, "alphabetic", js.undefined)
        
        @scala.inline
        def setAmplitude(value: Double | String): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAmplitudeUndefined: Self = StObject.set(x, "amplitude", js.undefined)
        
        @scala.inline
        def setArabicForm(value: initial | medial | terminal | isolated): Self = StObject.set(x, "arabicForm", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArabicFormUndefined: Self = StObject.set(x, "arabicForm", js.undefined)
        
        @scala.inline
        def setAscent(value: Double | String): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAscentUndefined: Self = StObject.set(x, "ascent", js.undefined)
        
        @scala.inline
        def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
        
        @scala.inline
        def setAttributeType(value: String): Self = StObject.set(x, "attributeType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttributeTypeUndefined: Self = StObject.set(x, "attributeType", js.undefined)
        
        @scala.inline
        def setAutoReverse(value: Double | String): Self = StObject.set(x, "autoReverse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoReverseUndefined: Self = StObject.set(x, "autoReverse", js.undefined)
        
        @scala.inline
        def setAzimuth(value: Double | String): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
        
        @scala.inline
        def setBaseFrequency(value: Double | String): Self = StObject.set(x, "baseFrequency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBaseFrequencyUndefined: Self = StObject.set(x, "baseFrequency", js.undefined)
        
        @scala.inline
        def setBaseProfile(value: Double | String): Self = StObject.set(x, "baseProfile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBaseProfileUndefined: Self = StObject.set(x, "baseProfile", js.undefined)
        
        @scala.inline
        def setBaselineShift(value: Double | String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
        
        @scala.inline
        def setBbox(value: Double | String): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
        
        @scala.inline
        def setBegin(value: Double | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
        
        @scala.inline
        def setBias(value: Double | String): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
        
        @scala.inline
        def setBy(value: Double | String): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setByUndefined: Self = StObject.set(x, "by", js.undefined)
        
        @scala.inline
        def setCalcMode(value: Double | String): Self = StObject.set(x, "calcMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCalcModeUndefined: Self = StObject.set(x, "calcMode", js.undefined)
        
        @scala.inline
        def setCapHeight(value: Double | String): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
        
        @scala.inline
        def setClip(value: Double | String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
        
        @scala.inline
        def setClipPathUnits(value: Double | String): Self = StObject.set(x, "clipPathUnits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClipPathUnitsUndefined: Self = StObject.set(x, "clipPathUnits", js.undefined)
        
        @scala.inline
        def setClipRule(value: Double | String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
        
        @scala.inline
        def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
        
        @scala.inline
        def setColorInterpolation(value: Double | String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
        
        @scala.inline
        def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
        
        @scala.inline
        def setColorProfile(value: Double | String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
        
        @scala.inline
        def setColorRendering(value: Double | String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
        
        @scala.inline
        def setContentScriptType(value: Double | String): Self = StObject.set(x, "contentScriptType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentScriptTypeUndefined: Self = StObject.set(x, "contentScriptType", js.undefined)
        
        @scala.inline
        def setContentStyleType(value: Double | String): Self = StObject.set(x, "contentStyleType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentStyleTypeUndefined: Self = StObject.set(x, "contentStyleType", js.undefined)
        
        @scala.inline
        def setCursor(value: Double | String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
        
        @scala.inline
        def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
        
        @scala.inline
        def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
        
        @scala.inline
        def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDUndefined: Self = StObject.set(x, "d", js.undefined)
        
        @scala.inline
        def setDecelerate(value: Double | String): Self = StObject.set(x, "decelerate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDecelerateUndefined: Self = StObject.set(x, "decelerate", js.undefined)
        
        @scala.inline
        def setDescent(value: Double | String): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
        
        @scala.inline
        def setDiffuseConstant(value: Double | String): Self = StObject.set(x, "diffuseConstant", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDiffuseConstantUndefined: Self = StObject.set(x, "diffuseConstant", js.undefined)
        
        @scala.inline
        def setDirection(value: Double | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
        
        @scala.inline
        def setDisplay(value: Double | String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
        
        @scala.inline
        def setDivisor(value: Double | String): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
        
        @scala.inline
        def setDominantBaseline(value: Double | String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
        
        @scala.inline
        def setDur(value: Double | String): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDurUndefined: Self = StObject.set(x, "dur", js.undefined)
        
        @scala.inline
        def setDx(value: Double | String): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
        
        @scala.inline
        def setDy(value: Double | String): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
        
        @scala.inline
        def setEdgeMode(value: Double | String): Self = StObject.set(x, "edgeMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEdgeModeUndefined: Self = StObject.set(x, "edgeMode", js.undefined)
        
        @scala.inline
        def setElevation(value: Double | String): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
        
        @scala.inline
        def setEnableBackground(value: Double | String): Self = StObject.set(x, "enableBackground", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnableBackgroundUndefined: Self = StObject.set(x, "enableBackground", js.undefined)
        
        @scala.inline
        def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        @scala.inline
        def setExponent(value: Double | String): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
        
        @scala.inline
        def setExternalResourcesRequired(value: Double | String): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExternalResourcesRequiredUndefined: Self = StObject.set(x, "externalResourcesRequired", js.undefined)
        
        @scala.inline
        def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
        
        @scala.inline
        def setFillRule(value: nonzero | evenodd | inherit): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
        
        @scala.inline
        def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
        
        @scala.inline
        def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterRes(value: Double | String): Self = StObject.set(x, "filterRes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterResUndefined: Self = StObject.set(x, "filterRes", js.undefined)
        
        @scala.inline
        def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        @scala.inline
        def setFilterUnits(value: Double | String): Self = StObject.set(x, "filterUnits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterUnitsUndefined: Self = StObject.set(x, "filterUnits", js.undefined)
        
        @scala.inline
        def setFloodColor(value: Double | String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
        
        @scala.inline
        def setFloodOpacity(value: Double | String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
        
        @scala.inline
        def setFocusable(value: Double | String): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
        
        @scala.inline
        def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
        
        @scala.inline
        def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontSizeAdjust(value: Double | String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
        
        @scala.inline
        def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
        
        @scala.inline
        def setFontStretch(value: Double | String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
        
        @scala.inline
        def setFontStyle(value: Double | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
        
        @scala.inline
        def setFontVariant(value: Double | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
        
        @scala.inline
        def setFontWeight(value: Double | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
        
        @scala.inline
        def setFormat(value: Double | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        @scala.inline
        def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
        
        @scala.inline
        def setFx(value: Double | String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
        
        @scala.inline
        def setFy(value: Double | String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
        
        @scala.inline
        def setG1(value: Double | String): Self = StObject.set(x, "g1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setG1Undefined: Self = StObject.set(x, "g1", js.undefined)
        
        @scala.inline
        def setG2(value: Double | String): Self = StObject.set(x, "g2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setG2Undefined: Self = StObject.set(x, "g2", js.undefined)
        
        @scala.inline
        def setGlyphName(value: Double | String): Self = StObject.set(x, "glyphName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlyphNameUndefined: Self = StObject.set(x, "glyphName", js.undefined)
        
        @scala.inline
        def setGlyphOrientationHorizontal(value: Double | String): Self = StObject.set(x, "glyphOrientationHorizontal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlyphOrientationHorizontalUndefined: Self = StObject.set(x, "glyphOrientationHorizontal", js.undefined)
        
        @scala.inline
        def setGlyphOrientationVertical(value: Double | String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
        
        @scala.inline
        def setGlyphRef(value: Double | String): Self = StObject.set(x, "glyphRef", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlyphRefUndefined: Self = StObject.set(x, "glyphRef", js.undefined)
        
        @scala.inline
        def setGradientTransform(value: String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
        
        @scala.inline
        def setGradientUnits(value: String): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
        
        @scala.inline
        def setHanging(value: Double | String): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
        
        @scala.inline
        def setHorizAdvX(value: Double | String): Self = StObject.set(x, "horizAdvX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHorizAdvXUndefined: Self = StObject.set(x, "horizAdvX", js.undefined)
        
        @scala.inline
        def setHorizOriginX(value: Double | String): Self = StObject.set(x, "horizOriginX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHorizOriginXUndefined: Self = StObject.set(x, "horizOriginX", js.undefined)
        
        @scala.inline
        def setIdeographic(value: Double | String): Self = StObject.set(x, "ideographic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdeographicUndefined: Self = StObject.set(x, "ideographic", js.undefined)
        
        @scala.inline
        def setImageRendering(value: Double | String): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
        
        @scala.inline
        def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIn2(value: Double | String): Self = StObject.set(x, "in2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIn2Undefined: Self = StObject.set(x, "in2", js.undefined)
        
        @scala.inline
        def setInUndefined: Self = StObject.set(x, "in", js.undefined)
        
        @scala.inline
        def setIntercept(value: Double | String): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
        
        @scala.inline
        def setK(value: Double | String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setK1(value: Double | String): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setK1Undefined: Self = StObject.set(x, "k1", js.undefined)
        
        @scala.inline
        def setK2(value: Double | String): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setK2Undefined: Self = StObject.set(x, "k2", js.undefined)
        
        @scala.inline
        def setK3(value: Double | String): Self = StObject.set(x, "k3", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setK3Undefined: Self = StObject.set(x, "k3", js.undefined)
        
        @scala.inline
        def setK4(value: Double | String): Self = StObject.set(x, "k4", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setK4Undefined: Self = StObject.set(x, "k4", js.undefined)
        
        @scala.inline
        def setKUndefined: Self = StObject.set(x, "k", js.undefined)
        
        @scala.inline
        def setKernelMatrix(value: Double | String): Self = StObject.set(x, "kernelMatrix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKernelMatrixUndefined: Self = StObject.set(x, "kernelMatrix", js.undefined)
        
        @scala.inline
        def setKernelUnitLength(value: Double | String): Self = StObject.set(x, "kernelUnitLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKernelUnitLengthUndefined: Self = StObject.set(x, "kernelUnitLength", js.undefined)
        
        @scala.inline
        def setKerning(value: Double | String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
        
        @scala.inline
        def setKeyPoints(value: Double | String): Self = StObject.set(x, "keyPoints", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyPointsUndefined: Self = StObject.set(x, "keyPoints", js.undefined)
        
        @scala.inline
        def setKeySplines(value: Double | String): Self = StObject.set(x, "keySplines", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeySplinesUndefined: Self = StObject.set(x, "keySplines", js.undefined)
        
        @scala.inline
        def setKeyTimes(value: Double | String): Self = StObject.set(x, "keyTimes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyTimesUndefined: Self = StObject.set(x, "keyTimes", js.undefined)
        
        @scala.inline
        def setLengthAdjust(value: Double | String): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
        
        @scala.inline
        def setLetterSpacing(value: Double | String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
        
        @scala.inline
        def setLightingColor(value: Double | String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
        
        @scala.inline
        def setLimitingConeAngle(value: Double | String): Self = StObject.set(x, "limitingConeAngle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitingConeAngleUndefined: Self = StObject.set(x, "limitingConeAngle", js.undefined)
        
        @scala.inline
        def setLocal(value: Double | String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
        
        @scala.inline
        def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
        
        @scala.inline
        def setMarkerHeight(value: Double | String): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", js.undefined)
        
        @scala.inline
        def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
        
        @scala.inline
        def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
        
        @scala.inline
        def setMarkerUnits(value: Double | String): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerUnitsUndefined: Self = StObject.set(x, "markerUnits", js.undefined)
        
        @scala.inline
        def setMarkerWidth(value: Double | String): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
        
        @scala.inline
        def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaskContentUnits(value: Double | String): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaskContentUnitsUndefined: Self = StObject.set(x, "maskContentUnits", js.undefined)
        
        @scala.inline
        def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
        
        @scala.inline
        def setMaskUnits(value: Double | String): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaskUnitsUndefined: Self = StObject.set(x, "maskUnits", js.undefined)
        
        @scala.inline
        def setMathematical(value: Double | String): Self = StObject.set(x, "mathematical", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMathematicalUndefined: Self = StObject.set(x, "mathematical", js.undefined)
        
        @scala.inline
        def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        @scala.inline
        def setNumOctaves(value: Double | String): Self = StObject.set(x, "numOctaves", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumOctavesUndefined: Self = StObject.set(x, "numOctaves", js.undefined)
        
        @scala.inline
        def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        @scala.inline
        def setOpacity(value: Double | String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
        
        @scala.inline
        def setOperator(value: Double | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
        
        @scala.inline
        def setOrder(value: Double | String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
        
        @scala.inline
        def setOrient(value: Double | String): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
        
        @scala.inline
        def setOrientation(value: Double | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
        
        @scala.inline
        def setOrigin(value: Double | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
        
        @scala.inline
        def setOverflow(value: Double | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
        
        @scala.inline
        def setOverlinePosition(value: Double | String): Self = StObject.set(x, "overlinePosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverlinePositionUndefined: Self = StObject.set(x, "overlinePosition", js.undefined)
        
        @scala.inline
        def setOverlineThickness(value: Double | String): Self = StObject.set(x, "overlineThickness", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverlineThicknessUndefined: Self = StObject.set(x, "overlineThickness", js.undefined)
        
        @scala.inline
        def setPaintOrder(value: Double | String): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
        
        @scala.inline
        def setPanose1(value: Double | String): Self = StObject.set(x, "panose1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPanose1Undefined: Self = StObject.set(x, "panose1", js.undefined)
        
        @scala.inline
        def setPathLength(value: Double | String): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
        
        @scala.inline
        def setPatternContentUnits(value: String): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
        
        @scala.inline
        def setPatternTransform(value: Double | String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
        
        @scala.inline
        def setPatternUnits(value: String): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
        
        @scala.inline
        def setPointerEvents(value: Double | String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
        
        @scala.inline
        def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPointsAtX(value: Double | String): Self = StObject.set(x, "pointsAtX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPointsAtXUndefined: Self = StObject.set(x, "pointsAtX", js.undefined)
        
        @scala.inline
        def setPointsAtY(value: Double | String): Self = StObject.set(x, "pointsAtY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPointsAtYUndefined: Self = StObject.set(x, "pointsAtY", js.undefined)
        
        @scala.inline
        def setPointsAtZ(value: Double | String): Self = StObject.set(x, "pointsAtZ", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPointsAtZUndefined: Self = StObject.set(x, "pointsAtZ", js.undefined)
        
        @scala.inline
        def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
        
        @scala.inline
        def setPreserveAlpha(value: Double | String): Self = StObject.set(x, "preserveAlpha", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreserveAlphaUndefined: Self = StObject.set(x, "preserveAlpha", js.undefined)
        
        @scala.inline
        def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
        
        @scala.inline
        def setPrimitiveUnits(value: Double | String): Self = StObject.set(x, "primitiveUnits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrimitiveUnitsUndefined: Self = StObject.set(x, "primitiveUnits", js.undefined)
        
        @scala.inline
        def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRUndefined: Self = StObject.set(x, "r", js.undefined)
        
        @scala.inline
        def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
        
        @scala.inline
        def setRefX(value: Double | String): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
        
        @scala.inline
        def setRefY(value: Double | String): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
        
        @scala.inline
        def setRenderingIntent(value: Double | String): Self = StObject.set(x, "renderingIntent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderingIntentUndefined: Self = StObject.set(x, "renderingIntent", js.undefined)
        
        @scala.inline
        def setRepeatCount(value: Double | String): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
        
        @scala.inline
        def setRepeatDur(value: Double | String): Self = StObject.set(x, "repeatDur", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRepeatDurUndefined: Self = StObject.set(x, "repeatDur", js.undefined)
        
        @scala.inline
        def setRequiredExtensions(value: Double | String): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequiredExtensionsUndefined: Self = StObject.set(x, "requiredExtensions", js.undefined)
        
        @scala.inline
        def setRequiredFeatures(value: Double | String): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
        
        @scala.inline
        def setRestart(value: Double | String): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
        
        @scala.inline
        def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
        
        @scala.inline
        def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
        
        @scala.inline
        def setRx(value: Double | String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
        
        @scala.inline
        def setRy(value: Double | String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
        
        @scala.inline
        def setScale(value: Double | String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
        
        @scala.inline
        def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
        
        @scala.inline
        def setShapeRendering(value: Double | String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
        
        @scala.inline
        def setSlope(value: Double | String): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlopeUndefined: Self = StObject.set(x, "slope", js.undefined)
        
        @scala.inline
        def setSpacing(value: Double | String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
        
        @scala.inline
        def setSpecularConstant(value: Double | String): Self = StObject.set(x, "specularConstant", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpecularConstantUndefined: Self = StObject.set(x, "specularConstant", js.undefined)
        
        @scala.inline
        def setSpecularExponent(value: Double | String): Self = StObject.set(x, "specularExponent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpecularExponentUndefined: Self = StObject.set(x, "specularExponent", js.undefined)
        
        @scala.inline
        def setSpeed(value: Double | String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
        
        @scala.inline
        def setSpreadMethod(value: String): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadMethodUndefined: Self = StObject.set(x, "spreadMethod", js.undefined)
        
        @scala.inline
        def setStartOffset(value: Double | String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
        
        @scala.inline
        def setStdDeviation(value: Double | String): Self = StObject.set(x, "stdDeviation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStdDeviationUndefined: Self = StObject.set(x, "stdDeviation", js.undefined)
        
        @scala.inline
        def setStemh(value: Double | String): Self = StObject.set(x, "stemh", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStemhUndefined: Self = StObject.set(x, "stemh", js.undefined)
        
        @scala.inline
        def setStemv(value: Double | String): Self = StObject.set(x, "stemv", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStemvUndefined: Self = StObject.set(x, "stemv", js.undefined)
        
        @scala.inline
        def setStitchTiles(value: Double | String): Self = StObject.set(x, "stitchTiles", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStitchTilesUndefined: Self = StObject.set(x, "stitchTiles", js.undefined)
        
        @scala.inline
        def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
        
        @scala.inline
        def setStopOpacity(value: Double | String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
        
        @scala.inline
        def setStrikethroughPosition(value: Double | String): Self = StObject.set(x, "strikethroughPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrikethroughPositionUndefined: Self = StObject.set(x, "strikethroughPosition", js.undefined)
        
        @scala.inline
        def setStrikethroughThickness(value: Double | String): Self = StObject.set(x, "strikethroughThickness", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrikethroughThicknessUndefined: Self = StObject.set(x, "strikethroughThickness", js.undefined)
        
        @scala.inline
        def setString(value: Double | String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
        
        @scala.inline
        def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrokeDasharray(value: String | Double): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
        
        @scala.inline
        def setStrokeDashoffset(value: String | Double): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
        
        @scala.inline
        def setStrokeLinecap(value: butt | round | square | inherit): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
        
        @scala.inline
        def setStrokeLinejoin(value: miter | round | bevel | inherit): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
        
        @scala.inline
        def setStrokeMiterlimit(value: String | Double): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
        
        @scala.inline
        def setStrokeOpacity(value: Double | String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
        
        @scala.inline
        def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
        
        @scala.inline
        def setStrokeWidth(value: Double | String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
        
        @scala.inline
        def setSurfaceScale(value: Double | String): Self = StObject.set(x, "surfaceScale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSurfaceScaleUndefined: Self = StObject.set(x, "surfaceScale", js.undefined)
        
        @scala.inline
        def setSystemLanguage(value: Double | String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSystemLanguageUndefined: Self = StObject.set(x, "systemLanguage", js.undefined)
        
        @scala.inline
        def setTableValues(value: Double | String): Self = StObject.set(x, "tableValues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableValuesUndefined: Self = StObject.set(x, "tableValues", js.undefined)
        
        @scala.inline
        def setTargetX(value: Double | String): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetXUndefined: Self = StObject.set(x, "targetX", js.undefined)
        
        @scala.inline
        def setTargetY(value: Double | String): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetYUndefined: Self = StObject.set(x, "targetY", js.undefined)
        
        @scala.inline
        def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
        
        @scala.inline
        def setTextDecoration(value: Double | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
        
        @scala.inline
        def setTextLength(value: Double | String): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
        
        @scala.inline
        def setTextRendering(value: Double | String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
        
        @scala.inline
        def setTo(value: Double | String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToUndefined: Self = StObject.set(x, "to", js.undefined)
        
        @scala.inline
        def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
        
        @scala.inline
        def setU1(value: Double | String): Self = StObject.set(x, "u1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setU1Undefined: Self = StObject.set(x, "u1", js.undefined)
        
        @scala.inline
        def setU2(value: Double | String): Self = StObject.set(x, "u2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setU2Undefined: Self = StObject.set(x, "u2", js.undefined)
        
        @scala.inline
        def setUnderlinePosition(value: Double | String): Self = StObject.set(x, "underlinePosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnderlinePositionUndefined: Self = StObject.set(x, "underlinePosition", js.undefined)
        
        @scala.inline
        def setUnderlineThickness(value: Double | String): Self = StObject.set(x, "underlineThickness", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnderlineThicknessUndefined: Self = StObject.set(x, "underlineThickness", js.undefined)
        
        @scala.inline
        def setUnicode(value: Double | String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnicodeBidi(value: Double | String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
        
        @scala.inline
        def setUnicodeRange(value: Double | String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
        
        @scala.inline
        def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
        
        @scala.inline
        def setUnitsPerEm(value: Double | String): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnitsPerEmUndefined: Self = StObject.set(x, "unitsPerEm", js.undefined)
        
        @scala.inline
        def setVAlphabetic(value: Double | String): Self = StObject.set(x, "vAlphabetic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVAlphabeticUndefined: Self = StObject.set(x, "vAlphabetic", js.undefined)
        
        @scala.inline
        def setVHanging(value: Double | String): Self = StObject.set(x, "vHanging", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVHangingUndefined: Self = StObject.set(x, "vHanging", js.undefined)
        
        @scala.inline
        def setVIdeographic(value: Double | String): Self = StObject.set(x, "vIdeographic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVIdeographicUndefined: Self = StObject.set(x, "vIdeographic", js.undefined)
        
        @scala.inline
        def setVMathematical(value: Double | String): Self = StObject.set(x, "vMathematical", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVMathematicalUndefined: Self = StObject.set(x, "vMathematical", js.undefined)
        
        @scala.inline
        def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        @scala.inline
        def setVectorEffect(value: Double | String): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
        
        @scala.inline
        def setVertAdvY(value: Double | String): Self = StObject.set(x, "vertAdvY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVertAdvYUndefined: Self = StObject.set(x, "vertAdvY", js.undefined)
        
        @scala.inline
        def setVertOriginX(value: Double | String): Self = StObject.set(x, "vertOriginX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVertOriginXUndefined: Self = StObject.set(x, "vertOriginX", js.undefined)
        
        @scala.inline
        def setVertOriginY(value: Double | String): Self = StObject.set(x, "vertOriginY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVertOriginYUndefined: Self = StObject.set(x, "vertOriginY", js.undefined)
        
        @scala.inline
        def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
        
        @scala.inline
        def setViewTarget(value: Double | String): Self = StObject.set(x, "viewTarget", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViewTargetUndefined: Self = StObject.set(x, "viewTarget", js.undefined)
        
        @scala.inline
        def setVisibility(value: Double | String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
        
        @scala.inline
        def setWidths(value: Double | String): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
        
        @scala.inline
        def setWordSpacing(value: Double | String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
        
        @scala.inline
        def setWritingMode(value: Double | String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
        
        @scala.inline
        def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX1(value: Double | String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
        
        @scala.inline
        def setX2(value: Double | String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
        
        @scala.inline
        def setXChannelSelector(value: String): Self = StObject.set(x, "xChannelSelector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXChannelSelectorUndefined: Self = StObject.set(x, "xChannelSelector", js.undefined)
        
        @scala.inline
        def setXHeight(value: Double | String): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXHeightUndefined: Self = StObject.set(x, "xHeight", js.undefined)
        
        @scala.inline
        def setXUndefined: Self = StObject.set(x, "x", js.undefined)
        
        @scala.inline
        def setXlinkActuate(value: String): Self = StObject.set(x, "xlinkActuate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXlinkActuateUndefined: Self = StObject.set(x, "xlinkActuate", js.undefined)
        
        @scala.inline
        def setXlinkArcrole(value: String): Self = StObject.set(x, "xlinkArcrole", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXlinkArcroleUndefined: Self = StObject.set(x, "xlinkArcrole", js.undefined)
        
        @scala.inline
        def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
        
        @scala.inline
        def setXlinkRole(value: String): Self = StObject.set(x, "xlinkRole", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXlinkRoleUndefined: Self = StObject.set(x, "xlinkRole", js.undefined)
        
        @scala.inline
        def setXlinkShow(value: String): Self = StObject.set(x, "xlinkShow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXlinkShowUndefined: Self = StObject.set(x, "xlinkShow", js.undefined)
        
        @scala.inline
        def setXlinkTitle(value: String): Self = StObject.set(x, "xlinkTitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXlinkTitleUndefined: Self = StObject.set(x, "xlinkTitle", js.undefined)
        
        @scala.inline
        def setXlinkType(value: String): Self = StObject.set(x, "xlinkType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXlinkTypeUndefined: Self = StObject.set(x, "xlinkType", js.undefined)
        
        @scala.inline
        def setXmlBase(value: String): Self = StObject.set(x, "xmlBase", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXmlBaseUndefined: Self = StObject.set(x, "xmlBase", js.undefined)
        
        @scala.inline
        def setXmlLang(value: String): Self = StObject.set(x, "xmlLang", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXmlLangUndefined: Self = StObject.set(x, "xmlLang", js.undefined)
        
        @scala.inline
        def setXmlSpace(value: String): Self = StObject.set(x, "xmlSpace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXmlSpaceUndefined: Self = StObject.set(x, "xmlSpace", js.undefined)
        
        @scala.inline
        def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
        
        @scala.inline
        def setXmlnsXlink(value: String): Self = StObject.set(x, "xmlnsXlink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXmlnsXlinkUndefined: Self = StObject.set(x, "xmlnsXlink", js.undefined)
        
        @scala.inline
        def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY1(value: Double | String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
        
        @scala.inline
        def setY2(value: Double | String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
        
        @scala.inline
        def setYChannelSelector(value: String): Self = StObject.set(x, "yChannelSelector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYChannelSelectorUndefined: Self = StObject.set(x, "yChannelSelector", js.undefined)
        
        @scala.inline
        def setYUndefined: Self = StObject.set(x, "y", js.undefined)
        
        @scala.inline
        def setZ(value: Double | String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZUndefined: Self = StObject.set(x, "z", js.undefined)
        
        @scala.inline
        def setZoomAndPan(value: String): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomAndPanUndefined: Self = StObject.set(x, "zoomAndPan", js.undefined)
      }
    }
    
    /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.AnimationEvent> */
    @js.native
    trait TargetedAnimationEvent[Target /* <: EventTarget */] extends StObject {
      
      var AT_TARGET: Double = js.native
      
      var BUBBLING_PHASE: Double = js.native
      
      var CAPTURING_PHASE: Double = js.native
      
      var NONE: Double = js.native
      
      var animationName: String = js.native
      
      var bubbles: Boolean = js.native
      
      var cancelBubble: Boolean = js.native
      
      var cancelable: Boolean = js.native
      
      var composed: Boolean = js.native
      
      def composedPath(): js.Array[EventTarget] = js.native
      @JSName("composedPath")
      var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
      
      val currentTarget: Target = js.native
      
      var defaultPrevented: Boolean = js.native
      
      var elapsedTime: Double = js.native
      
      var eventPhase: Double = js.native
      
      def initEvent(`type`: String): Unit = js.native
      @JSName("initEvent")
      var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
      
      var isTrusted: Boolean = js.native
      
      def preventDefault(): Unit = js.native
      @JSName("preventDefault")
      var preventDefault_Original: js.Function0[Unit] = js.native
      
      var pseudoElement: String = js.native
      
      var returnValue: Boolean = js.native
      
      var srcElement: js.UndefOr[EventTarget | Null] = js.native
      
      def stopImmediatePropagation(): Unit = js.native
      @JSName("stopImmediatePropagation")
      var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
      
      def stopPropagation(): Unit = js.native
      @JSName("stopPropagation")
      var stopPropagation_Original: js.Function0[Unit] = js.native
      
      var target: js.UndefOr[EventTarget | Null] = js.native
      
      var timeStamp: Double = js.native
      
      var `type`: String = js.native
    }
    
    /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.ClipboardEvent> */
    @js.native
    trait TargetedClipboardEvent[Target /* <: EventTarget */] extends StObject {
      
      var AT_TARGET: Double = js.native
      
      var BUBBLING_PHASE: Double = js.native
      
      var CAPTURING_PHASE: Double = js.native
      
      var NONE: Double = js.native
      
      var bubbles: Boolean = js.native
      
      var cancelBubble: Boolean = js.native
      
      var cancelable: Boolean = js.native
      
      var clipboardData: js.UndefOr[DataTransfer | Null] = js.native
      
      var composed: Boolean = js.native
      
      def composedPath(): js.Array[EventTarget] = js.native
      @JSName("composedPath")
      var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
      
      val currentTarget: Target = js.native
      
      var defaultPrevented: Boolean = js.native
      
      var eventPhase: Double = js.native
      
      def initEvent(`type`: String): Unit = js.native
      @JSName("initEvent")
      var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
      
      var isTrusted: Boolean = js.native
      
      def preventDefault(): Unit = js.native
      @JSName("preventDefault")
      var preventDefault_Original: js.Function0[Unit] = js.native
      
      var returnValue: Boolean = js.native
      
      var srcElement: js.UndefOr[EventTarget | Null] = js.native
      
      def stopImmediatePropagation(): Unit = js.native
      @JSName("stopImmediatePropagation")
      var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
      
      def stopPropagation(): Unit = js.native
      @JSName("stopPropagation")
      var stopPropagation_Original: js.Function0[Unit] = js.native
      
      var target: js.UndefOr[EventTarget | Null] = js.native
      
      var timeStamp: Double = js.native
      
      var `type`: String = js.native
    }
    
    /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.CompositionEvent> */
    @js.native
    trait TargetedCompositionEvent[Target /* <: EventTarget */] extends StObject {
      
      var AT_TARGET: Double = js.native
      
      var BUBBLING_PHASE: Double = js.native
      
      var CAPTURING_PHASE: Double = js.native
      
      var NONE: Double = js.native
      
      var bubbles: Boolean = js.native
      
      var cancelBubble: Boolean = js.native
      
      var cancelable: Boolean = js.native
      
      var composed: Boolean = js.native
      
      def composedPath(): js.Array[EventTarget] = js.native
      @JSName("composedPath")
      var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
      
      val currentTarget: Target = js.native
      
      var data: String = js.native
      
      var defaultPrevented: Boolean = js.native
      
      var detail: Double = js.native
      
      var eventPhase: Double = js.native
      
      def initEvent(`type`: String): Unit = js.native
      @JSName("initEvent")
      var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
      
      var isTrusted: Boolean = js.native
      
      def preventDefault(): Unit = js.native
      @JSName("preventDefault")
      var preventDefault_Original: js.Function0[Unit] = js.native
      
      var returnValue: Boolean = js.native
      
      var srcElement: js.UndefOr[EventTarget | Null] = js.native
      
      def stopImmediatePropagation(): Unit = js.native
      @JSName("stopImmediatePropagation")
      var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
      
      def stopPropagation(): Unit = js.native
      @JSName("stopPropagation")
      var stopPropagation_Original: js.Function0[Unit] = js.native
      
      var target: js.UndefOr[EventTarget | Null] = js.native
      
      var timeStamp: Double = js.native
      
      var `type`: String = js.native
      
      var view: js.UndefOr[Window | Null] = js.native
      
      var which: Double = js.native
    }
    
    /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.DragEvent> */
    @js.native
    trait TargetedDragEvent[Target /* <: EventTarget */] extends StObject {
      
      var AT_TARGET: Double = js.native
      
      var BUBBLING_PHASE: Double = js.native
      
      var CAPTURING_PHASE: Double = js.native
      
      var NONE: Double = js.native
      
      var altKey: Boolean = js.native
      
      var bubbles: Boolean = js.native
      
      var button: Double = js.native
      
      var buttons: Double = js.native
      
      var cancelBubble: Boolean = js.native
      
      var cancelable: Boolean = js.native
      
      var clientX: Double = js.native
      
      var clientY: Double = js.native
      
      var composed: Boolean = js.native
      
      def composedPath(): js.Array[EventTarget] = js.native
      @JSName("composedPath")
      var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
      
      var ctrlKey: Boolean = js.native
      
      val currentTarget: Target = js.native
      
      var dataTransfer: js.UndefOr[DataTransfer | Null] = js.native
      
      var defaultPrevented: Boolean = js.native
      
      var detail: Double = js.native
      
      var eventPhase: Double = js.native
      
      def getModifierState(keyArg: String): Boolean = js.native
      @JSName("getModifierState")
      var getModifierState_Original: js.Function1[/* keyArg */ String, Boolean] = js.native
      
      def initEvent(`type`: String): Unit = js.native
      @JSName("initEvent")
      var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
      
      def initMouseEvent(
        typeArg: String,
        canBubbleArg: Boolean,
        cancelableArg: Boolean,
        viewArg: Window,
        detailArg: Double,
        screenXArg: Double,
        screenYArg: Double,
        clientXArg: Double,
        clientYArg: Double,
        ctrlKeyArg: Boolean,
        altKeyArg: Boolean,
        shiftKeyArg: Boolean,
        metaKeyArg: Boolean,
        buttonArg: Double
      ): Unit = js.native
      @JSName("initMouseEvent")
      var initMouseEvent_Original: js.Function14[
            /* typeArg */ String, 
            /* canBubbleArg */ Boolean, 
            /* cancelableArg */ Boolean, 
            /* viewArg */ Window, 
            /* detailArg */ Double, 
            /* screenXArg */ Double, 
            /* screenYArg */ Double, 
            /* clientXArg */ Double, 
            /* clientYArg */ Double, 
            /* ctrlKeyArg */ Boolean, 
            /* altKeyArg */ Boolean, 
            /* shiftKeyArg */ Boolean, 
            /* metaKeyArg */ Boolean, 
            /* buttonArg */ Double, 
            Unit
          ] = js.native
      
      var isTrusted: Boolean = js.native
      
      var metaKey: Boolean = js.native
      
      var movementX: Double = js.native
      
      var movementY: Double = js.native
      
      var offsetX: Double = js.native
      
      var offsetY: Double = js.native
      
      var pageX: Double = js.native
      
      var pageY: Double = js.native
      
      def preventDefault(): Unit = js.native
      @JSName("preventDefault")
      var preventDefault_Original: js.Function0[Unit] = js.native
      
      var relatedTarget: js.UndefOr[EventTarget | Null] = js.native
      
      var returnValue: Boolean = js.native
      
      var screenX: Double = js.native
      
      var screenY: Double = js.native
      
      var shiftKey: Boolean = js.native
      
      var srcElement: js.UndefOr[EventTarget | Null] = js.native
      
      def stopImmediatePropagation(): Unit = js.native
      @JSName("stopImmediatePropagation")
      var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
      
      def stopPropagation(): Unit = js.native
      @JSName("stopPropagation")
      var stopPropagation_Original: js.Function0[Unit] = js.native
      
      var target: js.UndefOr[EventTarget | Null] = js.native
      
      var timeStamp: Double = js.native
      
      var `type`: String = js.native
      
      var view: js.UndefOr[Window | Null] = js.native
      
      var which: Double = js.native
      
      var x: Double = js.native
      
      var y: Double = js.native
    }
    
    type TargetedEvent[Target /* <: EventTarget */, TypedEvent /* <: Event */] = (Omit[TypedEvent, currentTarget]) with CurrentTarget[Target]
    
    /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.FocusEvent> */
    @js.native
    trait TargetedFocusEvent[Target /* <: EventTarget */] extends StObject {
      
      var AT_TARGET: Double = js.native
      
      var BUBBLING_PHASE: Double = js.native
      
      var CAPTURING_PHASE: Double = js.native
      
      var NONE: Double = js.native
      
      var bubbles: Boolean = js.native
      
      var cancelBubble: Boolean = js.native
      
      var cancelable: Boolean = js.native
      
      var composed: Boolean = js.native
      
      def composedPath(): js.Array[EventTarget] = js.native
      @JSName("composedPath")
      var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
      
      val currentTarget: Target = js.native
      
      var defaultPrevented: Boolean = js.native
      
      var detail: Double = js.native
      
      var eventPhase: Double = js.native
      
      def initEvent(`type`: String): Unit = js.native
      @JSName("initEvent")
      var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
      
      var isTrusted: Boolean = js.native
      
      def preventDefault(): Unit = js.native
      @JSName("preventDefault")
      var preventDefault_Original: js.Function0[Unit] = js.native
      
      var relatedTarget: js.UndefOr[EventTarget | Null] = js.native
      
      var returnValue: Boolean = js.native
      
      var srcElement: js.UndefOr[EventTarget | Null] = js.native
      
      def stopImmediatePropagation(): Unit = js.native
      @JSName("stopImmediatePropagation")
      var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
      
      def stopPropagation(): Unit = js.native
      @JSName("stopPropagation")
      var stopPropagation_Original: js.Function0[Unit] = js.native
      
      var target: js.UndefOr[EventTarget | Null] = js.native
      
      var timeStamp: Double = js.native
      
      var `type`: String = js.native
      
      var view: js.UndefOr[Window | Null] = js.native
      
      var which: Double = js.native
    }
    
    /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.KeyboardEvent> */
    @js.native
    trait TargetedKeyboardEvent[Target /* <: EventTarget */] extends StObject {
      
      var AT_TARGET: Double = js.native
      
      var BUBBLING_PHASE: Double = js.native
      
      var CAPTURING_PHASE: Double = js.native
      
      var DOM_KEY_LOCATION_LEFT: Double = js.native
      
      var DOM_KEY_LOCATION_NUMPAD: Double = js.native
      
      var DOM_KEY_LOCATION_RIGHT: Double = js.native
      
      var DOM_KEY_LOCATION_STANDARD: Double = js.native
      
      var NONE: Double = js.native
      
      var altKey: Boolean = js.native
      
      var bubbles: Boolean = js.native
      
      var cancelBubble: Boolean = js.native
      
      var cancelable: Boolean = js.native
      
      var char: String = js.native
      
      var charCode: Double = js.native
      
      var code: String = js.native
      
      var composed: Boolean = js.native
      
      def composedPath(): js.Array[EventTarget] = js.native
      @JSName("composedPath")
      var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
      
      var ctrlKey: Boolean = js.native
      
      val currentTarget: Target = js.native
      
      var defaultPrevented: Boolean = js.native
      
      var detail: Double = js.native
      
      var eventPhase: Double = js.native
      
      def getModifierState(keyArg: String): Boolean = js.native
      @JSName("getModifierState")
      var getModifierState_Original: js.Function1[/* keyArg */ String, Boolean] = js.native
      
      def initEvent(`type`: String): Unit = js.native
      @JSName("initEvent")
      var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
      
      var isComposing: Boolean = js.native
      
      var isTrusted: Boolean = js.native
      
      var key: String = js.native
      
      var keyCode: Double = js.native
      
      var location: Double = js.native
      
      var metaKey: Boolean = js.native
      
      def preventDefault(): Unit = js.native
      @JSName("preventDefault")
      var preventDefault_Original: js.Function0[Unit] = js.native
      
      var repeat: Boolean = js.native
      
      var returnValue: Boolean = js.native
      
      var shiftKey: Boolean = js.native
      
      var srcElement: js.UndefOr[EventTarget | Null] = js.native
      
      def stopImmediatePropagation(): Unit = js.native
      @JSName("stopImmediatePropagation")
      var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
      
      def stopPropagation(): Unit = js.native
      @JSName("stopPropagation")
      var stopPropagation_Original: js.Function0[Unit] = js.native
      
      var target: js.UndefOr[EventTarget | Null] = js.native
      
      var timeStamp: Double = js.native
      
      var `type`: String = js.native
      
      var view: js.UndefOr[Window | Null] = js.native
      
      var which: Double = js.native
    }
    
    /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.MouseEvent> */
    @js.native
    trait TargetedMouseEvent[Target /* <: EventTarget */] extends StObject {
      
      var AT_TARGET: Double = js.native
      
      var BUBBLING_PHASE: Double = js.native
      
      var CAPTURING_PHASE: Double = js.native
      
      var NONE: Double = js.native
      
      var altKey: Boolean = js.native
      
      var bubbles: Boolean = js.native
      
      var button: Double = js.native
      
      var buttons: Double = js.native
      
      var cancelBubble: Boolean = js.native
      
      var cancelable: Boolean = js.native
      
      var clientX: Double = js.native
      
      var clientY: Double = js.native
      
      var composed: Boolean = js.native
      
      def composedPath(): js.Array[EventTarget] = js.native
      @JSName("composedPath")
      var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
      
      var ctrlKey: Boolean = js.native
      
      val currentTarget: Target = js.native
      
      var defaultPrevented: Boolean = js.native
      
      var detail: Double = js.native
      
      var eventPhase: Double = js.native
      
      def getModifierState(keyArg: String): Boolean = js.native
      @JSName("getModifierState")
      var getModifierState_Original: js.Function1[/* keyArg */ String, Boolean] = js.native
      
      def initEvent(`type`: String): Unit = js.native
      @JSName("initEvent")
      var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
      
      def initMouseEvent(
        typeArg: String,
        canBubbleArg: Boolean,
        cancelableArg: Boolean,
        viewArg: Window,
        detailArg: Double,
        screenXArg: Double,
        screenYArg: Double,
        clientXArg: Double,
        clientYArg: Double,
        ctrlKeyArg: Boolean,
        altKeyArg: Boolean,
        shiftKeyArg: Boolean,
        metaKeyArg: Boolean,
        buttonArg: Double
      ): Unit = js.native
      @JSName("initMouseEvent")
      var initMouseEvent_Original: js.Function14[
            /* typeArg */ String, 
            /* canBubbleArg */ Boolean, 
            /* cancelableArg */ Boolean, 
            /* viewArg */ Window, 
            /* detailArg */ Double, 
            /* screenXArg */ Double, 
            /* screenYArg */ Double, 
            /* clientXArg */ Double, 
            /* clientYArg */ Double, 
            /* ctrlKeyArg */ Boolean, 
            /* altKeyArg */ Boolean, 
            /* shiftKeyArg */ Boolean, 
            /* metaKeyArg */ Boolean, 
            /* buttonArg */ Double, 
            Unit
          ] = js.native
      
      var isTrusted: Boolean = js.native
      
      var metaKey: Boolean = js.native
      
      var movementX: Double = js.native
      
      var movementY: Double = js.native
      
      var offsetX: Double = js.native
      
      var offsetY: Double = js.native
      
      var pageX: Double = js.native
      
      var pageY: Double = js.native
      
      def preventDefault(): Unit = js.native
      @JSName("preventDefault")
      var preventDefault_Original: js.Function0[Unit] = js.native
      
      var relatedTarget: js.UndefOr[EventTarget | Null] = js.native
      
      var returnValue: Boolean = js.native
      
      var screenX: Double = js.native
      
      var screenY: Double = js.native
      
      var shiftKey: Boolean = js.native
      
      var srcElement: js.UndefOr[EventTarget | Null] = js.native
      
      def stopImmediatePropagation(): Unit = js.native
      @JSName("stopImmediatePropagation")
      var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
      
      def stopPropagation(): Unit = js.native
      @JSName("stopPropagation")
      var stopPropagation_Original: js.Function0[Unit] = js.native
      
      var target: js.UndefOr[EventTarget | Null] = js.native
      
      var timeStamp: Double = js.native
      
      var `type`: String = js.native
      
      var view: js.UndefOr[Window | Null] = js.native
      
      var which: Double = js.native
      
      var x: Double = js.native
      
      var y: Double = js.native
    }
    
    /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.PointerEvent> */
    @js.native
    trait TargetedPointerEvent[Target /* <: EventTarget */] extends StObject {
      
      var AT_TARGET: Double = js.native
      
      var BUBBLING_PHASE: Double = js.native
      
      var CAPTURING_PHASE: Double = js.native
      
      var NONE: Double = js.native
      
      var altKey: Boolean = js.native
      
      var bubbles: Boolean = js.native
      
      var button: Double = js.native
      
      var buttons: Double = js.native
      
      var cancelBubble: Boolean = js.native
      
      var cancelable: Boolean = js.native
      
      var clientX: Double = js.native
      
      var clientY: Double = js.native
      
      var composed: Boolean = js.native
      
      def composedPath(): js.Array[EventTarget] = js.native
      @JSName("composedPath")
      var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
      
      var ctrlKey: Boolean = js.native
      
      val currentTarget: Target = js.native
      
      var defaultPrevented: Boolean = js.native
      
      var detail: Double = js.native
      
      var eventPhase: Double = js.native
      
      def getModifierState(keyArg: String): Boolean = js.native
      @JSName("getModifierState")
      var getModifierState_Original: js.Function1[/* keyArg */ String, Boolean] = js.native
      
      var height: Double = js.native
      
      def initEvent(`type`: String): Unit = js.native
      @JSName("initEvent")
      var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
      
      def initMouseEvent(
        typeArg: String,
        canBubbleArg: Boolean,
        cancelableArg: Boolean,
        viewArg: Window,
        detailArg: Double,
        screenXArg: Double,
        screenYArg: Double,
        clientXArg: Double,
        clientYArg: Double,
        ctrlKeyArg: Boolean,
        altKeyArg: Boolean,
        shiftKeyArg: Boolean,
        metaKeyArg: Boolean,
        buttonArg: Double
      ): Unit = js.native
      @JSName("initMouseEvent")
      var initMouseEvent_Original: js.Function14[
            /* typeArg */ String, 
            /* canBubbleArg */ Boolean, 
            /* cancelableArg */ Boolean, 
            /* viewArg */ Window, 
            /* detailArg */ Double, 
            /* screenXArg */ Double, 
            /* screenYArg */ Double, 
            /* clientXArg */ Double, 
            /* clientYArg */ Double, 
            /* ctrlKeyArg */ Boolean, 
            /* altKeyArg */ Boolean, 
            /* shiftKeyArg */ Boolean, 
            /* metaKeyArg */ Boolean, 
            /* buttonArg */ Double, 
            Unit
          ] = js.native
      
      var isPrimary: Boolean = js.native
      
      var isTrusted: Boolean = js.native
      
      var metaKey: Boolean = js.native
      
      var movementX: Double = js.native
      
      var movementY: Double = js.native
      
      var offsetX: Double = js.native
      
      var offsetY: Double = js.native
      
      var pageX: Double = js.native
      
      var pageY: Double = js.native
      
      var pointerId: Double = js.native
      
      var pointerType: String = js.native
      
      var pressure: Double = js.native
      
      def preventDefault(): Unit = js.native
      @JSName("preventDefault")
      var preventDefault_Original: js.Function0[Unit] = js.native
      
      var relatedTarget: js.UndefOr[EventTarget | Null] = js.native
      
      var returnValue: Boolean = js.native
      
      var screenX: Double = js.native
      
      var screenY: Double = js.native
      
      var shiftKey: Boolean = js.native
      
      var srcElement: js.UndefOr[EventTarget | Null] = js.native
      
      def stopImmediatePropagation(): Unit = js.native
      @JSName("stopImmediatePropagation")
      var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
      
      def stopPropagation(): Unit = js.native
      @JSName("stopPropagation")
      var stopPropagation_Original: js.Function0[Unit] = js.native
      
      var tangentialPressure: Double = js.native
      
      var target: js.UndefOr[EventTarget | Null] = js.native
      
      var tiltX: Double = js.native
      
      var tiltY: Double = js.native
      
      var timeStamp: Double = js.native
      
      var twist: Double = js.native
      
      var `type`: String = js.native
      
      var view: js.UndefOr[Window | Null] = js.native
      
      var which: Double = js.native
      
      var width: Double = js.native
      
      var x: Double = js.native
      
      var y: Double = js.native
    }
    
    /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.TouchEvent> */
    @js.native
    trait TargetedTouchEvent[Target /* <: EventTarget */] extends StObject {
      
      var AT_TARGET: Double = js.native
      
      var BUBBLING_PHASE: Double = js.native
      
      var CAPTURING_PHASE: Double = js.native
      
      var NONE: Double = js.native
      
      var altKey: Boolean = js.native
      
      var bubbles: Boolean = js.native
      
      var cancelBubble: Boolean = js.native
      
      var cancelable: Boolean = js.native
      
      var changedTouches: TouchList = js.native
      
      var composed: Boolean = js.native
      
      def composedPath(): js.Array[EventTarget] = js.native
      @JSName("composedPath")
      var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
      
      var ctrlKey: Boolean = js.native
      
      val currentTarget: Target = js.native
      
      var defaultPrevented: Boolean = js.native
      
      var detail: Double = js.native
      
      var eventPhase: Double = js.native
      
      def initEvent(`type`: String): Unit = js.native
      @JSName("initEvent")
      var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
      
      var isTrusted: Boolean = js.native
      
      var metaKey: Boolean = js.native
      
      def preventDefault(): Unit = js.native
      @JSName("preventDefault")
      var preventDefault_Original: js.Function0[Unit] = js.native
      
      var returnValue: Boolean = js.native
      
      var shiftKey: Boolean = js.native
      
      var srcElement: js.UndefOr[EventTarget | Null] = js.native
      
      def stopImmediatePropagation(): Unit = js.native
      @JSName("stopImmediatePropagation")
      var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
      
      def stopPropagation(): Unit = js.native
      @JSName("stopPropagation")
      var stopPropagation_Original: js.Function0[Unit] = js.native
      
      var target: js.UndefOr[EventTarget | Null] = js.native
      
      var targetTouches: TouchList = js.native
      
      var timeStamp: Double = js.native
      
      var touches: TouchList = js.native
      
      var `type`: String = js.native
      
      var view: js.UndefOr[Window | Null] = js.native
      
      var which: Double = js.native
    }
    
    /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.TransitionEvent> */
    @js.native
    trait TargetedTransitionEvent[Target /* <: EventTarget */] extends StObject {
      
      var AT_TARGET: Double = js.native
      
      var BUBBLING_PHASE: Double = js.native
      
      var CAPTURING_PHASE: Double = js.native
      
      var NONE: Double = js.native
      
      var bubbles: Boolean = js.native
      
      var cancelBubble: Boolean = js.native
      
      var cancelable: Boolean = js.native
      
      var composed: Boolean = js.native
      
      def composedPath(): js.Array[EventTarget] = js.native
      @JSName("composedPath")
      var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
      
      val currentTarget: Target = js.native
      
      var defaultPrevented: Boolean = js.native
      
      var elapsedTime: Double = js.native
      
      var eventPhase: Double = js.native
      
      def initEvent(`type`: String): Unit = js.native
      @JSName("initEvent")
      var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
      
      var isTrusted: Boolean = js.native
      
      def preventDefault(): Unit = js.native
      @JSName("preventDefault")
      var preventDefault_Original: js.Function0[Unit] = js.native
      
      var propertyName: String = js.native
      
      var pseudoElement: String = js.native
      
      var returnValue: Boolean = js.native
      
      var srcElement: js.UndefOr[EventTarget | Null] = js.native
      
      def stopImmediatePropagation(): Unit = js.native
      @JSName("stopImmediatePropagation")
      var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
      
      def stopPropagation(): Unit = js.native
      @JSName("stopPropagation")
      var stopPropagation_Original: js.Function0[Unit] = js.native
      
      var target: js.UndefOr[EventTarget | Null] = js.native
      
      var timeStamp: Double = js.native
      
      var `type`: String = js.native
    }
    
    /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.UIEvent> */
    @js.native
    trait TargetedUIEvent[Target /* <: EventTarget */] extends StObject {
      
      var AT_TARGET: Double = js.native
      
      var BUBBLING_PHASE: Double = js.native
      
      var CAPTURING_PHASE: Double = js.native
      
      var NONE: Double = js.native
      
      var bubbles: Boolean = js.native
      
      var cancelBubble: Boolean = js.native
      
      var cancelable: Boolean = js.native
      
      var composed: Boolean = js.native
      
      def composedPath(): js.Array[EventTarget] = js.native
      @JSName("composedPath")
      var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
      
      val currentTarget: Target = js.native
      
      var defaultPrevented: Boolean = js.native
      
      var detail: Double = js.native
      
      var eventPhase: Double = js.native
      
      def initEvent(`type`: String): Unit = js.native
      @JSName("initEvent")
      var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
      
      var isTrusted: Boolean = js.native
      
      def preventDefault(): Unit = js.native
      @JSName("preventDefault")
      var preventDefault_Original: js.Function0[Unit] = js.native
      
      var returnValue: Boolean = js.native
      
      var srcElement: js.UndefOr[EventTarget | Null] = js.native
      
      def stopImmediatePropagation(): Unit = js.native
      @JSName("stopImmediatePropagation")
      var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
      
      def stopPropagation(): Unit = js.native
      @JSName("stopPropagation")
      var stopPropagation_Original: js.Function0[Unit] = js.native
      
      var target: js.UndefOr[EventTarget | Null] = js.native
      
      var timeStamp: Double = js.native
      
      var `type`: String = js.native
      
      var view: js.UndefOr[Window | Null] = js.native
      
      var which: Double = js.native
    }
    
    /* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.WheelEvent> */
    @js.native
    trait TargetedWheelEvent[Target /* <: EventTarget */] extends StObject {
      
      var AT_TARGET: Double = js.native
      
      var BUBBLING_PHASE: Double = js.native
      
      var CAPTURING_PHASE: Double = js.native
      
      var DOM_DELTA_LINE: Double = js.native
      
      var DOM_DELTA_PAGE: Double = js.native
      
      var DOM_DELTA_PIXEL: Double = js.native
      
      var NONE: Double = js.native
      
      var altKey: Boolean = js.native
      
      var bubbles: Boolean = js.native
      
      var button: Double = js.native
      
      var buttons: Double = js.native
      
      var cancelBubble: Boolean = js.native
      
      var cancelable: Boolean = js.native
      
      var clientX: Double = js.native
      
      var clientY: Double = js.native
      
      var composed: Boolean = js.native
      
      def composedPath(): js.Array[EventTarget] = js.native
      @JSName("composedPath")
      var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
      
      var ctrlKey: Boolean = js.native
      
      val currentTarget: Target = js.native
      
      var defaultPrevented: Boolean = js.native
      
      var deltaMode: Double = js.native
      
      var deltaX: Double = js.native
      
      var deltaY: Double = js.native
      
      var deltaZ: Double = js.native
      
      var detail: Double = js.native
      
      var eventPhase: Double = js.native
      
      def getModifierState(keyArg: String): Boolean = js.native
      @JSName("getModifierState")
      var getModifierState_Original: js.Function1[/* keyArg */ String, Boolean] = js.native
      
      def initEvent(`type`: String): Unit = js.native
      @JSName("initEvent")
      var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
      
      def initMouseEvent(
        typeArg: String,
        canBubbleArg: Boolean,
        cancelableArg: Boolean,
        viewArg: Window,
        detailArg: Double,
        screenXArg: Double,
        screenYArg: Double,
        clientXArg: Double,
        clientYArg: Double,
        ctrlKeyArg: Boolean,
        altKeyArg: Boolean,
        shiftKeyArg: Boolean,
        metaKeyArg: Boolean,
        buttonArg: Double
      ): Unit = js.native
      @JSName("initMouseEvent")
      var initMouseEvent_Original: js.Function14[
            /* typeArg */ String, 
            /* canBubbleArg */ Boolean, 
            /* cancelableArg */ Boolean, 
            /* viewArg */ Window, 
            /* detailArg */ Double, 
            /* screenXArg */ Double, 
            /* screenYArg */ Double, 
            /* clientXArg */ Double, 
            /* clientYArg */ Double, 
            /* ctrlKeyArg */ Boolean, 
            /* altKeyArg */ Boolean, 
            /* shiftKeyArg */ Boolean, 
            /* metaKeyArg */ Boolean, 
            /* buttonArg */ Double, 
            Unit
          ] = js.native
      
      var isTrusted: Boolean = js.native
      
      var metaKey: Boolean = js.native
      
      var movementX: Double = js.native
      
      var movementY: Double = js.native
      
      var offsetX: Double = js.native
      
      var offsetY: Double = js.native
      
      var pageX: Double = js.native
      
      var pageY: Double = js.native
      
      def preventDefault(): Unit = js.native
      @JSName("preventDefault")
      var preventDefault_Original: js.Function0[Unit] = js.native
      
      var relatedTarget: js.UndefOr[EventTarget | Null] = js.native
      
      var returnValue: Boolean = js.native
      
      var screenX: Double = js.native
      
      var screenY: Double = js.native
      
      var shiftKey: Boolean = js.native
      
      var srcElement: js.UndefOr[EventTarget | Null] = js.native
      
      def stopImmediatePropagation(): Unit = js.native
      @JSName("stopImmediatePropagation")
      var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
      
      def stopPropagation(): Unit = js.native
      @JSName("stopPropagation")
      var stopPropagation_Original: js.Function0[Unit] = js.native
      
      var target: js.UndefOr[EventTarget | Null] = js.native
      
      var timeStamp: Double = js.native
      
      var `type`: String = js.native
      
      var view: js.UndefOr[Window | Null] = js.native
      
      var which: Double = js.native
      
      var x: Double = js.native
      
      var y: Double = js.native
    }
    
    type TouchEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedTouchEvent[Target]]
    
    type TransitionEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedTransitionEvent[Target]]
    
    type UIEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedUIEvent[Target]]
    
    type WheelEventHandler[Target /* <: EventTarget */] = typingsSlinky.preact.jsxMod.JSXInternal.EventHandler[typingsSlinky.preact.jsxMod.JSXInternal.TargetedWheelEvent[Target]]
  }
}
