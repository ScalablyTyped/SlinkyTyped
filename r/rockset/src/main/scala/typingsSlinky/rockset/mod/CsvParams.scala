package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsvParams extends js.Object {
  // names of columns
  var columnNames: js.UndefOr[js.Array[String]] = js.native
  // names of columns
  var columnTypes: js.UndefOr[js.Array[String]] = js.native
  // can be one of: UTF-8, ISO_8859_1, UTF-16
  var encoding: js.UndefOr[String] = js.native
  // If the first line in every object specifies the column names
  var firstLineAsColumnNames: js.UndefOr[Boolean] = js.native
  // character within which a cell value is enclosed,null character if no such character, default is '"'
  var quoteChar: js.UndefOr[String] = js.native
  // a single character that is the column seperator
  var separator: js.UndefOr[String] = js.native
}

object CsvParams {
  @scala.inline
  def apply(): CsvParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvParams]
  }
  @scala.inline
  implicit class CsvParamsOps[Self <: CsvParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNames")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTypes")(js.undefined)
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
    def withFirstLineAsColumnNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineAsColumnNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstLineAsColumnNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineAsColumnNames")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteChar")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
  }
  
}

