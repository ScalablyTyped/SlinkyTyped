package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ALWAYS
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ASNEEDED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCsvoutputMod {
  
  @js.native
  trait CSVOutput extends StObject {
    
    /**
      * <p>Value used to separate individual fields in a record.</p>
      */
    var FieldDelimiter: js.UndefOr[String] = js.native
    
    /**
      * <p>Value used for escaping where the field delimiter is part of the value.</p>
      */
    var QuoteCharacter: js.UndefOr[String] = js.native
    
    /**
      * <p>Single character used for escaping the quote character inside an already escaped value.</p>
      */
    var QuoteEscapeCharacter: js.UndefOr[String] = js.native
    
    /**
      * <p>Indicates whether or not all output fields should be quoted.</p>
      */
    var QuoteFields: js.UndefOr[ALWAYS | ASNEEDED | String] = js.native
    
    /**
      * <p>Value used to separate individual records.</p>
      */
    var RecordDelimiter: js.UndefOr[String] = js.native
  }
  object CSVOutput {
    
    @scala.inline
    def apply(): CSVOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSVOutput]
    }
    
    @scala.inline
    implicit class CSVOutputMutableBuilder[Self <: CSVOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldDelimiter(value: String): Self = StObject.set(x, "FieldDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldDelimiterUndefined: Self = StObject.set(x, "FieldDelimiter", js.undefined)
      
      @scala.inline
      def setQuoteCharacter(value: String): Self = StObject.set(x, "QuoteCharacter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteCharacterUndefined: Self = StObject.set(x, "QuoteCharacter", js.undefined)
      
      @scala.inline
      def setQuoteEscapeCharacter(value: String): Self = StObject.set(x, "QuoteEscapeCharacter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteEscapeCharacterUndefined: Self = StObject.set(x, "QuoteEscapeCharacter", js.undefined)
      
      @scala.inline
      def setQuoteFields(value: ALWAYS | ASNEEDED | String): Self = StObject.set(x, "QuoteFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteFieldsUndefined: Self = StObject.set(x, "QuoteFields", js.undefined)
      
      @scala.inline
      def setRecordDelimiter(value: String): Self = StObject.set(x, "RecordDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordDelimiterUndefined: Self = StObject.set(x, "RecordDelimiter", js.undefined)
    }
  }
  
  type UnmarshalledCSVOutput = CSVOutput
}
