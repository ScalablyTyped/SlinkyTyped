package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BZIP2
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.GZIP
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NONE
import typingsSlinky.awsSdkClientS3Node.typesCsvinputMod.CSVInput
import typingsSlinky.awsSdkClientS3Node.typesCsvinputMod.UnmarshalledCSVInput
import typingsSlinky.awsSdkClientS3Node.typesJsoninputMod.JSONInput
import typingsSlinky.awsSdkClientS3Node.typesJsoninputMod.UnmarshalledJSONInput
import typingsSlinky.awsSdkClientS3Node.typesParquetInputMod.ParquetInput
import typingsSlinky.awsSdkClientS3Node.typesParquetInputMod.UnmarshalledParquetInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputSerializationMod {
  
  @js.native
  trait InputSerialization extends StObject {
    
    /**
      * <p>Describes the serialization of a CSV-encoded object.</p>
      */
    var CSV: js.UndefOr[CSVInput] = js.native
    
    /**
      * <p>Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.</p>
      */
    var CompressionType: js.UndefOr[NONE | GZIP | BZIP2 | String] = js.native
    
    /**
      * <p>Specifies JSON as object's input serialization format.</p>
      */
    var JSON: js.UndefOr[JSONInput] = js.native
    
    /**
      * <p>Specifies Parquet as object's input serialization format.</p>
      */
    var Parquet: js.UndefOr[ParquetInput] = js.native
  }
  object InputSerialization {
    
    @scala.inline
    def apply(): InputSerialization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputSerialization]
    }
    
    @scala.inline
    implicit class InputSerializationMutableBuilder[Self <: InputSerialization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCSV(value: CSVInput): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCSVUndefined: Self = StObject.set(x, "CSV", js.undefined)
      
      @scala.inline
      def setCompressionType(value: NONE | GZIP | BZIP2 | String): Self = StObject.set(x, "CompressionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionTypeUndefined: Self = StObject.set(x, "CompressionType", js.undefined)
      
      @scala.inline
      def setJSON(value: JSONInput): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
      
      @scala.inline
      def setParquet(value: ParquetInput): Self = StObject.set(x, "Parquet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParquetUndefined: Self = StObject.set(x, "Parquet", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledInputSerialization extends InputSerialization {
    
    /**
      * <p>Describes the serialization of a CSV-encoded object.</p>
      */
    @JSName("CSV")
    var CSV_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledCSVInput] = js.native
    
    /**
      * <p>Specifies JSON as object's input serialization format.</p>
      */
    @JSName("JSON")
    var JSON_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledJSONInput] = js.native
    
    /**
      * <p>Specifies Parquet as object's input serialization format.</p>
      */
    @JSName("Parquet")
    var Parquet_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledParquetInput] = js.native
  }
  object UnmarshalledInputSerialization {
    
    @scala.inline
    def apply(): UnmarshalledInputSerialization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledInputSerialization]
    }
    
    @scala.inline
    implicit class UnmarshalledInputSerializationMutableBuilder[Self <: UnmarshalledInputSerialization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCSV(value: UnmarshalledCSVInput): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCSVUndefined: Self = StObject.set(x, "CSV", js.undefined)
      
      @scala.inline
      def setJSON(value: UnmarshalledJSONInput): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
      
      @scala.inline
      def setParquet(value: UnmarshalledParquetInput): Self = StObject.set(x, "Parquet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParquetUndefined: Self = StObject.set(x, "Parquet", js.undefined)
    }
  }
}
