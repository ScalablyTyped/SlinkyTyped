package typingsSlinky.jupyterlabCsvviewer.parseMod.IParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for a parser.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * Whether to return column offsets in the offsets array.
    *
    * #### Notes
    * If false, the returned offsets array contains just the row offsets. If
    * true, the returned offsets array contains all column offsets for each
    * column in the rows (i.e., it has nrows*ncols entries). Individual rows
    * will have empty columns added or extra columns merged into the last
    * column if they do not have exactly ncols columns.
    */
  var columnOffsets: Boolean = js.native
  /**
    * The data to parse.
    */
  var data: String = js.native
  /**
    * The delimiter to use. Defaults to ','.
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * Maximum number of rows to parse.
    *
    * If this is not given, parsing proceeds to the end of the data.
    */
  var maxRows: js.UndefOr[Double] = js.native
  /**
    * Number of columns in each row to parse.
    *
    * #### Notes
    * If this is not given, the ncols defaults to the number of columns in the
    * first row.
    */
  var ncols: js.UndefOr[Double] = js.native
  /**
    * The quote character for quoting fields. Defaults to the double quote (").
    *
    * #### Notes
    * As specified in [RFC 4180](https://tools.ietf.org/html/rfc4180), quotes
    * are escaped in a quoted field by doubling them (for example, "a""b" is the field
    * a"b).
    */
  var quote: js.UndefOr[String] = js.native
  /**
    * The row delimiter to use. Defaults to '\r\n'.
    */
  var rowDelimiter: js.UndefOr[String] = js.native
  /**
    * The starting index in the string for processing. Defaults to 0. This
    * index should be the first character of a new row. This must be less than
    * data.length.
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object IOptions {
  @scala.inline
  def apply(columnOffsets: Boolean, data: String): IOptions = {
    val __obj = js.Dynamic.literal(columnOffsets = columnOffsets.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnOffsets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnOffsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
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
    def withNcols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ncols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNcols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ncols")(js.undefined)
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
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
  }
  
}

