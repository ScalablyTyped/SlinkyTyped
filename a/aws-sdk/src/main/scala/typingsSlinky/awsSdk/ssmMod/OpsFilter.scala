package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpsFilter extends StObject {
  
  /**
    * The name of the filter.
    */
  var Key: OpsFilterKey = js.native
  
  /**
    * The type of filter.
    */
  var Type: js.UndefOr[OpsFilterOperatorType] = js.native
  
  /**
    * The filter value.
    */
  var Values: OpsFilterValueList = js.native
}
object OpsFilter {
  
  @scala.inline
  def apply(Key: OpsFilterKey, Values: OpsFilterValueList): OpsFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsFilter]
  }
  
  @scala.inline
  implicit class OpsFilterMutableBuilder[Self <: OpsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: OpsFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OpsFilterOperatorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValues(value: OpsFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: OpsFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
