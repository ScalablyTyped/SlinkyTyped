package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.IGNORE
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.NONE
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.USE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCsvinputMod {
  
  @js.native
  trait CSVInput extends StObject {
    
    /**
      * <p>A single character used to indicate that a row should be ignored when the character is present at the start of that row.</p>
      */
    var Comments: js.UndefOr[String] = js.native
    
    /**
      * <p>A value used to separate individual fields from each other within a record.</p>
      */
    var FieldDelimiter: js.UndefOr[String] = js.native
    
    /**
      * <p>Describes the first line of input. Valid values are <code>None</code>, <code>Ignore</code>, and <code>Use</code>.</p>
      */
    var FileHeaderInfo: js.UndefOr[USE | IGNORE | NONE | String] = js.native
    
    /**
      * <p>A value used as an escape character where the field delimiter is part of the value.</p>
      */
    var QuoteCharacter: js.UndefOr[String] = js.native
    
    /**
      * <p>A single character used for escaping the quotation-mark character inside an already escaped value.</p>
      */
    var QuoteEscapeCharacter: js.UndefOr[String] = js.native
    
    /**
      * <p>A value used to separate individual records from each other.</p>
      */
    var RecordDelimiter: js.UndefOr[String] = js.native
  }
  object CSVInput {
    
    @scala.inline
    def apply(): CSVInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSVInput]
    }
    
    @scala.inline
    implicit class CSVInputMutableBuilder[Self <: CSVInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: String): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "Comments", js.undefined)
      
      @scala.inline
      def setFieldDelimiter(value: String): Self = StObject.set(x, "FieldDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldDelimiterUndefined: Self = StObject.set(x, "FieldDelimiter", js.undefined)
      
      @scala.inline
      def setFileHeaderInfo(value: USE | IGNORE | NONE | String): Self = StObject.set(x, "FileHeaderInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileHeaderInfoUndefined: Self = StObject.set(x, "FileHeaderInfo", js.undefined)
      
      @scala.inline
      def setQuoteCharacter(value: String): Self = StObject.set(x, "QuoteCharacter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteCharacterUndefined: Self = StObject.set(x, "QuoteCharacter", js.undefined)
      
      @scala.inline
      def setQuoteEscapeCharacter(value: String): Self = StObject.set(x, "QuoteEscapeCharacter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteEscapeCharacterUndefined: Self = StObject.set(x, "QuoteEscapeCharacter", js.undefined)
      
      @scala.inline
      def setRecordDelimiter(value: String): Self = StObject.set(x, "RecordDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordDelimiterUndefined: Self = StObject.set(x, "RecordDelimiter", js.undefined)
    }
  }
  
  type UnmarshalledCSVInput = CSVInput
}
