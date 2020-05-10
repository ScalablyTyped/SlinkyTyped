package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsvOptions extends js.Object {
  var allowJaggedRows: js.UndefOr[Boolean] = js.native
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.native
  var encoding: js.UndefOr[String] = js.native
  var fieldDelimiter: js.UndefOr[String] = js.native
  var quote: js.UndefOr[String] = js.native
  var skipLeadingRows: js.UndefOr[String] = js.native
}

object CsvOptions {
  @scala.inline
  def apply(): CsvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvOptions]
  }
  @scala.inline
  implicit class CsvOptionsOps[Self <: CsvOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowJaggedRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowJaggedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowJaggedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowJaggedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowQuotedNewlines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowQuotedNewlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowQuotedNewlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowQuotedNewlines")(js.undefined)
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
    def withFieldDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldDelimiter")(js.undefined)
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
    def withSkipLeadingRows(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLeadingRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipLeadingRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLeadingRows")(js.undefined)
        ret
    }
  }
  
}

