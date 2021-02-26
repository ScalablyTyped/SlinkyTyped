package typingsSlinky.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoricalParameterRange extends StObject {
  
  /**
    * The name of the categorical hyperparameter to tune.
    */
  var Name: typingsSlinky.awsSdk.forecastserviceMod.Name = js.native
  
  /**
    * A list of the tunable categories for the hyperparameter.
    */
  var Values: typingsSlinky.awsSdk.forecastserviceMod.Values = js.native
}
object CategoricalParameterRange {
  
  @scala.inline
  def apply(Name: Name, Values: Values): CategoricalParameterRange = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoricalParameterRange]
  }
  
  @scala.inline
  implicit class CategoricalParameterRangeMutableBuilder[Self <: CategoricalParameterRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: Values): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Value*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
