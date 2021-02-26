package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryItemAttribute extends StObject {
  
  /**
    * The data type of the inventory item attribute. 
    */
  var DataType: InventoryAttributeDataType = js.native
  
  /**
    * Name of the inventory item attribute.
    */
  var Name: InventoryItemAttributeName = js.native
}
object InventoryItemAttribute {
  
  @scala.inline
  def apply(DataType: InventoryAttributeDataType, Name: InventoryItemAttributeName): InventoryItemAttribute = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItemAttribute]
  }
  
  @scala.inline
  implicit class InventoryItemAttributeMutableBuilder[Self <: InventoryItemAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: InventoryAttributeDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: InventoryItemAttributeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
