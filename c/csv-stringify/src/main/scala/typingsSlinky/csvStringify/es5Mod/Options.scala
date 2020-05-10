package typingsSlinky.csvStringify.es5Mod

import typingsSlinky.csvStringify.AnonBoolean
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Key-value object which defines custom cast for certain data types
    */
  var cast: js.UndefOr[AnonBoolean] = js.native
  /**
    * List of fields, applied when `transform` returns an object
    * order matters
    * read the transformer documentation for additionnal information
    * columns are auto discovered in the first record when the user write objects
    * can refer to nested properties of the input JSON
    * see the "header" option on how to print columns names on the first line
    */
  var columns: js.UndefOr[(js.Array[ColumnOption | String]) | PlainObject[String]] = js.native
  /**
    * Set the field delimiter, one character only, defaults to a comma.
    */
  var delimiter: js.UndefOr[String | Buffer] = js.native
  /**
    * Add the value of "options.RecordDelimiter" on the last line, default to true.
    */
  var eof: js.UndefOr[Boolean] = js.native
  /**
    * Defaults to the escape read option.
    */
  var escape: js.UndefOr[String | Buffer] = js.native
  /**
    * Display the column names on the first line if the columns option is provided or discovered.
    */
  var header: js.UndefOr[Boolean] = js.native
  /**
    * The quote characters, defaults to the ", an empty quote value will preserve the original field.
    */
  var quote: js.UndefOr[String | Buffer | Boolean] = js.native
  /**
    * Boolean, default to false, quote all the non-empty fields even if not required.
    */
  var quoted: js.UndefOr[Boolean] = js.native
  /**
    * Boolean, no default, quote empty fields and overrides `quoted_string` on empty strings when defined.
    */
  var quoted_empty: js.UndefOr[Boolean] = js.native
  /**
    * String or RegExp, no default, quote all fields matching a regular expression.
    */
  var quoted_match: js.UndefOr[String | js.RegExp] = js.native
  /**
    * Boolean, default to false, quote all fields of type string even if not required.
    */
  var quoted_string: js.UndefOr[Boolean] = js.native
  /**
    * String used to delimit record rows or a special value
    * special values are 'auto', 'unix', 'mac', 'windows', 'ascii', 'unicode'
    * defaults to 'auto' (discovered in source or 'unix' if no source is specified).
    */
  var record_delimiter: js.UndefOr[RecordDelimiter] = js.native
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
    def withCast(value: AnonBoolean): Self = {
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
    def withColumns(value: (js.Array[ColumnOption | String]) | PlainObject[String]): Self = {
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
    def withEof(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eof")(js.undefined)
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
    def withHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote(value: String | Buffer | Boolean): Self = {
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
    def withQuoted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoted_empty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted_empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoted_empty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted_empty")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoted_matchRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted_match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuoted_match(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted_match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoted_match: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted_match")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoted_string(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted_string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoted_string: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted_string")(js.undefined)
        ret
    }
    @scala.inline
    def withRecord_delimiter(value: RecordDelimiter): Self = {
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
  }
  
}

