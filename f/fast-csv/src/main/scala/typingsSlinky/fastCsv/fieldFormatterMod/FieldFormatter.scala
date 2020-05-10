package typingsSlinky.fastCsv.fieldFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldFormatter extends js.Object {
  val ESCAPE_REGEXP: js.Any = js.native
  val REPLACE_REGEXP: js.Any = js.native
  var _headers: js.Any = js.native
  val formatterOptions: js.Any = js.native
  var quoteField: js.Any = js.native
  var shouldQuote: js.Any = js.native
  def format(field: String, fieldIndex: Double, isHeader: Boolean): String = js.native
  def headers(headers: js.Array[String]): js.Any = js.native
}

object FieldFormatter {
  @scala.inline
  def apply(
    ESCAPE_REGEXP: js.Any,
    REPLACE_REGEXP: js.Any,
    _headers: js.Any,
    format: (String, Double, Boolean) => String,
    formatterOptions: js.Any,
    headers: js.Array[String] => js.Any,
    quoteField: js.Any,
    shouldQuote: js.Any
  ): FieldFormatter = {
    val __obj = js.Dynamic.literal(ESCAPE_REGEXP = ESCAPE_REGEXP.asInstanceOf[js.Any], REPLACE_REGEXP = REPLACE_REGEXP.asInstanceOf[js.Any], _headers = _headers.asInstanceOf[js.Any], format = js.Any.fromFunction3(format), formatterOptions = formatterOptions.asInstanceOf[js.Any], headers = js.Any.fromFunction1(headers), quoteField = quoteField.asInstanceOf[js.Any], shouldQuote = shouldQuote.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldFormatter]
  }
  @scala.inline
  implicit class FieldFormatterOps[Self <: FieldFormatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withESCAPE_REGEXP(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ESCAPE_REGEXP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREPLACE_REGEXP(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REPLACE_REGEXP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_headers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: (String, Double, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFormatterOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[String] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuoteField(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldQuote(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldQuote")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

