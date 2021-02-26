package typingsSlinky.csvParse

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es5Mod {
  
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(): Parser = js.native
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(callback: Callback): Parser = js.native
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(input: String): Parser = js.native
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(input: String, callback: Callback): Parser = js.native
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(input: String, options: js.UndefOr[scala.Nothing], callback: Callback): Parser = js.native
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options): Parser = js.native
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options, callback: Callback): Parser = js.native
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(input: Buffer): Parser = js.native
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, callback: Callback): Parser = js.native
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, options: js.UndefOr[scala.Nothing], callback: Callback): Parser = js.native
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, options: Options): Parser = js.native
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, options: Options, callback: Callback): Parser = js.native
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(options: js.UndefOr[scala.Nothing], callback: Callback): Parser = js.native
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(options: Options): Parser = js.native
  @JSImport("csv-parse/lib/es5", JSImport.Namespace)
  @js.native
  def apply(options: Options, callback: Callback): Parser = js.native
  
  @JSImport("csv-parse/lib/es5", "CsvError")
  @js.native
  class CsvError protected ()
    extends Error
       with /* key */ StringDictionary[js.Any] {
    def this(code: CsvErrorCode, message: String, options: js.UndefOr[scala.Nothing], contexts: js.Any*) = this()
    def this(code: CsvErrorCode, message: String, options: Options, contexts: js.Any*) = this()
    def this(
      code: CsvErrorCode,
      message: js.Array[String],
      options: js.UndefOr[scala.Nothing],
      contexts: js.Any*
    ) = this()
    def this(code: CsvErrorCode, message: js.Array[String], options: Options, contexts: js.Any*) = this()
    
    val code: CsvErrorCode = js.native
  }
  
  @JSImport("csv-parse/lib/es5", "Parser")
  @js.native
  class Parser protected () extends Transform {
    def this(options: Options) = this()
    
    def __push(line: js.Any): js.Any = js.native
    
    def __write(chars: js.Any, end: js.Any, callback: js.Any): js.Any = js.native
    
    val info: Info = js.native
    
    val options: Options = js.native
  }
  
  type Callback = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* records */ js.UndefOr[js.Any], 
    /* info */ Info, 
    Unit
  ]
  
  @js.native
  trait CastingContext extends StObject {
    
    val column: Double | String = js.native
    
    val empty_lines: Double = js.native
    
    val error: CsvError = js.native
    
    val header: Boolean = js.native
    
    val index: Double = js.native
    
    val invalid_field_length: Double = js.native
    
    val lines: Double = js.native
    
    val quoting: Boolean = js.native
    
    val records: Double = js.native
  }
  object CastingContext {
    
    @scala.inline
    def apply(
      column: Double | String,
      empty_lines: Double,
      error: CsvError,
      header: Boolean,
      index: Double,
      invalid_field_length: Double,
      lines: Double,
      quoting: Boolean,
      records: Double
    ): CastingContext = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], empty_lines = empty_lines.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], invalid_field_length = invalid_field_length.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], quoting = quoting.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[CastingContext]
    }
    
    @scala.inline
    implicit class CastingContextMutableBuilder[Self <: CastingContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double | String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmpty_lines(value: Double): Self = StObject.set(x, "empty_lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: CsvError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalid_field_length(value: Double): Self = StObject.set(x, "invalid_field_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoting(value: Boolean): Self = StObject.set(x, "quoting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecords(value: Double): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    }
  }
  
  type CastingDateFunction = js.Function2[/* value */ String, /* context */ CastingContext, js.Date]
  
  type CastingFunction = js.Function2[/* value */ String, /* context */ CastingContext, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typingsSlinky.csvParse.csvParseBooleans.`false`
    - typingsSlinky.csvParse.anon.Name
  */
  type ColumnOption = js.UndefOr[_ColumnOption | String | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_BOM
    - typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_CAST
    - typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_CAST_DATE
    - typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_COLUMNS
    - typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_COLUMNS_DUPLICATES_TO_ARRAY
    - typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_COMMENT
    - typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_DELIMITER
    - typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_ON_RECORD
    - typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_CLOSING_QUOTE
    - typingsSlinky.csvParse.csvParseStrings.INVALID_OPENING_QUOTE
    - typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_COLUMN_MAPPING
    - typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_ARGUMENT
    - typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_COLUMN_DEFINITION
    - typingsSlinky.csvParse.csvParseStrings.CSV_MAX_RECORD_SIZE
    - typingsSlinky.csvParse.csvParseStrings.CSV_NON_TRIMABLE_CHAR_AFTER_CLOSING_QUOTE
    - typingsSlinky.csvParse.csvParseStrings.CSV_QUOTE_NOT_CLOSED
    - typingsSlinky.csvParse.csvParseStrings.CSV_INCONSISTENT_RECORD_LENGTH
    - typingsSlinky.csvParse.csvParseStrings.CSV_RECORD_DONT_MATCH_COLUMNS_LENGTH
    - typingsSlinky.csvParse.csvParseStrings.CSV_OPTION_COLUMNS_MISSING_NAME
  */
  trait CsvErrorCode extends StObject
  object CsvErrorCode {
    
    @scala.inline
    def CSV_INCONSISTENT_RECORD_LENGTH: typingsSlinky.csvParse.csvParseStrings.CSV_INCONSISTENT_RECORD_LENGTH = "CSV_INCONSISTENT_RECORD_LENGTH".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_INCONSISTENT_RECORD_LENGTH]
    
    @scala.inline
    def CSV_INVALID_ARGUMENT: typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_ARGUMENT = "CSV_INVALID_ARGUMENT".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_ARGUMENT]
    
    @scala.inline
    def CSV_INVALID_CLOSING_QUOTE: typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_CLOSING_QUOTE = "CSV_INVALID_CLOSING_QUOTE".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_CLOSING_QUOTE]
    
    @scala.inline
    def CSV_INVALID_COLUMN_DEFINITION: typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_COLUMN_DEFINITION = "CSV_INVALID_COLUMN_DEFINITION".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_COLUMN_DEFINITION]
    
    @scala.inline
    def CSV_INVALID_COLUMN_MAPPING: typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_COLUMN_MAPPING = "CSV_INVALID_COLUMN_MAPPING".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_COLUMN_MAPPING]
    
    @scala.inline
    def CSV_INVALID_OPTION_BOM: typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_BOM = "CSV_INVALID_OPTION_BOM".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_BOM]
    
    @scala.inline
    def CSV_INVALID_OPTION_CAST: typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_CAST = "CSV_INVALID_OPTION_CAST".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_CAST]
    
    @scala.inline
    def CSV_INVALID_OPTION_CAST_DATE: typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_CAST_DATE = "CSV_INVALID_OPTION_CAST_DATE".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_CAST_DATE]
    
    @scala.inline
    def CSV_INVALID_OPTION_COLUMNS: typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_COLUMNS = "CSV_INVALID_OPTION_COLUMNS".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_COLUMNS]
    
    @scala.inline
    def CSV_INVALID_OPTION_COLUMNS_DUPLICATES_TO_ARRAY: typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_COLUMNS_DUPLICATES_TO_ARRAY = "CSV_INVALID_OPTION_COLUMNS_DUPLICATES_TO_ARRAY".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_COLUMNS_DUPLICATES_TO_ARRAY]
    
    @scala.inline
    def CSV_INVALID_OPTION_COMMENT: typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_COMMENT = "CSV_INVALID_OPTION_COMMENT".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_COMMENT]
    
    @scala.inline
    def CSV_INVALID_OPTION_DELIMITER: typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_DELIMITER = "CSV_INVALID_OPTION_DELIMITER".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_DELIMITER]
    
    @scala.inline
    def CSV_INVALID_OPTION_ON_RECORD: typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_ON_RECORD = "CSV_INVALID_OPTION_ON_RECORD".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_INVALID_OPTION_ON_RECORD]
    
    @scala.inline
    def CSV_MAX_RECORD_SIZE: typingsSlinky.csvParse.csvParseStrings.CSV_MAX_RECORD_SIZE = "CSV_MAX_RECORD_SIZE".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_MAX_RECORD_SIZE]
    
    @scala.inline
    def CSV_NON_TRIMABLE_CHAR_AFTER_CLOSING_QUOTE: typingsSlinky.csvParse.csvParseStrings.CSV_NON_TRIMABLE_CHAR_AFTER_CLOSING_QUOTE = "CSV_NON_TRIMABLE_CHAR_AFTER_CLOSING_QUOTE".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_NON_TRIMABLE_CHAR_AFTER_CLOSING_QUOTE]
    
    @scala.inline
    def CSV_OPTION_COLUMNS_MISSING_NAME: typingsSlinky.csvParse.csvParseStrings.CSV_OPTION_COLUMNS_MISSING_NAME = "CSV_OPTION_COLUMNS_MISSING_NAME".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_OPTION_COLUMNS_MISSING_NAME]
    
    @scala.inline
    def CSV_QUOTE_NOT_CLOSED: typingsSlinky.csvParse.csvParseStrings.CSV_QUOTE_NOT_CLOSED = "CSV_QUOTE_NOT_CLOSED".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_QUOTE_NOT_CLOSED]
    
    @scala.inline
    def CSV_RECORD_DONT_MATCH_COLUMNS_LENGTH: typingsSlinky.csvParse.csvParseStrings.CSV_RECORD_DONT_MATCH_COLUMNS_LENGTH = "CSV_RECORD_DONT_MATCH_COLUMNS_LENGTH".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.CSV_RECORD_DONT_MATCH_COLUMNS_LENGTH]
    
    @scala.inline
    def INVALID_OPENING_QUOTE: typingsSlinky.csvParse.csvParseStrings.INVALID_OPENING_QUOTE = "INVALID_OPENING_QUOTE".asInstanceOf[typingsSlinky.csvParse.csvParseStrings.INVALID_OPENING_QUOTE]
  }
  
  @js.native
  trait Info extends StObject {
    
    /**
      * Count the number of lines being fully commented.
      */
    val comment_lines: Double = js.native
    
    /**
      * Count the number of processed empty lines.
      */
    val empty_lines: Double = js.native
    
    /**
      * Number of non uniform records when `relax_column_count` is true.
      */
    val invalid_field_length: Double = js.native
    
    /**
      * The number of lines encountered in the source dataset, start at 1 for the first line.
      */
    val lines: Double = js.native
    
    /**
      * Count the number of processed records.
      */
    val records: Double = js.native
  }
  object Info {
    
    @scala.inline
    def apply(
      comment_lines: Double,
      empty_lines: Double,
      invalid_field_length: Double,
      lines: Double,
      records: Double
    ): Info = {
      val __obj = js.Dynamic.literal(comment_lines = comment_lines.asInstanceOf[js.Any], empty_lines = empty_lines.asInstanceOf[js.Any], invalid_field_length = invalid_field_length.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment_lines(value: Double): Self = StObject.set(x, "comment_lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmpty_lines(value: Double): Self = StObject.set(x, "empty_lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalid_field_length(value: Double): Self = StObject.set(x, "invalid_field_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecords(value: Double): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var autoParse: js.UndefOr[Boolean | CastingFunction] = js.native
    
    var autoParseDate: js.UndefOr[Boolean | CastingDateFunction] = js.native
    
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
    
    var castDate: js.UndefOr[Boolean | CastingDateFunction] = js.native
    
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
    
    var columnsDuplicatesToArray: js.UndefOr[Boolean] = js.native
    
    /**
      * Convert values into an array of values when columns are activated and
      * when multiple columns of the same name are found.
      */
    var columns_duplicates_to_array: js.UndefOr[Boolean] = js.native
    
    /**
      * Treat all the characters after this one as a comment, default to '' (disabled).
      */
    var comment: js.UndefOr[String] = js.native
    
    /**
      * Set the field delimiter. One character only, defaults to comma.
      */
    var delimiter: js.UndefOr[String | js.Array[String] | Buffer] = js.native
    
    /**
      * Set the source and destination encoding, a value of `null` returns buffer instead of strings.
      */
    var encoding: js.UndefOr[String | Null] = js.native
    
    /**
      * Set the escape character, one character only, defaults to double quotes.
      */
    var escape: js.UndefOr[String | Buffer] = js.native
    
    /**
      * Start handling records from the requested number of records.
      */
    var from: js.UndefOr[Double] = js.native
    
    var fromLine: js.UndefOr[Double] = js.native
    
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
    
    var maxRecordSize: js.UndefOr[Double] = js.native
    
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
    
    var onRecord: js.UndefOr[js.Function2[/* record */ js.Any, /* context */ CastingContext, _]] = js.native
    
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
    
    var recordDelimiter: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.native
    
    /**
      * One or multiple characters used to delimit record rows; defaults to auto discovery if not provided.
      * Supported auto discovery method are Linux ("\n"), Apple ("\r") and Windows ("\r\n") row delimiters.
      */
    var record_delimiter: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.native
    
    /**
      * Preserve quotes inside unquoted field.
      */
    var relax: js.UndefOr[Boolean] = js.native
    
    var relaxColumnCount: js.UndefOr[Boolean] = js.native
    
    var relaxColumnCountLess: js.UndefOr[Boolean] = js.native
    
    var relaxColumnCountMore: js.UndefOr[Boolean] = js.native
    
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
    
    var skipEmptyLines: js.UndefOr[Boolean] = js.native
    
    var skipLinesWithEmptyValues: js.UndefOr[Boolean] = js.native
    
    var skipLinesWithError: js.UndefOr[Boolean] = js.native
    
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
    
    var toLine: js.UndefOr[Double] = js.native
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoParse(value: Boolean | CastingFunction): Self = StObject.set(x, "autoParse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoParseDate(value: Boolean | CastingDateFunction): Self = StObject.set(x, "autoParseDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoParseDateFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Date): Self = StObject.set(x, "autoParseDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAutoParseDateUndefined: Self = StObject.set(x, "autoParseDate", js.undefined)
      
      @scala.inline
      def setAutoParseFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Any): Self = StObject.set(x, "autoParse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAutoParseUndefined: Self = StObject.set(x, "autoParse", js.undefined)
      
      @scala.inline
      def setAuto_parse(value: Boolean | CastingFunction): Self = StObject.set(x, "auto_parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuto_parseFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Any): Self = StObject.set(x, "auto_parse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAuto_parseUndefined: Self = StObject.set(x, "auto_parse", js.undefined)
      
      @scala.inline
      def setAuto_parse_date(value: Boolean | CastingDateFunction): Self = StObject.set(x, "auto_parse_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuto_parse_dateFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Date): Self = StObject.set(x, "auto_parse_date", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAuto_parse_dateUndefined: Self = StObject.set(x, "auto_parse_date", js.undefined)
      
      @scala.inline
      def setBom(value: Boolean): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      @scala.inline
      def setCast(value: Boolean | CastingFunction): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCastDate(value: Boolean | CastingDateFunction): Self = StObject.set(x, "castDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCastDateFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Date): Self = StObject.set(x, "castDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCastDateUndefined: Self = StObject.set(x, "castDate", js.undefined)
      
      @scala.inline
      def setCastFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Any): Self = StObject.set(x, "cast", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
      
      @scala.inline
      def setCast_date(value: Boolean | CastingDateFunction): Self = StObject.set(x, "cast_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCast_dateFunction2(value: (/* value */ String, /* context */ CastingContext) => js.Date): Self = StObject.set(x, "cast_date", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCast_dateUndefined: Self = StObject.set(x, "cast_date", js.undefined)
      
      @scala.inline
      def setColumns(
        value: js.Array[ColumnOption] | Boolean | (js.Function1[/* record */ js.Any, js.Array[ColumnOption]])
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsDuplicatesToArray(value: Boolean): Self = StObject.set(x, "columnsDuplicatesToArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsDuplicatesToArrayUndefined: Self = StObject.set(x, "columnsDuplicatesToArray", js.undefined)
      
      @scala.inline
      def setColumnsFunction1(value: /* record */ js.Any => js.Array[ColumnOption]): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: ColumnOption*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setColumns_duplicates_to_array(value: Boolean): Self = StObject.set(x, "columns_duplicates_to_array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumns_duplicates_to_arrayUndefined: Self = StObject.set(x, "columns_duplicates_to_array", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String | js.Array[String] | Buffer): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDelimiterVarargs(value: String*): Self = StObject.set(x, "delimiter", js.Array(value :_*))
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEscape(value: String | Buffer): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromLine(value: Double): Self = StObject.set(x, "fromLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromLineUndefined: Self = StObject.set(x, "fromLine", js.undefined)
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setFrom_line(value: Double): Self = StObject.set(x, "from_line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom_lineUndefined: Self = StObject.set(x, "from_line", js.undefined)
      
      @scala.inline
      def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setLtrim(value: Boolean): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
      
      @scala.inline
      def setMaxRecordSize(value: Double): Self = StObject.set(x, "maxRecordSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRecordSizeUndefined: Self = StObject.set(x, "maxRecordSize", js.undefined)
      
      @scala.inline
      def setMax_record_size(value: Double): Self = StObject.set(x, "max_record_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_record_sizeUndefined: Self = StObject.set(x, "max_record_size", js.undefined)
      
      @scala.inline
      def setObjname(value: String): Self = StObject.set(x, "objname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjnameUndefined: Self = StObject.set(x, "objname", js.undefined)
      
      @scala.inline
      def setOnRecord(value: (/* record */ js.Any, /* context */ CastingContext) => _): Self = StObject.set(x, "onRecord", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRecordUndefined: Self = StObject.set(x, "onRecord", js.undefined)
      
      @scala.inline
      def setOn_record(value: (/* record */ js.Any, /* context */ CastingContext) => _): Self = StObject.set(x, "on_record", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn_recordUndefined: Self = StObject.set(x, "on_record", js.undefined)
      
      @scala.inline
      def setQuote(value: String | Boolean | Buffer): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteNull: Self = StObject.set(x, "quote", null)
      
      @scala.inline
      def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setRecordDelimiter(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "recordDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordDelimiterUndefined: Self = StObject.set(x, "recordDelimiter", js.undefined)
      
      @scala.inline
      def setRecordDelimiterVarargs(value: (Buffer | String)*): Self = StObject.set(x, "recordDelimiter", js.Array(value :_*))
      
      @scala.inline
      def setRecord_delimiter(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "record_delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecord_delimiterUndefined: Self = StObject.set(x, "record_delimiter", js.undefined)
      
      @scala.inline
      def setRecord_delimiterVarargs(value: (Buffer | String)*): Self = StObject.set(x, "record_delimiter", js.Array(value :_*))
      
      @scala.inline
      def setRelax(value: Boolean): Self = StObject.set(x, "relax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelaxColumnCount(value: Boolean): Self = StObject.set(x, "relaxColumnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelaxColumnCountLess(value: Boolean): Self = StObject.set(x, "relaxColumnCountLess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelaxColumnCountLessUndefined: Self = StObject.set(x, "relaxColumnCountLess", js.undefined)
      
      @scala.inline
      def setRelaxColumnCountMore(value: Boolean): Self = StObject.set(x, "relaxColumnCountMore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelaxColumnCountMoreUndefined: Self = StObject.set(x, "relaxColumnCountMore", js.undefined)
      
      @scala.inline
      def setRelaxColumnCountUndefined: Self = StObject.set(x, "relaxColumnCount", js.undefined)
      
      @scala.inline
      def setRelaxUndefined: Self = StObject.set(x, "relax", js.undefined)
      
      @scala.inline
      def setRelax_column_count(value: Boolean): Self = StObject.set(x, "relax_column_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelax_column_countUndefined: Self = StObject.set(x, "relax_column_count", js.undefined)
      
      @scala.inline
      def setRelax_column_count_less(value: Boolean): Self = StObject.set(x, "relax_column_count_less", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelax_column_count_lessUndefined: Self = StObject.set(x, "relax_column_count_less", js.undefined)
      
      @scala.inline
      def setRelax_column_count_more(value: Boolean): Self = StObject.set(x, "relax_column_count_more", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelax_column_count_moreUndefined: Self = StObject.set(x, "relax_column_count_more", js.undefined)
      
      @scala.inline
      def setRtrim(value: Boolean): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
      
      @scala.inline
      def setSkipEmptyLines(value: Boolean): Self = StObject.set(x, "skipEmptyLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipEmptyLinesUndefined: Self = StObject.set(x, "skipEmptyLines", js.undefined)
      
      @scala.inline
      def setSkipLinesWithEmptyValues(value: Boolean): Self = StObject.set(x, "skipLinesWithEmptyValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipLinesWithEmptyValuesUndefined: Self = StObject.set(x, "skipLinesWithEmptyValues", js.undefined)
      
      @scala.inline
      def setSkipLinesWithError(value: Boolean): Self = StObject.set(x, "skipLinesWithError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipLinesWithErrorUndefined: Self = StObject.set(x, "skipLinesWithError", js.undefined)
      
      @scala.inline
      def setSkip_empty_lines(value: Boolean): Self = StObject.set(x, "skip_empty_lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip_empty_linesUndefined: Self = StObject.set(x, "skip_empty_lines", js.undefined)
      
      @scala.inline
      def setSkip_lines_with_empty_values(value: Boolean): Self = StObject.set(x, "skip_lines_with_empty_values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip_lines_with_empty_valuesUndefined: Self = StObject.set(x, "skip_lines_with_empty_values", js.undefined)
      
      @scala.inline
      def setSkip_lines_with_error(value: Boolean): Self = StObject.set(x, "skip_lines_with_error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip_lines_with_errorUndefined: Self = StObject.set(x, "skip_lines_with_error", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToLine(value: Double): Self = StObject.set(x, "toLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToLineUndefined: Self = StObject.set(x, "toLine", js.undefined)
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setTo_line(value: Double): Self = StObject.set(x, "to_line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo_lineUndefined: Self = StObject.set(x, "to_line", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  trait _ColumnOption extends StObject
}
