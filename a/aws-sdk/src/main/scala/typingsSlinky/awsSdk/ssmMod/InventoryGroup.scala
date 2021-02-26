package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryGroup extends StObject {
  
  /**
    * Filters define the criteria for the group. The matchingCount field displays the number of resources that match the criteria. The notMatchingCount field displays the number of resources that don't match the criteria. 
    */
  var Filters: InventoryFilterList = js.native
  
  /**
    * The name of the group.
    */
  var Name: InventoryGroupName = js.native
}
object InventoryGroup {
  
  @scala.inline
  def apply(Filters: InventoryFilterList, Name: InventoryGroupName): InventoryGroup = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryGroup]
  }
  
  @scala.inline
  implicit class InventoryGroupMutableBuilder[Self <: InventoryGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: InventoryFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: InventoryFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setName(value: InventoryGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
