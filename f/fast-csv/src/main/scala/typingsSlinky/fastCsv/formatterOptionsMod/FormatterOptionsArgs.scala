package typingsSlinky.fastCsv.formatterOptionsMod

import typingsSlinky.fastCsv.typesMod.RowTransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatterOptionsArgs extends js.Object {
  var alwaysWriteHeaders: js.UndefOr[Boolean] = js.native
  var delimiter: js.UndefOr[String] = js.native
  var escape: js.UndefOr[String] = js.native
  var headers: js.UndefOr[Null | Boolean | js.Array[String]] = js.native
  var includeEndRowDelimiter: js.UndefOr[Boolean] = js.native
  var objectMode: js.UndefOr[Boolean] = js.native
  var quote: js.UndefOr[String | Boolean] = js.native
  var quoteColumns: js.UndefOr[QuoteColumns] = js.native
  var quoteHeaders: js.UndefOr[QuoteColumns] = js.native
  var rowDelimiter: js.UndefOr[String] = js.native
  var transform: js.UndefOr[RowTransformFunction] = js.native
  var writeBOM: js.UndefOr[Boolean] = js.native
}

object FormatterOptionsArgs {
  @scala.inline
  def apply(): FormatterOptionsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatterOptionsArgs]
  }
  @scala.inline
  implicit class FormatterOptionsArgsOps[Self <: FormatterOptionsArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysWriteHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysWriteHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysWriteHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysWriteHeaders")(js.undefined)
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
    def withHeaders(value: Boolean | js.Array[String]): Self = {
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
    def withHeadersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(null)
        ret
    }
    @scala.inline
    def withIncludeEndRowDelimiter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEndRowDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeEndRowDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEndRowDelimiter")(js.undefined)
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
    def withQuote(value: String | Boolean): Self = {
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
    def withQuoteColumns(value: QuoteColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteHeaders(value: QuoteColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: RowTransformFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteBOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeBOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteBOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeBOM")(js.undefined)
        ret
    }
  }
  
}

