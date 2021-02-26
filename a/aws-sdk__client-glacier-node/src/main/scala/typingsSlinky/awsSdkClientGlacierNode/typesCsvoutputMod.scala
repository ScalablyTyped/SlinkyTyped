package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ALWAYS
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ASNEEDED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCsvoutputMod {
  
  @js.native
  trait CSVOutput extends StObject {
    
    /**
      * <p>A value used to separate individual fields from each other within a record.</p>
      */
    var FieldDelimiter: js.UndefOr[String] = js.native
    
    /**
      * <p>A value used as an escape character where the field delimiter is part of the value.</p>
      */
    var QuoteCharacter: js.UndefOr[String] = js.native
    
    /**
      * <p>A single character used for escaping the quotation-mark character inside an already escaped value.</p>
      */
    var QuoteEscapeCharacter: js.UndefOr[String] = js.native
    
    /**
      * <p>A value that indicates whether all output fields should be contained within quotation marks.</p>
      */
    var QuoteFields: js.UndefOr[ALWAYS | ASNEEDED | String] = js.native
    
    /**
      * <p>A value used to separate individual records from each other.</p>
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
