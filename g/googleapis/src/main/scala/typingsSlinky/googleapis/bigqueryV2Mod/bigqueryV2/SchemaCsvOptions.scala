package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCsvOptions extends StObject {
  
  /**
    * [Optional] Indicates if BigQuery should accept rows that are missing
    * trailing optional columns. If true, BigQuery treats missing trailing
    * columns as null values. If false, records with missing trailing columns
    * are treated as bad records, and if there are too many bad records, an
    * invalid error is returned in the job result. The default value is false.
    */
  var allowJaggedRows: js.UndefOr[Boolean] = js.native
  
  /**
    * [Optional] Indicates if BigQuery should allow quoted data sections that
    * contain newline characters in a CSV file. The default value is false.
    */
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.native
  
  /**
    * [Optional] The character encoding of the data. The supported values are
    * UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the
    * data after the raw, binary data has been split using the values of the
    * quote and fieldDelimiter properties.
    */
  var encoding: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The separator for fields in a CSV file. BigQuery converts the
    * string to ISO-8859-1 encoding, and then uses the first byte of the
    * encoded string to split the data in its raw, binary state. BigQuery also
    * supports the escape sequence &quot;\t&quot; to specify a tab separator.
    * The default value is a comma (&#39;,&#39;).
    */
  var fieldDelimiter: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The value that is used to quote data sections in a CSV file.
    * BigQuery converts the string to ISO-8859-1 encoding, and then uses the
    * first byte of the encoded string to split the data in its raw, binary
    * state. The default value is a double-quote (&#39;&quot;&#39;). If your
    * data does not contain quoted sections, set the property value to an empty
    * string. If your data contains quoted newline characters, you must also
    * set the allowQuotedNewlines property to true.
    */
  var quote: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The number of rows at the top of a CSV file that BigQuery will
    * skip when reading the data. The default value is 0. This property is
    * useful if you have header rows in the file that should be skipped.
    */
  var skipLeadingRows: js.UndefOr[String] = js.native
}
object SchemaCsvOptions {
  
  @scala.inline
  def apply(): SchemaCsvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCsvOptions]
  }
  
  @scala.inline
  implicit class SchemaCsvOptionsMutableBuilder[Self <: SchemaCsvOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowJaggedRows(value: Boolean): Self = StObject.set(x, "allowJaggedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowJaggedRowsUndefined: Self = StObject.set(x, "allowJaggedRows", js.undefined)
    
    @scala.inline
    def setAllowQuotedNewlines(value: Boolean): Self = StObject.set(x, "allowQuotedNewlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowQuotedNewlinesUndefined: Self = StObject.set(x, "allowQuotedNewlines", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFieldDelimiter(value: String): Self = StObject.set(x, "fieldDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDelimiterUndefined: Self = StObject.set(x, "fieldDelimiter", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    @scala.inline
    def setSkipLeadingRows(value: String): Self = StObject.set(x, "skipLeadingRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipLeadingRowsUndefined: Self = StObject.set(x, "skipLeadingRows", js.undefined)
  }
}
