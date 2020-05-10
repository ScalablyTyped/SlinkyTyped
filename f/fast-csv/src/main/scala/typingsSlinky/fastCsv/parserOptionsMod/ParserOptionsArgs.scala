package typingsSlinky.fastCsv.parserOptionsMod

import typingsSlinky.fastCsv.parserTypesMod.HeaderArray
import typingsSlinky.fastCsv.parserTypesMod.HeaderTransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserOptionsArgs extends js.Object {
  var comment: js.UndefOr[String] = js.native
  var delimiter: js.UndefOr[String] = js.native
  var discardUnmappedColumns: js.UndefOr[Boolean] = js.native
  var encoding: js.UndefOr[String] = js.native
  var escape: js.UndefOr[String] = js.native
  var headers: js.UndefOr[Boolean | HeaderTransformFunction | HeaderArray] = js.native
  var ignoreEmpty: js.UndefOr[Boolean] = js.native
  var ltrim: js.UndefOr[Boolean] = js.native
  var maxRows: js.UndefOr[Double] = js.native
  var objectMode: js.UndefOr[Boolean] = js.native
  var quote: js.UndefOr[String | Null] = js.native
  var renameHeaders: js.UndefOr[Boolean] = js.native
  var rtrim: js.UndefOr[Boolean] = js.native
  var skipLines: js.UndefOr[Double] = js.native
  var skipRows: js.UndefOr[Double] = js.native
  var strictColumnHandling: js.UndefOr[Boolean] = js.native
  var trim: js.UndefOr[Boolean] = js.native
}

object ParserOptionsArgs {
  @scala.inline
  def apply(): ParserOptionsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptionsArgs]
  }
  @scala.inline
  implicit class ParserOptionsArgsOps[Self <: ParserOptionsArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscardUnmappedColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discardUnmappedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscardUnmappedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discardUnmappedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withEscape(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadersFunction1(value: /* headers */ HeaderArray => HeaderArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaders(value: Boolean | HeaderTransformFunction | HeaderArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withLtrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ltrim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLtrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ltrim")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(null)
        ret
    }
    @scala.inline
    def withRenameHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withRtrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtrim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtrim")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLines")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipRows")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictColumnHandling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictColumnHandling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictColumnHandling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictColumnHandling")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
  }
  
}

