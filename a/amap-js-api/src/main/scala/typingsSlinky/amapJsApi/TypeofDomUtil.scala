package typingsSlinky.amapJsApi

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
import typingsSlinky.amapJsApi.AMap.Pixel
import typingsSlinky.amapJsApi.AMap.Size
import typingsSlinky.amapJsApi.amapJsApiStrings.`object`
import typingsSlinky.amapJsApi.amapJsApiStrings.`var`
import typingsSlinky.amapJsApi.amapJsApiStrings.a
import typingsSlinky.amapJsApi.amapJsApiStrings.abbr
import typingsSlinky.amapJsApi.amapJsApiStrings.address
import typingsSlinky.amapJsApi.amapJsApiStrings.applet
import typingsSlinky.amapJsApi.amapJsApiStrings.area
import typingsSlinky.amapJsApi.amapJsApiStrings.article
import typingsSlinky.amapJsApi.amapJsApiStrings.aside
import typingsSlinky.amapJsApi.amapJsApiStrings.audio
import typingsSlinky.amapJsApi.amapJsApiStrings.b
import typingsSlinky.amapJsApi.amapJsApiStrings.base
import typingsSlinky.amapJsApi.amapJsApiStrings.basefont
import typingsSlinky.amapJsApi.amapJsApiStrings.bdi
import typingsSlinky.amapJsApi.amapJsApiStrings.bdo
import typingsSlinky.amapJsApi.amapJsApiStrings.blockquote
import typingsSlinky.amapJsApi.amapJsApiStrings.body
import typingsSlinky.amapJsApi.amapJsApiStrings.br
import typingsSlinky.amapJsApi.amapJsApiStrings.button
import typingsSlinky.amapJsApi.amapJsApiStrings.canvas
import typingsSlinky.amapJsApi.amapJsApiStrings.caption
import typingsSlinky.amapJsApi.amapJsApiStrings.cite
import typingsSlinky.amapJsApi.amapJsApiStrings.code
import typingsSlinky.amapJsApi.amapJsApiStrings.col
import typingsSlinky.amapJsApi.amapJsApiStrings.colgroup
import typingsSlinky.amapJsApi.amapJsApiStrings.data
import typingsSlinky.amapJsApi.amapJsApiStrings.datalist
import typingsSlinky.amapJsApi.amapJsApiStrings.dd
import typingsSlinky.amapJsApi.amapJsApiStrings.del
import typingsSlinky.amapJsApi.amapJsApiStrings.details
import typingsSlinky.amapJsApi.amapJsApiStrings.dfn
import typingsSlinky.amapJsApi.amapJsApiStrings.dialog
import typingsSlinky.amapJsApi.amapJsApiStrings.dir
import typingsSlinky.amapJsApi.amapJsApiStrings.div
import typingsSlinky.amapJsApi.amapJsApiStrings.dl
import typingsSlinky.amapJsApi.amapJsApiStrings.dt
import typingsSlinky.amapJsApi.amapJsApiStrings.em
import typingsSlinky.amapJsApi.amapJsApiStrings.embed
import typingsSlinky.amapJsApi.amapJsApiStrings.fieldset
import typingsSlinky.amapJsApi.amapJsApiStrings.figcaption
import typingsSlinky.amapJsApi.amapJsApiStrings.figure
import typingsSlinky.amapJsApi.amapJsApiStrings.font
import typingsSlinky.amapJsApi.amapJsApiStrings.footer
import typingsSlinky.amapJsApi.amapJsApiStrings.form
import typingsSlinky.amapJsApi.amapJsApiStrings.frame
import typingsSlinky.amapJsApi.amapJsApiStrings.frameset
import typingsSlinky.amapJsApi.amapJsApiStrings.h1
import typingsSlinky.amapJsApi.amapJsApiStrings.h2
import typingsSlinky.amapJsApi.amapJsApiStrings.h3
import typingsSlinky.amapJsApi.amapJsApiStrings.h4
import typingsSlinky.amapJsApi.amapJsApiStrings.h5
import typingsSlinky.amapJsApi.amapJsApiStrings.h6
import typingsSlinky.amapJsApi.amapJsApiStrings.head
import typingsSlinky.amapJsApi.amapJsApiStrings.header
import typingsSlinky.amapJsApi.amapJsApiStrings.hgroup
import typingsSlinky.amapJsApi.amapJsApiStrings.hr
import typingsSlinky.amapJsApi.amapJsApiStrings.html
import typingsSlinky.amapJsApi.amapJsApiStrings.i
import typingsSlinky.amapJsApi.amapJsApiStrings.iframe
import typingsSlinky.amapJsApi.amapJsApiStrings.img
import typingsSlinky.amapJsApi.amapJsApiStrings.input
import typingsSlinky.amapJsApi.amapJsApiStrings.ins
import typingsSlinky.amapJsApi.amapJsApiStrings.kbd
import typingsSlinky.amapJsApi.amapJsApiStrings.label
import typingsSlinky.amapJsApi.amapJsApiStrings.legend
import typingsSlinky.amapJsApi.amapJsApiStrings.li
import typingsSlinky.amapJsApi.amapJsApiStrings.link
import typingsSlinky.amapJsApi.amapJsApiStrings.main
import typingsSlinky.amapJsApi.amapJsApiStrings.map
import typingsSlinky.amapJsApi.amapJsApiStrings.mark
import typingsSlinky.amapJsApi.amapJsApiStrings.marquee
import typingsSlinky.amapJsApi.amapJsApiStrings.menu
import typingsSlinky.amapJsApi.amapJsApiStrings.meta
import typingsSlinky.amapJsApi.amapJsApiStrings.meter
import typingsSlinky.amapJsApi.amapJsApiStrings.nav
import typingsSlinky.amapJsApi.amapJsApiStrings.noscript
import typingsSlinky.amapJsApi.amapJsApiStrings.ol
import typingsSlinky.amapJsApi.amapJsApiStrings.optgroup
import typingsSlinky.amapJsApi.amapJsApiStrings.option
import typingsSlinky.amapJsApi.amapJsApiStrings.output
import typingsSlinky.amapJsApi.amapJsApiStrings.p
import typingsSlinky.amapJsApi.amapJsApiStrings.param
import typingsSlinky.amapJsApi.amapJsApiStrings.picture
import typingsSlinky.amapJsApi.amapJsApiStrings.pre
import typingsSlinky.amapJsApi.amapJsApiStrings.progress
import typingsSlinky.amapJsApi.amapJsApiStrings.q
import typingsSlinky.amapJsApi.amapJsApiStrings.rp
import typingsSlinky.amapJsApi.amapJsApiStrings.rt
import typingsSlinky.amapJsApi.amapJsApiStrings.ruby
import typingsSlinky.amapJsApi.amapJsApiStrings.s
import typingsSlinky.amapJsApi.amapJsApiStrings.samp
import typingsSlinky.amapJsApi.amapJsApiStrings.script
import typingsSlinky.amapJsApi.amapJsApiStrings.section
import typingsSlinky.amapJsApi.amapJsApiStrings.select
import typingsSlinky.amapJsApi.amapJsApiStrings.slot
import typingsSlinky.amapJsApi.amapJsApiStrings.small
import typingsSlinky.amapJsApi.amapJsApiStrings.source
import typingsSlinky.amapJsApi.amapJsApiStrings.span
import typingsSlinky.amapJsApi.amapJsApiStrings.strong
import typingsSlinky.amapJsApi.amapJsApiStrings.style
import typingsSlinky.amapJsApi.amapJsApiStrings.sub
import typingsSlinky.amapJsApi.amapJsApiStrings.summary
import typingsSlinky.amapJsApi.amapJsApiStrings.sup
import typingsSlinky.amapJsApi.amapJsApiStrings.table
import typingsSlinky.amapJsApi.amapJsApiStrings.tbody
import typingsSlinky.amapJsApi.amapJsApiStrings.td
import typingsSlinky.amapJsApi.amapJsApiStrings.template
import typingsSlinky.amapJsApi.amapJsApiStrings.textarea
import typingsSlinky.amapJsApi.amapJsApiStrings.tfoot
import typingsSlinky.amapJsApi.amapJsApiStrings.th
import typingsSlinky.amapJsApi.amapJsApiStrings.thead
import typingsSlinky.amapJsApi.amapJsApiStrings.time
import typingsSlinky.amapJsApi.amapJsApiStrings.title
import typingsSlinky.amapJsApi.amapJsApiStrings.tr
import typingsSlinky.amapJsApi.amapJsApiStrings.track
import typingsSlinky.amapJsApi.amapJsApiStrings.u
import typingsSlinky.amapJsApi.amapJsApiStrings.ul
import typingsSlinky.amapJsApi.amapJsApiStrings.video
import typingsSlinky.amapJsApi.amapJsApiStrings.wbr
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDomUtil extends js.Object {
  /**
    * 给DOM元素添加一个className
    * @param dom DOM元素
    * @param className 类名
    */
  def addClass(dom: HTMLElement, className: String): Unit = js.native
  /**
    * 在parentNode内部创建一个className类名的tagName元素
    * @param tagName 标签名称
    * @param parent 父节点
    * @param className 类名
    */
  @JSName("create")
  def create_a(tagName: a): HTMLAnchorElement = js.native
  @JSName("create")
  def create_a(tagName: a, parent: HTMLElement): HTMLAnchorElement = js.native
  @JSName("create")
  def create_a(tagName: a, parent: HTMLElement, className: String): HTMLAnchorElement = js.native
  @JSName("create")
  def create_abbr(tagName: abbr): HTMLElement = js.native
  @JSName("create")
  def create_abbr(tagName: abbr, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_abbr(tagName: abbr, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_address(tagName: address): HTMLElement = js.native
  @JSName("create")
  def create_address(tagName: address, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_address(tagName: address, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_applet(tagName: applet): HTMLAppletElement = js.native
  @JSName("create")
  def create_applet(tagName: applet, parent: HTMLElement): HTMLAppletElement = js.native
  @JSName("create")
  def create_applet(tagName: applet, parent: HTMLElement, className: String): HTMLAppletElement = js.native
  @JSName("create")
  def create_area(tagName: area): HTMLAreaElement = js.native
  @JSName("create")
  def create_area(tagName: area, parent: HTMLElement): HTMLAreaElement = js.native
  @JSName("create")
  def create_area(tagName: area, parent: HTMLElement, className: String): HTMLAreaElement = js.native
  @JSName("create")
  def create_article(tagName: article): HTMLElement = js.native
  @JSName("create")
  def create_article(tagName: article, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_article(tagName: article, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_aside(tagName: aside): HTMLElement = js.native
  @JSName("create")
  def create_aside(tagName: aside, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_aside(tagName: aside, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_audio(tagName: audio): HTMLAudioElement = js.native
  @JSName("create")
  def create_audio(tagName: audio, parent: HTMLElement): HTMLAudioElement = js.native
  @JSName("create")
  def create_audio(tagName: audio, parent: HTMLElement, className: String): HTMLAudioElement = js.native
  @JSName("create")
  def create_b(tagName: b): HTMLElement = js.native
  @JSName("create")
  def create_b(tagName: b, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_b(tagName: b, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_base(tagName: base): HTMLBaseElement = js.native
  @JSName("create")
  def create_base(tagName: base, parent: HTMLElement): HTMLBaseElement = js.native
  @JSName("create")
  def create_base(tagName: base, parent: HTMLElement, className: String): HTMLBaseElement = js.native
  @JSName("create")
  def create_basefont(tagName: basefont): HTMLBaseFontElement = js.native
  @JSName("create")
  def create_basefont(tagName: basefont, parent: HTMLElement): HTMLBaseFontElement = js.native
  @JSName("create")
  def create_basefont(tagName: basefont, parent: HTMLElement, className: String): HTMLBaseFontElement = js.native
  @JSName("create")
  def create_bdi(tagName: bdi): HTMLElement = js.native
  @JSName("create")
  def create_bdi(tagName: bdi, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_bdi(tagName: bdi, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_bdo(tagName: bdo): HTMLElement = js.native
  @JSName("create")
  def create_bdo(tagName: bdo, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_bdo(tagName: bdo, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_blockquote(tagName: blockquote): HTMLQuoteElement = js.native
  @JSName("create")
  def create_blockquote(tagName: blockquote, parent: HTMLElement): HTMLQuoteElement = js.native
  @JSName("create")
  def create_blockquote(tagName: blockquote, parent: HTMLElement, className: String): HTMLQuoteElement = js.native
  @JSName("create")
  def create_body(tagName: body): HTMLBodyElement = js.native
  @JSName("create")
  def create_body(tagName: body, parent: HTMLElement): HTMLBodyElement = js.native
  @JSName("create")
  def create_body(tagName: body, parent: HTMLElement, className: String): HTMLBodyElement = js.native
  @JSName("create")
  def create_br(tagName: br): HTMLBRElement = js.native
  @JSName("create")
  def create_br(tagName: br, parent: HTMLElement): HTMLBRElement = js.native
  @JSName("create")
  def create_br(tagName: br, parent: HTMLElement, className: String): HTMLBRElement = js.native
  @JSName("create")
  def create_button(tagName: button): HTMLButtonElement = js.native
  @JSName("create")
  def create_button(tagName: button, parent: HTMLElement): HTMLButtonElement = js.native
  @JSName("create")
  def create_button(tagName: button, parent: HTMLElement, className: String): HTMLButtonElement = js.native
  @JSName("create")
  def create_canvas(tagName: canvas): HTMLCanvasElement = js.native
  @JSName("create")
  def create_canvas(tagName: canvas, parent: HTMLElement): HTMLCanvasElement = js.native
  @JSName("create")
  def create_canvas(tagName: canvas, parent: HTMLElement, className: String): HTMLCanvasElement = js.native
  @JSName("create")
  def create_caption(tagName: caption): HTMLTableCaptionElement = js.native
  @JSName("create")
  def create_caption(tagName: caption, parent: HTMLElement): HTMLTableCaptionElement = js.native
  @JSName("create")
  def create_caption(tagName: caption, parent: HTMLElement, className: String): HTMLTableCaptionElement = js.native
  @JSName("create")
  def create_cite(tagName: cite): HTMLElement = js.native
  @JSName("create")
  def create_cite(tagName: cite, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_cite(tagName: cite, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_code(tagName: code): HTMLElement = js.native
  @JSName("create")
  def create_code(tagName: code, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_code(tagName: code, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_col(tagName: col): HTMLTableColElement = js.native
  @JSName("create")
  def create_col(tagName: col, parent: HTMLElement): HTMLTableColElement = js.native
  @JSName("create")
  def create_col(tagName: col, parent: HTMLElement, className: String): HTMLTableColElement = js.native
  @JSName("create")
  def create_colgroup(tagName: colgroup): HTMLTableColElement = js.native
  @JSName("create")
  def create_colgroup(tagName: colgroup, parent: HTMLElement): HTMLTableColElement = js.native
  @JSName("create")
  def create_colgroup(tagName: colgroup, parent: HTMLElement, className: String): HTMLTableColElement = js.native
  @JSName("create")
  def create_data(tagName: data): HTMLDataElement = js.native
  @JSName("create")
  def create_data(tagName: data, parent: HTMLElement): HTMLDataElement = js.native
  @JSName("create")
  def create_data(tagName: data, parent: HTMLElement, className: String): HTMLDataElement = js.native
  @JSName("create")
  def create_datalist(tagName: datalist): HTMLDataListElement = js.native
  @JSName("create")
  def create_datalist(tagName: datalist, parent: HTMLElement): HTMLDataListElement = js.native
  @JSName("create")
  def create_datalist(tagName: datalist, parent: HTMLElement, className: String): HTMLDataListElement = js.native
  @JSName("create")
  def create_dd(tagName: dd): HTMLElement = js.native
  @JSName("create")
  def create_dd(tagName: dd, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_dd(tagName: dd, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_del(tagName: del): HTMLModElement = js.native
  @JSName("create")
  def create_del(tagName: del, parent: HTMLElement): HTMLModElement = js.native
  @JSName("create")
  def create_del(tagName: del, parent: HTMLElement, className: String): HTMLModElement = js.native
  @JSName("create")
  def create_details(tagName: details): HTMLDetailsElement = js.native
  @JSName("create")
  def create_details(tagName: details, parent: HTMLElement): HTMLDetailsElement = js.native
  @JSName("create")
  def create_details(tagName: details, parent: HTMLElement, className: String): HTMLDetailsElement = js.native
  @JSName("create")
  def create_dfn(tagName: dfn): HTMLElement = js.native
  @JSName("create")
  def create_dfn(tagName: dfn, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_dfn(tagName: dfn, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_dialog(tagName: dialog): HTMLDialogElement = js.native
  @JSName("create")
  def create_dialog(tagName: dialog, parent: HTMLElement): HTMLDialogElement = js.native
  @JSName("create")
  def create_dialog(tagName: dialog, parent: HTMLElement, className: String): HTMLDialogElement = js.native
  @JSName("create")
  def create_dir(tagName: dir): HTMLDirectoryElement = js.native
  @JSName("create")
  def create_dir(tagName: dir, parent: HTMLElement): HTMLDirectoryElement = js.native
  @JSName("create")
  def create_dir(tagName: dir, parent: HTMLElement, className: String): HTMLDirectoryElement = js.native
  @JSName("create")
  def create_div(tagName: div): HTMLDivElement = js.native
  @JSName("create")
  def create_div(tagName: div, parent: HTMLElement): HTMLDivElement = js.native
  @JSName("create")
  def create_div(tagName: div, parent: HTMLElement, className: String): HTMLDivElement = js.native
  @JSName("create")
  def create_dl(tagName: dl): HTMLDListElement = js.native
  @JSName("create")
  def create_dl(tagName: dl, parent: HTMLElement): HTMLDListElement = js.native
  @JSName("create")
  def create_dl(tagName: dl, parent: HTMLElement, className: String): HTMLDListElement = js.native
  @JSName("create")
  def create_dt(tagName: dt): HTMLElement = js.native
  @JSName("create")
  def create_dt(tagName: dt, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_dt(tagName: dt, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_em(tagName: em): HTMLElement = js.native
  @JSName("create")
  def create_em(tagName: em, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_em(tagName: em, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_embed(tagName: embed): HTMLEmbedElement = js.native
  @JSName("create")
  def create_embed(tagName: embed, parent: HTMLElement): HTMLEmbedElement = js.native
  @JSName("create")
  def create_embed(tagName: embed, parent: HTMLElement, className: String): HTMLEmbedElement = js.native
  @JSName("create")
  def create_fieldset(tagName: fieldset): HTMLFieldSetElement = js.native
  @JSName("create")
  def create_fieldset(tagName: fieldset, parent: HTMLElement): HTMLFieldSetElement = js.native
  @JSName("create")
  def create_fieldset(tagName: fieldset, parent: HTMLElement, className: String): HTMLFieldSetElement = js.native
  @JSName("create")
  def create_figcaption(tagName: figcaption): HTMLElement = js.native
  @JSName("create")
  def create_figcaption(tagName: figcaption, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_figcaption(tagName: figcaption, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_figure(tagName: figure): HTMLElement = js.native
  @JSName("create")
  def create_figure(tagName: figure, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_figure(tagName: figure, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_font(tagName: font): HTMLFontElement = js.native
  @JSName("create")
  def create_font(tagName: font, parent: HTMLElement): HTMLFontElement = js.native
  @JSName("create")
  def create_font(tagName: font, parent: HTMLElement, className: String): HTMLFontElement = js.native
  @JSName("create")
  def create_footer(tagName: footer): HTMLElement = js.native
  @JSName("create")
  def create_footer(tagName: footer, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_footer(tagName: footer, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_form(tagName: form): HTMLFormElement = js.native
  @JSName("create")
  def create_form(tagName: form, parent: HTMLElement): HTMLFormElement = js.native
  @JSName("create")
  def create_form(tagName: form, parent: HTMLElement, className: String): HTMLFormElement = js.native
  @JSName("create")
  def create_frame(tagName: frame): HTMLFrameElement = js.native
  @JSName("create")
  def create_frame(tagName: frame, parent: HTMLElement): HTMLFrameElement = js.native
  @JSName("create")
  def create_frame(tagName: frame, parent: HTMLElement, className: String): HTMLFrameElement = js.native
  @JSName("create")
  def create_frameset(tagName: frameset): HTMLFrameSetElement = js.native
  @JSName("create")
  def create_frameset(tagName: frameset, parent: HTMLElement): HTMLFrameSetElement = js.native
  @JSName("create")
  def create_frameset(tagName: frameset, parent: HTMLElement, className: String): HTMLFrameSetElement = js.native
  @JSName("create")
  def create_h1(tagName: h1): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h1(tagName: h1, parent: HTMLElement): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h1(tagName: h1, parent: HTMLElement, className: String): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h2(tagName: h2): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h2(tagName: h2, parent: HTMLElement): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h2(tagName: h2, parent: HTMLElement, className: String): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h3(tagName: h3): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h3(tagName: h3, parent: HTMLElement): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h3(tagName: h3, parent: HTMLElement, className: String): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h4(tagName: h4): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h4(tagName: h4, parent: HTMLElement): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h4(tagName: h4, parent: HTMLElement, className: String): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h5(tagName: h5): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h5(tagName: h5, parent: HTMLElement): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h5(tagName: h5, parent: HTMLElement, className: String): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h6(tagName: h6): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h6(tagName: h6, parent: HTMLElement): HTMLHeadingElement = js.native
  @JSName("create")
  def create_h6(tagName: h6, parent: HTMLElement, className: String): HTMLHeadingElement = js.native
  @JSName("create")
  def create_head(tagName: head): HTMLHeadElement = js.native
  @JSName("create")
  def create_head(tagName: head, parent: HTMLElement): HTMLHeadElement = js.native
  @JSName("create")
  def create_head(tagName: head, parent: HTMLElement, className: String): HTMLHeadElement = js.native
  @JSName("create")
  def create_header(tagName: header): HTMLElement = js.native
  @JSName("create")
  def create_header(tagName: header, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_header(tagName: header, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_hgroup(tagName: hgroup): HTMLElement = js.native
  @JSName("create")
  def create_hgroup(tagName: hgroup, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_hgroup(tagName: hgroup, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_hr(tagName: hr): HTMLHRElement = js.native
  @JSName("create")
  def create_hr(tagName: hr, parent: HTMLElement): HTMLHRElement = js.native
  @JSName("create")
  def create_hr(tagName: hr, parent: HTMLElement, className: String): HTMLHRElement = js.native
  @JSName("create")
  def create_html(tagName: html): HTMLHtmlElement = js.native
  @JSName("create")
  def create_html(tagName: html, parent: HTMLElement): HTMLHtmlElement = js.native
  @JSName("create")
  def create_html(tagName: html, parent: HTMLElement, className: String): HTMLHtmlElement = js.native
  @JSName("create")
  def create_i(tagName: i): HTMLElement = js.native
  @JSName("create")
  def create_i(tagName: i, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_i(tagName: i, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_iframe(tagName: iframe): HTMLIFrameElement = js.native
  @JSName("create")
  def create_iframe(tagName: iframe, parent: HTMLElement): HTMLIFrameElement = js.native
  @JSName("create")
  def create_iframe(tagName: iframe, parent: HTMLElement, className: String): HTMLIFrameElement = js.native
  @JSName("create")
  def create_img(tagName: img): HTMLImageElement = js.native
  @JSName("create")
  def create_img(tagName: img, parent: HTMLElement): HTMLImageElement = js.native
  @JSName("create")
  def create_img(tagName: img, parent: HTMLElement, className: String): HTMLImageElement = js.native
  @JSName("create")
  def create_input(tagName: input): HTMLInputElement = js.native
  @JSName("create")
  def create_input(tagName: input, parent: HTMLElement): HTMLInputElement = js.native
  @JSName("create")
  def create_input(tagName: input, parent: HTMLElement, className: String): HTMLInputElement = js.native
  @JSName("create")
  def create_ins(tagName: ins): HTMLModElement = js.native
  @JSName("create")
  def create_ins(tagName: ins, parent: HTMLElement): HTMLModElement = js.native
  @JSName("create")
  def create_ins(tagName: ins, parent: HTMLElement, className: String): HTMLModElement = js.native
  @JSName("create")
  def create_kbd(tagName: kbd): HTMLElement = js.native
  @JSName("create")
  def create_kbd(tagName: kbd, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_kbd(tagName: kbd, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_label(tagName: label): HTMLLabelElement = js.native
  @JSName("create")
  def create_label(tagName: label, parent: HTMLElement): HTMLLabelElement = js.native
  @JSName("create")
  def create_label(tagName: label, parent: HTMLElement, className: String): HTMLLabelElement = js.native
  @JSName("create")
  def create_legend(tagName: legend): HTMLLegendElement = js.native
  @JSName("create")
  def create_legend(tagName: legend, parent: HTMLElement): HTMLLegendElement = js.native
  @JSName("create")
  def create_legend(tagName: legend, parent: HTMLElement, className: String): HTMLLegendElement = js.native
  @JSName("create")
  def create_li(tagName: li): HTMLLIElement = js.native
  @JSName("create")
  def create_li(tagName: li, parent: HTMLElement): HTMLLIElement = js.native
  @JSName("create")
  def create_li(tagName: li, parent: HTMLElement, className: String): HTMLLIElement = js.native
  @JSName("create")
  def create_link(tagName: link): HTMLLinkElement = js.native
  @JSName("create")
  def create_link(tagName: link, parent: HTMLElement): HTMLLinkElement = js.native
  @JSName("create")
  def create_link(tagName: link, parent: HTMLElement, className: String): HTMLLinkElement = js.native
  @JSName("create")
  def create_main(tagName: main): HTMLElement = js.native
  @JSName("create")
  def create_main(tagName: main, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_main(tagName: main, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_map(tagName: map): HTMLMapElement = js.native
  @JSName("create")
  def create_map(tagName: map, parent: HTMLElement): HTMLMapElement = js.native
  @JSName("create")
  def create_map(tagName: map, parent: HTMLElement, className: String): HTMLMapElement = js.native
  @JSName("create")
  def create_mark(tagName: mark): HTMLElement = js.native
  @JSName("create")
  def create_mark(tagName: mark, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_mark(tagName: mark, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_marquee(tagName: marquee): HTMLMarqueeElement = js.native
  @JSName("create")
  def create_marquee(tagName: marquee, parent: HTMLElement): HTMLMarqueeElement = js.native
  @JSName("create")
  def create_marquee(tagName: marquee, parent: HTMLElement, className: String): HTMLMarqueeElement = js.native
  @JSName("create")
  def create_menu(tagName: menu): HTMLMenuElement = js.native
  @JSName("create")
  def create_menu(tagName: menu, parent: HTMLElement): HTMLMenuElement = js.native
  @JSName("create")
  def create_menu(tagName: menu, parent: HTMLElement, className: String): HTMLMenuElement = js.native
  @JSName("create")
  def create_meta(tagName: meta): HTMLMetaElement = js.native
  @JSName("create")
  def create_meta(tagName: meta, parent: HTMLElement): HTMLMetaElement = js.native
  @JSName("create")
  def create_meta(tagName: meta, parent: HTMLElement, className: String): HTMLMetaElement = js.native
  @JSName("create")
  def create_meter(tagName: meter): HTMLMeterElement = js.native
  @JSName("create")
  def create_meter(tagName: meter, parent: HTMLElement): HTMLMeterElement = js.native
  @JSName("create")
  def create_meter(tagName: meter, parent: HTMLElement, className: String): HTMLMeterElement = js.native
  @JSName("create")
  def create_nav(tagName: nav): HTMLElement = js.native
  @JSName("create")
  def create_nav(tagName: nav, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_nav(tagName: nav, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_noscript(tagName: noscript): HTMLElement = js.native
  @JSName("create")
  def create_noscript(tagName: noscript, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_noscript(tagName: noscript, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_object(tagName: `object`): HTMLObjectElement = js.native
  @JSName("create")
  def create_object(tagName: `object`, parent: HTMLElement): HTMLObjectElement = js.native
  @JSName("create")
  def create_object(tagName: `object`, parent: HTMLElement, className: String): HTMLObjectElement = js.native
  @JSName("create")
  def create_ol(tagName: ol): HTMLOListElement = js.native
  @JSName("create")
  def create_ol(tagName: ol, parent: HTMLElement): HTMLOListElement = js.native
  @JSName("create")
  def create_ol(tagName: ol, parent: HTMLElement, className: String): HTMLOListElement = js.native
  @JSName("create")
  def create_optgroup(tagName: optgroup): HTMLOptGroupElement = js.native
  @JSName("create")
  def create_optgroup(tagName: optgroup, parent: HTMLElement): HTMLOptGroupElement = js.native
  @JSName("create")
  def create_optgroup(tagName: optgroup, parent: HTMLElement, className: String): HTMLOptGroupElement = js.native
  @JSName("create")
  def create_option(tagName: option): HTMLOptionElement = js.native
  @JSName("create")
  def create_option(tagName: option, parent: HTMLElement): HTMLOptionElement = js.native
  @JSName("create")
  def create_option(tagName: option, parent: HTMLElement, className: String): HTMLOptionElement = js.native
  @JSName("create")
  def create_output(tagName: output): HTMLOutputElement = js.native
  @JSName("create")
  def create_output(tagName: output, parent: HTMLElement): HTMLOutputElement = js.native
  @JSName("create")
  def create_output(tagName: output, parent: HTMLElement, className: String): HTMLOutputElement = js.native
  @JSName("create")
  def create_p(tagName: p): HTMLParagraphElement = js.native
  @JSName("create")
  def create_p(tagName: p, parent: HTMLElement): HTMLParagraphElement = js.native
  @JSName("create")
  def create_p(tagName: p, parent: HTMLElement, className: String): HTMLParagraphElement = js.native
  @JSName("create")
  def create_param(tagName: param): HTMLParamElement = js.native
  @JSName("create")
  def create_param(tagName: param, parent: HTMLElement): HTMLParamElement = js.native
  @JSName("create")
  def create_param(tagName: param, parent: HTMLElement, className: String): HTMLParamElement = js.native
  @JSName("create")
  def create_picture(tagName: picture): HTMLPictureElement = js.native
  @JSName("create")
  def create_picture(tagName: picture, parent: HTMLElement): HTMLPictureElement = js.native
  @JSName("create")
  def create_picture(tagName: picture, parent: HTMLElement, className: String): HTMLPictureElement = js.native
  @JSName("create")
  def create_pre(tagName: pre): HTMLPreElement = js.native
  @JSName("create")
  def create_pre(tagName: pre, parent: HTMLElement): HTMLPreElement = js.native
  @JSName("create")
  def create_pre(tagName: pre, parent: HTMLElement, className: String): HTMLPreElement = js.native
  @JSName("create")
  def create_progress(tagName: progress): HTMLProgressElement = js.native
  @JSName("create")
  def create_progress(tagName: progress, parent: HTMLElement): HTMLProgressElement = js.native
  @JSName("create")
  def create_progress(tagName: progress, parent: HTMLElement, className: String): HTMLProgressElement = js.native
  @JSName("create")
  def create_q(tagName: q): HTMLQuoteElement = js.native
  @JSName("create")
  def create_q(tagName: q, parent: HTMLElement): HTMLQuoteElement = js.native
  @JSName("create")
  def create_q(tagName: q, parent: HTMLElement, className: String): HTMLQuoteElement = js.native
  @JSName("create")
  def create_rp(tagName: rp): HTMLElement = js.native
  @JSName("create")
  def create_rp(tagName: rp, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_rp(tagName: rp, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_rt(tagName: rt): HTMLElement = js.native
  @JSName("create")
  def create_rt(tagName: rt, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_rt(tagName: rt, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_ruby(tagName: ruby): HTMLElement = js.native
  @JSName("create")
  def create_ruby(tagName: ruby, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_ruby(tagName: ruby, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_s(tagName: s): HTMLElement = js.native
  @JSName("create")
  def create_s(tagName: s, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_s(tagName: s, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_samp(tagName: samp): HTMLElement = js.native
  @JSName("create")
  def create_samp(tagName: samp, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_samp(tagName: samp, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_script(tagName: script): HTMLScriptElement = js.native
  @JSName("create")
  def create_script(tagName: script, parent: HTMLElement): HTMLScriptElement = js.native
  @JSName("create")
  def create_script(tagName: script, parent: HTMLElement, className: String): HTMLScriptElement = js.native
  @JSName("create")
  def create_section(tagName: section): HTMLElement = js.native
  @JSName("create")
  def create_section(tagName: section, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_section(tagName: section, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_select(tagName: select): HTMLSelectElement = js.native
  @JSName("create")
  def create_select(tagName: select, parent: HTMLElement): HTMLSelectElement = js.native
  @JSName("create")
  def create_select(tagName: select, parent: HTMLElement, className: String): HTMLSelectElement = js.native
  @JSName("create")
  def create_slot(tagName: slot): HTMLSlotElement = js.native
  @JSName("create")
  def create_slot(tagName: slot, parent: HTMLElement): HTMLSlotElement = js.native
  @JSName("create")
  def create_slot(tagName: slot, parent: HTMLElement, className: String): HTMLSlotElement = js.native
  @JSName("create")
  def create_small(tagName: small): HTMLElement = js.native
  @JSName("create")
  def create_small(tagName: small, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_small(tagName: small, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_source(tagName: source): HTMLSourceElement = js.native
  @JSName("create")
  def create_source(tagName: source, parent: HTMLElement): HTMLSourceElement = js.native
  @JSName("create")
  def create_source(tagName: source, parent: HTMLElement, className: String): HTMLSourceElement = js.native
  @JSName("create")
  def create_span(tagName: span): HTMLSpanElement = js.native
  @JSName("create")
  def create_span(tagName: span, parent: HTMLElement): HTMLSpanElement = js.native
  @JSName("create")
  def create_span(tagName: span, parent: HTMLElement, className: String): HTMLSpanElement = js.native
  @JSName("create")
  def create_strong(tagName: strong): HTMLElement = js.native
  @JSName("create")
  def create_strong(tagName: strong, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_strong(tagName: strong, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_style(tagName: style): HTMLStyleElement = js.native
  @JSName("create")
  def create_style(tagName: style, parent: HTMLElement): HTMLStyleElement = js.native
  @JSName("create")
  def create_style(tagName: style, parent: HTMLElement, className: String): HTMLStyleElement = js.native
  @JSName("create")
  def create_sub(tagName: sub): HTMLElement = js.native
  @JSName("create")
  def create_sub(tagName: sub, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_sub(tagName: sub, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_summary(tagName: summary): HTMLElement = js.native
  @JSName("create")
  def create_summary(tagName: summary, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_summary(tagName: summary, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_sup(tagName: sup): HTMLElement = js.native
  @JSName("create")
  def create_sup(tagName: sup, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_sup(tagName: sup, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_table(tagName: table): HTMLTableElement = js.native
  @JSName("create")
  def create_table(tagName: table, parent: HTMLElement): HTMLTableElement = js.native
  @JSName("create")
  def create_table(tagName: table, parent: HTMLElement, className: String): HTMLTableElement = js.native
  @JSName("create")
  def create_tbody(tagName: tbody): HTMLTableSectionElement = js.native
  @JSName("create")
  def create_tbody(tagName: tbody, parent: HTMLElement): HTMLTableSectionElement = js.native
  @JSName("create")
  def create_tbody(tagName: tbody, parent: HTMLElement, className: String): HTMLTableSectionElement = js.native
  @JSName("create")
  def create_td(tagName: td): HTMLTableDataCellElement = js.native
  @JSName("create")
  def create_td(tagName: td, parent: HTMLElement): HTMLTableDataCellElement = js.native
  @JSName("create")
  def create_td(tagName: td, parent: HTMLElement, className: String): HTMLTableDataCellElement = js.native
  @JSName("create")
  def create_template(tagName: template): HTMLTemplateElement = js.native
  @JSName("create")
  def create_template(tagName: template, parent: HTMLElement): HTMLTemplateElement = js.native
  @JSName("create")
  def create_template(tagName: template, parent: HTMLElement, className: String): HTMLTemplateElement = js.native
  @JSName("create")
  def create_textarea(tagName: textarea): HTMLTextAreaElement = js.native
  @JSName("create")
  def create_textarea(tagName: textarea, parent: HTMLElement): HTMLTextAreaElement = js.native
  @JSName("create")
  def create_textarea(tagName: textarea, parent: HTMLElement, className: String): HTMLTextAreaElement = js.native
  @JSName("create")
  def create_tfoot(tagName: tfoot): HTMLTableSectionElement = js.native
  @JSName("create")
  def create_tfoot(tagName: tfoot, parent: HTMLElement): HTMLTableSectionElement = js.native
  @JSName("create")
  def create_tfoot(tagName: tfoot, parent: HTMLElement, className: String): HTMLTableSectionElement = js.native
  @JSName("create")
  def create_th(tagName: th): HTMLTableHeaderCellElement = js.native
  @JSName("create")
  def create_th(tagName: th, parent: HTMLElement): HTMLTableHeaderCellElement = js.native
  @JSName("create")
  def create_th(tagName: th, parent: HTMLElement, className: String): HTMLTableHeaderCellElement = js.native
  @JSName("create")
  def create_thead(tagName: thead): HTMLTableSectionElement = js.native
  @JSName("create")
  def create_thead(tagName: thead, parent: HTMLElement): HTMLTableSectionElement = js.native
  @JSName("create")
  def create_thead(tagName: thead, parent: HTMLElement, className: String): HTMLTableSectionElement = js.native
  @JSName("create")
  def create_time(tagName: time): HTMLTimeElement = js.native
  @JSName("create")
  def create_time(tagName: time, parent: HTMLElement): HTMLTimeElement = js.native
  @JSName("create")
  def create_time(tagName: time, parent: HTMLElement, className: String): HTMLTimeElement = js.native
  @JSName("create")
  def create_title(tagName: title): HTMLTitleElement = js.native
  @JSName("create")
  def create_title(tagName: title, parent: HTMLElement): HTMLTitleElement = js.native
  @JSName("create")
  def create_title(tagName: title, parent: HTMLElement, className: String): HTMLTitleElement = js.native
  @JSName("create")
  def create_tr(tagName: tr): HTMLTableRowElement = js.native
  @JSName("create")
  def create_tr(tagName: tr, parent: HTMLElement): HTMLTableRowElement = js.native
  @JSName("create")
  def create_tr(tagName: tr, parent: HTMLElement, className: String): HTMLTableRowElement = js.native
  @JSName("create")
  def create_track(tagName: track): HTMLTrackElement = js.native
  @JSName("create")
  def create_track(tagName: track, parent: HTMLElement): HTMLTrackElement = js.native
  @JSName("create")
  def create_track(tagName: track, parent: HTMLElement, className: String): HTMLTrackElement = js.native
  @JSName("create")
  def create_u(tagName: u): HTMLElement = js.native
  @JSName("create")
  def create_u(tagName: u, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_u(tagName: u, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_ul(tagName: ul): HTMLUListElement = js.native
  @JSName("create")
  def create_ul(tagName: ul, parent: HTMLElement): HTMLUListElement = js.native
  @JSName("create")
  def create_ul(tagName: ul, parent: HTMLElement, className: String): HTMLUListElement = js.native
  @JSName("create")
  def create_var(tagName: `var`): HTMLElement = js.native
  @JSName("create")
  def create_var(tagName: `var`, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_var(tagName: `var`, parent: HTMLElement, className: String): HTMLElement = js.native
  @JSName("create")
  def create_video(tagName: video): HTMLVideoElement = js.native
  @JSName("create")
  def create_video(tagName: video, parent: HTMLElement): HTMLVideoElement = js.native
  @JSName("create")
  def create_video(tagName: video, parent: HTMLElement, className: String): HTMLVideoElement = js.native
  @JSName("create")
  def create_wbr(tagName: wbr): HTMLElement = js.native
  @JSName("create")
  def create_wbr(tagName: wbr, parent: HTMLElement): HTMLElement = js.native
  @JSName("create")
  def create_wbr(tagName: wbr, parent: HTMLElement, className: String): HTMLElement = js.native
  /**
    * 清空DOM元素
    * @param dom DOM元素
    */
  def empty(dom: HTMLElement): Unit = js.native
  /**
    * 获取DOM元素的大小
    * @param dom DOM元素
    */
  def getViewport(dom: HTMLElement): Size = js.native
  /**
    * 获取DOM元素距离窗口左上角的距离
    * @param dom DOM元素
    */
  def getViewportOffset(dom: HTMLElement): Pixel = js.native
  /**
    * DOM元素是否包含className
    * @param dom DOM元素
    * @param className 类名
    */
  def hasClass(dom: HTMLElement, className: String): Boolean = js.native
  /**
    * 将DOM元素从父节点删除
    * @param dom DOM元素
    */
  def remove(dom: HTMLElement): Unit = js.native
  /**
    * 给DOM元素删除一个className
    * @param dom DOM元素
    * @param className 类名
    */
  def removeClass(dom: HTMLElement, className: String): Unit = js.native
  /**
    * 给DOM元素旋转一个角度，以center为中心，center以元素左上角为坐标原点
    * @param dom DOM元素
    * @param deg 旋转角度
    * @param origin 旋转中心
    */
  def rotate(dom: HTMLElement, deg: Double): Unit = js.native
  def rotate(dom: HTMLElement, deg: Double, origin: AnonX): Unit = js.native
  /**
    * 给DOM元素设置为className样式
    * @param dom DOM元素
    * @param className 类名
    */
  def setClass(dom: HTMLElement): Unit = js.native
  def setClass(dom: HTMLElement, className: String): Unit = js.native
  def setCss(dom: js.Array[typingsSlinky.std.HTMLElement], style: PartialCSSStyleDeclaratio): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomUtil */ js.Any = js.native
  /**
    * 给DOM元素删除一组样式，Object同样式表
    * @param dom DOM元素
    * @param style 样式
    */
  def setCss(dom: typingsSlinky.std.HTMLElement, style: PartialCSSStyleDeclaratio): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomUtil */ js.Any = js.native
  /**
    * 给DOM元素设定一个透明度
    * @param dom DOM元素
    * @param opacity 透明度(0-1)
    */
  def setOpacity(dom: HTMLElement, opacity: Double): Unit = js.native
}

