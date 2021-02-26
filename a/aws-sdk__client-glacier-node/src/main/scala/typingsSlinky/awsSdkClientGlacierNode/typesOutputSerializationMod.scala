package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.typesCsvoutputMod.CSVOutput
import typingsSlinky.awsSdkClientGlacierNode.typesCsvoutputMod.UnmarshalledCSVOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOutputSerializationMod {
  
  @js.native
  trait OutputSerialization extends StObject {
    
    /**
      * <p>Describes the serialization of CSV-encoded query results.</p>
      */
    var csv: js.UndefOr[CSVOutput] = js.native
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
      def setCsv(value: CSVOutput): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledOutputSerialization extends OutputSerialization {
    
    /**
      * <p>Describes the serialization of CSV-encoded query results.</p>
      */
    @JSName("csv")
    var csv_UnmarshalledOutputSerialization: js.UndefOr[UnmarshalledCSVOutput] = js.native
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
      def setCsv(value: UnmarshalledCSVOutput): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    }
  }
}
