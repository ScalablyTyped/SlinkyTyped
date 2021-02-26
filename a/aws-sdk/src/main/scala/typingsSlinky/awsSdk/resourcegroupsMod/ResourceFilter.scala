package typingsSlinky.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceFilter extends StObject {
  
  /**
    * The name of the filter. Filter names are case-sensitive.
    */
  var Name: ResourceFilterName = js.native
  
  /**
    * One or more filter values. Allowed filter values vary by resource filter name, and are case-sensitive.
    */
  var Values: ResourceFilterValues = js.native
}
object ResourceFilter {
  
  @scala.inline
  def apply(Name: ResourceFilterName, Values: ResourceFilterValues): ResourceFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceFilter]
  }
  
  @scala.inline
  implicit class ResourceFilterMutableBuilder[Self <: ResourceFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ResourceFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: ResourceFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: ResourceFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
