package typingsSlinky.rcTable.interfaceMod

import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.FC
import typingsSlinky.react.mod.ForwardRefExoticComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ComponentType[P]
  - typingsSlinky.react.mod.ForwardRefExoticComponent[P]
  - typingsSlinky.react.mod.FC[P]
  - typingsSlinky.rcTable.rcTableStrings.a
  - typingsSlinky.rcTable.rcTableStrings.abbr
  - typingsSlinky.rcTable.rcTableStrings.address
  - typingsSlinky.rcTable.rcTableStrings.area
  - typingsSlinky.rcTable.rcTableStrings.article
  - typingsSlinky.rcTable.rcTableStrings.aside
  - typingsSlinky.rcTable.rcTableStrings.audio
  - typingsSlinky.rcTable.rcTableStrings.b
  - typingsSlinky.rcTable.rcTableStrings.base
  - typingsSlinky.rcTable.rcTableStrings.bdi
  - typingsSlinky.rcTable.rcTableStrings.bdo
  - typingsSlinky.rcTable.rcTableStrings.big
  - typingsSlinky.rcTable.rcTableStrings.blockquote
  - typingsSlinky.rcTable.rcTableStrings.body
  - typingsSlinky.rcTable.rcTableStrings.br
  - typingsSlinky.rcTable.rcTableStrings.button
  - typingsSlinky.rcTable.rcTableStrings.canvas
  - typingsSlinky.rcTable.rcTableStrings.caption
  - typingsSlinky.rcTable.rcTableStrings.cite
  - typingsSlinky.rcTable.rcTableStrings.code
  - typingsSlinky.rcTable.rcTableStrings.col
  - typingsSlinky.rcTable.rcTableStrings.colgroup
  - typingsSlinky.rcTable.rcTableStrings.data
  - typingsSlinky.rcTable.rcTableStrings.datalist
  - typingsSlinky.rcTable.rcTableStrings.dd
  - typingsSlinky.rcTable.rcTableStrings.del
  - typingsSlinky.rcTable.rcTableStrings.details
  - typingsSlinky.rcTable.rcTableStrings.dfn
  - typingsSlinky.rcTable.rcTableStrings.dialog
  - typingsSlinky.rcTable.rcTableStrings.div
  - typingsSlinky.rcTable.rcTableStrings.dl
  - typingsSlinky.rcTable.rcTableStrings.dt
  - typingsSlinky.rcTable.rcTableStrings.em
  - typingsSlinky.rcTable.rcTableStrings.embed
  - typingsSlinky.rcTable.rcTableStrings.fieldset
  - typingsSlinky.rcTable.rcTableStrings.figcaption
  - typingsSlinky.rcTable.rcTableStrings.figure
  - typingsSlinky.rcTable.rcTableStrings.footer
  - typingsSlinky.rcTable.rcTableStrings.form
  - typingsSlinky.rcTable.rcTableStrings.h1
  - typingsSlinky.rcTable.rcTableStrings.h2
  - typingsSlinky.rcTable.rcTableStrings.h3
  - typingsSlinky.rcTable.rcTableStrings.h4
  - typingsSlinky.rcTable.rcTableStrings.h5
  - typingsSlinky.rcTable.rcTableStrings.h6
  - typingsSlinky.rcTable.rcTableStrings.head
  - typingsSlinky.rcTable.rcTableStrings.header
  - typingsSlinky.rcTable.rcTableStrings.hgroup
  - typingsSlinky.rcTable.rcTableStrings.hr
  - typingsSlinky.rcTable.rcTableStrings.html
  - typingsSlinky.rcTable.rcTableStrings.i
  - typingsSlinky.rcTable.rcTableStrings.iframe
  - typingsSlinky.rcTable.rcTableStrings.img
  - typingsSlinky.rcTable.rcTableStrings.input
  - typingsSlinky.rcTable.rcTableStrings.ins
  - typingsSlinky.rcTable.rcTableStrings.kbd
  - typingsSlinky.rcTable.rcTableStrings.keygen
  - typingsSlinky.rcTable.rcTableStrings.label
  - typingsSlinky.rcTable.rcTableStrings.legend
  - typingsSlinky.rcTable.rcTableStrings.li
  - typingsSlinky.rcTable.rcTableStrings.link
  - typingsSlinky.rcTable.rcTableStrings.main
  - typingsSlinky.rcTable.rcTableStrings.map
  - typingsSlinky.rcTable.rcTableStrings.mark
  - typingsSlinky.rcTable.rcTableStrings.menu
  - typingsSlinky.rcTable.rcTableStrings.menuitem
  - typingsSlinky.rcTable.rcTableStrings.meta
  - typingsSlinky.rcTable.rcTableStrings.meter
  - typingsSlinky.rcTable.rcTableStrings.nav
  - typingsSlinky.rcTable.rcTableStrings.noscript
  - typingsSlinky.rcTable.rcTableStrings.`object`
  - typingsSlinky.rcTable.rcTableStrings.ol
  - typingsSlinky.rcTable.rcTableStrings.optgroup
  - typingsSlinky.rcTable.rcTableStrings.option
  - typingsSlinky.rcTable.rcTableStrings.output
  - typingsSlinky.rcTable.rcTableStrings.p
  - typingsSlinky.rcTable.rcTableStrings.param
  - typingsSlinky.rcTable.rcTableStrings.picture
  - typingsSlinky.rcTable.rcTableStrings.pre
  - typingsSlinky.rcTable.rcTableStrings.progress
  - typingsSlinky.rcTable.rcTableStrings.q
  - typingsSlinky.rcTable.rcTableStrings.rp
  - typingsSlinky.rcTable.rcTableStrings.rt
  - typingsSlinky.rcTable.rcTableStrings.ruby
  - typingsSlinky.rcTable.rcTableStrings.s
  - typingsSlinky.rcTable.rcTableStrings.samp
  - typingsSlinky.rcTable.rcTableStrings.slot
  - typingsSlinky.rcTable.rcTableStrings.script
  - typingsSlinky.rcTable.rcTableStrings.section
  - typingsSlinky.rcTable.rcTableStrings.select
  - typingsSlinky.rcTable.rcTableStrings.small
  - typingsSlinky.rcTable.rcTableStrings.source
  - typingsSlinky.rcTable.rcTableStrings.span
  - typingsSlinky.rcTable.rcTableStrings.strong
  - typingsSlinky.rcTable.rcTableStrings.style
  - typingsSlinky.rcTable.rcTableStrings.sub
  - typingsSlinky.rcTable.rcTableStrings.summary
  - typingsSlinky.rcTable.rcTableStrings.sup
  - typingsSlinky.rcTable.rcTableStrings.table
  - typingsSlinky.rcTable.rcTableStrings.template
  - typingsSlinky.rcTable.rcTableStrings.tbody
  - typingsSlinky.rcTable.rcTableStrings.td
  - typingsSlinky.rcTable.rcTableStrings.textarea
  - typingsSlinky.rcTable.rcTableStrings.tfoot
  - typingsSlinky.rcTable.rcTableStrings.th
  - typingsSlinky.rcTable.rcTableStrings.thead
  - typingsSlinky.rcTable.rcTableStrings.time
  - typingsSlinky.rcTable.rcTableStrings.title
  - typingsSlinky.rcTable.rcTableStrings.tr
  - typingsSlinky.rcTable.rcTableStrings.track
  - typingsSlinky.rcTable.rcTableStrings.u
  - typingsSlinky.rcTable.rcTableStrings.ul
  - typingsSlinky.rcTable.rcTableStrings.`var`
  - typingsSlinky.rcTable.rcTableStrings.video
  - typingsSlinky.rcTable.rcTableStrings.wbr
  - typingsSlinky.rcTable.rcTableStrings.webview
