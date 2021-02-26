package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeConfigurationOptionsFilter extends StObject {
  
  /**
    * The name of the element to filter.
    */
  var Name: js.UndefOr[NodeConfigurationOptionsFilterName] = js.native
  
  /**
    * The filter operator. If filter Name is NodeType only the 'in' operator is supported. Provide one value to evaluate for 'eq', 'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for 'between'. Provide a list of values for 'in'.
    */
  var Operator: js.UndefOr[OperatorType] = js.native
  
  /**
    * List of values. Compare Name using Operator to Values. If filter Name is NumberOfNodes, then values can range from 0 to 200. If filter Name is EstimatedDiskUtilizationPercent, then values can range from 0 to 100. For example, filter NumberOfNodes (name) GT (operator) 3 (values).
    */
  var Values: js.UndefOr[ValueStringList] = js.native
}
object NodeConfigurationOptionsFilter {
  
  @scala.inline
  def apply(): NodeConfigurationOptionsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfigurationOptionsFilter]
  }
  
  @scala.inline
  implicit class NodeConfigurationOptionsFilterMutableBuilder[Self <: NodeConfigurationOptionsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NodeConfigurationOptionsFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOperator(value: OperatorType): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "Operator", js.undefined)
    
    @scala.inline
    def setValues(value: ValueStringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
