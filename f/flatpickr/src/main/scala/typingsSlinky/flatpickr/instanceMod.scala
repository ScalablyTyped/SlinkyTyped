package typingsSlinky.flatpickr

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLAreaElement
import org.scalajs.dom.raw.HTMLAudioElement
import org.scalajs.dom.raw.HTMLBRElement
import org.scalajs.dom.raw.HTMLBaseElement
import org.scalajs.dom.raw.HTMLBodyElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLCollection
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
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.NamedNodeMap
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import org.scalajs.dom.raw.ParentNode
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
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
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.flatpickr.anon.GetDaysInMonth
import typingsSlinky.flatpickr.anon.PartialParsedOptions
import typingsSlinky.flatpickr.anon.kinkeyCustomLocaledefault
import typingsSlinky.flatpickr.anon.kinkeyofOptionsOptionsk
import typingsSlinky.flatpickr.flatpickrStrings.`object`
import typingsSlinky.flatpickr.flatpickrStrings.`var`
import typingsSlinky.flatpickr.flatpickrStrings.a
import typingsSlinky.flatpickr.flatpickrStrings.abbr
import typingsSlinky.flatpickr.flatpickrStrings.abort
import typingsSlinky.flatpickr.flatpickrStrings.address
import typingsSlinky.flatpickr.flatpickrStrings.animationcancel
import typingsSlinky.flatpickr.flatpickrStrings.animationend
import typingsSlinky.flatpickr.flatpickrStrings.animationiteration
import typingsSlinky.flatpickr.flatpickrStrings.animationstart
import typingsSlinky.flatpickr.flatpickrStrings.applet
import typingsSlinky.flatpickr.flatpickrStrings.area
import typingsSlinky.flatpickr.flatpickrStrings.article
import typingsSlinky.flatpickr.flatpickrStrings.aside
import typingsSlinky.flatpickr.flatpickrStrings.audio
import typingsSlinky.flatpickr.flatpickrStrings.auxclick
import typingsSlinky.flatpickr.flatpickrStrings.b
import typingsSlinky.flatpickr.flatpickrStrings.base
import typingsSlinky.flatpickr.flatpickrStrings.basefont
import typingsSlinky.flatpickr.flatpickrStrings.bdi
import typingsSlinky.flatpickr.flatpickrStrings.bdo
import typingsSlinky.flatpickr.flatpickrStrings.blockquote
import typingsSlinky.flatpickr.flatpickrStrings.blur
import typingsSlinky.flatpickr.flatpickrStrings.body
import typingsSlinky.flatpickr.flatpickrStrings.br
import typingsSlinky.flatpickr.flatpickrStrings.button
import typingsSlinky.flatpickr.flatpickrStrings.cancel
import typingsSlinky.flatpickr.flatpickrStrings.canplay
import typingsSlinky.flatpickr.flatpickrStrings.canplaythrough
import typingsSlinky.flatpickr.flatpickrStrings.canvas
import typingsSlinky.flatpickr.flatpickrStrings.caption
import typingsSlinky.flatpickr.flatpickrStrings.change
import typingsSlinky.flatpickr.flatpickrStrings.circle
import typingsSlinky.flatpickr.flatpickrStrings.cite
import typingsSlinky.flatpickr.flatpickrStrings.click
import typingsSlinky.flatpickr.flatpickrStrings.clipPath
import typingsSlinky.flatpickr.flatpickrStrings.close
import typingsSlinky.flatpickr.flatpickrStrings.code
import typingsSlinky.flatpickr.flatpickrStrings.col
import typingsSlinky.flatpickr.flatpickrStrings.colgroup
import typingsSlinky.flatpickr.flatpickrStrings.contextmenu
import typingsSlinky.flatpickr.flatpickrStrings.copy
import typingsSlinky.flatpickr.flatpickrStrings.cuechange
import typingsSlinky.flatpickr.flatpickrStrings.cut
import typingsSlinky.flatpickr.flatpickrStrings.data
import typingsSlinky.flatpickr.flatpickrStrings.datalist
import typingsSlinky.flatpickr.flatpickrStrings.dblclick
import typingsSlinky.flatpickr.flatpickrStrings.dd
import typingsSlinky.flatpickr.flatpickrStrings.defs
import typingsSlinky.flatpickr.flatpickrStrings.del
import typingsSlinky.flatpickr.flatpickrStrings.desc
import typingsSlinky.flatpickr.flatpickrStrings.details
import typingsSlinky.flatpickr.flatpickrStrings.dfn
import typingsSlinky.flatpickr.flatpickrStrings.dialog
import typingsSlinky.flatpickr.flatpickrStrings.dir
import typingsSlinky.flatpickr.flatpickrStrings.div
import typingsSlinky.flatpickr.flatpickrStrings.dl
import typingsSlinky.flatpickr.flatpickrStrings.drag
import typingsSlinky.flatpickr.flatpickrStrings.dragend
import typingsSlinky.flatpickr.flatpickrStrings.dragenter
import typingsSlinky.flatpickr.flatpickrStrings.dragexit
import typingsSlinky.flatpickr.flatpickrStrings.dragleave
import typingsSlinky.flatpickr.flatpickrStrings.dragover
import typingsSlinky.flatpickr.flatpickrStrings.dragstart
import typingsSlinky.flatpickr.flatpickrStrings.drop
import typingsSlinky.flatpickr.flatpickrStrings.dt
import typingsSlinky.flatpickr.flatpickrStrings.durationchange
import typingsSlinky.flatpickr.flatpickrStrings.ellipse
import typingsSlinky.flatpickr.flatpickrStrings.em
import typingsSlinky.flatpickr.flatpickrStrings.embed
import typingsSlinky.flatpickr.flatpickrStrings.emptied
import typingsSlinky.flatpickr.flatpickrStrings.ended
import typingsSlinky.flatpickr.flatpickrStrings.error
import typingsSlinky.flatpickr.flatpickrStrings.feBlend
import typingsSlinky.flatpickr.flatpickrStrings.feColorMatrix
import typingsSlinky.flatpickr.flatpickrStrings.feComponentTransfer
import typingsSlinky.flatpickr.flatpickrStrings.feComposite
import typingsSlinky.flatpickr.flatpickrStrings.feConvolveMatrix
import typingsSlinky.flatpickr.flatpickrStrings.feDiffuseLighting
import typingsSlinky.flatpickr.flatpickrStrings.feDisplacementMap
import typingsSlinky.flatpickr.flatpickrStrings.feDistantLight
import typingsSlinky.flatpickr.flatpickrStrings.feFlood
import typingsSlinky.flatpickr.flatpickrStrings.feFuncA
import typingsSlinky.flatpickr.flatpickrStrings.feFuncB
import typingsSlinky.flatpickr.flatpickrStrings.feFuncG
import typingsSlinky.flatpickr.flatpickrStrings.feFuncR
import typingsSlinky.flatpickr.flatpickrStrings.feGaussianBlur
import typingsSlinky.flatpickr.flatpickrStrings.feImage
import typingsSlinky.flatpickr.flatpickrStrings.feMerge
import typingsSlinky.flatpickr.flatpickrStrings.feMergeNode
import typingsSlinky.flatpickr.flatpickrStrings.feMorphology
import typingsSlinky.flatpickr.flatpickrStrings.feOffset
import typingsSlinky.flatpickr.flatpickrStrings.fePointLight
import typingsSlinky.flatpickr.flatpickrStrings.feSpecularLighting
import typingsSlinky.flatpickr.flatpickrStrings.feSpotLight
import typingsSlinky.flatpickr.flatpickrStrings.feTile
import typingsSlinky.flatpickr.flatpickrStrings.feTurbulence
import typingsSlinky.flatpickr.flatpickrStrings.fieldset
import typingsSlinky.flatpickr.flatpickrStrings.figcaption
import typingsSlinky.flatpickr.flatpickrStrings.figure
import typingsSlinky.flatpickr.flatpickrStrings.filter
import typingsSlinky.flatpickr.flatpickrStrings.focus
import typingsSlinky.flatpickr.flatpickrStrings.focusin
import typingsSlinky.flatpickr.flatpickrStrings.focusout
import typingsSlinky.flatpickr.flatpickrStrings.font
import typingsSlinky.flatpickr.flatpickrStrings.footer
import typingsSlinky.flatpickr.flatpickrStrings.foreignObject
import typingsSlinky.flatpickr.flatpickrStrings.form
import typingsSlinky.flatpickr.flatpickrStrings.frame
import typingsSlinky.flatpickr.flatpickrStrings.frameset
import typingsSlinky.flatpickr.flatpickrStrings.fullscreenchange
import typingsSlinky.flatpickr.flatpickrStrings.fullscreenerror
import typingsSlinky.flatpickr.flatpickrStrings.g_
import typingsSlinky.flatpickr.flatpickrStrings.gotpointercapture
import typingsSlinky.flatpickr.flatpickrStrings.h1
import typingsSlinky.flatpickr.flatpickrStrings.h2
import typingsSlinky.flatpickr.flatpickrStrings.h3
import typingsSlinky.flatpickr.flatpickrStrings.h4
import typingsSlinky.flatpickr.flatpickrStrings.h5
import typingsSlinky.flatpickr.flatpickrStrings.h6
import typingsSlinky.flatpickr.flatpickrStrings.head
import typingsSlinky.flatpickr.flatpickrStrings.header
import typingsSlinky.flatpickr.flatpickrStrings.hgroup
import typingsSlinky.flatpickr.flatpickrStrings.hr
import typingsSlinky.flatpickr.flatpickrStrings.html
import typingsSlinky.flatpickr.flatpickrStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsSlinky.flatpickr.flatpickrStrings.httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg
import typingsSlinky.flatpickr.flatpickrStrings.i
import typingsSlinky.flatpickr.flatpickrStrings.iframe
import typingsSlinky.flatpickr.flatpickrStrings.image
import typingsSlinky.flatpickr.flatpickrStrings.img
import typingsSlinky.flatpickr.flatpickrStrings.input
import typingsSlinky.flatpickr.flatpickrStrings.ins
import typingsSlinky.flatpickr.flatpickrStrings.invalid
import typingsSlinky.flatpickr.flatpickrStrings.kbd
import typingsSlinky.flatpickr.flatpickrStrings.keydown
import typingsSlinky.flatpickr.flatpickrStrings.keypress
import typingsSlinky.flatpickr.flatpickrStrings.keyup
import typingsSlinky.flatpickr.flatpickrStrings.label
import typingsSlinky.flatpickr.flatpickrStrings.legend
import typingsSlinky.flatpickr.flatpickrStrings.li
import typingsSlinky.flatpickr.flatpickrStrings.line
import typingsSlinky.flatpickr.flatpickrStrings.linearGradient
import typingsSlinky.flatpickr.flatpickrStrings.link
import typingsSlinky.flatpickr.flatpickrStrings.load
import typingsSlinky.flatpickr.flatpickrStrings.loadeddata
import typingsSlinky.flatpickr.flatpickrStrings.loadedmetadata
import typingsSlinky.flatpickr.flatpickrStrings.loadstart
import typingsSlinky.flatpickr.flatpickrStrings.lostpointercapture
import typingsSlinky.flatpickr.flatpickrStrings.main
import typingsSlinky.flatpickr.flatpickrStrings.map
import typingsSlinky.flatpickr.flatpickrStrings.mark
import typingsSlinky.flatpickr.flatpickrStrings.marker
import typingsSlinky.flatpickr.flatpickrStrings.marquee
import typingsSlinky.flatpickr.flatpickrStrings.mask
import typingsSlinky.flatpickr.flatpickrStrings.menu
import typingsSlinky.flatpickr.flatpickrStrings.meta
import typingsSlinky.flatpickr.flatpickrStrings.metadata
import typingsSlinky.flatpickr.flatpickrStrings.meter
import typingsSlinky.flatpickr.flatpickrStrings.mousedown
import typingsSlinky.flatpickr.flatpickrStrings.mouseenter
import typingsSlinky.flatpickr.flatpickrStrings.mouseleave
import typingsSlinky.flatpickr.flatpickrStrings.mousemove
import typingsSlinky.flatpickr.flatpickrStrings.mouseout
import typingsSlinky.flatpickr.flatpickrStrings.mouseover
import typingsSlinky.flatpickr.flatpickrStrings.mouseup
import typingsSlinky.flatpickr.flatpickrStrings.nav
import typingsSlinky.flatpickr.flatpickrStrings.noscript
import typingsSlinky.flatpickr.flatpickrStrings.ol
import typingsSlinky.flatpickr.flatpickrStrings.optgroup
import typingsSlinky.flatpickr.flatpickrStrings.option
import typingsSlinky.flatpickr.flatpickrStrings.output
import typingsSlinky.flatpickr.flatpickrStrings.p
import typingsSlinky.flatpickr.flatpickrStrings.param
import typingsSlinky.flatpickr.flatpickrStrings.paste
import typingsSlinky.flatpickr.flatpickrStrings.path
import typingsSlinky.flatpickr.flatpickrStrings.pattern
import typingsSlinky.flatpickr.flatpickrStrings.pause
import typingsSlinky.flatpickr.flatpickrStrings.picture
import typingsSlinky.flatpickr.flatpickrStrings.play
import typingsSlinky.flatpickr.flatpickrStrings.playing
import typingsSlinky.flatpickr.flatpickrStrings.pointercancel
import typingsSlinky.flatpickr.flatpickrStrings.pointerdown
import typingsSlinky.flatpickr.flatpickrStrings.pointerenter
import typingsSlinky.flatpickr.flatpickrStrings.pointerleave
import typingsSlinky.flatpickr.flatpickrStrings.pointermove
import typingsSlinky.flatpickr.flatpickrStrings.pointerout
import typingsSlinky.flatpickr.flatpickrStrings.pointerover
import typingsSlinky.flatpickr.flatpickrStrings.pointerup
import typingsSlinky.flatpickr.flatpickrStrings.polygon
import typingsSlinky.flatpickr.flatpickrStrings.polyline
import typingsSlinky.flatpickr.flatpickrStrings.pre
import typingsSlinky.flatpickr.flatpickrStrings.progress
import typingsSlinky.flatpickr.flatpickrStrings.q
import typingsSlinky.flatpickr.flatpickrStrings.radialGradient
import typingsSlinky.flatpickr.flatpickrStrings.ratechange
import typingsSlinky.flatpickr.flatpickrStrings.rect
import typingsSlinky.flatpickr.flatpickrStrings.reset
import typingsSlinky.flatpickr.flatpickrStrings.resize
import typingsSlinky.flatpickr.flatpickrStrings.rp
import typingsSlinky.flatpickr.flatpickrStrings.rt
import typingsSlinky.flatpickr.flatpickrStrings.ruby
import typingsSlinky.flatpickr.flatpickrStrings.s_
import typingsSlinky.flatpickr.flatpickrStrings.samp
import typingsSlinky.flatpickr.flatpickrStrings.script
import typingsSlinky.flatpickr.flatpickrStrings.scroll
import typingsSlinky.flatpickr.flatpickrStrings.section
import typingsSlinky.flatpickr.flatpickrStrings.securitypolicyviolation
import typingsSlinky.flatpickr.flatpickrStrings.seeked
import typingsSlinky.flatpickr.flatpickrStrings.seeking
import typingsSlinky.flatpickr.flatpickrStrings.select
import typingsSlinky.flatpickr.flatpickrStrings.selectionchange
import typingsSlinky.flatpickr.flatpickrStrings.selectstart
import typingsSlinky.flatpickr.flatpickrStrings.slot
import typingsSlinky.flatpickr.flatpickrStrings.small
import typingsSlinky.flatpickr.flatpickrStrings.source
import typingsSlinky.flatpickr.flatpickrStrings.span
import typingsSlinky.flatpickr.flatpickrStrings.stalled
import typingsSlinky.flatpickr.flatpickrStrings.stop
import typingsSlinky.flatpickr.flatpickrStrings.strong
import typingsSlinky.flatpickr.flatpickrStrings.sub
import typingsSlinky.flatpickr.flatpickrStrings.submit
import typingsSlinky.flatpickr.flatpickrStrings.summary
import typingsSlinky.flatpickr.flatpickrStrings.sup
import typingsSlinky.flatpickr.flatpickrStrings.suspend
import typingsSlinky.flatpickr.flatpickrStrings.svg
import typingsSlinky.flatpickr.flatpickrStrings.switch
import typingsSlinky.flatpickr.flatpickrStrings.symbol
import typingsSlinky.flatpickr.flatpickrStrings.table
import typingsSlinky.flatpickr.flatpickrStrings.tbody
import typingsSlinky.flatpickr.flatpickrStrings.td
import typingsSlinky.flatpickr.flatpickrStrings.template
import typingsSlinky.flatpickr.flatpickrStrings.text
import typingsSlinky.flatpickr.flatpickrStrings.textPath
import typingsSlinky.flatpickr.flatpickrStrings.textarea
import typingsSlinky.flatpickr.flatpickrStrings.tfoot
import typingsSlinky.flatpickr.flatpickrStrings.th
import typingsSlinky.flatpickr.flatpickrStrings.thead
import typingsSlinky.flatpickr.flatpickrStrings.time
import typingsSlinky.flatpickr.flatpickrStrings.timeupdate
import typingsSlinky.flatpickr.flatpickrStrings.title
import typingsSlinky.flatpickr.flatpickrStrings.toggle
import typingsSlinky.flatpickr.flatpickrStrings.touchcancel
import typingsSlinky.flatpickr.flatpickrStrings.touchend
import typingsSlinky.flatpickr.flatpickrStrings.touchmove
import typingsSlinky.flatpickr.flatpickrStrings.touchstart
import typingsSlinky.flatpickr.flatpickrStrings.tr
import typingsSlinky.flatpickr.flatpickrStrings.track
import typingsSlinky.flatpickr.flatpickrStrings.transitioncancel
import typingsSlinky.flatpickr.flatpickrStrings.transitionend
import typingsSlinky.flatpickr.flatpickrStrings.transitionrun
import typingsSlinky.flatpickr.flatpickrStrings.transitionstart
import typingsSlinky.flatpickr.flatpickrStrings.tspan
import typingsSlinky.flatpickr.flatpickrStrings.u_
import typingsSlinky.flatpickr.flatpickrStrings.ul
import typingsSlinky.flatpickr.flatpickrStrings.use
import typingsSlinky.flatpickr.flatpickrStrings.video
import typingsSlinky.flatpickr.flatpickrStrings.view
import typingsSlinky.flatpickr.flatpickrStrings.volumechange
import typingsSlinky.flatpickr.flatpickrStrings.waiting
import typingsSlinky.flatpickr.flatpickrStrings.wbr
import typingsSlinky.flatpickr.flatpickrStrings.wheel
import typingsSlinky.flatpickr.formattingMod.Formats_
import typingsSlinky.flatpickr.formattingMod.RevFormat_
import typingsSlinky.flatpickr.formattingMod.TokenRegex_
import typingsSlinky.flatpickr.globalsMod.global.Date
import typingsSlinky.flatpickr.localeMod.CustomLocale
import typingsSlinky.flatpickr.localeMod.Locale
import typingsSlinky.flatpickr.optionsMod.DateOption
import typingsSlinky.flatpickr.optionsMod.Options
import typingsSlinky.flatpickr.optionsMod.ParsedOptions
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.Animation
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.ChildNode
import typingsSlinky.std.DOMRect
import typingsSlinky.std.DOMRectList
import typingsSlinky.std.DOMStringMap
import typingsSlinky.std.EventListenerOrEventListenerObject
import typingsSlinky.std.FocusOptions
import typingsSlinky.std.FullscreenOptions
import typingsSlinky.std.GetRootNodeOptions
import typingsSlinky.std.HTMLAppletElement
import typingsSlinky.std.HTMLBaseFontElement
import typingsSlinky.std.HTMLCollectionOf
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
import typingsSlinky.std.InsertPosition
import typingsSlinky.std.Keyframe
import typingsSlinky.std.KeyframeAnimationOptions
import typingsSlinky.std.OnErrorEventHandler
import typingsSlinky.std.PropertyIndexedKeyframes
import typingsSlinky.std.SVGForeignObjectElement
import typingsSlinky.std.ScrollIntoViewOptions
import typingsSlinky.std.ScrollToOptions
import typingsSlinky.std.SecurityPolicyViolationEvent
import typingsSlinky.std.ShadowRoot
import typingsSlinky.std.ShadowRootInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceMod {
  
  /* Inlined std.HTMLSpanElement & {  dateObj :flatpickr.flatpickr/dist/types/globals.<global>.Date,   $i :number} */
  @js.native
  trait DayElement extends StObject {
    
    @JSName("$i")
    var $i: Double = js.native
    
    val ATTRIBUTE_NODE: Double = js.native
    
    /**
      * node is a CDATASection node.
      */
    val CDATA_SECTION_NODE: Double = js.native
    
    /**
      * node is a Comment node.
      */
    val COMMENT_NODE: Double = js.native
    
    /**
      * node is a DocumentFragment node.
      */
    val DOCUMENT_FRAGMENT_NODE: Double = js.native
    
    /**
      * node is a document.
      */
    val DOCUMENT_NODE: Double = js.native
    
    /**
      * Set when other is a descendant of node.
      */
    val DOCUMENT_POSITION_CONTAINED_BY: Double = js.native
    
    /**
      * Set when other is an ancestor of node.
      */
    val DOCUMENT_POSITION_CONTAINS: Double = js.native
    
    /**
      * Set when node and other are not in the same tree.
      */
    val DOCUMENT_POSITION_DISCONNECTED: Double = js.native
    
    /**
      * Set when other is following node.
      */
    val DOCUMENT_POSITION_FOLLOWING: Double = js.native
    
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double = js.native
    
    /**
      * Set when other is preceding node.
      */
    val DOCUMENT_POSITION_PRECEDING: Double = js.native
    
    /**
      * node is a doctype.
      */
    val DOCUMENT_TYPE_NODE: Double = js.native
    
    /**
      * node is an element.
      */
    val ELEMENT_NODE: Double = js.native
    
    val ENTITY_NODE: Double = js.native
    
    val ENTITY_REFERENCE_NODE: Double = js.native
    
    val NOTATION_NODE: Double = js.native
    
    /**
      * node is a ProcessingInstruction node.
      */
    val PROCESSING_INSTRUCTION_NODE: Double = js.native
    
    /**
      * node is a Text node.
      */
    val TEXT_NODE: Double = js.native
    
    var accessKey: String = js.native
    
    val accessKeyLabel: String = js.native
    
    /**
      * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
      * 
      * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
      * 
      * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
      * 
      * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
      * 
      * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
      * 
      * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
      */
    def addEventListener(`type`: String): Unit = js.native
    def addEventListener(`type`: String, listener: Null, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(`type`: animationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(`type`: dragexit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(`type`: pointercancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /**
      * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
      * 
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def after(nodes: (Node | String)*): Unit = js.native
    
    def animate(): Animation = js.native
    def animate(keyframes: js.Array[Keyframe]): Animation = js.native
    def animate(keyframes: js.Array[Keyframe], options: Double): Animation = js.native
    def animate(keyframes: js.Array[Keyframe], options: KeyframeAnimationOptions): Animation = js.native
    def animate(keyframes: Null, options: Double): Animation = js.native
    def animate(keyframes: Null, options: KeyframeAnimationOptions): Animation = js.native
    def animate(keyframes: PropertyIndexedKeyframes): Animation = js.native
    def animate(keyframes: PropertyIndexedKeyframes, options: Double): Animation = js.native
    def animate(keyframes: PropertyIndexedKeyframes, options: KeyframeAnimationOptions): Animation = js.native
    
    /**
      * Inserts nodes after the last child of node, while replacing strings in nodes with equivalent Text nodes.
      * 
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def append(nodes: (Node | String)*): Unit = js.native
    
    def appendChild[T /* <: Node */](newChild: T): T = js.native
    
    val assignedSlot: HTMLSlotElement | Null = js.native
    
    /**
      * Creates a shadow root for element and returns it.
      */
    def attachShadow(init: ShadowRootInit): ShadowRoot = js.native
    
    val attributes: NamedNodeMap = js.native
    
    var autocapitalize: String = js.native
    
    var autofocus: Boolean = js.native
    
    /**
      * Returns node's node document's document base URL.
      */
    val baseURI: String = js.native
    
    /**
      * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
      * 
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def before(nodes: (Node | String)*): Unit = js.native
    
    def blur(): Unit = js.native
    
    val childElementCount: Double = js.native
    
    /**
      * Returns the children.
      */
    val childNodes: NodeListOf[ChildNode with Node] = js.native
    
    /**
      * Returns the child elements.
      */
    val children: HTMLCollection = js.native
    
    /**
      * Allows for manipulation of element's class content attribute as a set of whitespace-separated tokens through a DOMTokenList object.
      */
    val classList: DOMTokenList = js.native
    
    /**
      * Returns the value of element's class content attribute. Can be set to change it.
      */
    var className: String = js.native
    
    def click(): Unit = js.native
    
    val clientHeight: Double = js.native
    
    val clientLeft: Double = js.native
    
    val clientTop: Double = js.native
    
    val clientWidth: Double = js.native
    
    /**
      * Returns a copy of node. If deep is true, the copy also includes the node's descendants.
      */
    def cloneNode(): Node = js.native
    def cloneNode(deep: Boolean): Node = js.native
    
    def closest[E /* <: Element */](selector: String): E | Null = js.native
    /**
      * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
      */
    @JSName("closest")
    def closest_a(selector: a): HTMLAnchorElement | Null = js.native
    @JSName("closest")
    def closest_abbr(selector: abbr): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_address(selector: address): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_applet(selector: applet): HTMLAppletElement | Null = js.native
    @JSName("closest")
    def closest_area(selector: area): HTMLAreaElement | Null = js.native
    @JSName("closest")
    def closest_article(selector: article): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_aside(selector: aside): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_audio(selector: audio): HTMLAudioElement | Null = js.native
    @JSName("closest")
    def closest_b(selector: b): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_base(selector: base): HTMLBaseElement | Null = js.native
    @JSName("closest")
    def closest_basefont(selector: basefont): HTMLBaseFontElement | Null = js.native
    @JSName("closest")
    def closest_bdi(selector: bdi): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_bdo(selector: bdo): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_blockquote(selector: blockquote): HTMLQuoteElement | Null = js.native
    @JSName("closest")
    def closest_body(selector: body): HTMLBodyElement | Null = js.native
    @JSName("closest")
    def closest_br(selector: br): HTMLBRElement | Null = js.native
    @JSName("closest")
    def closest_button(selector: button): HTMLButtonElement | Null = js.native
    @JSName("closest")
    def closest_canvas(selector: canvas): HTMLCanvasElement | Null = js.native
    @JSName("closest")
    def closest_caption(selector: caption): HTMLTableCaptionElement | Null = js.native
    @JSName("closest")
    def closest_circle(selector: circle): SVGCircleElement | Null = js.native
    @JSName("closest")
    def closest_cite(selector: cite): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_clipPath(selector: clipPath): SVGClipPathElement | Null = js.native
    @JSName("closest")
    def closest_code(selector: code): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_col(selector: col): HTMLTableColElement | Null = js.native
    @JSName("closest")
    def closest_colgroup(selector: colgroup): HTMLTableColElement | Null = js.native
    @JSName("closest")
    def closest_data(selector: data): HTMLDataElement | Null = js.native
    @JSName("closest")
    def closest_datalist(selector: datalist): HTMLDataListElement | Null = js.native
    @JSName("closest")
    def closest_dd(selector: dd): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_defs(selector: defs): SVGDefsElement | Null = js.native
    @JSName("closest")
    def closest_del(selector: del): HTMLModElement | Null = js.native
    @JSName("closest")
    def closest_desc(selector: desc): SVGDescElement | Null = js.native
    @JSName("closest")
    def closest_details(selector: details): HTMLDetailsElement | Null = js.native
    @JSName("closest")
    def closest_dfn(selector: dfn): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_dialog(selector: dialog): HTMLDialogElement | Null = js.native
    @JSName("closest")
    def closest_dir(selector: dir): HTMLDirectoryElement | Null = js.native
    @JSName("closest")
    def closest_div(selector: div): HTMLDivElement | Null = js.native
    @JSName("closest")
    def closest_dl(selector: dl): HTMLDListElement | Null = js.native
    @JSName("closest")
    def closest_dt(selector: dt): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_ellipse(selector: ellipse): SVGEllipseElement | Null = js.native
    @JSName("closest")
    def closest_em(selector: em): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_embed(selector: embed): HTMLEmbedElement | Null = js.native
    @JSName("closest")
    def closest_feBlend(selector: feBlend): SVGFEBlendElement | Null = js.native
    @JSName("closest")
    def closest_feColorMatrix(selector: feColorMatrix): SVGFEColorMatrixElement | Null = js.native
    @JSName("closest")
    def closest_feComponentTransfer(selector: feComponentTransfer): SVGFEComponentTransferElement | Null = js.native
    @JSName("closest")
    def closest_feComposite(selector: feComposite): SVGFECompositeElement | Null = js.native
    @JSName("closest")
    def closest_feConvolveMatrix(selector: feConvolveMatrix): SVGFEConvolveMatrixElement | Null = js.native
    @JSName("closest")
    def closest_feDiffuseLighting(selector: feDiffuseLighting): SVGFEDiffuseLightingElement | Null = js.native
    @JSName("closest")
    def closest_feDisplacementMap(selector: feDisplacementMap): SVGFEDisplacementMapElement | Null = js.native
    @JSName("closest")
    def closest_feDistantLight(selector: feDistantLight): SVGFEDistantLightElement | Null = js.native
    @JSName("closest")
    def closest_feFlood(selector: feFlood): SVGFEFloodElement | Null = js.native
    @JSName("closest")
    def closest_feFuncA(selector: feFuncA): SVGFEFuncAElement | Null = js.native
    @JSName("closest")
    def closest_feFuncB(selector: feFuncB): SVGFEFuncBElement | Null = js.native
    @JSName("closest")
    def closest_feFuncG(selector: feFuncG): SVGFEFuncGElement | Null = js.native
    @JSName("closest")
    def closest_feFuncR(selector: feFuncR): SVGFEFuncRElement | Null = js.native
    @JSName("closest")
    def closest_feGaussianBlur(selector: feGaussianBlur): SVGFEGaussianBlurElement | Null = js.native
    @JSName("closest")
    def closest_feImage(selector: feImage): SVGFEImageElement | Null = js.native
    @JSName("closest")
    def closest_feMerge(selector: feMerge): SVGFEMergeElement | Null = js.native
    @JSName("closest")
    def closest_feMergeNode(selector: feMergeNode): SVGFEMergeNodeElement | Null = js.native
    @JSName("closest")
    def closest_feMorphology(selector: feMorphology): SVGFEMorphologyElement | Null = js.native
    @JSName("closest")
    def closest_feOffset(selector: feOffset): SVGFEOffsetElement | Null = js.native
    @JSName("closest")
    def closest_fePointLight(selector: fePointLight): SVGFEPointLightElement | Null = js.native
    @JSName("closest")
    def closest_feSpecularLighting(selector: feSpecularLighting): SVGFESpecularLightingElement | Null = js.native
    @JSName("closest")
    def closest_feSpotLight(selector: feSpotLight): SVGFESpotLightElement | Null = js.native
    @JSName("closest")
    def closest_feTile(selector: feTile): SVGFETileElement | Null = js.native
    @JSName("closest")
    def closest_feTurbulence(selector: feTurbulence): SVGFETurbulenceElement | Null = js.native
    @JSName("closest")
    def closest_fieldset(selector: fieldset): HTMLFieldSetElement | Null = js.native
    @JSName("closest")
    def closest_figcaption(selector: figcaption): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_figure(selector: figure): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_filter(selector: filter): SVGFilterElement | Null = js.native
    @JSName("closest")
    def closest_font(selector: font): HTMLFontElement | Null = js.native
    @JSName("closest")
    def closest_footer(selector: footer): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_foreignObject(selector: foreignObject): SVGForeignObjectElement | Null = js.native
    @JSName("closest")
    def closest_form(selector: form): HTMLFormElement | Null = js.native
    @JSName("closest")
    def closest_frame(selector: frame): HTMLFrameElement | Null = js.native
    @JSName("closest")
    def closest_frameset(selector: frameset): HTMLFrameSetElement | Null = js.native
    @JSName("closest")
    def closest_g(selector: g_): SVGGElement | Null = js.native
    @JSName("closest")
    def closest_h1(selector: h1): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h2(selector: h2): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h3(selector: h3): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h4(selector: h4): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h5(selector: h5): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h6(selector: h6): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_head(selector: head): HTMLHeadElement | Null = js.native
    @JSName("closest")
    def closest_header(selector: header): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_hgroup(selector: hgroup): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_hr(selector: hr): HTMLHRElement | Null = js.native
    @JSName("closest")
    def closest_html(selector: html): HTMLHtmlElement | Null = js.native
    @JSName("closest")
    def closest_i(selector: i): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_iframe(selector: iframe): HTMLIFrameElement | Null = js.native
    @JSName("closest")
    def closest_image(selector: image): SVGImageElement | Null = js.native
    @JSName("closest")
    def closest_img(selector: img): HTMLImageElement | Null = js.native
    @JSName("closest")
    def closest_input(selector: input): HTMLInputElement | Null = js.native
    @JSName("closest")
    def closest_ins(selector: ins): HTMLModElement | Null = js.native
    @JSName("closest")
    def closest_kbd(selector: kbd): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_label(selector: label): HTMLLabelElement | Null = js.native
    @JSName("closest")
    def closest_legend(selector: legend): HTMLLegendElement | Null = js.native
    @JSName("closest")
    def closest_li(selector: li): HTMLLIElement | Null = js.native
    @JSName("closest")
    def closest_line(selector: line): SVGLineElement | Null = js.native
    @JSName("closest")
    def closest_linearGradient(selector: linearGradient): SVGLinearGradientElement | Null = js.native
    @JSName("closest")
    def closest_link(selector: link): HTMLLinkElement | Null = js.native
    @JSName("closest")
    def closest_main(selector: main): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_map(selector: map): HTMLMapElement | Null = js.native
    @JSName("closest")
    def closest_mark(selector: mark): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_marker(selector: marker): SVGMarkerElement | Null = js.native
    @JSName("closest")
    def closest_marquee(selector: marquee): HTMLMarqueeElement | Null = js.native
    @JSName("closest")
    def closest_mask(selector: mask): SVGMaskElement | Null = js.native
    @JSName("closest")
    def closest_menu(selector: menu): HTMLMenuElement | Null = js.native
    @JSName("closest")
    def closest_meta(selector: meta): HTMLMetaElement | Null = js.native
    @JSName("closest")
    def closest_metadata(selector: metadata): SVGMetadataElement | Null = js.native
    @JSName("closest")
    def closest_meter(selector: meter): HTMLMeterElement | Null = js.native
    @JSName("closest")
    def closest_nav(selector: nav): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_noscript(selector: noscript): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_object(selector: `object`): HTMLObjectElement | Null = js.native
    @JSName("closest")
    def closest_ol(selector: ol): HTMLOListElement | Null = js.native
    @JSName("closest")
    def closest_optgroup(selector: optgroup): HTMLOptGroupElement | Null = js.native
    @JSName("closest")
    def closest_option(selector: option): HTMLOptionElement | Null = js.native
    @JSName("closest")
    def closest_output(selector: output): HTMLOutputElement | Null = js.native
    @JSName("closest")
    def closest_p(selector: p): HTMLParagraphElement | Null = js.native
    @JSName("closest")
    def closest_param(selector: param): HTMLParamElement | Null = js.native
    @JSName("closest")
    def closest_path(selector: path): SVGPathElement | Null = js.native
    @JSName("closest")
    def closest_pattern(selector: pattern): SVGPatternElement | Null = js.native
    @JSName("closest")
    def closest_picture(selector: picture): HTMLPictureElement | Null = js.native
    @JSName("closest")
    def closest_polygon(selector: polygon): SVGPolygonElement | Null = js.native
    @JSName("closest")
    def closest_polyline(selector: polyline): SVGPolylineElement | Null = js.native
    @JSName("closest")
    def closest_pre(selector: pre): HTMLPreElement | Null = js.native
    @JSName("closest")
    def closest_progress(selector: progress): HTMLProgressElement | Null = js.native
    @JSName("closest")
    def closest_q(selector: q): HTMLQuoteElement | Null = js.native
    @JSName("closest")
    def closest_radialGradient(selector: radialGradient): SVGRadialGradientElement | Null = js.native
    @JSName("closest")
    def closest_rect(selector: rect): SVGRectElement | Null = js.native
    @JSName("closest")
    def closest_rp(selector: rp): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_rt(selector: rt): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_ruby(selector: ruby): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_s(selector: s_): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_samp(selector: samp): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_script(selector: script): HTMLScriptElement | Null = js.native
    @JSName("closest")
    def closest_section(selector: section): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_select(selector: select): HTMLSelectElement | Null = js.native
    @JSName("closest")
    def closest_slot(selector: slot): HTMLSlotElement | Null = js.native
    @JSName("closest")
    def closest_small(selector: small): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_source(selector: source): HTMLSourceElement | Null = js.native
    @JSName("closest")
    def closest_span(selector: span): HTMLSpanElement | Null = js.native
    @JSName("closest")
    def closest_stop(selector: stop): SVGStopElement | Null = js.native
    @JSName("closest")
    def closest_strong(selector: strong): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_style(selector: typingsSlinky.flatpickr.flatpickrStrings.style): HTMLStyleElement | Null = js.native
    @JSName("closest")
    def closest_sub(selector: sub): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_summary(selector: summary): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_sup(selector: sup): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_svg(selector: svg): SVGSVGElement | Null = js.native
    @JSName("closest")
    def closest_switch(selector: switch): SVGSwitchElement | Null = js.native
    @JSName("closest")
    def closest_symbol(selector: symbol): SVGSymbolElement | Null = js.native
    @JSName("closest")
    def closest_table(selector: table): HTMLTableElement | Null = js.native
    @JSName("closest")
    def closest_tbody(selector: tbody): HTMLTableSectionElement | Null = js.native
    @JSName("closest")
    def closest_td(selector: td): HTMLTableDataCellElement | Null = js.native
    @JSName("closest")
    def closest_template(selector: template): HTMLTemplateElement | Null = js.native
    @JSName("closest")
    def closest_text(selector: text): SVGTextElement | Null = js.native
    @JSName("closest")
    def closest_textPath(selector: textPath): SVGTextPathElement | Null = js.native
    @JSName("closest")
    def closest_textarea(selector: textarea): HTMLTextAreaElement | Null = js.native
    @JSName("closest")
    def closest_tfoot(selector: tfoot): HTMLTableSectionElement | Null = js.native
    @JSName("closest")
    def closest_th(selector: th): HTMLTableHeaderCellElement | Null = js.native
    @JSName("closest")
    def closest_thead(selector: thead): HTMLTableSectionElement | Null = js.native
    @JSName("closest")
    def closest_time(selector: time): HTMLTimeElement | Null = js.native
    @JSName("closest")
    def closest_title(selector: title): HTMLTitleElement | Null = js.native
    @JSName("closest")
    def closest_tr(selector: tr): HTMLTableRowElement | Null = js.native
    @JSName("closest")
    def closest_track(selector: track): HTMLTrackElement | Null = js.native
    @JSName("closest")
    def closest_tspan(selector: tspan): SVGTSpanElement | Null = js.native
    @JSName("closest")
    def closest_u(selector: u_): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_ul(selector: ul): HTMLUListElement | Null = js.native
    @JSName("closest")
    def closest_use(selector: use): SVGUseElement | Null = js.native
    @JSName("closest")
    def closest_var(selector: `var`): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_video(selector: video): HTMLVideoElement | Null = js.native
    @JSName("closest")
    def closest_view(selector: view): SVGViewElement | Null = js.native
    @JSName("closest")
    def closest_wbr(selector: wbr): HTMLElement | Null = js.native
    
    /**
      * Returns a bitmask indicating the position of other relative to node.
      */
    def compareDocumentPosition(other: Node): Double = js.native
    
    /**
      * Returns true if other is an inclusive descendant of node, and false otherwise.
      */
    def contains(): Boolean = js.native
    def contains(other: Node): Boolean = js.native
    
    var contentEditable: String = js.native
    
    val dataset: DOMStringMap = js.native
    
    var dateObj: Date = js.native
    
    var dir: String = js.native
    
    /**
      * Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
      */
    def dispatchEvent(event: Event): Boolean = js.native
    
    var draggable: Boolean = js.native
    
    var enterKeyHint: String = js.native
    
    /**
      * Returns the first child.
      */
    val firstChild: ChildNode | Null = js.native
    
    /**
      * Returns the first child that is an element, and null otherwise.
      */
    val firstElementChild: Element | Null = js.native
    
    def focus(): Unit = js.native
    def focus(options: FocusOptions): Unit = js.native
    
    def getAnimations(): js.Array[Animation] = js.native
    
    /**
      * Returns element's first attribute whose qualified name is qualifiedName, and null if there is no such attribute otherwise.
      */
    def getAttribute(qualifiedName: String): String | Null = js.native
    
    /**
      * Returns element's attribute whose namespace is namespace and local name is localName, and null if there is no such attribute otherwise.
      */
    def getAttributeNS(namespace: String, localName: String): String | Null = js.native
    def getAttributeNS(namespace: Null, localName: String): String | Null = js.native
    
    /**
      * Returns the qualified names of all element's attributes. Can contain duplicates.
      */
    def getAttributeNames(): js.Array[String] = js.native
    
    def getAttributeNode(qualifiedName: String): Attr | Null = js.native
    
    def getAttributeNodeNS(namespace: String, localName: String): Attr | Null = js.native
    def getAttributeNodeNS(namespace: Null, localName: String): Attr | Null = js.native
    
    def getBoundingClientRect(): DOMRect = js.native
    
    def getClientRects(): DOMRectList = js.native
    
    /**
      * Returns a HTMLCollection of the elements in the object on which the method was invoked (a document or an element) that have all the classes given by classNames. The classNames argument is interpreted as a space-separated list of classes.
      */
    def getElementsByClassName(classNames: String): HTMLCollectionOf[Element] = js.native
    
    def getElementsByTagName(qualifiedName: String): HTMLCollectionOf[Element] = js.native
    
    def getElementsByTagNameNS(namespaceURI: String, localName: String): HTMLCollectionOf[Element] = js.native
    @JSName("getElementsByTagNameNS")
    def getElementsByTagNameNS_httpwwww3org1999xhtml(namespaceURI: httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, localName: String): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagNameNS")
    def getElementsByTagNameNS_httpwwww3org2000svg(namespaceURI: httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg, localName: String): HTMLCollectionOf[SVGElement] = js.native
    
    @JSName("getElementsByTagName")
    def getElementsByTagName_a(qualifiedName: a): HTMLCollectionOf[HTMLAnchorElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_abbr(qualifiedName: abbr): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_address(qualifiedName: address): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_applet(qualifiedName: applet): HTMLCollectionOf[HTMLAppletElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_area(qualifiedName: area): HTMLCollectionOf[HTMLAreaElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_article(qualifiedName: article): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_aside(qualifiedName: aside): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_audio(qualifiedName: audio): HTMLCollectionOf[HTMLAudioElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_b(qualifiedName: b): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_base(qualifiedName: base): HTMLCollectionOf[HTMLBaseElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_basefont(qualifiedName: basefont): HTMLCollectionOf[HTMLBaseFontElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_bdi(qualifiedName: bdi): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_bdo(qualifiedName: bdo): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_blockquote(qualifiedName: blockquote): HTMLCollectionOf[HTMLQuoteElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_body(qualifiedName: body): HTMLCollectionOf[HTMLBodyElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_br(qualifiedName: br): HTMLCollectionOf[HTMLBRElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_button(qualifiedName: button): HTMLCollectionOf[HTMLButtonElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_canvas(qualifiedName: canvas): HTMLCollectionOf[HTMLCanvasElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_caption(qualifiedName: caption): HTMLCollectionOf[HTMLTableCaptionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_circle(qualifiedName: circle): HTMLCollectionOf[SVGCircleElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_cite(qualifiedName: cite): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_clipPath(qualifiedName: clipPath): HTMLCollectionOf[SVGClipPathElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_code(qualifiedName: code): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_col(qualifiedName: col): HTMLCollectionOf[HTMLTableColElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_colgroup(qualifiedName: colgroup): HTMLCollectionOf[HTMLTableColElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_data(qualifiedName: data): HTMLCollectionOf[HTMLDataElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_datalist(qualifiedName: datalist): HTMLCollectionOf[HTMLDataListElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dd(qualifiedName: dd): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_defs(qualifiedName: defs): HTMLCollectionOf[SVGDefsElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_del(qualifiedName: del): HTMLCollectionOf[HTMLModElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_desc(qualifiedName: desc): HTMLCollectionOf[SVGDescElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_details(qualifiedName: details): HTMLCollectionOf[HTMLDetailsElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dfn(qualifiedName: dfn): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dialog(qualifiedName: dialog): HTMLCollectionOf[HTMLDialogElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dir(qualifiedName: dir): HTMLCollectionOf[HTMLDirectoryElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_div(qualifiedName: div): HTMLCollectionOf[HTMLDivElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dl(qualifiedName: dl): HTMLCollectionOf[HTMLDListElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dt(qualifiedName: dt): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ellipse(qualifiedName: ellipse): HTMLCollectionOf[SVGEllipseElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_em(qualifiedName: em): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_embed(qualifiedName: embed): HTMLCollectionOf[HTMLEmbedElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feBlend(qualifiedName: feBlend): HTMLCollectionOf[SVGFEBlendElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feColorMatrix(qualifiedName: feColorMatrix): HTMLCollectionOf[SVGFEColorMatrixElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feComponentTransfer(qualifiedName: feComponentTransfer): HTMLCollectionOf[SVGFEComponentTransferElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feComposite(qualifiedName: feComposite): HTMLCollectionOf[SVGFECompositeElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feConvolveMatrix(qualifiedName: feConvolveMatrix): HTMLCollectionOf[SVGFEConvolveMatrixElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feDiffuseLighting(qualifiedName: feDiffuseLighting): HTMLCollectionOf[SVGFEDiffuseLightingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feDisplacementMap(qualifiedName: feDisplacementMap): HTMLCollectionOf[SVGFEDisplacementMapElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feDistantLight(qualifiedName: feDistantLight): HTMLCollectionOf[SVGFEDistantLightElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFlood(qualifiedName: feFlood): HTMLCollectionOf[SVGFEFloodElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFuncA(qualifiedName: feFuncA): HTMLCollectionOf[SVGFEFuncAElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFuncB(qualifiedName: feFuncB): HTMLCollectionOf[SVGFEFuncBElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFuncG(qualifiedName: feFuncG): HTMLCollectionOf[SVGFEFuncGElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFuncR(qualifiedName: feFuncR): HTMLCollectionOf[SVGFEFuncRElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feGaussianBlur(qualifiedName: feGaussianBlur): HTMLCollectionOf[SVGFEGaussianBlurElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feImage(qualifiedName: feImage): HTMLCollectionOf[SVGFEImageElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feMerge(qualifiedName: feMerge): HTMLCollectionOf[SVGFEMergeElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feMergeNode(qualifiedName: feMergeNode): HTMLCollectionOf[SVGFEMergeNodeElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feMorphology(qualifiedName: feMorphology): HTMLCollectionOf[SVGFEMorphologyElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feOffset(qualifiedName: feOffset): HTMLCollectionOf[SVGFEOffsetElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_fePointLight(qualifiedName: fePointLight): HTMLCollectionOf[SVGFEPointLightElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feSpecularLighting(qualifiedName: feSpecularLighting): HTMLCollectionOf[SVGFESpecularLightingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feSpotLight(qualifiedName: feSpotLight): HTMLCollectionOf[SVGFESpotLightElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feTile(qualifiedName: feTile): HTMLCollectionOf[SVGFETileElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feTurbulence(qualifiedName: feTurbulence): HTMLCollectionOf[SVGFETurbulenceElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_fieldset(qualifiedName: fieldset): HTMLCollectionOf[HTMLFieldSetElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_figcaption(qualifiedName: figcaption): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_figure(qualifiedName: figure): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_filter(qualifiedName: filter): HTMLCollectionOf[SVGFilterElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_font(qualifiedName: font): HTMLCollectionOf[HTMLFontElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_footer(qualifiedName: footer): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_foreignObject(qualifiedName: foreignObject): HTMLCollectionOf[SVGForeignObjectElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_form(qualifiedName: form): HTMLCollectionOf[HTMLFormElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_frame(qualifiedName: frame): HTMLCollectionOf[HTMLFrameElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_frameset(qualifiedName: frameset): HTMLCollectionOf[HTMLFrameSetElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_g(qualifiedName: g_): HTMLCollectionOf[SVGGElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h1(qualifiedName: h1): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h2(qualifiedName: h2): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h3(qualifiedName: h3): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h4(qualifiedName: h4): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h5(qualifiedName: h5): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h6(qualifiedName: h6): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_head(qualifiedName: head): HTMLCollectionOf[HTMLHeadElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_header(qualifiedName: header): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_hgroup(qualifiedName: hgroup): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_hr(qualifiedName: hr): HTMLCollectionOf[HTMLHRElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_html(qualifiedName: html): HTMLCollectionOf[HTMLHtmlElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_i(qualifiedName: i): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_iframe(qualifiedName: iframe): HTMLCollectionOf[HTMLIFrameElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_image(qualifiedName: image): HTMLCollectionOf[SVGImageElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_img(qualifiedName: img): HTMLCollectionOf[HTMLImageElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_input(qualifiedName: input): HTMLCollectionOf[HTMLInputElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ins(qualifiedName: ins): HTMLCollectionOf[HTMLModElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_kbd(qualifiedName: kbd): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_label(qualifiedName: label): HTMLCollectionOf[HTMLLabelElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_legend(qualifiedName: legend): HTMLCollectionOf[HTMLLegendElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_li(qualifiedName: li): HTMLCollectionOf[HTMLLIElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_line(qualifiedName: line): HTMLCollectionOf[SVGLineElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_linearGradient(qualifiedName: linearGradient): HTMLCollectionOf[SVGLinearGradientElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_link(qualifiedName: link): HTMLCollectionOf[HTMLLinkElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_main(qualifiedName: main): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_map(qualifiedName: map): HTMLCollectionOf[HTMLMapElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_mark(qualifiedName: mark): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_marker(qualifiedName: marker): HTMLCollectionOf[SVGMarkerElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_marquee(qualifiedName: marquee): HTMLCollectionOf[HTMLMarqueeElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_mask(qualifiedName: mask): HTMLCollectionOf[SVGMaskElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_menu(qualifiedName: menu): HTMLCollectionOf[HTMLMenuElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_meta(qualifiedName: meta): HTMLCollectionOf[HTMLMetaElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_metadata(qualifiedName: metadata): HTMLCollectionOf[SVGMetadataElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_meter(qualifiedName: meter): HTMLCollectionOf[HTMLMeterElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_nav(qualifiedName: nav): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_noscript(qualifiedName: noscript): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_object(qualifiedName: `object`): HTMLCollectionOf[HTMLObjectElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ol(qualifiedName: ol): HTMLCollectionOf[HTMLOListElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_optgroup(qualifiedName: optgroup): HTMLCollectionOf[HTMLOptGroupElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_option(qualifiedName: option): HTMLCollectionOf[HTMLOptionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_output(qualifiedName: output): HTMLCollectionOf[HTMLOutputElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_p(qualifiedName: p): HTMLCollectionOf[HTMLParagraphElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_param(qualifiedName: param): HTMLCollectionOf[HTMLParamElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_path(qualifiedName: path): HTMLCollectionOf[SVGPathElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_pattern(qualifiedName: pattern): HTMLCollectionOf[SVGPatternElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_picture(qualifiedName: picture): HTMLCollectionOf[HTMLPictureElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_polygon(qualifiedName: polygon): HTMLCollectionOf[SVGPolygonElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_polyline(qualifiedName: polyline): HTMLCollectionOf[SVGPolylineElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_pre(qualifiedName: pre): HTMLCollectionOf[HTMLPreElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_progress(qualifiedName: progress): HTMLCollectionOf[HTMLProgressElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_q(qualifiedName: q): HTMLCollectionOf[HTMLQuoteElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_radialGradient(qualifiedName: radialGradient): HTMLCollectionOf[SVGRadialGradientElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_rect(qualifiedName: rect): HTMLCollectionOf[SVGRectElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_rp(qualifiedName: rp): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_rt(qualifiedName: rt): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ruby(qualifiedName: ruby): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_s(qualifiedName: s_): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_samp(qualifiedName: samp): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_script(qualifiedName: script): HTMLCollectionOf[HTMLScriptElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_section(qualifiedName: section): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_select(qualifiedName: select): HTMLCollectionOf[HTMLSelectElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_slot(qualifiedName: slot): HTMLCollectionOf[HTMLSlotElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_small(qualifiedName: small): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_source(qualifiedName: source): HTMLCollectionOf[HTMLSourceElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_span(qualifiedName: span): HTMLCollectionOf[HTMLSpanElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_stop(qualifiedName: stop): HTMLCollectionOf[SVGStopElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_strong(qualifiedName: strong): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_style(qualifiedName: typingsSlinky.flatpickr.flatpickrStrings.style): HTMLCollectionOf[HTMLStyleElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_sub(qualifiedName: sub): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_summary(qualifiedName: summary): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_sup(qualifiedName: sup): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_svg(qualifiedName: svg): HTMLCollectionOf[SVGSVGElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_switch(qualifiedName: switch): HTMLCollectionOf[SVGSwitchElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_symbol(qualifiedName: symbol): HTMLCollectionOf[SVGSymbolElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_table(qualifiedName: table): HTMLCollectionOf[HTMLTableElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_tbody(qualifiedName: tbody): HTMLCollectionOf[HTMLTableSectionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_td(qualifiedName: td): HTMLCollectionOf[HTMLTableDataCellElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_template(qualifiedName: template): HTMLCollectionOf[HTMLTemplateElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_text(qualifiedName: text): HTMLCollectionOf[SVGTextElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_textPath(qualifiedName: textPath): HTMLCollectionOf[SVGTextPathElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_textarea(qualifiedName: textarea): HTMLCollectionOf[HTMLTextAreaElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_tfoot(qualifiedName: tfoot): HTMLCollectionOf[HTMLTableSectionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_th(qualifiedName: th): HTMLCollectionOf[HTMLTableHeaderCellElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_thead(qualifiedName: thead): HTMLCollectionOf[HTMLTableSectionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_time(qualifiedName: time): HTMLCollectionOf[HTMLTimeElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_title(qualifiedName: title): HTMLCollectionOf[HTMLTitleElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_tr(qualifiedName: tr): HTMLCollectionOf[HTMLTableRowElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_track(qualifiedName: track): HTMLCollectionOf[HTMLTrackElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_tspan(qualifiedName: tspan): HTMLCollectionOf[SVGTSpanElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_u(qualifiedName: u_): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ul(qualifiedName: ul): HTMLCollectionOf[HTMLUListElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_use(qualifiedName: use): HTMLCollectionOf[SVGUseElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_var(qualifiedName: `var`): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_video(qualifiedName: video): HTMLCollectionOf[HTMLVideoElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_view(qualifiedName: view): HTMLCollectionOf[SVGViewElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_wbr(qualifiedName: wbr): HTMLCollectionOf[HTMLElement] = js.native
    
    /**
      * Returns node's root.
      */
    def getRootNode(): Node = js.native
    def getRootNode(options: GetRootNodeOptions): Node = js.native
    
    /**
      * Returns true if element has an attribute whose qualified name is qualifiedName, and false otherwise.
      */
    def hasAttribute(qualifiedName: String): Boolean = js.native
    
    /**
      * Returns true if element has an attribute whose namespace is namespace and local name is localName.
      */
    def hasAttributeNS(namespace: String, localName: String): Boolean = js.native
    def hasAttributeNS(namespace: Null, localName: String): Boolean = js.native
    
    /**
      * Returns true if element has attributes, and false otherwise.
      */
    def hasAttributes(): Boolean = js.native
    
    /**
      * Returns whether node has children.
      */
    def hasChildNodes(): Boolean = js.native
    
    def hasPointerCapture(pointerId: Double): Boolean = js.native
    
    var hidden: Boolean = js.native
    
    /**
      * Returns the value of element's id content attribute. Can be set to change it.
      */
    var id: String = js.native
    
    var innerHTML: String = js.native
    
    var innerText: String = js.native
    
    var inputMode: String = js.native
    
    def insertAdjacentElement(position: InsertPosition, insertedElement: Element): Element | Null = js.native
    
    def insertAdjacentHTML(where: InsertPosition, html: String): Unit = js.native
    
    def insertAdjacentText(where: InsertPosition, text: String): Unit = js.native
    
    def insertBefore[T /* <: Node */](newChild: T): T = js.native
    def insertBefore[T /* <: Node */](newChild: T, refChild: Node): T = js.native
    
    /**
      * Returns true if node is connected and false otherwise.
      */
    val isConnected: Boolean = js.native
    
    val isContentEditable: Boolean = js.native
    
    def isDefaultNamespace(): Boolean = js.native
    def isDefaultNamespace(namespace: String): Boolean = js.native
    
    /**
      * Returns whether node and otherNode have the same properties.
      */
    def isEqualNode(): Boolean = js.native
    def isEqualNode(otherNode: Node): Boolean = js.native
    
    def isSameNode(): Boolean = js.native
    def isSameNode(otherNode: Node): Boolean = js.native
    
    var lang: String = js.native
    
    /**
      * Returns the last child.
      */
    val lastChild: ChildNode | Null = js.native
    
    /**
      * Returns the last child that is an element, and null otherwise.
      */
    val lastElementChild: Element | Null = js.native
    
    /**
      * Returns the local name.
      */
    val localName: String = js.native
    
    def lookupNamespaceURI(): String | Null = js.native
    def lookupNamespaceURI(prefix: String): String | Null = js.native
    
    def lookupPrefix(): String | Null = js.native
    def lookupPrefix(namespace: String): String | Null = js.native
    
    /**
      * Returns true if matching selectors against element's root yields element, and false otherwise.
      */
    def matches(selectors: String): Boolean = js.native
    
    def msGetRegionContent(): js.Any = js.native
    
    /**
      * Returns the namespace.
      */
    val namespaceURI: String | Null = js.native
    
    /**
      * Returns the first following sibling that is an element, and null otherwise.
      */
    val nextElementSibling: Element | Null = js.native
    
    /**
      * Returns the next sibling.
      */
    val nextSibling: ChildNode | Null = js.native
    
    /**
      * Returns a string appropriate for the type of node.
      */
    val nodeName: String = js.native
    
    /**
      * Returns the type of node.
      */
    val nodeType: Double = js.native
    
    var nodeValue: String | Null = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    /**
      * Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes.
      */
    def normalize(): Unit = js.native
    
    val offsetHeight: Double = js.native
    
    val offsetLeft: Double = js.native
    
    val offsetParent: Element | Null = js.native
    
    val offsetTop: Double = js.native
    
    val offsetWidth: Double = js.native
    
    /**
      * Fires when the user aborts the download.
      * @param ev The event.
      */
    var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null = js.native
    
    var onanimationcancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onanimationend: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onanimationiteration: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onanimationstart: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onauxclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the object loses the input focus.
      * @param ev The focus event.
      */
    var onblur: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null = js.native
    
    var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when playback is possible, but would require further buffering.
      * @param ev The event.
      */
    var oncanplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var oncanplaythrough: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the contents of the object or selection have changed.
      * @param ev The event.
      */
    var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user clicks the left mouse button on the object
      * @param ev The mouse event.
      */
    var onclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user clicks the right mouse button in the client area, opening the context menu.
      * @param ev The mouse event.
      */
    var oncontextmenu: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var oncopy: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | Null = js.native
    
    var oncuechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var oncut: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | Null = js.native
    
    /**
      * Fires when the user double-clicks the object.
      * @param ev The mouse event.
      */
    var ondblclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires on the source object continuously during a drag operation.
      * @param ev The event.
      */
    var ondrag: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the source object when the user releases the mouse at the close of a drag operation.
      * @param ev The event.
      */
    var ondragend: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the target element when the user drags the object to a valid drop target.
      * @param ev The drag event.
      */
    var ondragenter: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    var ondragexit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
      * @param ev The drag event.
      */
    var ondragleave: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the target element continuously while the user drags the object over a valid drop target.
      * @param ev The event.
      */
    var ondragover: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the source object when the user starts to drag a text selection or selected object.
      * @param ev The event.
      */
    var ondragstart: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    var ondrop: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Occurs when the duration attribute is updated.
      * @param ev The event.
      */
    var ondurationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the media element is reset to its initial state.
      * @param ev The event.
      */
    var onemptied: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the end of playback is reached.
      * @param ev The event
      */
    var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when an error occurs during object loading.
      * @param ev The event.
      */
    var onerror: OnErrorEventHandler = js.native
    
    /**
      * Fires when the object receives focus.
      * @param ev The event.
      */
    var onfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null = js.native
    
    var onfullscreenchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onfullscreenerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var ongotpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var oninput: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var oninvalid: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user presses a key.
      * @param ev The keyboard event
      */
    var onkeydown: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
    
    /**
      * Fires when the user presses an alphanumeric key.
      * @param ev The event.
      */
    var onkeypress: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
    
    /**
      * Fires when the user releases a key.
      * @param ev The keyboard event
      */
    var onkeyup: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
    
    /**
      * Fires immediately after the browser loads the object.
      * @param ev The event.
      */
    var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when media data is loaded at the current playback position.
      * @param ev The event.
      */
    var onloadeddata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the duration and dimensions of the media have been determined.
      * @param ev The event.
      */
    var onloadedmetadata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when Internet Explorer begins looking for media data.
      * @param ev The event.
      */
    var onloadstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onlostpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    /**
      * Fires when the user clicks the object with either mouse button.
      * @param ev The mouse event.
      */
    var onmousedown: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onmouseenter: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onmouseleave: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse over the object.
      * @param ev The mouse event.
      */
    var onmousemove: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse pointer outside the boundaries of the object.
      * @param ev The mouse event.
      */
    var onmouseout: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse pointer into the object.
      * @param ev The mouse event.
      */
    var onmouseover: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user releases a mouse button while the mouse is over the object.
      * @param ev The mouse event.
      */
    var onmouseup: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onpaste: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | Null = js.native
    
    /**
      * Occurs when playback is paused.
      * @param ev The event.
      */
    var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the play method is requested.
      * @param ev The event.
      */
    var onplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the audio or video has started playing.
      * @param ev The event.
      */
    var onplaying: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onpointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    /**
      * Occurs to indicate progress while downloading media data.
      * @param ev The event.
      */
    var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | Null = js.native
    
    /**
      * Occurs when the playback rate is increased or decreased.
      * @param ev The event.
      */
    var onratechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user resets a form.
      * @param ev The event.
      */
    var onreset: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onresize: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null = js.native
    
    /**
      * Fires when the user repositions the scroll box in the scroll bar on the object.
      * @param ev The event.
      */
    var onscroll: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onsecuritypolicyviolation: (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]) | Null = js.native
    
    /**
      * Occurs when the seek operation ends.
      * @param ev The event.
      */
    var onseeked: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the current playback position is moved.
      * @param ev The event.
      */
    var onseeking: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the current selection changes.
      * @param ev The event.
      */
    var onselect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onselectionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onselectstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the download has stopped.
      * @param ev The event.
      */
    var onstalled: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onsubmit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs if the load operation has been intentionally halted.
      * @param ev The event.
      */
    var onsuspend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs to indicate the current playback position.
      * @param ev The event.
      */
    var ontimeupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var ontoggle: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontransitioncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    var ontransitionend: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    var ontransitionrun: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    var ontransitionstart: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    /**
      * Occurs when the volume is changed, or playback is muted or unmuted.
      * @param ev The event.
      */
    var onvolumechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when playback stops because the next frame of a video resource is not available.
      * @param ev The event.
      */
    var onwaiting: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onwheel: (js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]) | Null = js.native
    
    var outerHTML: String = js.native
    
    val ownerDocument: Document = js.native
    
    /**
      * Returns the parent element.
      */
    val parentElement: HTMLElement | Null = js.native
    
    /**
      * Returns the parent.
      */
    val parentNode: (Node with ParentNode) | Null = js.native
    
    /**
      * Returns the namespace prefix.
      */
    val prefix: String | Null = js.native
    
    /**
      * Inserts nodes before the first child of node, while replacing strings in nodes with equivalent Text nodes.
      * 
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def prepend(nodes: (Node | String)*): Unit = js.native
    
    /**
      * Returns the first preceding sibling that is an element, and null otherwise.
      */
    val previousElementSibling: Element | Null = js.native
    
    /**
      * Returns the previous sibling.
      */
    val previousSibling: ChildNode | Null = js.native
    
    def querySelector[E /* <: Element */](selectors: String): E | Null = js.native
    
    def querySelectorAll[E /* <: Element */](selectors: String): NodeListOf[E with Node] = js.native
    /**
      * Returns all element descendants of node that match selectors.
      */
    @JSName("querySelectorAll")
    def querySelectorAll_a(selectors: a): NodeListOf[HTMLAnchorElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_abbr(selectors: abbr): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_address(selectors: address): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_applet(selectors: applet): NodeListOf[HTMLAppletElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_area(selectors: area): NodeListOf[HTMLAreaElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_article(selectors: article): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_aside(selectors: aside): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_audio(selectors: audio): NodeListOf[HTMLAudioElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_b(selectors: b): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_base(selectors: base): NodeListOf[HTMLBaseElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_basefont(selectors: basefont): NodeListOf[HTMLBaseFontElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_bdi(selectors: bdi): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_bdo(selectors: bdo): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_blockquote(selectors: blockquote): NodeListOf[HTMLQuoteElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_body(selectors: body): NodeListOf[HTMLBodyElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_br(selectors: br): NodeListOf[HTMLBRElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_button(selectors: button): NodeListOf[HTMLButtonElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_canvas(selectors: canvas): NodeListOf[HTMLCanvasElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_caption(selectors: caption): NodeListOf[HTMLTableCaptionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_circle(selectors: circle): NodeListOf[SVGCircleElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_cite(selectors: cite): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_clipPath(selectors: clipPath): NodeListOf[SVGClipPathElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_code(selectors: code): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_col(selectors: col): NodeListOf[HTMLTableColElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_colgroup(selectors: colgroup): NodeListOf[HTMLTableColElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_data(selectors: data): NodeListOf[HTMLDataElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_datalist(selectors: datalist): NodeListOf[HTMLDataListElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dd(selectors: dd): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_defs(selectors: defs): NodeListOf[SVGDefsElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_del(selectors: del): NodeListOf[HTMLModElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_desc(selectors: desc): NodeListOf[SVGDescElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_details(selectors: details): NodeListOf[HTMLDetailsElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dfn(selectors: dfn): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dialog(selectors: dialog): NodeListOf[HTMLDialogElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dir(selectors: dir): NodeListOf[HTMLDirectoryElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_div(selectors: div): NodeListOf[HTMLDivElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dl(selectors: dl): NodeListOf[HTMLDListElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dt(selectors: dt): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ellipse(selectors: ellipse): NodeListOf[SVGEllipseElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_em(selectors: em): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_embed(selectors: embed): NodeListOf[HTMLEmbedElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feBlend(selectors: feBlend): NodeListOf[SVGFEBlendElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feColorMatrix(selectors: feColorMatrix): NodeListOf[SVGFEColorMatrixElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feComponentTransfer(selectors: feComponentTransfer): NodeListOf[SVGFEComponentTransferElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feComposite(selectors: feComposite): NodeListOf[SVGFECompositeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feConvolveMatrix(selectors: feConvolveMatrix): NodeListOf[SVGFEConvolveMatrixElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feDiffuseLighting(selectors: feDiffuseLighting): NodeListOf[SVGFEDiffuseLightingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feDisplacementMap(selectors: feDisplacementMap): NodeListOf[SVGFEDisplacementMapElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feDistantLight(selectors: feDistantLight): NodeListOf[SVGFEDistantLightElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFlood(selectors: feFlood): NodeListOf[SVGFEFloodElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncA(selectors: feFuncA): NodeListOf[SVGFEFuncAElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncB(selectors: feFuncB): NodeListOf[SVGFEFuncBElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncG(selectors: feFuncG): NodeListOf[SVGFEFuncGElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncR(selectors: feFuncR): NodeListOf[SVGFEFuncRElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feGaussianBlur(selectors: feGaussianBlur): NodeListOf[SVGFEGaussianBlurElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feImage(selectors: feImage): NodeListOf[SVGFEImageElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feMerge(selectors: feMerge): NodeListOf[SVGFEMergeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feMergeNode(selectors: feMergeNode): NodeListOf[SVGFEMergeNodeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feMorphology(selectors: feMorphology): NodeListOf[SVGFEMorphologyElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feOffset(selectors: feOffset): NodeListOf[SVGFEOffsetElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_fePointLight(selectors: fePointLight): NodeListOf[SVGFEPointLightElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feSpecularLighting(selectors: feSpecularLighting): NodeListOf[SVGFESpecularLightingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feSpotLight(selectors: feSpotLight): NodeListOf[SVGFESpotLightElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feTile(selectors: feTile): NodeListOf[SVGFETileElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feTurbulence(selectors: feTurbulence): NodeListOf[SVGFETurbulenceElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_fieldset(selectors: fieldset): NodeListOf[HTMLFieldSetElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_figcaption(selectors: figcaption): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_figure(selectors: figure): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_filter(selectors: filter): NodeListOf[SVGFilterElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_font(selectors: font): NodeListOf[HTMLFontElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_footer(selectors: footer): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_foreignObject(selectors: foreignObject): NodeListOf[SVGForeignObjectElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_form(selectors: form): NodeListOf[HTMLFormElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_frame(selectors: frame): NodeListOf[HTMLFrameElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_frameset(selectors: frameset): NodeListOf[HTMLFrameSetElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_g(selectors: g_): NodeListOf[SVGGElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h1(selectors: h1): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h2(selectors: h2): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h3(selectors: h3): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h4(selectors: h4): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h5(selectors: h5): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h6(selectors: h6): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_head(selectors: head): NodeListOf[HTMLHeadElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_header(selectors: header): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_hgroup(selectors: hgroup): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_hr(selectors: hr): NodeListOf[HTMLHRElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_html(selectors: html): NodeListOf[HTMLHtmlElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_i(selectors: i): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_iframe(selectors: iframe): NodeListOf[HTMLIFrameElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_image(selectors: image): NodeListOf[SVGImageElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_img(selectors: img): NodeListOf[HTMLImageElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_input(selectors: input): NodeListOf[HTMLInputElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ins(selectors: ins): NodeListOf[HTMLModElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_kbd(selectors: kbd): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_label(selectors: label): NodeListOf[HTMLLabelElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_legend(selectors: legend): NodeListOf[HTMLLegendElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_li(selectors: li): NodeListOf[HTMLLIElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_line(selectors: line): NodeListOf[SVGLineElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_linearGradient(selectors: linearGradient): NodeListOf[SVGLinearGradientElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_link(selectors: link): NodeListOf[HTMLLinkElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_main(selectors: main): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_map(selectors: map): NodeListOf[HTMLMapElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_mark(selectors: mark): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_marker(selectors: marker): NodeListOf[SVGMarkerElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_marquee(selectors: marquee): NodeListOf[HTMLMarqueeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_mask(selectors: mask): NodeListOf[SVGMaskElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_menu(selectors: menu): NodeListOf[HTMLMenuElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_meta(selectors: meta): NodeListOf[HTMLMetaElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_metadata(selectors: metadata): NodeListOf[SVGMetadataElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_meter(selectors: meter): NodeListOf[HTMLMeterElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_nav(selectors: nav): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_noscript(selectors: noscript): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_object(selectors: `object`): NodeListOf[HTMLObjectElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ol(selectors: ol): NodeListOf[HTMLOListElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_optgroup(selectors: optgroup): NodeListOf[HTMLOptGroupElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_option(selectors: option): NodeListOf[HTMLOptionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_output(selectors: output): NodeListOf[HTMLOutputElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_p(selectors: p): NodeListOf[HTMLParagraphElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_param(selectors: param): NodeListOf[HTMLParamElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_path(selectors: path): NodeListOf[SVGPathElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_pattern(selectors: pattern): NodeListOf[SVGPatternElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_picture(selectors: picture): NodeListOf[HTMLPictureElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_polygon(selectors: polygon): NodeListOf[SVGPolygonElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_polyline(selectors: polyline): NodeListOf[SVGPolylineElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_pre(selectors: pre): NodeListOf[HTMLPreElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_progress(selectors: progress): NodeListOf[HTMLProgressElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_q(selectors: q): NodeListOf[HTMLQuoteElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_radialGradient(selectors: radialGradient): NodeListOf[SVGRadialGradientElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_rect(selectors: rect): NodeListOf[SVGRectElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_rp(selectors: rp): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_rt(selectors: rt): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ruby(selectors: ruby): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_s(selectors: s_): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_samp(selectors: samp): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_script(selectors: script): NodeListOf[HTMLScriptElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_section(selectors: section): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_select(selectors: select): NodeListOf[HTMLSelectElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_slot(selectors: slot): NodeListOf[HTMLSlotElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_small(selectors: small): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_source(selectors: source): NodeListOf[HTMLSourceElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_span(selectors: span): NodeListOf[HTMLSpanElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_stop(selectors: stop): NodeListOf[SVGStopElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_strong(selectors: strong): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_style(selectors: typingsSlinky.flatpickr.flatpickrStrings.style): NodeListOf[HTMLStyleElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_sub(selectors: sub): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_summary(selectors: summary): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_sup(selectors: sup): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_svg(selectors: svg): NodeListOf[SVGSVGElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_switch(selectors: switch): NodeListOf[SVGSwitchElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_symbol(selectors: symbol): NodeListOf[SVGSymbolElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_table(selectors: table): NodeListOf[HTMLTableElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tbody(selectors: tbody): NodeListOf[HTMLTableSectionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_td(selectors: td): NodeListOf[HTMLTableDataCellElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_template(selectors: template): NodeListOf[HTMLTemplateElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_text(selectors: text): NodeListOf[SVGTextElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_textPath(selectors: textPath): NodeListOf[SVGTextPathElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_textarea(selectors: textarea): NodeListOf[HTMLTextAreaElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tfoot(selectors: tfoot): NodeListOf[HTMLTableSectionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_th(selectors: th): NodeListOf[HTMLTableHeaderCellElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_thead(selectors: thead): NodeListOf[HTMLTableSectionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_time(selectors: time): NodeListOf[HTMLTimeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_title(selectors: title): NodeListOf[HTMLTitleElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tr(selectors: tr): NodeListOf[HTMLTableRowElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_track(selectors: track): NodeListOf[HTMLTrackElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tspan(selectors: tspan): NodeListOf[SVGTSpanElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_u(selectors: u_): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ul(selectors: ul): NodeListOf[HTMLUListElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_use(selectors: use): NodeListOf[SVGUseElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_var(selectors: `var`): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_video(selectors: video): NodeListOf[HTMLVideoElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_view(selectors: view): NodeListOf[SVGViewElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_wbr(selectors: wbr): NodeListOf[HTMLElement with Node] = js.native
    
    /**
      * Returns the first element that is a descendant of node that matches selectors.
      */
    @JSName("querySelector")
    def querySelector_a(selectors: a): HTMLAnchorElement | Null = js.native
    @JSName("querySelector")
    def querySelector_abbr(selectors: abbr): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_address(selectors: address): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_applet(selectors: applet): HTMLAppletElement | Null = js.native
    @JSName("querySelector")
    def querySelector_area(selectors: area): HTMLAreaElement | Null = js.native
    @JSName("querySelector")
    def querySelector_article(selectors: article): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_aside(selectors: aside): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_audio(selectors: audio): HTMLAudioElement | Null = js.native
    @JSName("querySelector")
    def querySelector_b(selectors: b): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_base(selectors: base): HTMLBaseElement | Null = js.native
    @JSName("querySelector")
    def querySelector_basefont(selectors: basefont): HTMLBaseFontElement | Null = js.native
    @JSName("querySelector")
    def querySelector_bdi(selectors: bdi): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_bdo(selectors: bdo): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_blockquote(selectors: blockquote): HTMLQuoteElement | Null = js.native
    @JSName("querySelector")
    def querySelector_body(selectors: body): HTMLBodyElement | Null = js.native
    @JSName("querySelector")
    def querySelector_br(selectors: br): HTMLBRElement | Null = js.native
    @JSName("querySelector")
    def querySelector_button(selectors: button): HTMLButtonElement | Null = js.native
    @JSName("querySelector")
    def querySelector_canvas(selectors: canvas): HTMLCanvasElement | Null = js.native
    @JSName("querySelector")
    def querySelector_caption(selectors: caption): HTMLTableCaptionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_circle(selectors: circle): SVGCircleElement | Null = js.native
    @JSName("querySelector")
    def querySelector_cite(selectors: cite): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_clipPath(selectors: clipPath): SVGClipPathElement | Null = js.native
    @JSName("querySelector")
    def querySelector_code(selectors: code): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_col(selectors: col): HTMLTableColElement | Null = js.native
    @JSName("querySelector")
    def querySelector_colgroup(selectors: colgroup): HTMLTableColElement | Null = js.native
    @JSName("querySelector")
    def querySelector_data(selectors: data): HTMLDataElement | Null = js.native
    @JSName("querySelector")
    def querySelector_datalist(selectors: datalist): HTMLDataListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dd(selectors: dd): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_defs(selectors: defs): SVGDefsElement | Null = js.native
    @JSName("querySelector")
    def querySelector_del(selectors: del): HTMLModElement | Null = js.native
    @JSName("querySelector")
    def querySelector_desc(selectors: desc): SVGDescElement | Null = js.native
    @JSName("querySelector")
    def querySelector_details(selectors: details): HTMLDetailsElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dfn(selectors: dfn): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dialog(selectors: dialog): HTMLDialogElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dir(selectors: dir): HTMLDirectoryElement | Null = js.native
    @JSName("querySelector")
    def querySelector_div(selectors: div): HTMLDivElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dl(selectors: dl): HTMLDListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dt(selectors: dt): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ellipse(selectors: ellipse): SVGEllipseElement | Null = js.native
    @JSName("querySelector")
    def querySelector_em(selectors: em): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_embed(selectors: embed): HTMLEmbedElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feBlend(selectors: feBlend): SVGFEBlendElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feColorMatrix(selectors: feColorMatrix): SVGFEColorMatrixElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feComponentTransfer(selectors: feComponentTransfer): SVGFEComponentTransferElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feComposite(selectors: feComposite): SVGFECompositeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feConvolveMatrix(selectors: feConvolveMatrix): SVGFEConvolveMatrixElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feDiffuseLighting(selectors: feDiffuseLighting): SVGFEDiffuseLightingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feDisplacementMap(selectors: feDisplacementMap): SVGFEDisplacementMapElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feDistantLight(selectors: feDistantLight): SVGFEDistantLightElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFlood(selectors: feFlood): SVGFEFloodElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncA(selectors: feFuncA): SVGFEFuncAElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncB(selectors: feFuncB): SVGFEFuncBElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncG(selectors: feFuncG): SVGFEFuncGElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncR(selectors: feFuncR): SVGFEFuncRElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feGaussianBlur(selectors: feGaussianBlur): SVGFEGaussianBlurElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feImage(selectors: feImage): SVGFEImageElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feMerge(selectors: feMerge): SVGFEMergeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feMergeNode(selectors: feMergeNode): SVGFEMergeNodeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feMorphology(selectors: feMorphology): SVGFEMorphologyElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feOffset(selectors: feOffset): SVGFEOffsetElement | Null = js.native
    @JSName("querySelector")
    def querySelector_fePointLight(selectors: fePointLight): SVGFEPointLightElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feSpecularLighting(selectors: feSpecularLighting): SVGFESpecularLightingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feSpotLight(selectors: feSpotLight): SVGFESpotLightElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feTile(selectors: feTile): SVGFETileElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feTurbulence(selectors: feTurbulence): SVGFETurbulenceElement | Null = js.native
    @JSName("querySelector")
    def querySelector_fieldset(selectors: fieldset): HTMLFieldSetElement | Null = js.native
    @JSName("querySelector")
    def querySelector_figcaption(selectors: figcaption): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_figure(selectors: figure): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_filter(selectors: filter): SVGFilterElement | Null = js.native
    @JSName("querySelector")
    def querySelector_font(selectors: font): HTMLFontElement | Null = js.native
    @JSName("querySelector")
    def querySelector_footer(selectors: footer): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_foreignObject(selectors: foreignObject): SVGForeignObjectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_form(selectors: form): HTMLFormElement | Null = js.native
    @JSName("querySelector")
    def querySelector_frame(selectors: frame): HTMLFrameElement | Null = js.native
    @JSName("querySelector")
    def querySelector_frameset(selectors: frameset): HTMLFrameSetElement | Null = js.native
    @JSName("querySelector")
    def querySelector_g(selectors: g_): SVGGElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h1(selectors: h1): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h2(selectors: h2): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h3(selectors: h3): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h4(selectors: h4): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h5(selectors: h5): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h6(selectors: h6): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_head(selectors: head): HTMLHeadElement | Null = js.native
    @JSName("querySelector")
    def querySelector_header(selectors: header): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_hgroup(selectors: hgroup): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_hr(selectors: hr): HTMLHRElement | Null = js.native
    @JSName("querySelector")
    def querySelector_html(selectors: html): HTMLHtmlElement | Null = js.native
    @JSName("querySelector")
    def querySelector_i(selectors: i): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_iframe(selectors: iframe): HTMLIFrameElement | Null = js.native
    @JSName("querySelector")
    def querySelector_image(selectors: image): SVGImageElement | Null = js.native
    @JSName("querySelector")
    def querySelector_img(selectors: img): HTMLImageElement | Null = js.native
    @JSName("querySelector")
    def querySelector_input(selectors: input): HTMLInputElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ins(selectors: ins): HTMLModElement | Null = js.native
    @JSName("querySelector")
    def querySelector_kbd(selectors: kbd): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_label(selectors: label): HTMLLabelElement | Null = js.native
    @JSName("querySelector")
    def querySelector_legend(selectors: legend): HTMLLegendElement | Null = js.native
    @JSName("querySelector")
    def querySelector_li(selectors: li): HTMLLIElement | Null = js.native
    @JSName("querySelector")
    def querySelector_line(selectors: line): SVGLineElement | Null = js.native
    @JSName("querySelector")
    def querySelector_linearGradient(selectors: linearGradient): SVGLinearGradientElement | Null = js.native
    @JSName("querySelector")
    def querySelector_link(selectors: link): HTMLLinkElement | Null = js.native
    @JSName("querySelector")
    def querySelector_main(selectors: main): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_map(selectors: map): HTMLMapElement | Null = js.native
    @JSName("querySelector")
    def querySelector_mark(selectors: mark): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_marker(selectors: marker): SVGMarkerElement | Null = js.native
    @JSName("querySelector")
    def querySelector_marquee(selectors: marquee): HTMLMarqueeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_mask(selectors: mask): SVGMaskElement | Null = js.native
    @JSName("querySelector")
    def querySelector_menu(selectors: menu): HTMLMenuElement | Null = js.native
    @JSName("querySelector")
    def querySelector_meta(selectors: meta): HTMLMetaElement | Null = js.native
    @JSName("querySelector")
    def querySelector_metadata(selectors: metadata): SVGMetadataElement | Null = js.native
    @JSName("querySelector")
    def querySelector_meter(selectors: meter): HTMLMeterElement | Null = js.native
    @JSName("querySelector")
    def querySelector_nav(selectors: nav): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_noscript(selectors: noscript): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_object(selectors: `object`): HTMLObjectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ol(selectors: ol): HTMLOListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_optgroup(selectors: optgroup): HTMLOptGroupElement | Null = js.native
    @JSName("querySelector")
    def querySelector_option(selectors: option): HTMLOptionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_output(selectors: output): HTMLOutputElement | Null = js.native
    @JSName("querySelector")
    def querySelector_p(selectors: p): HTMLParagraphElement | Null = js.native
    @JSName("querySelector")
    def querySelector_param(selectors: param): HTMLParamElement | Null = js.native
    @JSName("querySelector")
    def querySelector_path(selectors: path): SVGPathElement | Null = js.native
    @JSName("querySelector")
    def querySelector_pattern(selectors: pattern): SVGPatternElement | Null = js.native
    @JSName("querySelector")
    def querySelector_picture(selectors: picture): HTMLPictureElement | Null = js.native
    @JSName("querySelector")
    def querySelector_polygon(selectors: polygon): SVGPolygonElement | Null = js.native
    @JSName("querySelector")
    def querySelector_polyline(selectors: polyline): SVGPolylineElement | Null = js.native
    @JSName("querySelector")
    def querySelector_pre(selectors: pre): HTMLPreElement | Null = js.native
    @JSName("querySelector")
    def querySelector_progress(selectors: progress): HTMLProgressElement | Null = js.native
    @JSName("querySelector")
    def querySelector_q(selectors: q): HTMLQuoteElement | Null = js.native
    @JSName("querySelector")
    def querySelector_radialGradient(selectors: radialGradient): SVGRadialGradientElement | Null = js.native
    @JSName("querySelector")
    def querySelector_rect(selectors: rect): SVGRectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_rp(selectors: rp): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_rt(selectors: rt): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ruby(selectors: ruby): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_s(selectors: s_): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_samp(selectors: samp): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_script(selectors: script): HTMLScriptElement | Null = js.native
    @JSName("querySelector")
    def querySelector_section(selectors: section): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_select(selectors: select): HTMLSelectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_slot(selectors: slot): HTMLSlotElement | Null = js.native
    @JSName("querySelector")
    def querySelector_small(selectors: small): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_source(selectors: source): HTMLSourceElement | Null = js.native
    @JSName("querySelector")
    def querySelector_span(selectors: span): HTMLSpanElement | Null = js.native
    @JSName("querySelector")
    def querySelector_stop(selectors: stop): SVGStopElement | Null = js.native
    @JSName("querySelector")
    def querySelector_strong(selectors: strong): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_style(selectors: typingsSlinky.flatpickr.flatpickrStrings.style): HTMLStyleElement | Null = js.native
    @JSName("querySelector")
    def querySelector_sub(selectors: sub): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_summary(selectors: summary): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_sup(selectors: sup): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_svg(selectors: svg): SVGSVGElement | Null = js.native
    @JSName("querySelector")
    def querySelector_switch(selectors: switch): SVGSwitchElement | Null = js.native
    @JSName("querySelector")
    def querySelector_symbol(selectors: symbol): SVGSymbolElement | Null = js.native
    @JSName("querySelector")
    def querySelector_table(selectors: table): HTMLTableElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tbody(selectors: tbody): HTMLTableSectionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_td(selectors: td): HTMLTableDataCellElement | Null = js.native
    @JSName("querySelector")
    def querySelector_template(selectors: template): HTMLTemplateElement | Null = js.native
    @JSName("querySelector")
    def querySelector_text(selectors: text): SVGTextElement | Null = js.native
    @JSName("querySelector")
    def querySelector_textPath(selectors: textPath): SVGTextPathElement | Null = js.native
    @JSName("querySelector")
    def querySelector_textarea(selectors: textarea): HTMLTextAreaElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tfoot(selectors: tfoot): HTMLTableSectionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_th(selectors: th): HTMLTableHeaderCellElement | Null = js.native
    @JSName("querySelector")
    def querySelector_thead(selectors: thead): HTMLTableSectionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_time(selectors: time): HTMLTimeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_title(selectors: title): HTMLTitleElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tr(selectors: tr): HTMLTableRowElement | Null = js.native
    @JSName("querySelector")
    def querySelector_track(selectors: track): HTMLTrackElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tspan(selectors: tspan): SVGTSpanElement | Null = js.native
    @JSName("querySelector")
    def querySelector_u(selectors: u_): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ul(selectors: ul): HTMLUListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_use(selectors: use): SVGUseElement | Null = js.native
    @JSName("querySelector")
    def querySelector_var(selectors: `var`): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_video(selectors: video): HTMLVideoElement | Null = js.native
    @JSName("querySelector")
    def querySelector_view(selectors: view): SVGViewElement | Null = js.native
    @JSName("querySelector")
    def querySelector_wbr(selectors: wbr): HTMLElement | Null = js.native
    
    def releasePointerCapture(pointerId: Double): Unit = js.native
    
    /**
      * Removes node.
      */
    def remove(): Unit = js.native
    
    /**
      * Removes element's first attribute whose qualified name is qualifiedName.
      */
    def removeAttribute(qualifiedName: String): Unit = js.native
    
    /**
      * Removes element's attribute whose namespace is namespace and local name is localName.
      */
    def removeAttributeNS(namespace: String, localName: String): Unit = js.native
    def removeAttributeNS(namespace: Null, localName: String): Unit = js.native
    
    def removeAttributeNode(attr: Attr): Attr = js.native
    
    def removeChild[T /* <: Node */](oldChild: T): T = js.native
    
    /**
      * Removes the event listener in target's event listener list with the same type, callback, and options.
      */
    def removeEventListener(`type`: String): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(`type`: animationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(`type`: dragexit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(`type`: pointercancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: Boolean
    ): Unit = js.native
    
    def replaceChild[T /* <: Node */](newChild: Node, oldChild: T): T = js.native
    
    /**
      * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
      * 
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def replaceWith(nodes: (Node | String)*): Unit = js.native
    
    /**
      * Displays element fullscreen and resolves promise when done.
      * 
      * When supplied, options's navigationUI member indicates whether showing navigation UI while in fullscreen is preferred or not. If set to "show", navigation simplicity is preferred over screen space, and if set to "hide", more screen space is preferred. User agents are always free to honor user preference over the application's. The default value "auto" indicates no application preference.
      */
    def requestFullscreen(): js.Promise[Unit] = js.native
    def requestFullscreen(options: FullscreenOptions): js.Promise[Unit] = js.native
    
    def requestPointerLock(): Unit = js.native
    
    def scroll(): Unit = js.native
    def scroll(options: ScrollToOptions): Unit = js.native
    def scroll(x: Double, y: Double): Unit = js.native
    
    def scrollBy(): Unit = js.native
    def scrollBy(options: ScrollToOptions): Unit = js.native
    def scrollBy(x: Double, y: Double): Unit = js.native
    
    val scrollHeight: Double = js.native
    
    def scrollIntoView(): Unit = js.native
    def scrollIntoView(arg: Boolean): Unit = js.native
    def scrollIntoView(arg: ScrollIntoViewOptions): Unit = js.native
    
    var scrollLeft: Double = js.native
    
    def scrollTo(): Unit = js.native
    def scrollTo(options: ScrollToOptions): Unit = js.native
    def scrollTo(x: Double, y: Double): Unit = js.native
    
    var scrollTop: Double = js.native
    
    val scrollWidth: Double = js.native
    
    /**
      * Sets the value of element's first attribute whose qualified name is qualifiedName to value.
      */
    def setAttribute(qualifiedName: String, value: String): Unit = js.native
    
    /**
      * Sets the value of element's attribute whose namespace is namespace and local name is localName to value.
      */
    def setAttributeNS(namespace: String, qualifiedName: String, value: String): Unit = js.native
    def setAttributeNS(namespace: Null, qualifiedName: String, value: String): Unit = js.native
    
    def setAttributeNode(attr: Attr): Attr | Null = js.native
    
    def setAttributeNodeNS(attr: Attr): Attr | Null = js.native
    
    def setPointerCapture(pointerId: Double): Unit = js.native
    
    /**
      * Returns element's shadow root, if any, and if shadow root's mode is "open", and null otherwise.
      */
    val shadowRoot: ShadowRoot | Null = js.native
    
    /**
      * Returns the value of element's slot content attribute. Can be set to change it.
      */
    var slot: String = js.native
    
    var spellcheck: Boolean = js.native
    
    val style: CSSStyleDeclaration = js.native
    
    var tabIndex: Double = js.native
    
    /**
      * Returns the HTML-uppercased qualified name.
      */
    val tagName: String = js.native
    
    var textContent: String | Null = js.native
    
    var title: String = js.native
    
    /**
      * If force is not given, "toggles" qualifiedName, removing it if it is present and adding it if it is not present. If force is true, adds qualifiedName. If force is false, removes qualifiedName.
      * 
      * Returns true if qualifiedName is now present, and false otherwise.
      */
    def toggleAttribute(qualifiedName: String): Boolean = js.native
    def toggleAttribute(qualifiedName: String, force: Boolean): Boolean = js.native
    
    var translate: Boolean = js.native
    
    def webkitMatchesSelector(selectors: String): Boolean = js.native
  }
  
  @js.native
  trait Elements extends StObject {
    
    var _hideNextMonthArrow: Boolean = js.native
    
    var _hidePrevMonthArrow: Boolean = js.native
    
    var _input: HTMLInputElement = js.native
    
    var _positionElement: typingsSlinky.flatpickr.globalsMod.global.HTMLElement = js.native
    
    var altInput: js.UndefOr[HTMLInputElement] = js.native
    
    var amPM: js.UndefOr[HTMLSpanElement] = js.native
    
    var calendarContainer: HTMLDivElement = js.native
    
    var currentMonthElement: HTMLSpanElement = js.native
    
    var currentYearElement: HTMLInputElement = js.native
    
    var days: HTMLDivElement = js.native
    
    var daysContainer: js.UndefOr[HTMLDivElement] = js.native
    
    var element: typingsSlinky.flatpickr.globalsMod.global.HTMLElement = js.native
    
    var hourElement: js.UndefOr[HTMLInputElement] = js.native
    
    var innerContainer: js.UndefOr[HTMLDivElement] = js.native
    
    var input: HTMLInputElement = js.native
    
    var minuteElement: js.UndefOr[HTMLInputElement] = js.native
    
    var mobileFormatStr: js.UndefOr[String] = js.native
    
    var mobileInput: js.UndefOr[HTMLInputElement] = js.native
    
    var monthElements: js.Array[HTMLSpanElement] = js.native
    
    var monthNav: HTMLDivElement = js.native
    
    var monthsDropdownContainer: HTMLSelectElement = js.native
    
    var nextMonthNav: typingsSlinky.flatpickr.globalsMod.global.HTMLElement = js.native
    
    var pluginElements: js.Array[Node] = js.native
    
    var prevMonthNav: typingsSlinky.flatpickr.globalsMod.global.HTMLElement = js.native
    
    var rContainer: js.UndefOr[HTMLDivElement] = js.native
    
    var secondElement: js.UndefOr[HTMLInputElement] = js.native
    
    var selectedDateElem: js.UndefOr[DayElement] = js.native
    
    var timeContainer: js.UndefOr[HTMLDivElement] = js.native
    
    var todayDateElem: js.UndefOr[DayElement] = js.native
    
    var weekNumbers: js.UndefOr[HTMLDivElement] = js.native
    
    var weekWrapper: js.UndefOr[HTMLDivElement] = js.native
    
    var weekdayContainer: HTMLDivElement = js.native
    
    var yearElements: js.Array[HTMLInputElement] = js.native
  }
  object Elements {
    
    @scala.inline
    def apply(
      _hideNextMonthArrow: Boolean,
      _hidePrevMonthArrow: Boolean,
      _input: HTMLInputElement,
      _positionElement: typingsSlinky.flatpickr.globalsMod.global.HTMLElement,
      calendarContainer: HTMLDivElement,
      currentMonthElement: HTMLSpanElement,
      currentYearElement: HTMLInputElement,
      days: HTMLDivElement,
      element: typingsSlinky.flatpickr.globalsMod.global.HTMLElement,
      input: HTMLInputElement,
      monthElements: js.Array[HTMLSpanElement],
      monthNav: HTMLDivElement,
      monthsDropdownContainer: HTMLSelectElement,
      nextMonthNav: typingsSlinky.flatpickr.globalsMod.global.HTMLElement,
      pluginElements: js.Array[Node],
      prevMonthNav: typingsSlinky.flatpickr.globalsMod.global.HTMLElement,
      weekdayContainer: HTMLDivElement,
      yearElements: js.Array[HTMLInputElement]
    ): Elements = {
      val __obj = js.Dynamic.literal(_hideNextMonthArrow = _hideNextMonthArrow.asInstanceOf[js.Any], _hidePrevMonthArrow = _hidePrevMonthArrow.asInstanceOf[js.Any], _input = _input.asInstanceOf[js.Any], _positionElement = _positionElement.asInstanceOf[js.Any], calendarContainer = calendarContainer.asInstanceOf[js.Any], currentMonthElement = currentMonthElement.asInstanceOf[js.Any], currentYearElement = currentYearElement.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], monthElements = monthElements.asInstanceOf[js.Any], monthNav = monthNav.asInstanceOf[js.Any], monthsDropdownContainer = monthsDropdownContainer.asInstanceOf[js.Any], nextMonthNav = nextMonthNav.asInstanceOf[js.Any], pluginElements = pluginElements.asInstanceOf[js.Any], prevMonthNav = prevMonthNav.asInstanceOf[js.Any], weekdayContainer = weekdayContainer.asInstanceOf[js.Any], yearElements = yearElements.asInstanceOf[js.Any])
      __obj.asInstanceOf[Elements]
    }
    
    @scala.inline
    implicit class ElementsMutableBuilder[Self <: Elements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltInput(value: HTMLInputElement): Self = StObject.set(x, "altInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltInputUndefined: Self = StObject.set(x, "altInput", js.undefined)
      
      @scala.inline
      def setAmPM(value: HTMLSpanElement): Self = StObject.set(x, "amPM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmPMUndefined: Self = StObject.set(x, "amPM", js.undefined)
      
      @scala.inline
      def setCalendarContainer(value: HTMLDivElement): Self = StObject.set(x, "calendarContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentMonthElement(value: HTMLSpanElement): Self = StObject.set(x, "currentMonthElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentYearElement(value: HTMLInputElement): Self = StObject.set(x, "currentYearElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDays(value: HTMLDivElement): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysContainer(value: HTMLDivElement): Self = StObject.set(x, "daysContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysContainerUndefined: Self = StObject.set(x, "daysContainer", js.undefined)
      
      @scala.inline
      def setElement(value: typingsSlinky.flatpickr.globalsMod.global.HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourElement(value: HTMLInputElement): Self = StObject.set(x, "hourElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourElementUndefined: Self = StObject.set(x, "hourElement", js.undefined)
      
      @scala.inline
      def setInnerContainer(value: HTMLDivElement): Self = StObject.set(x, "innerContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerContainerUndefined: Self = StObject.set(x, "innerContainer", js.undefined)
      
      @scala.inline
      def setInput(value: HTMLInputElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteElement(value: HTMLInputElement): Self = StObject.set(x, "minuteElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteElementUndefined: Self = StObject.set(x, "minuteElement", js.undefined)
      
      @scala.inline
      def setMobileFormatStr(value: String): Self = StObject.set(x, "mobileFormatStr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileFormatStrUndefined: Self = StObject.set(x, "mobileFormatStr", js.undefined)
      
      @scala.inline
      def setMobileInput(value: HTMLInputElement): Self = StObject.set(x, "mobileInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileInputUndefined: Self = StObject.set(x, "mobileInput", js.undefined)
      
      @scala.inline
      def setMonthElements(value: js.Array[HTMLSpanElement]): Self = StObject.set(x, "monthElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthElementsVarargs(value: HTMLSpanElement*): Self = StObject.set(x, "monthElements", js.Array(value :_*))
      
      @scala.inline
      def setMonthNav(value: HTMLDivElement): Self = StObject.set(x, "monthNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsDropdownContainer(value: HTMLSelectElement): Self = StObject.set(x, "monthsDropdownContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMonthNav(value: typingsSlinky.flatpickr.globalsMod.global.HTMLElement): Self = StObject.set(x, "nextMonthNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginElements(value: js.Array[Node]): Self = StObject.set(x, "pluginElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginElementsVarargs(value: Node*): Self = StObject.set(x, "pluginElements", js.Array(value :_*))
      
      @scala.inline
      def setPrevMonthNav(value: typingsSlinky.flatpickr.globalsMod.global.HTMLElement): Self = StObject.set(x, "prevMonthNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRContainer(value: HTMLDivElement): Self = StObject.set(x, "rContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRContainerUndefined: Self = StObject.set(x, "rContainer", js.undefined)
      
      @scala.inline
      def setSecondElement(value: HTMLInputElement): Self = StObject.set(x, "secondElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondElementUndefined: Self = StObject.set(x, "secondElement", js.undefined)
      
      @scala.inline
      def setSelectedDateElem(value: DayElement): Self = StObject.set(x, "selectedDateElem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDateElemUndefined: Self = StObject.set(x, "selectedDateElem", js.undefined)
      
      @scala.inline
      def setTimeContainer(value: HTMLDivElement): Self = StObject.set(x, "timeContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeContainerUndefined: Self = StObject.set(x, "timeContainer", js.undefined)
      
      @scala.inline
      def setTodayDateElem(value: DayElement): Self = StObject.set(x, "todayDateElem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayDateElemUndefined: Self = StObject.set(x, "todayDateElem", js.undefined)
      
      @scala.inline
      def setWeekNumbers(value: HTMLDivElement): Self = StObject.set(x, "weekNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekNumbersUndefined: Self = StObject.set(x, "weekNumbers", js.undefined)
      
      @scala.inline
      def setWeekWrapper(value: HTMLDivElement): Self = StObject.set(x, "weekWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekWrapperUndefined: Self = StObject.set(x, "weekWrapper", js.undefined)
      
      @scala.inline
      def setWeekdayContainer(value: HTMLDivElement): Self = StObject.set(x, "weekdayContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearElements(value: js.Array[HTMLInputElement]): Self = StObject.set(x, "yearElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearElementsVarargs(value: HTMLInputElement*): Self = StObject.set(x, "yearElements", js.Array(value :_*))
      
      @scala.inline
      def set_hideNextMonthArrow(value: Boolean): Self = StObject.set(x, "_hideNextMonthArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_hidePrevMonthArrow(value: Boolean): Self = StObject.set(x, "_hidePrevMonthArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_input(value: HTMLInputElement): Self = StObject.set(x, "_input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_positionElement(value: typingsSlinky.flatpickr.globalsMod.global.HTMLElement): Self = StObject.set(x, "_positionElement", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FlatpickrFn extends StObject {
    
    def apply(selector: String): Instance | js.Array[Instance] = js.native
    def apply(selector: String, config: Options): Instance | js.Array[Instance] = js.native
    def apply(selector: Node): Instance = js.native
    def apply(selector: Node, config: Options): Instance = js.native
    def apply(selector: ArrayLike[Node]): js.Array[Instance] = js.native
    def apply(selector: ArrayLike[Node], config: Options): js.Array[Instance] = js.native
    
    def compareDates(date1: Date, date2: Date): Double = js.native
    def compareDates(date1: Date, date2: Date, timeless: Boolean): Double = js.native
    
    var defaultConfig: PartialParsedOptions = js.native
    
    def formatDate(date: Date, format: String): String = js.native
    
    var l10ns: kinkeyCustomLocaledefault = js.native
    
    def localize(l10n: CustomLocale): Unit = js.native
    
    def parseDate(date: DateOption): js.UndefOr[Date] = js.native
    def parseDate(date: DateOption, format: js.UndefOr[scala.Nothing], timeless: Boolean): js.UndefOr[Date] = js.native
    def parseDate(date: DateOption, format: String): js.UndefOr[Date] = js.native
    def parseDate(date: DateOption, format: String, timeless: Boolean): js.UndefOr[Date] = js.native
    
    def setDefaults(config: Options): Unit = js.native
  }
  
  @js.native
  trait Formatting extends StObject {
    
    var formats: Formats_ = js.native
    
    var revFormat: RevFormat_ = js.native
    
    var tokenRegex: TokenRegex_ = js.native
  }
  object Formatting {
    
    @scala.inline
    def apply(formats: Formats_, revFormat: RevFormat_, tokenRegex: TokenRegex_): Formatting = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], revFormat = revFormat.asInstanceOf[js.Any], tokenRegex = tokenRegex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formatting]
    }
    
    @scala.inline
    implicit class FormattingMutableBuilder[Self <: Formatting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormats(value: Formats_): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevFormat(value: RevFormat_): Self = StObject.set(x, "revFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenRegex(value: TokenRegex_): Self = StObject.set(x, "tokenRegex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined flatpickr.flatpickr/dist/types/instance.Elements & flatpickr.flatpickr/dist/types/instance.Formatting & {  minRangeDate :flatpickr.flatpickr/dist/types/globals.<global>.Date | undefined,   maxRangeDate :flatpickr.flatpickr/dist/types/globals.<global>.Date | undefined,   now :flatpickr.flatpickr/dist/types/globals.<global>.Date,   latestSelectedDateObj :flatpickr.flatpickr/dist/types/globals.<global>.Date | undefined,   _selectedDateObj :flatpickr.flatpickr/dist/types/globals.<global>.Date | undefined,   selectedDates :std.Array<flatpickr.flatpickr/dist/types/globals.<global>.Date>,   _initialDate :flatpickr.flatpickr/dist/types/globals.<global>.Date,   config :flatpickr.flatpickr/dist/types/options.ParsedOptions,   loadedPlugins :std.Array<string>,   l10n :flatpickr.flatpickr/dist/types/locale.Locale,   currentYear :number,   currentMonth :number,   isOpen :boolean,   isMobile :boolean,   minDateHasTime :boolean,   maxDateHasTime :boolean, changeMonth (value : number, isOffset : boolean | undefined, fromKeyboard : boolean | undefined): void, changeYear (year : number): void, clear (emitChangeEvent : boolean | undefined, toInitial : boolean | undefined): void, close (): void, destroy (): void, isEnabled (date : flatpickr.flatpickr/dist/types/options.DateOption, timeless : boolean | undefined): boolean, jumpToDate (date : flatpickr.flatpickr/dist/types/options.DateOption | undefined, triggerChange : boolean | undefined): void, open (e : std.FocusEvent | std.MouseEvent | undefined, positionElement : flatpickr.flatpickr/dist/types/globals.<global>.HTMLElement | undefined): void, redraw (): void, set (option : keyof flatpickr.flatpickr/dist/types/options.Options | {[ k in keyof flatpickr.flatpickr/dist/types/options.Options ]:? flatpickr.flatpickr/dist/types/options.Options[k]}, value : any | undefined): void, setDate (date : flatpickr.flatpickr/dist/types/options.DateOption | std.Array<flatpickr.flatpickr/dist/types/options.DateOption>, triggerChange : boolean | undefined, format : string | undefined): void, toggle (): void, pad (num : string | number): string, parseDate (date : flatpickr.flatpickr/dist/types/globals.<global>.Date | string | number, givenFormat : string | undefined, timeless : boolean | undefined): flatpickr.flatpickr/dist/types/globals.<global>.Date | undefined, formatDate (dateObj : flatpickr.flatpickr/dist/types/globals.<global>.Date, frmt : string): string,   _handlers :std.Array<{  event :string,   element :std.Element, handler (e : std.Event | undefined): void,   options :{  capture :boolean | undefined} | undefined}>, _bind <E extends std.Element>(element : E | std.Array<E>, event : string | std.Array<string>, handler : (e : any | undefined): void): void, _createElement <E extends flatpickr.flatpickr/dist/types/globals.<global>.HTMLElement>(tag : keyof std.HTMLElementTagNameMap, className : string, content : string | undefined): E, _setHoursFromDate (date : flatpickr.flatpickr/dist/types/globals.<global>.Date): void, _debouncedChange (): void,   __hideNextMonthArrow :boolean,   __hidePrevMonthArrow :boolean, _positionCalendar (customPositionElement : flatpickr.flatpickr/dist/types/globals.<global>.HTMLElement | undefined): void,   utils :{getDaysInMonth (month : number | undefined, year : number | undefined): number}} */
  @js.native
  trait Instance extends StObject {
    
    var __hideNextMonthArrow: Boolean = js.native
    
    var __hidePrevMonthArrow: Boolean = js.native
    
    def _bind[E /* <: Element */](element: E, event: String, handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def _bind[E /* <: Element */](element: E, event: js.Array[String], handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def _bind[E /* <: Element */](element: js.Array[E], event: String, handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def _bind[E /* <: Element */](
      element: js.Array[E],
      event: js.Array[String],
      handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    
    def _createElement[E /* <: typingsSlinky.flatpickr.globalsMod.global.HTMLElement */](
      tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any,
      className: String
    ): E = js.native
    def _createElement[E /* <: typingsSlinky.flatpickr.globalsMod.global.HTMLElement */](
      tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any,
      className: String,
      content: String
    ): E = js.native
    
    def _debouncedChange(): Unit = js.native
    
    var _handlers: js.Array[typingsSlinky.flatpickr.anon.Element] = js.native
    
    var _hideNextMonthArrow: Boolean = js.native
    
    var _hidePrevMonthArrow: Boolean = js.native
    
    var _initialDate: Date = js.native
    
    var _input: HTMLInputElement = js.native
    
    def _positionCalendar(): Unit = js.native
    def _positionCalendar(customPositionElement: typingsSlinky.flatpickr.globalsMod.global.HTMLElement): Unit = js.native
    
    var _positionElement: typingsSlinky.flatpickr.globalsMod.global.HTMLElement = js.native
    
    var _selectedDateObj: js.UndefOr[Date] = js.native
    
    def _setHoursFromDate(date: Date): Unit = js.native
    
    var altInput: js.UndefOr[HTMLInputElement] = js.native
    
    var amPM: js.UndefOr[HTMLSpanElement] = js.native
    
    var calendarContainer: HTMLDivElement = js.native
    
    def changeMonth(value: Double): Unit = js.native
    def changeMonth(value: Double, isOffset: js.UndefOr[scala.Nothing], fromKeyboard: Boolean): Unit = js.native
    def changeMonth(value: Double, isOffset: Boolean): Unit = js.native
    def changeMonth(value: Double, isOffset: Boolean, fromKeyboard: Boolean): Unit = js.native
    
    def changeYear(year: Double): Unit = js.native
    
    def clear(): Unit = js.native
    def clear(emitChangeEvent: js.UndefOr[scala.Nothing], toInitial: Boolean): Unit = js.native
    def clear(emitChangeEvent: Boolean): Unit = js.native
    def clear(emitChangeEvent: Boolean, toInitial: Boolean): Unit = js.native
    
    def close(): Unit = js.native
    
    var config: ParsedOptions = js.native
    
    var currentMonth: Double = js.native
    
    var currentMonthElement: HTMLSpanElement = js.native
    
    var currentYear: Double = js.native
    
    var currentYearElement: HTMLInputElement = js.native
    
    var days: HTMLDivElement = js.native
    
    var daysContainer: js.UndefOr[HTMLDivElement] = js.native
    
    def destroy(): Unit = js.native
    
    var element: typingsSlinky.flatpickr.globalsMod.global.HTMLElement = js.native
    
    def formatDate(dateObj: Date, frmt: String): String = js.native
    
    var formats: Formats_ = js.native
    
    var hourElement: js.UndefOr[HTMLInputElement] = js.native
    
    var innerContainer: js.UndefOr[HTMLDivElement] = js.native
    
    var input: HTMLInputElement = js.native
    
    def isEnabled(date: DateOption): Boolean = js.native
    def isEnabled(date: DateOption, timeless: Boolean): Boolean = js.native
    
    var isMobile: Boolean = js.native
    
    var isOpen: Boolean = js.native
    
    def jumpToDate(): Unit = js.native
    def jumpToDate(date: js.UndefOr[DateOption], triggerChange: Boolean): Unit = js.native
    def jumpToDate(date: DateOption): Unit = js.native
    
    var l10n: Locale = js.native
    
    var latestSelectedDateObj: js.UndefOr[Date] = js.native
    
    var loadedPlugins: js.Array[String] = js.native
    
    var maxDateHasTime: Boolean = js.native
    
    var maxRangeDate: js.UndefOr[Date] = js.native
    
    var minDateHasTime: Boolean = js.native
    
    var minRangeDate: js.UndefOr[Date] = js.native
    
    var minuteElement: js.UndefOr[HTMLInputElement] = js.native
    
    var mobileFormatStr: js.UndefOr[String] = js.native
    
    var mobileInput: js.UndefOr[HTMLInputElement] = js.native
    
    var monthElements: js.Array[HTMLSpanElement] = js.native
    
    var monthNav: HTMLDivElement = js.native
    
    var monthsDropdownContainer: HTMLSelectElement = js.native
    
    var nextMonthNav: typingsSlinky.flatpickr.globalsMod.global.HTMLElement = js.native
    
    var now: Date = js.native
    
    def open(): Unit = js.native
    def open(
      e: js.UndefOr[scala.Nothing],
      positionElement: typingsSlinky.flatpickr.globalsMod.global.HTMLElement
    ): Unit = js.native
    def open(e: FocusEvent): Unit = js.native
    def open(e: FocusEvent, positionElement: typingsSlinky.flatpickr.globalsMod.global.HTMLElement): Unit = js.native
    def open(e: MouseEvent): Unit = js.native
    def open(e: MouseEvent, positionElement: typingsSlinky.flatpickr.globalsMod.global.HTMLElement): Unit = js.native
    
    def pad(num: String): String = js.native
    def pad(num: Double): String = js.native
    
    def parseDate(date: String): js.UndefOr[Date] = js.native
    def parseDate(date: String, givenFormat: js.UndefOr[scala.Nothing], timeless: Boolean): js.UndefOr[Date] = js.native
    def parseDate(date: String, givenFormat: String): js.UndefOr[Date] = js.native
    def parseDate(date: String, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
    def parseDate(date: Double): js.UndefOr[Date] = js.native
    def parseDate(date: Double, givenFormat: js.UndefOr[scala.Nothing], timeless: Boolean): js.UndefOr[Date] = js.native
    def parseDate(date: Double, givenFormat: String): js.UndefOr[Date] = js.native
    def parseDate(date: Double, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
    def parseDate(date: Date): js.UndefOr[Date] = js.native
    def parseDate(date: Date, givenFormat: js.UndefOr[scala.Nothing], timeless: Boolean): js.UndefOr[Date] = js.native
    def parseDate(date: Date, givenFormat: String): js.UndefOr[Date] = js.native
    def parseDate(date: Date, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
    
    var pluginElements: js.Array[Node] = js.native
    
    var prevMonthNav: typingsSlinky.flatpickr.globalsMod.global.HTMLElement = js.native
    
    var rContainer: js.UndefOr[HTMLDivElement] = js.native
    
    def redraw(): Unit = js.native
    
    var revFormat: RevFormat_ = js.native
    
    var secondElement: js.UndefOr[HTMLInputElement] = js.native
    
    var selectedDateElem: js.UndefOr[DayElement] = js.native
    
    var selectedDates: js.Array[Date] = js.native
    
    def set(option: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 62 */ js.Any): Unit = js.native
    def set(
      option: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 62 */ js.Any,
      value: js.Any
    ): Unit = js.native
    def set(option: kinkeyofOptionsOptionsk): Unit = js.native
    def set(option: kinkeyofOptionsOptionsk, value: js.Any): Unit = js.native
    
    def setDate(date: js.Array[DateOption]): Unit = js.native
    def setDate(date: js.Array[DateOption], triggerChange: js.UndefOr[scala.Nothing], format: String): Unit = js.native
    def setDate(date: js.Array[DateOption], triggerChange: Boolean): Unit = js.native
    def setDate(date: js.Array[DateOption], triggerChange: Boolean, format: String): Unit = js.native
    def setDate(date: DateOption): Unit = js.native
    def setDate(date: DateOption, triggerChange: js.UndefOr[scala.Nothing], format: String): Unit = js.native
    def setDate(date: DateOption, triggerChange: Boolean): Unit = js.native
    def setDate(date: DateOption, triggerChange: Boolean, format: String): Unit = js.native
    
    var timeContainer: js.UndefOr[HTMLDivElement] = js.native
    
    var todayDateElem: js.UndefOr[DayElement] = js.native
    
    def toggle(): Unit = js.native
    
    var tokenRegex: TokenRegex_ = js.native
    
    var utils: GetDaysInMonth = js.native
    
    var weekNumbers: js.UndefOr[HTMLDivElement] = js.native
    
    var weekWrapper: js.UndefOr[HTMLDivElement] = js.native
    
    var weekdayContainer: HTMLDivElement = js.native
    
    var yearElements: js.Array[HTMLInputElement] = js.native
  }
}
