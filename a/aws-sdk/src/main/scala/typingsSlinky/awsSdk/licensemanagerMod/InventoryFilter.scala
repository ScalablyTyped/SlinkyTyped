package typingsSlinky.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryFilter extends StObject {
  
  /**
    * Condition of the filter.
    */
  var Condition: InventoryFilterCondition = js.native
  
  /**
    * Name of the filter.
    */
  var Name: String = js.native
  
  /**
    * Value of the filter.
    */
  var Value: js.UndefOr[String] = js.native
}
object InventoryFilter {
  
  @scala.inline
  def apply(Condition: InventoryFilterCondition, Name: String): InventoryFilter = {
    val __obj = js.Dynamic.literal(Condition = Condition.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryFilter]
  }
  
  @scala.inline
  implicit class InventoryFilterMutableBuilder[Self <: InventoryFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: InventoryFilterCondition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