*/
trait Component[P] extends js.Object

object Component {
  @scala.inline
  def a[P]: typingsSlinky.rcTable.rcTableStrings.a = "a".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.a]
  @scala.inline
  def abbr[P]: typingsSlinky.rcTable.rcTableStrings.abbr = "abbr".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.abbr]
  @scala.inline
  def address[P]: typingsSlinky.rcTable.rcTableStrings.address = "address".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.address]
  @scala.inline
  def area[P]: typingsSlinky.rcTable.rcTableStrings.area = "area".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.area]
  @scala.inline
  def article[P]: typingsSlinky.rcTable.rcTableStrings.article = "article".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.article]
  @scala.inline
  def aside[P]: typingsSlinky.rcTable.rcTableStrings.aside = "aside".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.aside]
  @scala.inline
  def audio[P]: typingsSlinky.rcTable.rcTableStrings.audio = "audio".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.audio]
  @scala.inline
  def b[P]: typingsSlinky.rcTable.rcTableStrings.b = "b".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.b]
  @scala.inline
  def base[P]: typingsSlinky.rcTable.rcTableStrings.base = "base".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.base]
  @scala.inline
  def bdi[P]: typingsSlinky.rcTable.rcTableStrings.bdi = "bdi".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.bdi]
  @scala.inline
  def bdo[P]: typingsSlinky.rcTable.rcTableStrings.bdo = "bdo".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.bdo]
  @scala.inline
  def big[P]: typingsSlinky.rcTable.rcTableStrings.big = "big".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.big]
  @scala.inline
  def blockquote[P]: typingsSlinky.rcTable.rcTableStrings.blockquote = "blockquote".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.blockquote]
  @scala.inline
  def body[P]: typingsSlinky.rcTable.rcTableStrings.body = "body".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.body]
  @scala.inline
  def br[P]: typingsSlinky.rcTable.rcTableStrings.br = "br".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.br]
  @scala.inline
  def button[P]: typingsSlinky.rcTable.rcTableStrings.button = "button".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.button]
  @scala.inline
  def canvas[P]: typingsSlinky.rcTable.rcTableStrings.canvas = "canvas".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.canvas]
  @scala.inline
  def caption[P]: typingsSlinky.rcTable.rcTableStrings.caption = "caption".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.caption]
  @scala.inline
  def cite[P]: typingsSlinky.rcTable.rcTableStrings.cite = "cite".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.cite]
  @scala.inline
  def code[P]: typingsSlinky.rcTable.rcTableStrings.code = "code".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.code]
  @scala.inline
  def col[P]: typingsSlinky.rcTable.rcTableStrings.col = "col".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.col]
  @scala.inline
  def colgroup[P]: typingsSlinky.rcTable.rcTableStrings.colgroup = "colgroup".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.colgroup]
  @scala.inline
  def data[P]: typingsSlinky.rcTable.rcTableStrings.data = "data".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.data]
  @scala.inline
  def datalist[P]: typingsSlinky.rcTable.rcTableStrings.datalist = "datalist".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.datalist]
  @scala.inline
  def dd[P]: typingsSlinky.rcTable.rcTableStrings.dd = "dd".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.dd]
  @scala.inline
  def del[P]: typingsSlinky.rcTable.rcTableStrings.del = "del".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.del]
  @scala.inline
  def details[P]: typingsSlinky.rcTable.rcTableStrings.details = "details".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.details]
  @scala.inline
  def dfn[P]: typingsSlinky.rcTable.rcTableStrings.dfn = "dfn".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.dfn]
  @scala.inline
  def dialog[P]: typingsSlinky.rcTable.rcTableStrings.dialog = "dialog".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.dialog]
  @scala.inline
  def div[P]: typingsSlinky.rcTable.rcTableStrings.div = "div".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.div]
  @scala.inline
  def dl[P]: typingsSlinky.rcTable.rcTableStrings.dl = "dl".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.dl]
  @scala.inline
  def dt[P]: typingsSlinky.rcTable.rcTableStrings.dt = "dt".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.dt]
  @scala.inline
  def em[P]: typingsSlinky.rcTable.rcTableStrings.em = "em".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.em]
  @scala.inline
  def embed[P]: typingsSlinky.rcTable.rcTableStrings.embed = "embed".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.embed]
  @scala.inline
  def fieldset[P]: typingsSlinky.rcTable.rcTableStrings.fieldset = "fieldset".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.fieldset]
  @scala.inline
  def figcaption[P]: typingsSlinky.rcTable.rcTableStrings.figcaption = "figcaption".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.figcaption]
  @scala.inline
  def figure[P]: typingsSlinky.rcTable.rcTableStrings.figure = "figure".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.figure]
  @scala.inline
  def footer[P]: typingsSlinky.rcTable.rcTableStrings.footer = "footer".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.footer]
  @scala.inline
  def form[P]: typingsSlinky.rcTable.rcTableStrings.form = "form".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.form]
  @scala.inline
  def h1[P]: typingsSlinky.rcTable.rcTableStrings.h1 = "h1".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.h1]
  @scala.inline
  def h2[P]: typingsSlinky.rcTable.rcTableStrings.h2 = "h2".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.h2]
  @scala.inline
  def h3[P]: typingsSlinky.rcTable.rcTableStrings.h3 = "h3".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.h3]
  @scala.inline
  def h4[P]: typingsSlinky.rcTable.rcTableStrings.h4 = "h4".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.h4]
  @scala.inline
  def h5[P]: typingsSlinky.rcTable.rcTableStrings.h5 = "h5".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.h5]
  @scala.inline
  def h6[P]: typingsSlinky.rcTable.rcTableStrings.h6 = "h6".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.h6]
  @scala.inline
  def head[P]: typingsSlinky.rcTable.rcTableStrings.head = "head".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.head]
  @scala.inline
  def header[P]: typingsSlinky.rcTable.rcTableStrings.header = "header".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.header]
  @scala.inline
  def hgroup[P]: typingsSlinky.rcTable.rcTableStrings.hgroup = "hgroup".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.hgroup]
  @scala.inline
  def hr[P]: typingsSlinky.rcTable.rcTableStrings.hr = "hr".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.hr]
  @scala.inline
  def html[P]: typingsSlinky.rcTable.rcTableStrings.html = "html".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.html]
  @scala.inline
  def i[P]: typingsSlinky.rcTable.rcTableStrings.i = "i".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.i]
  @scala.inline
  def iframe[P]: typingsSlinky.rcTable.rcTableStrings.iframe = "iframe".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.iframe]
  @scala.inline
  def img[P]: typingsSlinky.rcTable.rcTableStrings.img = "img".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.img]
  @scala.inline
  def input[P]: typingsSlinky.rcTable.rcTableStrings.input = "input".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.input]
  @scala.inline
  def ins[P]: typingsSlinky.rcTable.rcTableStrings.ins = "ins".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.ins]
  @scala.inline
  def kbd[P]: typingsSlinky.rcTable.rcTableStrings.kbd = "kbd".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.kbd]
  @scala.inline
  def keygen[P]: typingsSlinky.rcTable.rcTableStrings.keygen = "keygen".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.keygen]
  @scala.inline
  def label[P]: typingsSlinky.rcTable.rcTableStrings.label = "label".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.label]
  @scala.inline
  def legend[P]: typingsSlinky.rcTable.rcTableStrings.legend = "legend".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.legend]
  @scala.inline
  def li[P]: typingsSlinky.rcTable.rcTableStrings.li = "li".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.li]
  @scala.inline
  def link[P]: typingsSlinky.rcTable.rcTableStrings.link = "link".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.link]
  @scala.inline
  def main[P]: typingsSlinky.rcTable.rcTableStrings.main = "main".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.main]
  @scala.inline
  def map[P]: typingsSlinky.rcTable.rcTableStrings.map = "map".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.map]
  @scala.inline
  def mark[P]: typingsSlinky.rcTable.rcTableStrings.mark = "mark".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.mark]
  @scala.inline
  def menu[P]: typingsSlinky.rcTable.rcTableStrings.menu = "menu".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.menu]
  @scala.inline
  def menuitem[P]: typingsSlinky.rcTable.rcTableStrings.menuitem = "menuitem".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.menuitem]
  @scala.inline
  def meta[P]: typingsSlinky.rcTable.rcTableStrings.meta = "meta".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.meta]
  @scala.inline
  def meter[P]: typingsSlinky.rcTable.rcTableStrings.meter = "meter".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.meter]
  @scala.inline
  def nav[P]: typingsSlinky.rcTable.rcTableStrings.nav = "nav".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.nav]
  @scala.inline
  def noscript[P]: typingsSlinky.rcTable.rcTableStrings.noscript = "noscript".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.noscript]
  @scala.inline
  def `object`[P]: typingsSlinky.rcTable.rcTableStrings.`object` = "object".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.`object`]
  @scala.inline
  def ol[P]: typingsSlinky.rcTable.rcTableStrings.ol = "ol".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.ol]
  @scala.inline
  def optgroup[P]: typingsSlinky.rcTable.rcTableStrings.optgroup = "optgroup".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.optgroup]
  @scala.inline
  def option[P]: typingsSlinky.rcTable.rcTableStrings.option = "option".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.option]
  @scala.inline
  def output[P]: typingsSlinky.rcTable.rcTableStrings.output = "output".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.output]
  @scala.inline
  def p[P]: typingsSlinky.rcTable.rcTableStrings.p = "p".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.p]
  @scala.inline
  def param[P]: typingsSlinky.rcTable.rcTableStrings.param = "param".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.param]
  @scala.inline
  def picture[P]: typingsSlinky.rcTable.rcTableStrings.picture = "picture".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.picture]
  @scala.inline
  def pre[P]: typingsSlinky.rcTable.rcTableStrings.pre = "pre".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.pre]
  @scala.inline
  def progress[P]: typingsSlinky.rcTable.rcTableStrings.progress = "progress".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.progress]
  @scala.inline
  def q[P]: typingsSlinky.rcTable.rcTableStrings.q = "q".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.q]
  @scala.inline
  def rp[P]: typingsSlinky.rcTable.rcTableStrings.rp = "rp".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.rp]
  @scala.inline
  def rt[P]: typingsSlinky.rcTable.rcTableStrings.rt = "rt".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.rt]
  @scala.inline
  def ruby[P]: typingsSlinky.rcTable.rcTableStrings.ruby = "ruby".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.ruby]
  @scala.inline
  def s[P]: typingsSlinky.rcTable.rcTableStrings.s = "s".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.s]
  @scala.inline
  def samp[P]: typingsSlinky.rcTable.rcTableStrings.samp = "samp".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.samp]
  @scala.inline
  def slot[P]: typingsSlinky.rcTable.rcTableStrings.slot = "slot".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.slot]
  @scala.inline
  def script[P]: typingsSlinky.rcTable.rcTableStrings.script = "script".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.script]
  @scala.inline
  def section[P]: typingsSlinky.rcTable.rcTableStrings.section = "section".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.section]
  @scala.inline
  def select[P]: typingsSlinky.rcTable.rcTableStrings.select = "select".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.select]
  @scala.inline
  def small[P]: typingsSlinky.rcTable.rcTableStrings.small = "small".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.small]
  @scala.inline
  def source[P]: typingsSlinky.rcTable.rcTableStrings.source = "source".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.source]
  @scala.inline
  def span[P]: typingsSlinky.rcTable.rcTableStrings.span = "span".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.span]
  @scala.inline
  def strong[P]: typingsSlinky.rcTable.rcTableStrings.strong = "strong".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.strong]
  @scala.inline
  def style[P]: typingsSlinky.rcTable.rcTableStrings.style = "style".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.style]
  @scala.inline
  def sub[P]: typingsSlinky.rcTable.rcTableStrings.sub = "sub".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.sub]
  @scala.inline
  def summary[P]: typingsSlinky.rcTable.rcTableStrings.summary = "summary".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.summary]
  @scala.inline
  def sup[P]: typingsSlinky.rcTable.rcTableStrings.sup = "sup".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.sup]
  @scala.inline
  def table[P]: typingsSlinky.rcTable.rcTableStrings.table = "table".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.table]
  @scala.inline
  def template[P]: typingsSlinky.rcTable.rcTableStrings.template = "template".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.template]
  @scala.inline
  def tbody[P]: typingsSlinky.rcTable.rcTableStrings.tbody = "tbody".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.tbody]
  @scala.inline
  def td[P]: typingsSlinky.rcTable.rcTableStrings.td = "td".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.td]
  @scala.inline
  def textarea[P]: typingsSlinky.rcTable.rcTableStrings.textarea = "textarea".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.textarea]
  @scala.inline
  def tfoot[P]: typingsSlinky.rcTable.rcTableStrings.tfoot = "tfoot".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.tfoot]
  @scala.inline
  def th[P]: typingsSlinky.rcTable.rcTableStrings.th = "th".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.th]
  @scala.inline
  def thead[P]: typingsSlinky.rcTable.rcTableStrings.thead = "thead".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.thead]
  @scala.inline
  def time[P]: typingsSlinky.rcTable.rcTableStrings.time = "time".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.time]
  @scala.inline
  def title[P]: typingsSlinky.rcTable.rcTableStrings.title = "title".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.title]
  @scala.inline
  def tr[P]: typingsSlinky.rcTable.rcTableStrings.tr = "tr".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.tr]
  @scala.inline
  def track[P]: typingsSlinky.rcTable.rcTableStrings.track = "track".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.track]
  @scala.inline
  def u[P]: typingsSlinky.rcTable.rcTableStrings.u = "u".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.u]
  @scala.inline
  def ul[P]: typingsSlinky.rcTable.rcTableStrings.ul = "ul".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.ul]
  @scala.inline
  def `var`[P]: typingsSlinky.rcTable.rcTableStrings.`var` = "var".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.`var`]
  @scala.inline
  def video[P]: typingsSlinky.rcTable.rcTableStrings.video = "video".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.video]
  @scala.inline
  def wbr[P]: typingsSlinky.rcTable.rcTableStrings.wbr = "wbr".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.wbr]
  @scala.inline
  def webview[P]: typingsSlinky.rcTable.rcTableStrings.webview = "webview".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.webview]
  @scala.inline
  implicit def apply[P](value: ComponentType[P]): Component[P] = value.asInstanceOf[Component[P]]
  @scala.inline
  implicit def apply[P](value: FC[P]): Component[P] = value.asInstanceOf[Component[P]]
  @scala.inline
  implicit def apply[P](value: ForwardRefExoticComponent[P]): Component[P] = value.asInstanceOf[Component[P]]
}

