package typingsSlinky.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageAttributeValue extends StObject {
  
  /**
    * Not implemented. Reserved for future use.
    */
  var BinaryListValues: js.UndefOr[BinaryList] = js.native
  
  /**
    * Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.
    */
  var BinaryValue: js.UndefOr[Binary] = js.native
  
  /**
    * Amazon SQS supports the following logical data types: String, Number, and Binary. For the Number data type, you must use StringValue. You can also append custom labels. For more information, see Amazon SQS Message Attributes in the Amazon Simple Queue Service Developer Guide.
    */
  var DataType: String = js.native
  
  /**
    * Not implemented. Reserved for future use.
    */
  var StringListValues: js.UndefOr[StringList] = js.native
  
  /**
    * Strings are Unicode with UTF-8 binary encoding. For a list of code values, see ASCII Printable Characters.
    */
  var StringValue: js.UndefOr[String] = js.native
}
object MessageAttributeValue {
  
  @scala.inline
  def apply(DataType: String): MessageAttributeValue = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttributeValue]
  }
  
  @scala.inline
  implicit class MessageAttributeValueMutableBuilder[Self <: MessageAttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryListValues(value: BinaryList): Self = StObject.set(x, "BinaryListValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryListValuesUndefined: Self = StObject.set(x, "BinaryListValues", js.undefined)
    
    @scala.inline
    def setBinaryListValuesVarargs(value: Binary*): Self = StObject.set(x, "BinaryListValues", js.Array(value :_*))
    
    @scala.inline
    def setBinaryValue(value: Binary): Self = StObject.set(x, "BinaryValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryValueUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "BinaryValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryValueUndefined: Self = StObject.set(x, "BinaryValue", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringListValues(value: StringList): Self = StObject.set(x, "StringListValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringListValuesUndefined: Self = StObject.set(x, "StringListValues", js.undefined)
    
    @scala.inline
    def setStringListValuesVarargs(value: String*): Self = StObject.set(x, "StringListValues", js.Array(value :_*))
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
  }
}
