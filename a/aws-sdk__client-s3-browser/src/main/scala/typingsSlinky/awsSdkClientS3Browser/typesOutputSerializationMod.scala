package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.typesCsvoutputMod.CSVOutput
import typingsSlinky.awsSdkClientS3Browser.typesCsvoutputMod.UnmarshalledCSVOutput
import typingsSlinky.awsSdkClientS3Browser.typesJsonoutputMod.JSONOutput
import typingsSlinky.awsSdkClientS3Browser.typesJsonoutputMod.UnmarshalledJSONOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOutputSerializationMod {
  
  @js.native
  trait OutputSerialization extends StObject {
    
    /**
      * <p>Describes the serialization of CSV-encoded Select results.</p>
      */
    var CSV: js.UndefOr[CSVOutput] = js.native
    
    /**
      * <p>Specifies JSON as request's output serialization format.</p>
      */
    var JSON: js.UndefOr[JSONOutput] = js.native
  }
  object OutputSerialization {
    
    @scala.inline
    def apply(): OutputSerialization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutputSerialization]
    }
    
    @scala.inline
    implicit class OutputSerializationMutableBuilder[Self <: OutputSerialization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCSV(value: CSVOutput): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCSVUndefined: Self = StObject.set(x, "CSV", js.undefined)
      
      @scala.inline
      def setJSON(value: JSONOutput): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledOutputSerialization extends OutputSerialization {
    
    /**
      * <p>Describes the serialization of CSV-encoded Select results.</p>
      */
    @JSName("CSV")
    var CSV_UnmarshalledOutputSerialization: js.UndefOr[UnmarshalledCSVOutput] = js.native
    
    /**
      * <p>Specifies JSON as request's output serialization format.</p>
      */
    @JSName("JSON")
    var JSON_UnmarshalledOutputSerialization: js.UndefOr[UnmarshalledJSONOutput] = js.native
  }
  object UnmarshalledOutputSerialization {
    
    @scala.inline
    def apply(): UnmarshalledOutputSerialization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledOutputSerialization]
    }
    
    @scala.inline
    implicit class UnmarshalledOutputSerializationMutableBuilder[Self <: UnmarshalledOutputSerialization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCSV(value: UnmarshalledCSVOutput): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCSVUndefined: Self = StObject.set(x, "CSV", js.undefined)
      
      @scala.inline
      def setJSON(value: UnmarshalledJSONOutput): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
    }
  }
}
