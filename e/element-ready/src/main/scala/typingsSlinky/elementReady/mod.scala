package typingsSlinky.elementReady

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
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
import org.scalajs.dom.raw.HTMLElement
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
import org.scalajs.dom.raw.HTMLTableColElement
import org.scalajs.dom.raw.HTMLTableElement
import org.scalajs.dom.raw.HTMLTableRowElement
import org.scalajs.dom.raw.HTMLTableSectionElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import org.scalajs.dom.raw.HTMLTitleElement
import org.scalajs.dom.raw.HTMLTrackElement
import org.scalajs.dom.raw.HTMLUListElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.SVGCircleElement
import org.scalajs.dom.raw.SVGClipPathElement
import org.scalajs.dom.raw.SVGDefsElement
import org.scalajs.dom.raw.SVGDescElement
import org.scalajs.dom.raw.SVGEllipseElement
import org.scalajs.dom.raw.SVGFEBlendElement
import org.scalajs.dom.raw.SVGFEColorMatrixElement
import org.scalajs.dom.raw.SVGFEComponentTransferElement
import org.scalajs.dom.raw.SVGFECompositeElement
import org.scalajs.dom.raw.SVGFEConvolveMatrixElement
import org.scalajs.dom.raw.SVGFEDiffuseLightingElement
import org.scalajs.dom.raw.SVGFEDisplacementMapElement
import org.scalajs.dom.raw.SVGFEDistantLightElement
import org.scalajs.dom.raw.SVGFEFloodElement
import org.scalajs.dom.raw.SVGFEFuncAElement
import org.scalajs.dom.raw.SVGFEFuncBElement
import org.scalajs.dom.raw.SVGFEFuncGElement
import org.scalajs.dom.raw.SVGFEFuncRElement
import org.scalajs.dom.raw.SVGFEGaussianBlurElement
import org.scalajs.dom.raw.SVGFEImageElement
import org.scalajs.dom.raw.SVGFEMergeElement
import org.scalajs.dom.raw.SVGFEMergeNodeElement
import org.scalajs.dom.raw.SVGFEMorphologyElement
import org.scalajs.dom.raw.SVGFEOffsetElement
import org.scalajs.dom.raw.SVGFEPointLightElement
import org.scalajs.dom.raw.SVGFESpecularLightingElement
import org.scalajs.dom.raw.SVGFESpotLightElement
import org.scalajs.dom.raw.SVGFETileElement
import org.scalajs.dom.raw.SVGFETurbulenceElement
import org.scalajs.dom.raw.SVGFilterElement
import org.scalajs.dom.raw.SVGGElement
import org.scalajs.dom.raw.SVGImageElement
import org.scalajs.dom.raw.SVGLineElement
import org.scalajs.dom.raw.SVGLinearGradientElement
import org.scalajs.dom.raw.SVGMarkerElement
import org.scalajs.dom.raw.SVGMaskElement
import org.scalajs.dom.raw.SVGMetadataElement
import org.scalajs.dom.raw.SVGPathElement
import org.scalajs.dom.raw.SVGPatternElement
import org.scalajs.dom.raw.SVGPolygonElement
import org.scalajs.dom.raw.SVGPolylineElement
import org.scalajs.dom.raw.SVGRadialGradientElement
import org.scalajs.dom.raw.SVGRectElement
import org.scalajs.dom.raw.SVGSVGElement
import org.scalajs.dom.raw.SVGStopElement
import org.scalajs.dom.raw.SVGSwitchElement
import org.scalajs.dom.raw.SVGSymbolElement
import org.scalajs.dom.raw.SVGTSpanElement
import org.scalajs.dom.raw.SVGTextElement
import org.scalajs.dom.raw.SVGTextPathElement
import org.scalajs.dom.raw.SVGUseElement
import org.scalajs.dom.raw.SVGViewElement
import typingsSlinky.elementReady.elementReadyStrings.`object`
import typingsSlinky.elementReady.elementReadyStrings.`var`
import typingsSlinky.elementReady.elementReadyStrings.a
import typingsSlinky.elementReady.elementReadyStrings.abbr
import typingsSlinky.elementReady.elementReadyStrings.address
import typingsSlinky.elementReady.elementReadyStrings.applet
import typingsSlinky.elementReady.elementReadyStrings.area
import typingsSlinky.elementReady.elementReadyStrings.article
import typingsSlinky.elementReady.elementReadyStrings.aside
import typingsSlinky.elementReady.elementReadyStrings.audio
import typingsSlinky.elementReady.elementReadyStrings.b
import typingsSlinky.elementReady.elementReadyStrings.base
import typingsSlinky.elementReady.elementReadyStrings.basefont
import typingsSlinky.elementReady.elementReadyStrings.bdi
import typingsSlinky.elementReady.elementReadyStrings.bdo
import typingsSlinky.elementReady.elementReadyStrings.blockquote
import typingsSlinky.elementReady.elementReadyStrings.body
import typingsSlinky.elementReady.elementReadyStrings.br
import typingsSlinky.elementReady.elementReadyStrings.button
import typingsSlinky.elementReady.elementReadyStrings.canvas
import typingsSlinky.elementReady.elementReadyStrings.caption
import typingsSlinky.elementReady.elementReadyStrings.circle
import typingsSlinky.elementReady.elementReadyStrings.cite
import typingsSlinky.elementReady.elementReadyStrings.clipPath
import typingsSlinky.elementReady.elementReadyStrings.code
import typingsSlinky.elementReady.elementReadyStrings.col
import typingsSlinky.elementReady.elementReadyStrings.colgroup
import typingsSlinky.elementReady.elementReadyStrings.data
import typingsSlinky.elementReady.elementReadyStrings.datalist
import typingsSlinky.elementReady.elementReadyStrings.dd
import typingsSlinky.elementReady.elementReadyStrings.defs
import typingsSlinky.elementReady.elementReadyStrings.del
import typingsSlinky.elementReady.elementReadyStrings.desc
import typingsSlinky.elementReady.elementReadyStrings.details
import typingsSlinky.elementReady.elementReadyStrings.dfn
import typingsSlinky.elementReady.elementReadyStrings.dialog
import typingsSlinky.elementReady.elementReadyStrings.dir
import typingsSlinky.elementReady.elementReadyStrings.div
import typingsSlinky.elementReady.elementReadyStrings.dl
import typingsSlinky.elementReady.elementReadyStrings.dt
import typingsSlinky.elementReady.elementReadyStrings.ellipse
import typingsSlinky.elementReady.elementReadyStrings.em
import typingsSlinky.elementReady.elementReadyStrings.embed
import typingsSlinky.elementReady.elementReadyStrings.feBlend
import typingsSlinky.elementReady.elementReadyStrings.feColorMatrix
import typingsSlinky.elementReady.elementReadyStrings.feComponentTransfer
import typingsSlinky.elementReady.elementReadyStrings.feComposite
import typingsSlinky.elementReady.elementReadyStrings.feConvolveMatrix
import typingsSlinky.elementReady.elementReadyStrings.feDiffuseLighting
import typingsSlinky.elementReady.elementReadyStrings.feDisplacementMap
import typingsSlinky.elementReady.elementReadyStrings.feDistantLight
import typingsSlinky.elementReady.elementReadyStrings.feFlood
import typingsSlinky.elementReady.elementReadyStrings.feFuncA
import typingsSlinky.elementReady.elementReadyStrings.feFuncB
import typingsSlinky.elementReady.elementReadyStrings.feFuncG
import typingsSlinky.elementReady.elementReadyStrings.feFuncR
import typingsSlinky.elementReady.elementReadyStrings.feGaussianBlur
import typingsSlinky.elementReady.elementReadyStrings.feImage
import typingsSlinky.elementReady.elementReadyStrings.feMerge
import typingsSlinky.elementReady.elementReadyStrings.feMergeNode
import typingsSlinky.elementReady.elementReadyStrings.feMorphology
import typingsSlinky.elementReady.elementReadyStrings.feOffset
import typingsSlinky.elementReady.elementReadyStrings.fePointLight
import typingsSlinky.elementReady.elementReadyStrings.feSpecularLighting
import typingsSlinky.elementReady.elementReadyStrings.feSpotLight
import typingsSlinky.elementReady.elementReadyStrings.feTile
import typingsSlinky.elementReady.elementReadyStrings.feTurbulence
import typingsSlinky.elementReady.elementReadyStrings.fieldset
import typingsSlinky.elementReady.elementReadyStrings.figcaption
import typingsSlinky.elementReady.elementReadyStrings.figure
import typingsSlinky.elementReady.elementReadyStrings.filter
import typingsSlinky.elementReady.elementReadyStrings.font
import typingsSlinky.elementReady.elementReadyStrings.footer
import typingsSlinky.elementReady.elementReadyStrings.foreignObject
import typingsSlinky.elementReady.elementReadyStrings.form
import typingsSlinky.elementReady.elementReadyStrings.frame
import typingsSlinky.elementReady.elementReadyStrings.frameset
import typingsSlinky.elementReady.elementReadyStrings.g
import typingsSlinky.elementReady.elementReadyStrings.h1
import typingsSlinky.elementReady.elementReadyStrings.h2
import typingsSlinky.elementReady.elementReadyStrings.h3
import typingsSlinky.elementReady.elementReadyStrings.h4
import typingsSlinky.elementReady.elementReadyStrings.h5
import typingsSlinky.elementReady.elementReadyStrings.h6
import typingsSlinky.elementReady.elementReadyStrings.head
import typingsSlinky.elementReady.elementReadyStrings.header
import typingsSlinky.elementReady.elementReadyStrings.hgroup
import typingsSlinky.elementReady.elementReadyStrings.hr
import typingsSlinky.elementReady.elementReadyStrings.html
import typingsSlinky.elementReady.elementReadyStrings.i
import typingsSlinky.elementReady.elementReadyStrings.iframe
import typingsSlinky.elementReady.elementReadyStrings.image
import typingsSlinky.elementReady.elementReadyStrings.img
import typingsSlinky.elementReady.elementReadyStrings.input
import typingsSlinky.elementReady.elementReadyStrings.ins
import typingsSlinky.elementReady.elementReadyStrings.kbd
import typingsSlinky.elementReady.elementReadyStrings.label
import typingsSlinky.elementReady.elementReadyStrings.legend
import typingsSlinky.elementReady.elementReadyStrings.li
import typingsSlinky.elementReady.elementReadyStrings.line
import typingsSlinky.elementReady.elementReadyStrings.linearGradient
import typingsSlinky.elementReady.elementReadyStrings.link
import typingsSlinky.elementReady.elementReadyStrings.main
import typingsSlinky.elementReady.elementReadyStrings.map
import typingsSlinky.elementReady.elementReadyStrings.mark
import typingsSlinky.elementReady.elementReadyStrings.marker
import typingsSlinky.elementReady.elementReadyStrings.marquee
import typingsSlinky.elementReady.elementReadyStrings.mask
import typingsSlinky.elementReady.elementReadyStrings.menu
import typingsSlinky.elementReady.elementReadyStrings.meta
import typingsSlinky.elementReady.elementReadyStrings.metadata
import typingsSlinky.elementReady.elementReadyStrings.meter
import typingsSlinky.elementReady.elementReadyStrings.nav
import typingsSlinky.elementReady.elementReadyStrings.noscript
import typingsSlinky.elementReady.elementReadyStrings.ol
import typingsSlinky.elementReady.elementReadyStrings.optgroup
import typingsSlinky.elementReady.elementReadyStrings.option
import typingsSlinky.elementReady.elementReadyStrings.output
import typingsSlinky.elementReady.elementReadyStrings.p
import typingsSlinky.elementReady.elementReadyStrings.param
import typingsSlinky.elementReady.elementReadyStrings.path
import typingsSlinky.elementReady.elementReadyStrings.pattern
import typingsSlinky.elementReady.elementReadyStrings.picture
import typingsSlinky.elementReady.elementReadyStrings.polygon
import typingsSlinky.elementReady.elementReadyStrings.polyline
import typingsSlinky.elementReady.elementReadyStrings.pre
import typingsSlinky.elementReady.elementReadyStrings.progress
import typingsSlinky.elementReady.elementReadyStrings.q
import typingsSlinky.elementReady.elementReadyStrings.radialGradient
import typingsSlinky.elementReady.elementReadyStrings.rect
import typingsSlinky.elementReady.elementReadyStrings.rp
import typingsSlinky.elementReady.elementReadyStrings.rt
import typingsSlinky.elementReady.elementReadyStrings.ruby
import typingsSlinky.elementReady.elementReadyStrings.s
import typingsSlinky.elementReady.elementReadyStrings.samp
import typingsSlinky.elementReady.elementReadyStrings.script
import typingsSlinky.elementReady.elementReadyStrings.section
import typingsSlinky.elementReady.elementReadyStrings.select
import typingsSlinky.elementReady.elementReadyStrings.slot
import typingsSlinky.elementReady.elementReadyStrings.small
import typingsSlinky.elementReady.elementReadyStrings.source
import typingsSlinky.elementReady.elementReadyStrings.span
import typingsSlinky.elementReady.elementReadyStrings.stop
import typingsSlinky.elementReady.elementReadyStrings.strong
import typingsSlinky.elementReady.elementReadyStrings.style
import typingsSlinky.elementReady.elementReadyStrings.sub
import typingsSlinky.elementReady.elementReadyStrings.summary
import typingsSlinky.elementReady.elementReadyStrings.sup
import typingsSlinky.elementReady.elementReadyStrings.svg
import typingsSlinky.elementReady.elementReadyStrings.switch
import typingsSlinky.elementReady.elementReadyStrings.symbol
import typingsSlinky.elementReady.elementReadyStrings.table
import typingsSlinky.elementReady.elementReadyStrings.tbody
import typingsSlinky.elementReady.elementReadyStrings.td
import typingsSlinky.elementReady.elementReadyStrings.template
import typingsSlinky.elementReady.elementReadyStrings.text
import typingsSlinky.elementReady.elementReadyStrings.textPath
import typingsSlinky.elementReady.elementReadyStrings.textarea
import typingsSlinky.elementReady.elementReadyStrings.tfoot
import typingsSlinky.elementReady.elementReadyStrings.th
import typingsSlinky.elementReady.elementReadyStrings.thead
import typingsSlinky.elementReady.elementReadyStrings.time
import typingsSlinky.elementReady.elementReadyStrings.title
import typingsSlinky.elementReady.elementReadyStrings.tr
import typingsSlinky.elementReady.elementReadyStrings.track
import typingsSlinky.elementReady.elementReadyStrings.tspan
import typingsSlinky.elementReady.elementReadyStrings.u
import typingsSlinky.elementReady.elementReadyStrings.ul
import typingsSlinky.elementReady.elementReadyStrings.use
import typingsSlinky.elementReady.elementReadyStrings.video
import typingsSlinky.elementReady.elementReadyStrings.view
import typingsSlinky.elementReady.elementReadyStrings.wbr
import typingsSlinky.std.HTMLAppletElement
import typingsSlinky.std.HTMLBaseFontElement
import typingsSlinky.std.HTMLDataElement
import typingsSlinky.std.HTMLDetailsElement
import typingsSlinky.std.HTMLDialogElement
import typingsSlinky.std.HTMLDirectoryElement
import typingsSlinky.std.HTMLFontElement
import typingsSlinky.std.HTMLFrameElement
import typingsSlinky.std.HTMLFrameSetElement
import typingsSlinky.std.HTMLMarqueeElement
import typingsSlinky.std.HTMLMeterElement
import typingsSlinky.std.HTMLOutputElement
import typingsSlinky.std.HTMLPictureElement
import typingsSlinky.std.HTMLSlotElement
import typingsSlinky.std.HTMLTableDataCellElement
import typingsSlinky.std.HTMLTableHeaderCellElement
import typingsSlinky.std.HTMLTemplateElement
import typingsSlinky.std.HTMLTimeElement
import typingsSlinky.std.SVGForeignObjectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: `object`): StoppablePromise[js.UndefOr[HTMLObjectElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: `object`, options: Options): StoppablePromise[js.UndefOr[HTMLObjectElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: `var`): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: `var`, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  /**
  Detect when an element is ready in the DOM.
  @param selector - [CSS selector.](https://developer.mozilla.org/en-US/docs/Web/Guide/CSS/Getting_Started/Selectors)
  @returns The matching element, or `undefined` if the element could not be found.
  @example
  ```
  import elementReady = require('element-ready');
  (async () => {
  	const element = await elementReady('#unicorn');
  	console.log(element.id);
  	//=> 'unicorn'
  })();
  ```
  */
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: a): StoppablePromise[js.UndefOr[HTMLAnchorElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: abbr): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: abbr, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: address): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: address, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: a, options: Options): StoppablePromise[js.UndefOr[HTMLAnchorElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: applet): StoppablePromise[js.UndefOr[HTMLAppletElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: applet, options: Options): StoppablePromise[js.UndefOr[HTMLAppletElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: area): StoppablePromise[js.UndefOr[HTMLAreaElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: area, options: Options): StoppablePromise[js.UndefOr[HTMLAreaElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: article): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: article, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: aside): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: aside, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: audio): StoppablePromise[js.UndefOr[HTMLAudioElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: audio, options: Options): StoppablePromise[js.UndefOr[HTMLAudioElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: b): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: base): StoppablePromise[js.UndefOr[HTMLBaseElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: basefont): StoppablePromise[js.UndefOr[HTMLBaseFontElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: basefont, options: Options): StoppablePromise[js.UndefOr[HTMLBaseFontElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: base, options: Options): StoppablePromise[js.UndefOr[HTMLBaseElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: bdi): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: bdi, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: bdo): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: bdo, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: blockquote): StoppablePromise[js.UndefOr[HTMLQuoteElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: blockquote, options: Options): StoppablePromise[js.UndefOr[HTMLQuoteElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: body): StoppablePromise[js.UndefOr[HTMLBodyElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: body, options: Options): StoppablePromise[js.UndefOr[HTMLBodyElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: b, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: br): StoppablePromise[js.UndefOr[HTMLBRElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: br, options: Options): StoppablePromise[js.UndefOr[HTMLBRElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: button): StoppablePromise[js.UndefOr[HTMLButtonElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: button, options: Options): StoppablePromise[js.UndefOr[HTMLButtonElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: canvas): StoppablePromise[js.UndefOr[HTMLCanvasElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: canvas, options: Options): StoppablePromise[js.UndefOr[HTMLCanvasElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: caption): StoppablePromise[js.UndefOr[HTMLTableCaptionElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: caption, options: Options): StoppablePromise[js.UndefOr[HTMLTableCaptionElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: circle): StoppablePromise[js.UndefOr[SVGCircleElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: circle, options: Options): StoppablePromise[js.UndefOr[SVGCircleElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: cite): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: cite, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: clipPath): StoppablePromise[js.UndefOr[SVGClipPathElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: clipPath, options: Options): StoppablePromise[js.UndefOr[SVGClipPathElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: code): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: code, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: col): StoppablePromise[js.UndefOr[HTMLTableColElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: colgroup): StoppablePromise[js.UndefOr[HTMLTableColElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: colgroup, options: Options): StoppablePromise[js.UndefOr[HTMLTableColElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: col, options: Options): StoppablePromise[js.UndefOr[HTMLTableColElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: data): StoppablePromise[js.UndefOr[HTMLDataElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: datalist): StoppablePromise[js.UndefOr[HTMLDataListElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: datalist, options: Options): StoppablePromise[js.UndefOr[HTMLDataListElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: data, options: Options): StoppablePromise[js.UndefOr[HTMLDataElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: dd): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: dd, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: defs): StoppablePromise[js.UndefOr[SVGDefsElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: defs, options: Options): StoppablePromise[js.UndefOr[SVGDefsElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: del): StoppablePromise[js.UndefOr[HTMLModElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: del, options: Options): StoppablePromise[js.UndefOr[HTMLModElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: desc): StoppablePromise[js.UndefOr[SVGDescElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: desc, options: Options): StoppablePromise[js.UndefOr[SVGDescElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: details): StoppablePromise[js.UndefOr[HTMLDetailsElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: details, options: Options): StoppablePromise[js.UndefOr[HTMLDetailsElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: dfn): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: dfn, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: dialog): StoppablePromise[js.UndefOr[HTMLDialogElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: dialog, options: Options): StoppablePromise[js.UndefOr[HTMLDialogElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: dir): StoppablePromise[js.UndefOr[HTMLDirectoryElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: dir, options: Options): StoppablePromise[js.UndefOr[HTMLDirectoryElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: div): StoppablePromise[js.UndefOr[HTMLDivElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: div, options: Options): StoppablePromise[js.UndefOr[HTMLDivElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: dl): StoppablePromise[js.UndefOr[HTMLDListElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: dl, options: Options): StoppablePromise[js.UndefOr[HTMLDListElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: dt): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: dt, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: ellipse): StoppablePromise[js.UndefOr[SVGEllipseElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: ellipse, options: Options): StoppablePromise[js.UndefOr[SVGEllipseElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: em): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: embed): StoppablePromise[js.UndefOr[HTMLEmbedElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: embed, options: Options): StoppablePromise[js.UndefOr[HTMLEmbedElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: em, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feBlend): StoppablePromise[js.UndefOr[SVGFEBlendElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feBlend, options: Options): StoppablePromise[js.UndefOr[SVGFEBlendElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feColorMatrix): StoppablePromise[js.UndefOr[SVGFEColorMatrixElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feColorMatrix, options: Options): StoppablePromise[js.UndefOr[SVGFEColorMatrixElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feComponentTransfer): StoppablePromise[js.UndefOr[SVGFEComponentTransferElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feComponentTransfer, options: Options): StoppablePromise[js.UndefOr[SVGFEComponentTransferElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feComposite): StoppablePromise[js.UndefOr[SVGFECompositeElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feComposite, options: Options): StoppablePromise[js.UndefOr[SVGFECompositeElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feConvolveMatrix): StoppablePromise[js.UndefOr[SVGFEConvolveMatrixElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feConvolveMatrix, options: Options): StoppablePromise[js.UndefOr[SVGFEConvolveMatrixElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feDiffuseLighting): StoppablePromise[js.UndefOr[SVGFEDiffuseLightingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feDiffuseLighting, options: Options): StoppablePromise[js.UndefOr[SVGFEDiffuseLightingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feDisplacementMap): StoppablePromise[js.UndefOr[SVGFEDisplacementMapElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feDisplacementMap, options: Options): StoppablePromise[js.UndefOr[SVGFEDisplacementMapElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feDistantLight): StoppablePromise[js.UndefOr[SVGFEDistantLightElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feDistantLight, options: Options): StoppablePromise[js.UndefOr[SVGFEDistantLightElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feFlood): StoppablePromise[js.UndefOr[SVGFEFloodElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feFlood, options: Options): StoppablePromise[js.UndefOr[SVGFEFloodElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feFuncA): StoppablePromise[js.UndefOr[SVGFEFuncAElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feFuncA, options: Options): StoppablePromise[js.UndefOr[SVGFEFuncAElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feFuncB): StoppablePromise[js.UndefOr[SVGFEFuncBElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feFuncB, options: Options): StoppablePromise[js.UndefOr[SVGFEFuncBElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feFuncG): StoppablePromise[js.UndefOr[SVGFEFuncGElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feFuncG, options: Options): StoppablePromise[js.UndefOr[SVGFEFuncGElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feFuncR): StoppablePromise[js.UndefOr[SVGFEFuncRElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feFuncR, options: Options): StoppablePromise[js.UndefOr[SVGFEFuncRElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feGaussianBlur): StoppablePromise[js.UndefOr[SVGFEGaussianBlurElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feGaussianBlur, options: Options): StoppablePromise[js.UndefOr[SVGFEGaussianBlurElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feImage): StoppablePromise[js.UndefOr[SVGFEImageElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feImage, options: Options): StoppablePromise[js.UndefOr[SVGFEImageElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feMerge): StoppablePromise[js.UndefOr[SVGFEMergeElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feMergeNode): StoppablePromise[js.UndefOr[SVGFEMergeNodeElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feMergeNode, options: Options): StoppablePromise[js.UndefOr[SVGFEMergeNodeElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feMerge, options: Options): StoppablePromise[js.UndefOr[SVGFEMergeElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feMorphology): StoppablePromise[js.UndefOr[SVGFEMorphologyElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feMorphology, options: Options): StoppablePromise[js.UndefOr[SVGFEMorphologyElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feOffset): StoppablePromise[js.UndefOr[SVGFEOffsetElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feOffset, options: Options): StoppablePromise[js.UndefOr[SVGFEOffsetElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: fePointLight): StoppablePromise[js.UndefOr[SVGFEPointLightElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: fePointLight, options: Options): StoppablePromise[js.UndefOr[SVGFEPointLightElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feSpecularLighting): StoppablePromise[js.UndefOr[SVGFESpecularLightingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feSpecularLighting, options: Options): StoppablePromise[js.UndefOr[SVGFESpecularLightingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feSpotLight): StoppablePromise[js.UndefOr[SVGFESpotLightElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feSpotLight, options: Options): StoppablePromise[js.UndefOr[SVGFESpotLightElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feTile): StoppablePromise[js.UndefOr[SVGFETileElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feTile, options: Options): StoppablePromise[js.UndefOr[SVGFETileElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feTurbulence): StoppablePromise[js.UndefOr[SVGFETurbulenceElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: feTurbulence, options: Options): StoppablePromise[js.UndefOr[SVGFETurbulenceElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: fieldset): StoppablePromise[js.UndefOr[HTMLFieldSetElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: fieldset, options: Options): StoppablePromise[js.UndefOr[HTMLFieldSetElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: figcaption): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: figcaption, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: figure): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: figure, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: filter): StoppablePromise[js.UndefOr[SVGFilterElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: filter, options: Options): StoppablePromise[js.UndefOr[SVGFilterElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: font): StoppablePromise[js.UndefOr[HTMLFontElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: font, options: Options): StoppablePromise[js.UndefOr[HTMLFontElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: footer): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: footer, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: foreignObject): StoppablePromise[js.UndefOr[SVGForeignObjectElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: foreignObject, options: Options): StoppablePromise[js.UndefOr[SVGForeignObjectElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: form): StoppablePromise[js.UndefOr[HTMLFormElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: form, options: Options): StoppablePromise[js.UndefOr[HTMLFormElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: frame): StoppablePromise[js.UndefOr[HTMLFrameElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: frame, options: Options): StoppablePromise[js.UndefOr[HTMLFrameElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: frameset): StoppablePromise[js.UndefOr[HTMLFrameSetElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: frameset, options: Options): StoppablePromise[js.UndefOr[HTMLFrameSetElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: g): StoppablePromise[js.UndefOr[SVGGElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: g, options: Options): StoppablePromise[js.UndefOr[SVGGElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: h1): StoppablePromise[js.UndefOr[HTMLHeadingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: h1, options: Options): StoppablePromise[js.UndefOr[HTMLHeadingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: h2): StoppablePromise[js.UndefOr[HTMLHeadingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: h2, options: Options): StoppablePromise[js.UndefOr[HTMLHeadingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: h3): StoppablePromise[js.UndefOr[HTMLHeadingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: h3, options: Options): StoppablePromise[js.UndefOr[HTMLHeadingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: h4): StoppablePromise[js.UndefOr[HTMLHeadingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: h4, options: Options): StoppablePromise[js.UndefOr[HTMLHeadingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: h5): StoppablePromise[js.UndefOr[HTMLHeadingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: h5, options: Options): StoppablePromise[js.UndefOr[HTMLHeadingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: h6): StoppablePromise[js.UndefOr[HTMLHeadingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: h6, options: Options): StoppablePromise[js.UndefOr[HTMLHeadingElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: head): StoppablePromise[js.UndefOr[HTMLHeadElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: header): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: header, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: head, options: Options): StoppablePromise[js.UndefOr[HTMLHeadElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: hgroup): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: hgroup, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: hr): StoppablePromise[js.UndefOr[HTMLHRElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: hr, options: Options): StoppablePromise[js.UndefOr[HTMLHRElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: html): StoppablePromise[js.UndefOr[HTMLHtmlElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: html, options: Options): StoppablePromise[js.UndefOr[HTMLHtmlElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: i): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: iframe): StoppablePromise[js.UndefOr[HTMLIFrameElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: iframe, options: Options): StoppablePromise[js.UndefOr[HTMLIFrameElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: image): StoppablePromise[js.UndefOr[SVGImageElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: image, options: Options): StoppablePromise[js.UndefOr[SVGImageElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: img): StoppablePromise[js.UndefOr[HTMLImageElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: img, options: Options): StoppablePromise[js.UndefOr[HTMLImageElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: input): StoppablePromise[js.UndefOr[HTMLInputElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: input, options: Options): StoppablePromise[js.UndefOr[HTMLInputElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: ins): StoppablePromise[js.UndefOr[HTMLModElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: ins, options: Options): StoppablePromise[js.UndefOr[HTMLModElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: i, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: kbd): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: kbd, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: label): StoppablePromise[js.UndefOr[HTMLLabelElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: label, options: Options): StoppablePromise[js.UndefOr[HTMLLabelElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: legend): StoppablePromise[js.UndefOr[HTMLLegendElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: legend, options: Options): StoppablePromise[js.UndefOr[HTMLLegendElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: li): StoppablePromise[js.UndefOr[HTMLLIElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: line): StoppablePromise[js.UndefOr[SVGLineElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: linearGradient): StoppablePromise[js.UndefOr[SVGLinearGradientElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: linearGradient, options: Options): StoppablePromise[js.UndefOr[SVGLinearGradientElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: line, options: Options): StoppablePromise[js.UndefOr[SVGLineElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: link): StoppablePromise[js.UndefOr[HTMLLinkElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: link, options: Options): StoppablePromise[js.UndefOr[HTMLLinkElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: li, options: Options): StoppablePromise[js.UndefOr[HTMLLIElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: main): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: main, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: map): StoppablePromise[js.UndefOr[HTMLMapElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: map, options: Options): StoppablePromise[js.UndefOr[HTMLMapElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: mark): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: marker): StoppablePromise[js.UndefOr[SVGMarkerElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: marker, options: Options): StoppablePromise[js.UndefOr[SVGMarkerElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: mark, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: marquee): StoppablePromise[js.UndefOr[HTMLMarqueeElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: marquee, options: Options): StoppablePromise[js.UndefOr[HTMLMarqueeElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: mask): StoppablePromise[js.UndefOr[SVGMaskElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: mask, options: Options): StoppablePromise[js.UndefOr[SVGMaskElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: menu): StoppablePromise[js.UndefOr[HTMLMenuElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: menu, options: Options): StoppablePromise[js.UndefOr[HTMLMenuElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: meta): StoppablePromise[js.UndefOr[HTMLMetaElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: metadata): StoppablePromise[js.UndefOr[SVGMetadataElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: metadata, options: Options): StoppablePromise[js.UndefOr[SVGMetadataElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: meta, options: Options): StoppablePromise[js.UndefOr[HTMLMetaElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: meter): StoppablePromise[js.UndefOr[HTMLMeterElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: meter, options: Options): StoppablePromise[js.UndefOr[HTMLMeterElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: nav): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: nav, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: noscript): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: noscript, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: ol): StoppablePromise[js.UndefOr[HTMLOListElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: ol, options: Options): StoppablePromise[js.UndefOr[HTMLOListElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: optgroup): StoppablePromise[js.UndefOr[HTMLOptGroupElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: optgroup, options: Options): StoppablePromise[js.UndefOr[HTMLOptGroupElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: option): StoppablePromise[js.UndefOr[HTMLOptionElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: option, options: Options): StoppablePromise[js.UndefOr[HTMLOptionElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: output): StoppablePromise[js.UndefOr[HTMLOutputElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: output, options: Options): StoppablePromise[js.UndefOr[HTMLOutputElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: p): StoppablePromise[js.UndefOr[HTMLParagraphElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: param): StoppablePromise[js.UndefOr[HTMLParamElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: param, options: Options): StoppablePromise[js.UndefOr[HTMLParamElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: path): StoppablePromise[js.UndefOr[SVGPathElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: path, options: Options): StoppablePromise[js.UndefOr[SVGPathElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: pattern): StoppablePromise[js.UndefOr[SVGPatternElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: pattern, options: Options): StoppablePromise[js.UndefOr[SVGPatternElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: picture): StoppablePromise[js.UndefOr[HTMLPictureElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: picture, options: Options): StoppablePromise[js.UndefOr[HTMLPictureElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: polygon): StoppablePromise[js.UndefOr[SVGPolygonElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: polygon, options: Options): StoppablePromise[js.UndefOr[SVGPolygonElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: polyline): StoppablePromise[js.UndefOr[SVGPolylineElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: polyline, options: Options): StoppablePromise[js.UndefOr[SVGPolylineElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: p, options: Options): StoppablePromise[js.UndefOr[HTMLParagraphElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: pre): StoppablePromise[js.UndefOr[HTMLPreElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: pre, options: Options): StoppablePromise[js.UndefOr[HTMLPreElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: progress): StoppablePromise[js.UndefOr[HTMLProgressElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: progress, options: Options): StoppablePromise[js.UndefOr[HTMLProgressElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: q): StoppablePromise[js.UndefOr[HTMLQuoteElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: q, options: Options): StoppablePromise[js.UndefOr[HTMLQuoteElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: radialGradient): StoppablePromise[js.UndefOr[SVGRadialGradientElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: radialGradient, options: Options): StoppablePromise[js.UndefOr[SVGRadialGradientElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: rect): StoppablePromise[js.UndefOr[SVGRectElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: rect, options: Options): StoppablePromise[js.UndefOr[SVGRectElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: rp): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: rp, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: rt): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: rt, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: ruby): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: ruby, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: s): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: samp): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: samp, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: script): StoppablePromise[js.UndefOr[HTMLScriptElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: script, options: Options): StoppablePromise[js.UndefOr[HTMLScriptElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: section): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: section, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: select): StoppablePromise[js.UndefOr[HTMLSelectElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: select, options: Options): StoppablePromise[js.UndefOr[HTMLSelectElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: slot): StoppablePromise[js.UndefOr[HTMLSlotElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: slot, options: Options): StoppablePromise[js.UndefOr[HTMLSlotElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: small): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: small, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: s, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: source): StoppablePromise[js.UndefOr[HTMLSourceElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: source, options: Options): StoppablePromise[js.UndefOr[HTMLSourceElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: span): StoppablePromise[js.UndefOr[HTMLSpanElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: span, options: Options): StoppablePromise[js.UndefOr[HTMLSpanElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: stop): StoppablePromise[js.UndefOr[SVGStopElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: stop, options: Options): StoppablePromise[js.UndefOr[SVGStopElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: strong): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: strong, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: style): StoppablePromise[js.UndefOr[HTMLStyleElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: style, options: Options): StoppablePromise[js.UndefOr[HTMLStyleElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: sub): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: sub, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: summary): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: summary, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: sup): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: sup, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: svg): StoppablePromise[js.UndefOr[SVGSVGElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: svg, options: Options): StoppablePromise[js.UndefOr[SVGSVGElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: switch): StoppablePromise[js.UndefOr[SVGSwitchElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: switch, options: Options): StoppablePromise[js.UndefOr[SVGSwitchElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: symbol): StoppablePromise[js.UndefOr[SVGSymbolElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: symbol, options: Options): StoppablePromise[js.UndefOr[SVGSymbolElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: table): StoppablePromise[js.UndefOr[HTMLTableElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: table, options: Options): StoppablePromise[js.UndefOr[HTMLTableElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: tbody): StoppablePromise[js.UndefOr[HTMLTableSectionElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: tbody, options: Options): StoppablePromise[js.UndefOr[HTMLTableSectionElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: td): StoppablePromise[js.UndefOr[HTMLTableDataCellElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: td, options: Options): StoppablePromise[js.UndefOr[HTMLTableDataCellElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: template): StoppablePromise[js.UndefOr[HTMLTemplateElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: template, options: Options): StoppablePromise[js.UndefOr[HTMLTemplateElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: text): StoppablePromise[js.UndefOr[SVGTextElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: textPath): StoppablePromise[js.UndefOr[SVGTextPathElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: textPath, options: Options): StoppablePromise[js.UndefOr[SVGTextPathElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: textarea): StoppablePromise[js.UndefOr[HTMLTextAreaElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: textarea, options: Options): StoppablePromise[js.UndefOr[HTMLTextAreaElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: text, options: Options): StoppablePromise[js.UndefOr[SVGTextElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: tfoot): StoppablePromise[js.UndefOr[HTMLTableSectionElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: tfoot, options: Options): StoppablePromise[js.UndefOr[HTMLTableSectionElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: th): StoppablePromise[js.UndefOr[HTMLTableHeaderCellElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: thead): StoppablePromise[js.UndefOr[HTMLTableSectionElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: thead, options: Options): StoppablePromise[js.UndefOr[HTMLTableSectionElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: th, options: Options): StoppablePromise[js.UndefOr[HTMLTableHeaderCellElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: time): StoppablePromise[js.UndefOr[HTMLTimeElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: time, options: Options): StoppablePromise[js.UndefOr[HTMLTimeElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: title): StoppablePromise[js.UndefOr[HTMLTitleElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: title, options: Options): StoppablePromise[js.UndefOr[HTMLTitleElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: tr): StoppablePromise[js.UndefOr[HTMLTableRowElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: track): StoppablePromise[js.UndefOr[HTMLTrackElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: track, options: Options): StoppablePromise[js.UndefOr[HTMLTrackElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: tr, options: Options): StoppablePromise[js.UndefOr[HTMLTableRowElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: tspan): StoppablePromise[js.UndefOr[SVGTSpanElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: tspan, options: Options): StoppablePromise[js.UndefOr[SVGTSpanElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: u): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: ul): StoppablePromise[js.UndefOr[HTMLUListElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: ul, options: Options): StoppablePromise[js.UndefOr[HTMLUListElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: u, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: use): StoppablePromise[js.UndefOr[SVGUseElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: use, options: Options): StoppablePromise[js.UndefOr[SVGUseElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: video): StoppablePromise[js.UndefOr[HTMLVideoElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: video, options: Options): StoppablePromise[js.UndefOr[HTMLVideoElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: view): StoppablePromise[js.UndefOr[SVGViewElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: view, options: Options): StoppablePromise[js.UndefOr[SVGViewElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: wbr): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply(selector: wbr, options: Options): StoppablePromise[js.UndefOr[HTMLElement]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply[ElementName /* <: Element */](selector: String): StoppablePromise[js.UndefOr[ElementName]] = js.native
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  def apply[ElementName /* <: Element */](selector: String, options: Options): StoppablePromise[js.UndefOr[ElementName]] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Automatically stop checking for the element to be ready after the DOM ready event. The promise is then resolved to `undefined`.
    		@default true
    		*/
    val stopOnDomReady: js.UndefOr[Boolean] = js.native
    
    /**
    		The element that's expected to contain a match.
    		@default document
    		*/
    val target: js.UndefOr[Element | Document] = js.native
    
    /**
    		Milliseconds to wait before stopping the search and resolving the promise to `undefined`.
    		@default Infinity
    		*/
    val timeout: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStopOnDomReady(value: Boolean): Self = StObject.set(x, "stopOnDomReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOnDomReadyUndefined: Self = StObject.set(x, "stopOnDomReady", js.undefined)
      
      @scala.inline
      def setTarget(value: Element | Document): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetDocument(value: Document): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElement(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined std.Promise<T> & {stop (): void} */
  @js.native
  trait StoppablePromise[T] extends StObject {
    
    /**
      * Attaches a callback for only the rejection of the Promise.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    def `catch`[TResult](): js.Promise[T | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[T | TResult] = js.native
    
    /**
      * Attaches a callback that is invoked when the Promise is settled (fulfilled or rejected). The
      * resolved value cannot be modified from the callback.
      * @param onfinally The callback to execute when the Promise is settled (fulfilled or rejected).
      * @returns A Promise for the completion of the callback.
      */
    def `finally`(): js.Promise[T] = js.native
    def `finally`(onfinally: js.Function0[Unit]): js.Promise[T] = js.native
    
    /**
    		Stop checking for the element to be ready. The stop is synchronous and the original promise is then resolved to `undefined`.
    		Calling it after the promise has settled or multiple times does nothing.
    		*/
    def stop(): Unit = js.native
    
    /**
      * Attaches callbacks for the resolution and/or rejection of the Promise.
      * @param onfulfilled The callback to execute when the Promise is resolved.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of which ever callback is executed.
      */
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
  }
}
