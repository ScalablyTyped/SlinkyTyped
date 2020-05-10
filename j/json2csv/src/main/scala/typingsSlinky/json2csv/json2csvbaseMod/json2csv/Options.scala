package typingsSlinky.json2csv.json2csvbaseMod.json2csv

import typingsSlinky.json2csv.baseMod.Json2CsvTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[T] extends js.Object {
  var defaultValue: js.UndefOr[String] = js.native
  var delimiter: js.UndefOr[String] = js.native
  var eol: js.UndefOr[String] = js.native
  var escapedQuote: js.UndefOr[String] = js.native
  var excelStrings: js.UndefOr[Boolean] = js.native
  var fields: js.UndefOr[js.Array[String | FieldInfo[T]]] = js.native
  var header: js.UndefOr[Boolean] = js.native
  var includeEmptyRows: js.UndefOr[Boolean] = js.native
  var ndjson: js.UndefOr[Boolean] = js.native
  var quote: js.UndefOr[String] = js.native
  var transforms: js.UndefOr[js.Array[Json2CsvTransform[_, _]]] = js.native
  var withBOM: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply[T](): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[T]]
  }
  @scala.inline
  implicit class OptionsOps[Self[t] <: Options[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDefaultValue(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withEol(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEol: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapedQuote(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapedQuote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapedQuote: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapedQuote")(js.undefined)
        ret
    }
    @scala.inline
    def withExcelStrings(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcelStrings: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelStrings")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String | FieldInfo[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeEmptyRows(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmptyRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeEmptyRows: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmptyRows")(js.undefined)
        ret
    }
    @scala.inline
    def withNdjson(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ndjson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNdjson: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ndjson")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(js.undefined)
        ret
    }
    @scala.inline
    def withTransforms(value: js.Array[Json2CsvTransform[_, _]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransforms: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(js.undefined)
        ret
    }
    @scala.inline
    def withWithBOM(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withBOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithBOM: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withBOM")(js.undefined)
        ret
    }
  }
  
}

