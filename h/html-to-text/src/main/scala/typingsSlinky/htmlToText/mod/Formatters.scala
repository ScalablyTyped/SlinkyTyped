package typingsSlinky.htmlToText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatters extends js.Object {
  var anchor: js.UndefOr[Formatter[_]] = js.native
  var heading: js.UndefOr[Formatter[_]] = js.native
  var horizontalLine: js.UndefOr[Formatter[_]] = js.native
  var image: js.UndefOr[LeafFormatter[_]] = js.native
  var lineBreak: js.UndefOr[Formatter[_]] = js.native
  var listItem: js.UndefOr[Formatter[_]] = js.native
  var orderedList: js.UndefOr[Formatter[_]] = js.native
  var paragraph: js.UndefOr[Formatter[_]] = js.native
  var table: js.UndefOr[Formatter[_]] = js.native
  var text: js.UndefOr[LeafFormatter[_]] = js.native
  var unorderedList: js.UndefOr[Formatter[_]] = js.native
}

object Formatters {
  @scala.inline
  def apply(): Formatters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formatters]
  }
  @scala.inline
  implicit class FormattersOps[Self <: Formatters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeading(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalLine(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLine")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHorizontalLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLine")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: (_, /* options */ HtmlToTextOptions) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withLineBreak(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineBreak")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLineBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withListItem(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutListItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItem")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderedList(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderedList")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOrderedList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderedList")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraph(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutParagraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: (_, /* options */ HtmlToTextOptions) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withUnorderedList(
      value: (_, /* walk */ js.Function2[/* dom */ js.Array[js.Any], /* options */ HtmlToTextOptions, String], /* options */ HtmlToTextOptions) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unorderedList")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUnorderedList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unorderedList")(js.undefined)
        ret
    }
  }
  
}

