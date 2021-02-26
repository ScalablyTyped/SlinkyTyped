package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersFilter extends StObject {
  
  /**
    * The name of the filter.
    */
  var Key: ParametersFilterKey = js.native
  
  /**
    * The filter values.
    */
  var Values: ParametersFilterValueList = js.native
}
object ParametersFilter {
  
  @scala.inline
  def apply(Key: ParametersFilterKey, Values: ParametersFilterValueList): ParametersFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersFilter]
  }
  
  @scala.inline
  implicit class ParametersFilterMutableBuilder[Self <: ParametersFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: ParametersFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: ParametersFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: ParametersFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
