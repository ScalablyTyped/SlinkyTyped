package typingsSlinky.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceFilter extends StObject {
  
  /**
    * The operator that you want to use to determine whether a service is returned by ListServices. Valid values for Condition include the following:    EQ: When you specify EQ, specify one namespace ID for Values. EQ is the default condition and can be omitted.    IN: When you specify IN, specify a list of the IDs for the namespaces that you want ListServices to return a list of services for.    BETWEEN: Not applicable.  
    */
  var Condition: js.UndefOr[FilterCondition] = js.native
  
  /**
    * Specify NAMESPACE_ID.
    */
  var Name: ServiceFilterName = js.native
  
  /**
    * The values that are applicable to the value that you specify for Condition to filter the list of services.
    */
  var Values: FilterValues = js.native
}
object ServiceFilter {
  
  @scala.inline
  def apply(Name: ServiceFilterName, Values: FilterValues): ServiceFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceFilter]
  }
  
  @scala.inline
  implicit class ServiceFilterMutableBuilder[Self <: ServiceFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: FilterCondition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    @scala.inline
    def setName(value: ServiceFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: FilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
