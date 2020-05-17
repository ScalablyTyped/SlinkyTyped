package typingsSlinky.kramed.mod

import typingsSlinky.kramed.anon.Align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KramedRenderer extends js.Object {
  def blockquote(quote: String): String = js.native
  def br(): String = js.native
  def code(code: String, language: String): String = js.native
  def codespan(code: String): String = js.native
  def del(text: String): String = js.native
  def em(text: String): String = js.native
  def heading(text: String, level: Double, raw: String): String = js.native
  def hr(): String = js.native
  def html(html: String): String = js.native
  def image(href: String, title: String, text: String): String = js.native
  def link(href: String, title: String, text: String): String = js.native
  def list(body: String, ordered: Boolean): String = js.native
  def listitem(text: String): String = js.native
  def paragraph(text: String): String = js.native
  def strong(text: String): String = js.native
  def table(header: String, body: String): String = js.native
  def tablecell(content: String, flags: Align): String = js.native
  def tablerow(content: String): String = js.native
  def text(text: String): String = js.native
}

object KramedRenderer {
  @scala.inline
  def apply(
    blockquote: String => String,
    br: () => String,
    code: (String, String) => String,
    codespan: String => String,
    del: String => String,
    em: String => String,
    heading: (String, Double, String) => String,
    hr: () => String,
    html: String => String,
    image: (String, String, String) => String,
    link: (String, String, String) => String,
    list: (String, Boolean) => String,
    listitem: String => String,
    paragraph: String => String,
    strong: String => String,
    table: (String, String) => String,
    tablecell: (String, Align) => String,
    tablerow: String => String,
    text: String => String
  ): KramedRenderer = {
    val __obj = js.Dynamic.literal(blockquote = js.Any.fromFunction1(blockquote), br = js.Any.fromFunction0(br), code = js.Any.fromFunction2(code), codespan = js.Any.fromFunction1(codespan), del = js.Any.fromFunction1(del), em = js.Any.fromFunction1(em), heading = js.Any.fromFunction3(heading), hr = js.Any.fromFunction0(hr), html = js.Any.fromFunction1(html), image = js.Any.fromFunction3(image), link = js.Any.fromFunction3(link), list = js.Any.fromFunction2(list), listitem = js.Any.fromFunction1(listitem), paragraph = js.Any.fromFunction1(paragraph), strong = js.Any.fromFunction1(strong), table = js.Any.fromFunction2(table), tablecell = js.Any.fromFunction2(tablecell), tablerow = js.Any.fromFunction1(tablerow), text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[KramedRenderer]
  }
  @scala.inline
  implicit class KramedRendererOps[Self <: KramedRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockquote(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockquote")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBr(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCode(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCodespan(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codespan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDel(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEm(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("em")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeading(value: (String, Double, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHr(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHtml(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImage(value: (String, String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLink(value: (String, String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withList(value: (String, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListitem(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listitem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParagraph(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStrong(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTable(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTablecell(value: (String, Align) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablecell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTablerow(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablerow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withText(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

