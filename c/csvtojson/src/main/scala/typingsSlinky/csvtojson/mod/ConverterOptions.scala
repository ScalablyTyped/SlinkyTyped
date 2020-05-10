package typingsSlinky.csvtojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Converter options
  */
@js.native
trait ConverterOptions extends js.Object {
  /**
    * Whether or not to check if the column number of a row is the same as headers. If column number
    * mismatched headers number, an error of "mismatched_column" will be emitted. (default: false)
    */
  var checkColumn: js.UndefOr[Boolean] = js.native
  /**
    * This parameter turns on and off whether check field type. (default: true)
    */
  var checkType: js.UndefOr[Boolean] = js.native
  /**
    * Whether to construct final json object in memory which will be populated in "end_parsed"
    * event. Set to false if deal with huge csv data. default: true.
    */
  var constructResult: js.UndefOr[Boolean] = js.native
  /**
    * Delimiter used for seperating columns. Use "auto" if delimiter is unknown in advance,
    * in this case, delimiter will be auto-detected (by best attempt). Use an array to give
    * a list of potential delimiters e.g. [",","|","$"]. (default: ",")
    */
  var delimiter: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * End of line character. If omitted, parser will attempt retrieve it from first chunk of CSV data.
    * If no valid eol found, then operation system eol will be used.
    */
  var eol: js.UndefOr[String] = js.native
  /**
    * Escape character used in quoted column. Default is double quote (") according to RFC4108. Change
    * to back slash (\) or other chars for your own case. (default: " (double quote))
    */
  var escape: js.UndefOr[String] = js.native
  /**
    * Don't interpret dots (.) and square brackets in header fields as nested object or array identifiers
    * at all (treat them like regular characters for JSON field identifiers). (default: false)
    */
  var flatKeys: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated. Use workerNum instead.
    */
  var fork: js.UndefOr[Double] = js.native
  /**
    * An array to specify the headers of CSV data. If noheader is false, this value will override
    * CSV header row. Example: ["my field","name"] (default: null)
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
  /**
    * This parameter instructs the parser to ignore columns as specified by an array of column indexes.
    * Example: [1,3,5] will ignore columns 1, 3, and 5 and will not return them in the JSON output.
    */
  var ignoreColumns: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Ignore the empty value in CSV columns. If a column value is not giving, set this to true to
    * skip them. (default: false)
    */
  var ignoreEmpty: js.UndefOr[Boolean] = js.native
  /**
    * This parameter instructs the parser to include only those columns as specified by an array of
    * column indexes. Example: [0,2,3] will parse and include only columns 0, 2, and 3 in the JSON output.
    */
  var includeColumns: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The max character a CSV row could have. 0 means infinite. If max number exceeded, parser will emit
    * "error" of "row_exceed". if a possibly corrupted CSV data provided, give it a number like 65535
    * so the parser wont consume memory. (default: 0)
    */
  var maxRowLength: js.UndefOr[Double] = js.native
  /**
    * Indicating CSV data has no header row and first row is data row. (default: false)
    */
  var noheader: js.UndefOr[Boolean] = js.native
  /**
    * If a column contains delimiter, it is able to use quote character to surround the column
    * content. e.g. "hello, world" wont be split into two columns while parsing. Set to "off"
    * will ignore all quotes. (default: " (double quote))
    */
  var quote: js.UndefOr[String] = js.native
  /**
    * Stringify the stream output to JSON array. This is useful when pipe output to a file
    * which expects stringified JSON array. (default: false and only stringified JSON (without [])
    * will be pushed to downstream)
    */
  var toArrayString: js.UndefOr[Boolean] = js.native
  /**
    * Indicate if parser trim off spaces surrounding column content. e.g. " content " will be
    * trimmed to "content". (default: true)
    */
  var trim: js.UndefOr[Boolean] = js.native
  /**
    * Number of worker processes. The worker process will use multi-cores to help process CSV data.
    * Set to number of cores to improve the performance of processing large CSV file. Keep 1 for
    * small csv files. (default: 1)
    */
  var workerNum: js.UndefOr[Double] = js.native
}

object ConverterOptions {
  @scala.inline
  def apply(): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterOptions]
  }
  @scala.inline
  implicit class ConverterOptionsOps[Self <: ConverterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkType")(js.undefined)
        ret
    }
    @scala.inline
    def withConstructResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstructResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructResult")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String | js.Array[String]): Self = {
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
    def withEol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(js.undefined)
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
    def withFlatKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withFork(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fork")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[String]): Self = {
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
    def withIgnoreColumns(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreColumns")(js.undefined)
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
    def withIncludeColumns(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRowLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRowLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRowLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRowLength")(js.undefined)
        ret
    }
    @scala.inline
    def withNoheader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noheader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoheader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noheader")(js.undefined)
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
    def withToArrayString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArrayString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToArrayString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArrayString")(js.undefined)
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
    @scala.inline
    def withWorkerNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerNum")(js.undefined)
        ret
    }
  }
  
}

