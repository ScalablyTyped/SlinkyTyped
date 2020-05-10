package typingsSlinky.markedTerminal.mod

import typingsSlinky.chalk.mod.Chalk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminalRendererOptions extends js.Object {
  var blockquote: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
  var code: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
  var codespan: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
  var del: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
  var em: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
  // Whether or not to show emojis
  var emoji: js.UndefOr[Boolean] = js.native
  var firstHeading: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
  var heading: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
  var hr: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
  var href: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
  var html: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
  var link: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
  // Formats the bulletpoints and numbers for lists
  var list: js.UndefOr[js.Function2[/* body */ String, /* ordered */ js.UndefOr[Boolean], String]] = js.native
  var listitem: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
  var paragraph: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
   // only applicable when reflow is true
  var reflowText: js.UndefOr[Boolean] = js.native
  // Should it prefix headers?
  var showSectionPrefix: js.UndefOr[Boolean] = js.native
  var strong: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
  // The size of tabs in number of spaces or as tab characters
  var tab: js.UndefOr[Double] = js.native
  var table: js.UndefOr[Chalk | (js.Function1[/* s */ String, String])] = js.native
  // Options passed to cli-table
  var tableOptions: js.UndefOr[js.Any] = js.native
  // Whether or not to undo marked escaping
  // of enitities (" -> &quot; etc)
  var unescape: js.UndefOr[Boolean] = js.native
  // Reflow and print-out width
  var width: js.UndefOr[Double] = js.native
}

object TerminalRendererOptions {
  @scala.inline
  def apply(): TerminalRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalRendererOptions]
  }
  @scala.inline
  implicit class TerminalRendererOptionsOps[Self <: TerminalRendererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockquoteFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockquote")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBlockquote(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockquote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockquote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockquote")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCode(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withCodespanFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codespan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCodespan(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codespan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodespan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codespan")(js.undefined)
        ret
    }
    @scala.inline
    def withDelFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDel(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(js.undefined)
        ret
    }
    @scala.inline
    def withEmFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("em")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEm(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("em")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("em")(js.undefined)
        ret
    }
    @scala.inline
    def withEmoji(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmoji: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstHeadingFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstHeading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstHeading(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstHeading")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadingFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeading(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
    @scala.inline
    def withHrFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHr(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hr")(js.undefined)
        ret
    }
    @scala.inline
    def withHrefFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHref(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHtml(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLink(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withList(value: (/* body */ String, /* ordered */ js.UndefOr[Boolean]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withListitemFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listitem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListitem(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listitem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListitem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listitem")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParagraph(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(js.undefined)
        ret
    }
    @scala.inline
    def withReflowText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflowText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReflowText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflowText")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSectionPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSectionPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSectionPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSectionPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withStrongFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStrong(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(js.undefined)
        ret
    }
    @scala.inline
    def withTab(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(js.undefined)
        ret
    }
    @scala.inline
    def withTableFunction1(value: /* s */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTable(value: Chalk | (js.Function1[/* s */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withTableOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUnescape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnescape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescape")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

