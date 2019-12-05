package typingsSlinky.hyperscript.hyperscriptMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLAppletElement
import org.scalajs.dom.raw.HTMLAreaElement
import org.scalajs.dom.raw.HTMLAudioElement
import org.scalajs.dom.raw.HTMLBRElement
import org.scalajs.dom.raw.HTMLBaseElement
import org.scalajs.dom.raw.HTMLBaseFontElement
import org.scalajs.dom.raw.HTMLBodyElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLDListElement
import org.scalajs.dom.raw.HTMLDataListElement
import org.scalajs.dom.raw.HTMLDirectoryElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLEmbedElement
import org.scalajs.dom.raw.HTMLFieldSetElement
import org.scalajs.dom.raw.HTMLFontElement
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLFrameElement
import org.scalajs.dom.raw.HTMLFrameSetElement
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
import org.scalajs.dom.raw.HTMLMarqueeElement
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
import org.scalajs.dom.raw.HTMLTableDataCellElement
import org.scalajs.dom.raw.HTMLTableElement
import org.scalajs.dom.raw.HTMLTableHeaderCellElement
import org.scalajs.dom.raw.HTMLTableRowElement
import org.scalajs.dom.raw.HTMLTableSectionElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import org.scalajs.dom.raw.HTMLTitleElement
import org.scalajs.dom.raw.HTMLTrackElement
import org.scalajs.dom.raw.HTMLUListElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.hyperscript.hyperscriptStrings.`object`
import typingsSlinky.hyperscript.hyperscriptStrings.`var`
import typingsSlinky.hyperscript.hyperscriptStrings.a
import typingsSlinky.hyperscript.hyperscriptStrings.abbr
import typingsSlinky.hyperscript.hyperscriptStrings.address
import typingsSlinky.hyperscript.hyperscriptStrings.applet
import typingsSlinky.hyperscript.hyperscriptStrings.area
import typingsSlinky.hyperscript.hyperscriptStrings.article
import typingsSlinky.hyperscript.hyperscriptStrings.aside
import typingsSlinky.hyperscript.hyperscriptStrings.audio
import typingsSlinky.hyperscript.hyperscriptStrings.b
import typingsSlinky.hyperscript.hyperscriptStrings.base
import typingsSlinky.hyperscript.hyperscriptStrings.basefont
import typingsSlinky.hyperscript.hyperscriptStrings.bdi
import typingsSlinky.hyperscript.hyperscriptStrings.bdo
import typingsSlinky.hyperscript.hyperscriptStrings.blockquote
import typingsSlinky.hyperscript.hyperscriptStrings.body
import typingsSlinky.hyperscript.hyperscriptStrings.br
import typingsSlinky.hyperscript.hyperscriptStrings.button
import typingsSlinky.hyperscript.hyperscriptStrings.canvas
import typingsSlinky.hyperscript.hyperscriptStrings.caption
import typingsSlinky.hyperscript.hyperscriptStrings.cite
import typingsSlinky.hyperscript.hyperscriptStrings.code
import typingsSlinky.hyperscript.hyperscriptStrings.col
import typingsSlinky.hyperscript.hyperscriptStrings.colgroup
import typingsSlinky.hyperscript.hyperscriptStrings.data
import typingsSlinky.hyperscript.hyperscriptStrings.datalist
import typingsSlinky.hyperscript.hyperscriptStrings.dd
import typingsSlinky.hyperscript.hyperscriptStrings.del
import typingsSlinky.hyperscript.hyperscriptStrings.details
import typingsSlinky.hyperscript.hyperscriptStrings.dfn
import typingsSlinky.hyperscript.hyperscriptStrings.dialog
import typingsSlinky.hyperscript.hyperscriptStrings.dir
import typingsSlinky.hyperscript.hyperscriptStrings.div
import typingsSlinky.hyperscript.hyperscriptStrings.dl
import typingsSlinky.hyperscript.hyperscriptStrings.dt
import typingsSlinky.hyperscript.hyperscriptStrings.em
import typingsSlinky.hyperscript.hyperscriptStrings.embed
import typingsSlinky.hyperscript.hyperscriptStrings.fieldset
import typingsSlinky.hyperscript.hyperscriptStrings.figcaption
import typingsSlinky.hyperscript.hyperscriptStrings.figure
import typingsSlinky.hyperscript.hyperscriptStrings.font
import typingsSlinky.hyperscript.hyperscriptStrings.footer
import typingsSlinky.hyperscript.hyperscriptStrings.form
import typingsSlinky.hyperscript.hyperscriptStrings.frame
import typingsSlinky.hyperscript.hyperscriptStrings.frameset
import typingsSlinky.hyperscript.hyperscriptStrings.h1
import typingsSlinky.hyperscript.hyperscriptStrings.h2
import typingsSlinky.hyperscript.hyperscriptStrings.h3
import typingsSlinky.hyperscript.hyperscriptStrings.h4
import typingsSlinky.hyperscript.hyperscriptStrings.h5
import typingsSlinky.hyperscript.hyperscriptStrings.h6
import typingsSlinky.hyperscript.hyperscriptStrings.head
import typingsSlinky.hyperscript.hyperscriptStrings.header
import typingsSlinky.hyperscript.hyperscriptStrings.hgroup
import typingsSlinky.hyperscript.hyperscriptStrings.hr
import typingsSlinky.hyperscript.hyperscriptStrings.html
import typingsSlinky.hyperscript.hyperscriptStrings.i
import typingsSlinky.hyperscript.hyperscriptStrings.iframe
import typingsSlinky.hyperscript.hyperscriptStrings.img
import typingsSlinky.hyperscript.hyperscriptStrings.input
import typingsSlinky.hyperscript.hyperscriptStrings.ins
import typingsSlinky.hyperscript.hyperscriptStrings.kbd
import typingsSlinky.hyperscript.hyperscriptStrings.label
import typingsSlinky.hyperscript.hyperscriptStrings.legend
import typingsSlinky.hyperscript.hyperscriptStrings.li
import typingsSlinky.hyperscript.hyperscriptStrings.link
import typingsSlinky.hyperscript.hyperscriptStrings.main
import typingsSlinky.hyperscript.hyperscriptStrings.map
import typingsSlinky.hyperscript.hyperscriptStrings.mark
import typingsSlinky.hyperscript.hyperscriptStrings.marquee
import typingsSlinky.hyperscript.hyperscriptStrings.menu
import typingsSlinky.hyperscript.hyperscriptStrings.meta
import typingsSlinky.hyperscript.hyperscriptStrings.meter
import typingsSlinky.hyperscript.hyperscriptStrings.nav
import typingsSlinky.hyperscript.hyperscriptStrings.noscript
import typingsSlinky.hyperscript.hyperscriptStrings.ol
import typingsSlinky.hyperscript.hyperscriptStrings.optgroup
import typingsSlinky.hyperscript.hyperscriptStrings.option
import typingsSlinky.hyperscript.hyperscriptStrings.output
import typingsSlinky.hyperscript.hyperscriptStrings.p
import typingsSlinky.hyperscript.hyperscriptStrings.param
import typingsSlinky.hyperscript.hyperscriptStrings.picture
import typingsSlinky.hyperscript.hyperscriptStrings.pre
import typingsSlinky.hyperscript.hyperscriptStrings.progress
import typingsSlinky.hyperscript.hyperscriptStrings.q
import typingsSlinky.hyperscript.hyperscriptStrings.rp
import typingsSlinky.hyperscript.hyperscriptStrings.rt
import typingsSlinky.hyperscript.hyperscriptStrings.ruby
import typingsSlinky.hyperscript.hyperscriptStrings.s
import typingsSlinky.hyperscript.hyperscriptStrings.samp
import typingsSlinky.hyperscript.hyperscriptStrings.script
import typingsSlinky.hyperscript.hyperscriptStrings.section
import typingsSlinky.hyperscript.hyperscriptStrings.select
import typingsSlinky.hyperscript.hyperscriptStrings.slot
import typingsSlinky.hyperscript.hyperscriptStrings.small
import typingsSlinky.hyperscript.hyperscriptStrings.source
import typingsSlinky.hyperscript.hyperscriptStrings.span
import typingsSlinky.hyperscript.hyperscriptStrings.strong
import typingsSlinky.hyperscript.hyperscriptStrings.style
import typingsSlinky.hyperscript.hyperscriptStrings.sub
import typingsSlinky.hyperscript.hyperscriptStrings.summary
import typingsSlinky.hyperscript.hyperscriptStrings.sup
import typingsSlinky.hyperscript.hyperscriptStrings.table
import typingsSlinky.hyperscript.hyperscriptStrings.tbody
import typingsSlinky.hyperscript.hyperscriptStrings.td
import typingsSlinky.hyperscript.hyperscriptStrings.template
import typingsSlinky.hyperscript.hyperscriptStrings.textarea
import typingsSlinky.hyperscript.hyperscriptStrings.tfoot
import typingsSlinky.hyperscript.hyperscriptStrings.th
import typingsSlinky.hyperscript.hyperscriptStrings.thead
import typingsSlinky.hyperscript.hyperscriptStrings.time
import typingsSlinky.hyperscript.hyperscriptStrings.title
import typingsSlinky.hyperscript.hyperscriptStrings.tr
import typingsSlinky.hyperscript.hyperscriptStrings.track
import typingsSlinky.hyperscript.hyperscriptStrings.u
import typingsSlinky.hyperscript.hyperscriptStrings.ul
import typingsSlinky.hyperscript.hyperscriptStrings.video
import typingsSlinky.hyperscript.hyperscriptStrings.wbr
import typingsSlinky.std.HTMLDataElement
import typingsSlinky.std.HTMLDetailsElement
import typingsSlinky.std.HTMLDialogElement
import typingsSlinky.std.HTMLMeterElement
import typingsSlinky.std.HTMLOutputElement
import typingsSlinky.std.HTMLPictureElement
import typingsSlinky.std.HTMLSlotElement
import typingsSlinky.std.HTMLTemplateElement
import typingsSlinky.std.HTMLTimeElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperScript extends js.Object {
  def apply(tagName: `object`): HTMLObjectElement = js.native
  def apply(tagName: `object`, attrs: js.Object, children: js.Any*): HTMLObjectElement = js.native
  def apply(tagName: `var`): HTMLElement = js.native
  def apply(tagName: `var`, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  /** Creates an Element */
  def apply(tagName: a): HTMLAnchorElement = js.native
  def apply(tagName: a, attrs: js.Object, children: js.Any*): HTMLAnchorElement = js.native
  def apply(tagName: abbr): HTMLElement = js.native
  def apply(tagName: abbr, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: address): HTMLElement = js.native
  def apply(tagName: address, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: applet): HTMLAppletElement = js.native
  def apply(tagName: applet, attrs: js.Object, children: js.Any*): HTMLAppletElement = js.native
  def apply(tagName: area): HTMLAreaElement = js.native
  def apply(tagName: area, attrs: js.Object, children: js.Any*): HTMLAreaElement = js.native
  def apply(tagName: article): HTMLElement = js.native
  def apply(tagName: article, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: aside): HTMLElement = js.native
  def apply(tagName: aside, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: audio): HTMLAudioElement = js.native
  def apply(tagName: audio, attrs: js.Object, children: js.Any*): HTMLAudioElement = js.native
  def apply(tagName: b): HTMLElement = js.native
  def apply(tagName: base): HTMLBaseElement = js.native
  def apply(tagName: base, attrs: js.Object, children: js.Any*): HTMLBaseElement = js.native
  def apply(tagName: basefont): HTMLBaseFontElement = js.native
  def apply(tagName: basefont, attrs: js.Object, children: js.Any*): HTMLBaseFontElement = js.native
  def apply(tagName: b, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: bdi): HTMLElement = js.native
  def apply(tagName: bdi, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: bdo): HTMLElement = js.native
  def apply(tagName: bdo, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: blockquote): HTMLQuoteElement = js.native
  def apply(tagName: blockquote, attrs: js.Object, children: js.Any*): HTMLQuoteElement = js.native
  def apply(tagName: body): HTMLBodyElement = js.native
  def apply(tagName: body, attrs: js.Object, children: js.Any*): HTMLBodyElement = js.native
  def apply(tagName: br): HTMLBRElement = js.native
  def apply(tagName: br, attrs: js.Object, children: js.Any*): HTMLBRElement = js.native
  def apply(tagName: button): HTMLButtonElement = js.native
  def apply(tagName: button, attrs: js.Object, children: js.Any*): HTMLButtonElement = js.native
  def apply(tagName: canvas): HTMLCanvasElement = js.native
  def apply(tagName: canvas, attrs: js.Object, children: js.Any*): HTMLCanvasElement = js.native
  def apply(tagName: caption): HTMLTableCaptionElement = js.native
  def apply(tagName: caption, attrs: js.Object, children: js.Any*): HTMLTableCaptionElement = js.native
  def apply(tagName: cite): HTMLElement = js.native
  def apply(tagName: cite, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: code): HTMLElement = js.native
  def apply(tagName: code, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: col): HTMLTableColElement = js.native
  def apply(tagName: col, attrs: js.Object, children: js.Any*): HTMLTableColElement = js.native
  def apply(tagName: colgroup): HTMLTableColElement = js.native
  def apply(tagName: colgroup, attrs: js.Object, children: js.Any*): HTMLTableColElement = js.native
  def apply(tagName: data): HTMLDataElement = js.native
  def apply(tagName: data, attrs: js.Object, children: js.Any*): HTMLDataElement = js.native
  def apply(tagName: datalist): HTMLDataListElement = js.native
  def apply(tagName: datalist, attrs: js.Object, children: js.Any*): HTMLDataListElement = js.native
  def apply(tagName: dd): HTMLElement = js.native
  def apply(tagName: dd, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: del): HTMLModElement = js.native
  def apply(tagName: del, attrs: js.Object, children: js.Any*): HTMLModElement = js.native
  def apply(tagName: details): HTMLDetailsElement = js.native
  def apply(tagName: details, attrs: js.Object, children: js.Any*): HTMLDetailsElement = js.native
  def apply(tagName: dfn): HTMLElement = js.native
  def apply(tagName: dfn, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: dialog): HTMLDialogElement = js.native
  def apply(tagName: dialog, attrs: js.Object, children: js.Any*): HTMLDialogElement = js.native
  def apply(tagName: dir): HTMLDirectoryElement = js.native
  def apply(tagName: dir, attrs: js.Object, children: js.Any*): HTMLDirectoryElement = js.native
  def apply(tagName: div): HTMLDivElement = js.native
  def apply(tagName: div, attrs: js.Object, children: js.Any*): HTMLDivElement = js.native
  def apply(tagName: dl): HTMLDListElement = js.native
  def apply(tagName: dl, attrs: js.Object, children: js.Any*): HTMLDListElement = js.native
  def apply(tagName: dt): HTMLElement = js.native
  def apply(tagName: dt, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: em): HTMLElement = js.native
  def apply(tagName: em, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: embed): HTMLEmbedElement = js.native
  def apply(tagName: embed, attrs: js.Object, children: js.Any*): HTMLEmbedElement = js.native
  def apply(tagName: fieldset): HTMLFieldSetElement = js.native
  def apply(tagName: fieldset, attrs: js.Object, children: js.Any*): HTMLFieldSetElement = js.native
  def apply(tagName: figcaption): HTMLElement = js.native
  def apply(tagName: figcaption, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: figure): HTMLElement = js.native
  def apply(tagName: figure, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: font): HTMLFontElement = js.native
  def apply(tagName: font, attrs: js.Object, children: js.Any*): HTMLFontElement = js.native
  def apply(tagName: footer): HTMLElement = js.native
  def apply(tagName: footer, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: form): HTMLFormElement = js.native
  def apply(tagName: form, attrs: js.Object, children: js.Any*): HTMLFormElement = js.native
  def apply(tagName: frame): HTMLFrameElement = js.native
  def apply(tagName: frame, attrs: js.Object, children: js.Any*): HTMLFrameElement = js.native
  def apply(tagName: frameset): HTMLFrameSetElement = js.native
  def apply(tagName: frameset, attrs: js.Object, children: js.Any*): HTMLFrameSetElement = js.native
  def apply(tagName: h1): HTMLHeadingElement = js.native
  def apply(tagName: h1, attrs: js.Object, children: js.Any*): HTMLHeadingElement = js.native
  def apply(tagName: h2): HTMLHeadingElement = js.native
  def apply(tagName: h2, attrs: js.Object, children: js.Any*): HTMLHeadingElement = js.native
  def apply(tagName: h3): HTMLHeadingElement = js.native
  def apply(tagName: h3, attrs: js.Object, children: js.Any*): HTMLHeadingElement = js.native
  def apply(tagName: h4): HTMLHeadingElement = js.native
  def apply(tagName: h4, attrs: js.Object, children: js.Any*): HTMLHeadingElement = js.native
  def apply(tagName: h5): HTMLHeadingElement = js.native
  def apply(tagName: h5, attrs: js.Object, children: js.Any*): HTMLHeadingElement = js.native
  def apply(tagName: h6): HTMLHeadingElement = js.native
  def apply(tagName: h6, attrs: js.Object, children: js.Any*): HTMLHeadingElement = js.native
  def apply(tagName: head): HTMLHeadElement = js.native
  def apply(tagName: head, attrs: js.Object, children: js.Any*): HTMLHeadElement = js.native
  def apply(tagName: header): HTMLElement = js.native
  def apply(tagName: header, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: hgroup): HTMLElement = js.native
  def apply(tagName: hgroup, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: hr): HTMLHRElement = js.native
  def apply(tagName: hr, attrs: js.Object, children: js.Any*): HTMLHRElement = js.native
  def apply(tagName: html): HTMLHtmlElement = js.native
  def apply(tagName: html, attrs: js.Object, children: js.Any*): HTMLHtmlElement = js.native
  def apply(tagName: i): HTMLElement = js.native
  def apply(tagName: i, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: iframe): HTMLIFrameElement = js.native
  def apply(tagName: iframe, attrs: js.Object, children: js.Any*): HTMLIFrameElement = js.native
  def apply(tagName: img): HTMLImageElement = js.native
  def apply(tagName: img, attrs: js.Object, children: js.Any*): HTMLImageElement = js.native
  def apply(tagName: input): HTMLInputElement = js.native
  def apply(tagName: input, attrs: js.Object, children: js.Any*): HTMLInputElement = js.native
  def apply(tagName: ins): HTMLModElement = js.native
  def apply(tagName: ins, attrs: js.Object, children: js.Any*): HTMLModElement = js.native
  def apply(tagName: kbd): HTMLElement = js.native
  def apply(tagName: kbd, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: label): HTMLLabelElement = js.native
  def apply(tagName: label, attrs: js.Object, children: js.Any*): HTMLLabelElement = js.native
  def apply(tagName: legend): HTMLLegendElement = js.native
  def apply(tagName: legend, attrs: js.Object, children: js.Any*): HTMLLegendElement = js.native
  def apply(tagName: li): HTMLLIElement = js.native
  def apply(tagName: li, attrs: js.Object, children: js.Any*): HTMLLIElement = js.native
  def apply(tagName: link): HTMLLinkElement = js.native
  def apply(tagName: link, attrs: js.Object, children: js.Any*): HTMLLinkElement = js.native
  def apply(tagName: main): HTMLElement = js.native
  def apply(tagName: main, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: map): HTMLMapElement = js.native
  def apply(tagName: map, attrs: js.Object, children: js.Any*): HTMLMapElement = js.native
  def apply(tagName: mark): HTMLElement = js.native
  def apply(tagName: mark, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: marquee): HTMLMarqueeElement = js.native
  def apply(tagName: marquee, attrs: js.Object, children: js.Any*): HTMLMarqueeElement = js.native
  def apply(tagName: menu): HTMLMenuElement = js.native
  def apply(tagName: menu, attrs: js.Object, children: js.Any*): HTMLMenuElement = js.native
  def apply(tagName: meta): HTMLMetaElement = js.native
  def apply(tagName: meta, attrs: js.Object, children: js.Any*): HTMLMetaElement = js.native
  def apply(tagName: meter): HTMLMeterElement = js.native
  def apply(tagName: meter, attrs: js.Object, children: js.Any*): HTMLMeterElement = js.native
  def apply(tagName: nav): HTMLElement = js.native
  def apply(tagName: nav, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: noscript): HTMLElement = js.native
  def apply(tagName: noscript, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: ol): HTMLOListElement = js.native
  def apply(tagName: ol, attrs: js.Object, children: js.Any*): HTMLOListElement = js.native
  def apply(tagName: optgroup): HTMLOptGroupElement = js.native
  def apply(tagName: optgroup, attrs: js.Object, children: js.Any*): HTMLOptGroupElement = js.native
  def apply(tagName: option): HTMLOptionElement = js.native
  def apply(tagName: option, attrs: js.Object, children: js.Any*): HTMLOptionElement = js.native
  def apply(tagName: output): HTMLOutputElement = js.native
  def apply(tagName: output, attrs: js.Object, children: js.Any*): HTMLOutputElement = js.native
  def apply(tagName: p): HTMLParagraphElement = js.native
  def apply(tagName: param): HTMLParamElement = js.native
  def apply(tagName: param, attrs: js.Object, children: js.Any*): HTMLParamElement = js.native
  def apply(tagName: p, attrs: js.Object, children: js.Any*): HTMLParagraphElement = js.native
  def apply(tagName: picture): HTMLPictureElement = js.native
  def apply(tagName: picture, attrs: js.Object, children: js.Any*): HTMLPictureElement = js.native
  def apply(tagName: pre): HTMLPreElement = js.native
  def apply(tagName: pre, attrs: js.Object, children: js.Any*): HTMLPreElement = js.native
  def apply(tagName: progress): HTMLProgressElement = js.native
  def apply(tagName: progress, attrs: js.Object, children: js.Any*): HTMLProgressElement = js.native
  def apply(tagName: q): HTMLQuoteElement = js.native
  def apply(tagName: q, attrs: js.Object, children: js.Any*): HTMLQuoteElement = js.native
  def apply(tagName: rp): HTMLElement = js.native
  def apply(tagName: rp, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: rt): HTMLElement = js.native
  def apply(tagName: rt, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: ruby): HTMLElement = js.native
  def apply(tagName: ruby, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: s): HTMLElement = js.native
  def apply(tagName: samp): HTMLElement = js.native
  def apply(tagName: samp, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: s, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: script): HTMLScriptElement = js.native
  def apply(tagName: script, attrs: js.Object, children: js.Any*): HTMLScriptElement = js.native
  def apply(tagName: section): HTMLElement = js.native
  def apply(tagName: section, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: select): HTMLSelectElement = js.native
  def apply(tagName: select, attrs: js.Object, children: js.Any*): HTMLSelectElement = js.native
  def apply(tagName: slot): HTMLSlotElement = js.native
  def apply(tagName: slot, attrs: js.Object, children: js.Any*): HTMLSlotElement = js.native
  def apply(tagName: small): HTMLElement = js.native
  def apply(tagName: small, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: source): HTMLSourceElement = js.native
  def apply(tagName: source, attrs: js.Object, children: js.Any*): HTMLSourceElement = js.native
  def apply(tagName: span): HTMLSpanElement = js.native
  def apply(tagName: span, attrs: js.Object, children: js.Any*): HTMLSpanElement = js.native
  def apply(tagName: strong): HTMLElement = js.native
  def apply(tagName: strong, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: style): HTMLStyleElement = js.native
  def apply(tagName: style, attrs: js.Object, children: js.Any*): HTMLStyleElement = js.native
  def apply(tagName: sub): HTMLElement = js.native
  def apply(tagName: sub, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: summary): HTMLElement = js.native
  def apply(tagName: summary, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: sup): HTMLElement = js.native
  def apply(tagName: sup, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: table): HTMLTableElement = js.native
  def apply(tagName: table, attrs: js.Object, children: js.Any*): HTMLTableElement = js.native
  def apply(tagName: tbody): HTMLTableSectionElement = js.native
  def apply(tagName: tbody, attrs: js.Object, children: js.Any*): HTMLTableSectionElement = js.native
  def apply(tagName: td): HTMLTableDataCellElement = js.native
  def apply(tagName: td, attrs: js.Object, children: js.Any*): HTMLTableDataCellElement = js.native
  def apply(tagName: template): HTMLTemplateElement = js.native
  def apply(tagName: template, attrs: js.Object, children: js.Any*): HTMLTemplateElement = js.native
  def apply(tagName: textarea): HTMLTextAreaElement = js.native
  def apply(tagName: textarea, attrs: js.Object, children: js.Any*): HTMLTextAreaElement = js.native
  def apply(tagName: tfoot): HTMLTableSectionElement = js.native
  def apply(tagName: tfoot, attrs: js.Object, children: js.Any*): HTMLTableSectionElement = js.native
  def apply(tagName: th): HTMLTableHeaderCellElement = js.native
  def apply(tagName: th, attrs: js.Object, children: js.Any*): HTMLTableHeaderCellElement = js.native
  def apply(tagName: thead): HTMLTableSectionElement = js.native
  def apply(tagName: thead, attrs: js.Object, children: js.Any*): HTMLTableSectionElement = js.native
  def apply(tagName: time): HTMLTimeElement = js.native
  def apply(tagName: time, attrs: js.Object, children: js.Any*): HTMLTimeElement = js.native
  def apply(tagName: title): HTMLTitleElement = js.native
  def apply(tagName: title, attrs: js.Object, children: js.Any*): HTMLTitleElement = js.native
  def apply(tagName: tr): HTMLTableRowElement = js.native
  def apply(tagName: track): HTMLTrackElement = js.native
  def apply(tagName: track, attrs: js.Object, children: js.Any*): HTMLTrackElement = js.native
  def apply(tagName: tr, attrs: js.Object, children: js.Any*): HTMLTableRowElement = js.native
  def apply(tagName: u): HTMLElement = js.native
  def apply(tagName: u, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply(tagName: ul): HTMLUListElement = js.native
  def apply(tagName: ul, attrs: js.Object, children: js.Any*): HTMLUListElement = js.native
  def apply(tagName: video): HTMLVideoElement = js.native
  def apply(tagName: video, attrs: js.Object, children: js.Any*): HTMLVideoElement = js.native
  def apply(tagName: wbr): HTMLElement = js.native
  def apply(tagName: wbr, attrs: js.Object, children: js.Any*): HTMLElement = js.native
  def apply[T /* <: Element */](tagName: String): T = js.native
  def apply[T /* <: Element */](tagName: String, attrs: js.Object, children: js.Any*): T = js.native
  /** Cleans up any event handlers created by this hyperscript context */
  def cleanup(): Unit = js.native
  /** Creates a new hyperscript context */
  def context(): HyperScript = js.native
}

