package typingsSlinky.csvtojson

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.streamMod.Stream
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Factory function which creates an instance of a Converter object.
    * @param options       converter options
    * @param    streamOptions stream options
    * @return Converter object
    */
  @JSImport("csvtojson", JSImport.Namespace)
  @js.native
  def apply(): Converter = js.native
  @JSImport("csvtojson", JSImport.Namespace)
  @js.native
  def apply(options: js.UndefOr[scala.Nothing], streamOptions: StreamOptions): Converter = js.native
  @JSImport("csvtojson", JSImport.Namespace)
  @js.native
  def apply(options: ConverterOptions): Converter = js.native
  @JSImport("csvtojson", JSImport.Namespace)
  @js.native
  def apply(options: ConverterOptions, streamOptions: StreamOptions): Converter = js.native
  
  /**
    * Converts provided CSV input to  a JSON object.
    */
  @JSImport("csvtojson", "Converter")
  @js.native
  /**
    * Initializes a new instance of a Converter
    * @param options       converter options
    * @param    streamOptions stream options
    */
  class Converter () extends Transform {
    def this(options: ConverterOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], streamOptions: StreamOptions) = this()
    def this(options: ConverterOptions, streamOptions: StreamOptions) = this()
    
    /**
      * Reads in a CSV from a file.
      * @param filePath the path to the CSV file
      * @return returns this object for chaining
      */
    def fromFile(filePath: String): this.type = js.native
    /**
      * Reads in a CSV from a file.
      * @param             filePath the path to the CSV file
      * @param callback callback function to handle result or error
      */
    def fromFile(filePath: String, callback: ParseResultHandler): Unit = js.native
    
    /**
      * Reads in a CSV from a stream.
      * @param stream the stream
      * @return returns this object for chaining
      */
    def fromStream(stream: ReadableStream): this.type = js.native
    /**
      * Reads in a CSV from a stream.
      * @param             stream   the stream
      * @param callback callback function to handle result or error
      */
    def fromStream(stream: Stream, callback: ParseResultHandler): Unit = js.native
    
    /**
      * Reads in a CSV from a string.
      * @param str the string to convert
      * @return returns this object for chaining
      */
    def fromString(str: String): this.type = js.native
    /**
      * Reads in a CSV from a string.
      * @param             str      the string to convert
      * @param callback callback function to handle result or error
      */
    def fromString(str: String, callback: ParseResultHandler): Unit = js.native
    
    def on(
      event: String,
      listener: CsvEventHandler | DataEventHandler | DoneEventHandler | EndParsedEventHandler | ErrorEventHandler | JsonEventHandler
    ): this.type = js.native
    /**
      * Adds a listener function to the end of the listeners array for an event.
      * Available events:
      * - json
      * - csv
      * - data
      * - error
      * - record_parsed
      * - end
      * - end_parsed
      * - done
      * @param    event    name of event
      * @param  listener listener function
      * @return returns this object for chaining
      */
    // tslint:disable-next-line ban-types
    def on(event: String, listener: js.Function): this.type = js.native
    def on(event: String, listener: EndEventHandler): this.type = js.native
    def on(event: String, listener: RecordParsedEventHandler): this.type = js.native
    
    /**
      * The function is called each time a file line being found in csv stream.
      * @param  callback callback function
      * @return returns this object for chaining
      */
    def preFileLine(callback: js.Function2[/* line */ String, /* rowNumber */ Double, String]): this.type = js.native
    
    /**
      * The function in preRawData will be called directly with the string from upper stream.
      * @param  callback callback function
      * @return returns this object for chaining
      */
    def preRawData(
      callback: js.Function2[/* csvRawData */ String, /* cb */ js.Function1[/* newData */ js.Any, Unit], Unit]
    ): this.type = js.native
    
    /**
      * Transform objects after CSV parsing but before result being emitted or pushed downstream.
      * @param  callback transform function
      * @return returns this object for chaining
      */
    def transf(
      callback: js.Function3[/* jsonObj */ js.Any, /* csvRow */ js.Array[String], /* rowNumber */ Double, Unit]
    ): this.type = js.native
  }
  
  /**
    * Converter options
    */
  @js.native
  trait ConverterOptions extends StObject {
    
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
    implicit class ConverterOptionsMutableBuilder[Self <: ConverterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckColumn(value: Boolean): Self = StObject.set(x, "checkColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckColumnUndefined: Self = StObject.set(x, "checkColumn", js.undefined)
      
      @scala.inline
      def setCheckType(value: Boolean): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckTypeUndefined: Self = StObject.set(x, "checkType", js.undefined)
      
      @scala.inline
      def setConstructResult(value: Boolean): Self = StObject.set(x, "constructResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstructResultUndefined: Self = StObject.set(x, "constructResult", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String | js.Array[String]): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDelimiterVarargs(value: String*): Self = StObject.set(x, "delimiter", js.Array(value :_*))
      
      @scala.inline
      def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setFlatKeys(value: Boolean): Self = StObject.set(x, "flatKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatKeysUndefined: Self = StObject.set(x, "flatKeys", js.undefined)
      
      @scala.inline
      def setFork(value: Double): Self = StObject.set(x, "fork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForkUndefined: Self = StObject.set(x, "fork", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreColumns(value: js.Array[Double]): Self = StObject.set(x, "ignoreColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreColumnsUndefined: Self = StObject.set(x, "ignoreColumns", js.undefined)
      
      @scala.inline
      def setIgnoreColumnsVarargs(value: Double*): Self = StObject.set(x, "ignoreColumns", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreEmpty(value: Boolean): Self = StObject.set(x, "ignoreEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreEmptyUndefined: Self = StObject.set(x, "ignoreEmpty", js.undefined)
      
      @scala.inline
      def setIncludeColumns(value: js.Array[Double]): Self = StObject.set(x, "includeColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeColumnsUndefined: Self = StObject.set(x, "includeColumns", js.undefined)
      
      @scala.inline
      def setIncludeColumnsVarargs(value: Double*): Self = StObject.set(x, "includeColumns", js.Array(value :_*))
      
      @scala.inline
      def setMaxRowLength(value: Double): Self = StObject.set(x, "maxRowLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRowLengthUndefined: Self = StObject.set(x, "maxRowLength", js.undefined)
      
      @scala.inline
      def setNoheader(value: Boolean): Self = StObject.set(x, "noheader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoheaderUndefined: Self = StObject.set(x, "noheader", js.undefined)
      
      @scala.inline
      def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      @scala.inline
      def setToArrayString(value: Boolean): Self = StObject.set(x, "toArrayString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToArrayStringUndefined: Self = StObject.set(x, "toArrayString", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setWorkerNum(value: Double): Self = StObject.set(x, "workerNum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerNumUndefined: Self = StObject.set(x, "workerNum", js.undefined)
    }
  }
  
  /**
    * Event handler for "csv" events.
    */
  type CsvEventHandler = js.Function2[/* csvRow */ js.Array[String], /* rowNumber */ Double, Unit]
  
  /**
    * Event handler for "data" events.
    */
  type DataEventHandler = js.Function1[/* data */ js.Any, Unit]
  
  /**
    * Event handler for "done" events.
    */
  type DoneEventHandler = js.Function1[/* err */ js.Any, Unit]
  
  /**
    * Event handler for "end" events.
    */
  type EndEventHandler = js.Function0[Unit]
  
  /**
    * Event handler for "end_parsed" events.
    */
  type EndParsedEventHandler = js.Function1[/* jsonObjArray */ js.Array[js.Any], Unit]
  
  /**
    * Event handler for "error" events.
    */
  type ErrorEventHandler = js.Function1[/* err */ js.Any, Unit]
  
  /**
    * Event handler for "json" events.
    */
  type JsonEventHandler = js.Function2[/* jsonObj */ js.Any, /* rowNumber */ Double, Unit]
  
  /**
    * Callback function for handling result of parse.
    */
  type ParseResultHandler = js.Function2[/* err */ js.Any, /* result */ js.Any, Unit]
  
  /**
    * Event handler for "record_parsed" events.
    */
  type RecordParsedEventHandler = js.Function3[/* jsonObj */ js.Any, /* csvRoe */ js.Array[String], /* rowNumber */ Double, Unit]
  
  /**
    * Stream options
    */
  type StreamOptions = TransformOptions
}
