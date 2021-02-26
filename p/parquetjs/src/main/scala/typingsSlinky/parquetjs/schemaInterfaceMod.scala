package typingsSlinky.parquetjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaInterfaceMod {
  
  @js.native
  trait NestedFieldsInterface extends SchemaInterfaceField {
    
    var fields: SchemaInterface = js.native
    
    var optional: js.UndefOr[Boolean] = js.native
    
    var repeated: js.UndefOr[Boolean] = js.native
  }
  object NestedFieldsInterface {
    
    @scala.inline
    def apply(fields: SchemaInterface): NestedFieldsInterface = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestedFieldsInterface]
    }
    
    @scala.inline
    implicit class NestedFieldsInterfaceMutableBuilder[Self <: NestedFieldsInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: SchemaInterface): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      @scala.inline
      def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatedUndefined: Self = StObject.set(x, "repeated", js.undefined)
    }
  }
  
  type SchemaInterface = StringDictionary[SchemaInterfaceField]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.parquetjs.schemaInterfaceMod.SingleFieldInterface
    - typingsSlinky.parquetjs.schemaInterfaceMod.NestedFieldsInterface
  */
  trait SchemaInterfaceField extends StObject
  object SchemaInterfaceField {
    
    @scala.inline
    def NestedFieldsInterface(fields: SchemaInterface): typingsSlinky.parquetjs.schemaInterfaceMod.NestedFieldsInterface = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.parquetjs.schemaInterfaceMod.NestedFieldsInterface]
    }
    
    @scala.inline
    def SingleFieldInterface(`type`: String): typingsSlinky.parquetjs.schemaInterfaceMod.SingleFieldInterface = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.parquetjs.schemaInterfaceMod.SingleFieldInterface]
    }
  }
  
  @js.native
  trait SingleFieldInterface extends SchemaInterfaceField {
    
    var bitWidth: js.UndefOr[Double] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var optional: js.UndefOr[Boolean] = js.native
    
    var repeated: js.UndefOr[Boolean] = js.native
    
    var `type`: String = js.native
  }
  object SingleFieldInterface {
    
    @scala.inline
    def apply(`type`: String): SingleFieldInterface = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleFieldInterface]
    }
    
    @scala.inline
    implicit class SingleFieldInterfaceMutableBuilder[Self <: SingleFieldInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitWidth(value: Double): Self = StObject.set(x, "bitWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitWidthUndefined: Self = StObject.set(x, "bitWidth", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      @scala.inline
      def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatedUndefined: Self = StObject.set(x, "repeated", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
