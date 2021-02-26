package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoricalParameterRange extends StObject {
  
  /**
    * The name of the categorical hyperparameter to tune.
    */
  var Name: ParameterKey = js.native
  
  /**
    * A list of the categories for the hyperparameter.
    */
  var Values: ParameterValues = js.native
}
object CategoricalParameterRange {
  
  @scala.inline
  def apply(Name: ParameterKey, Values: ParameterValues): CategoricalParameterRange = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoricalParameterRange]
  }
  
  @scala.inline
  implicit class CategoricalParameterRangeMutableBuilder[Self <: CategoricalParameterRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ParameterKey): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: ParameterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: ParameterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
