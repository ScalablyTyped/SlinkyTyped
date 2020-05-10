package typingsSlinky.csvParse.es5Mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If true, the parser will attempt to convert read data types to native types.
    * @deprecated Use {@link cast}
    */
  var auto_parse: js.UndefOr[Boolean | CastingFunction] = js.native
  /**
    * If true, the parser will attempt to convert read data types to dates. It requires the "auto_parse" option.
    * @deprecated Use {@link cast_date}
    */
  var auto_parse_date: js.UndefOr[Boolean | CastingDateFunction] = js.native
  /**
    * If true, detect and exclude the byte order mark (BOM) from the CSV input if present.
    */
  var bom: js.UndefOr[Boolean] = js.native
  /**
    * If true, the parser will attempt to convert input string to native types.
    * If a function, receive the value as first argument, a context as second argument and return a new value. More information about the context properties is available below.
    */
  var cast: js.UndefOr[Boolean | CastingFunction] = js.native
  /**
    * If true, the parser will attempt to convert input string to dates.
    * If a function, receive the value as argument and return a new value. It requires the "auto_parse" option. Be careful, it relies on Date.parse.
    */
  var cast_date: js.UndefOr[Boolean | CastingDateFunction] = js.native
  /**
    * List of fields as an array,
    * a user defined callback accepting the first line and returning the column names or true if autodiscovered in the first CSV line,
    * default to null,
    * affect the result data set in the sense that records will be objects instead of arrays.
    */
  var columns: js.UndefOr[
    js.Array[ColumnOption] | Boolean | (js.Function1[/* record */ js.Any, js.Array[ColumnOption]])
  ] = js.native
  /**
    * Treat all the characters after this one as a comment, default to '' (disabled).
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * Set the field delimiter. One character only, defaults to comma.
    */
  var delimiter: js.UndefOr[String | Buffer] = js.native
  /**
    * Set the escape character, one character only, defaults to double quotes.
    */
  var escape: js.UndefOr[String | Buffer] = js.native
  /**
    * Start handling records from the requested number of records.
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * Start handling records from the requested line number.
    */
  var from_line: js.UndefOr[Double] = js.native
  /**
    * Generate two properties `info` and `record` where `info` is a snapshot of the info object at the time the record was created and `record` is the parsed array or object.
    */
  var info: js.UndefOr[Boolean] = js.native
  /**
    * If true, ignore whitespace immediately following the delimiter (i.e. left-trim all fields), defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var ltrim: js.UndefOr[Boolean] = js.native
  /**
    * Maximum numer of characters to be contained in the field and line buffers before an exception is raised,
    * used to guard against a wrong delimiter or record_delimiter,
    * default to 128000 characters.
    */
  var max_record_size: js.UndefOr[Double] = js.native
  /**
    * Name of header-record title to name objects by.
    */
  var objname: js.UndefOr[String] = js.native
  /**
    * Alter and filter records by executing a user defined function.
    */
  var on_record: js.UndefOr[js.Function2[/* record */ js.Any, /* context */ CastingContext, _]] = js.native
  /**
    * Optional character surrounding a field, one character only, defaults to double quotes.
    */
  var quote: js.UndefOr[String | Boolean | Buffer | Null] = js.native
  /**
    * Generate two properties raw and row where raw is the original CSV row content and row is the parsed array or object.
    */
  var raw: js.UndefOr[Boolean] = js.native
  /**
    * One or multiple characters used to delimit record rows; defaults to auto discovery if not provided.
    * Supported auto discovery method are Linux ("\n"), Apple ("\r") and Windows ("\r\n") row delimiters.
    */
  var record_delimiter: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.native
  /**
    * Preserve quotes inside unquoted field.
    */
  var relax: js.UndefOr[Boolean] = js.native
  /**
    * Discard inconsistent columns count, default to false.
    */
  var relax_column_count: js.UndefOr[Boolean] = js.native
  /**
    * Discard inconsistent columns count when the record contains less fields than expected, default to false.
    */
  var relax_column_count_less: js.UndefOr[Boolean] = js.native
  /**
    * Discard inconsistent columns count when the record contains more fields than expected, default to false.
    */
  var relax_column_count_more: js.UndefOr[Boolean] = js.native
  /**
    * If true, ignore whitespace immediately preceding the delimiter (i.e. right-trim all fields), defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var rtrim: js.UndefOr[Boolean] = js.native
  /**
    * Dont generate empty values for empty lines.
    * Defaults to false
    */
  var skip_empty_lines: js.UndefOr[Boolean] = js.native
  /**
    * Don't generate records for lines containing empty column values (column matching /\s*\/), defaults to false.
    */
  var skip_lines_with_empty_values: js.UndefOr[Boolean] = js.native
  /**
    * Skip a line with error found inside and directly go process the next line.
    */
  var skip_lines_with_error: js.UndefOr[Boolean] = js.native
  /**
    * Stop handling records after the requested number of records.
    */
  var to: js.UndefOr[Double] = js.native
  /**
    * Stop handling records after the requested line number.
    */
  var to_line: js.UndefOr[Double] = js.native
  /**
    * If true, ignore whitespace immediately around the delimiter, defaults to false.
    * Does not remove whitespace in a quoted field.
    */
  var trim: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto_parseFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_parse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAuto_parse(value: Boolean | CastingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto_parse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_parse")(js.undefined)
        ret
    }
    @scala.inline
    def withAuto_parse_dateFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_parse_date")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAuto_parse_date(value: Boolean | CastingDateFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_parse_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto_parse_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_parse_date")(js.undefined)
        ret
    }
    @scala.inline
    def withBom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bom")(js.undefined)
        ret
    }
    @scala.inline
    def withCastFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCast(value: Boolean | CastingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(js.undefined)
        ret
    }
    @scala.inline
    def withCast_dateFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast_date")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCast_date(value: Boolean | CastingDateFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCast_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast_date")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnsFunction1(value: /* record */ js.Any => js.Array[ColumnOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColumns(
      value: js.Array[ColumnOption] | Boolean | (js.Function1[/* record */ js.Any, js.Array[ColumnOption]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
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
    def withDelimiter(value: String | Buffer): Self = {
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
    def withEscape(value: String | Buffer): Self = {
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
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom_line(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom_line: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_line")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
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
    def withMax_record_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_record_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_record_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_record_size")(js.undefined)
        ret
    }
    @scala.inline
    def withObjname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objname")(js.undefined)
        ret
    }
    @scala.inline
    def withOn_record(value: (/* record */ js.Any, /* context */ CastingContext) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_record")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOn_record: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_record")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote(value: String | Boolean | Buffer): Self = {
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
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withRecord_delimiter(value: String | (js.Array[Buffer | String]) | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record_delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecord_delimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record_delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withRelax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relax")(js.undefined)
        ret
    }
    @scala.inline
    def withRelax_column_count(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relax_column_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelax_column_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relax_column_count")(js.undefined)
        ret
    }
    @scala.inline
    def withRelax_column_count_less(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relax_column_count_less")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelax_column_count_less: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relax_column_count_less")(js.undefined)
        ret
    }
    @scala.inline
    def withRelax_column_count_more(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relax_column_count_more")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelax_column_count_more: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relax_column_count_more")(js.undefined)
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
    def withSkip_empty_lines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_empty_lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip_empty_lines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_empty_lines")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip_lines_with_empty_values(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_lines_with_empty_values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip_lines_with_empty_values: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_lines_with_empty_values")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip_lines_with_error(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_lines_with_error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip_lines_with_error: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_lines_with_error")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withTo_line(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo_line: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_line")(js.undefined)
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

