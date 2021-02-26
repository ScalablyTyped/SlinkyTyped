package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterRange extends StObject {
  
  /**
    * A CategoricalParameterRangeSpecification object that defines the possible values for a categorical hyperparameter.
    */
  var CategoricalParameterRangeSpecification: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CategoricalParameterRangeSpecification] = js.native
  
  /**
    * A ContinuousParameterRangeSpecification object that defines the possible values for a continuous hyperparameter.
    */
  var ContinuousParameterRangeSpecification: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ContinuousParameterRangeSpecification] = js.native
  
  /**
    * A IntegerParameterRangeSpecification object that defines the possible values for an integer hyperparameter.
    */
  var IntegerParameterRangeSpecification: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.IntegerParameterRangeSpecification] = js.native
}
object ParameterRange {
  
  @scala.inline
  def apply(): ParameterRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterRange]
  }
  
  @scala.inline
  implicit class ParameterRangeMutableBuilder[Self <: ParameterRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoricalParameterRangeSpecification(value: CategoricalParameterRangeSpecification): Self = StObject.set(x, "CategoricalParameterRangeSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoricalParameterRangeSpecificationUndefined: Self = StObject.set(x, "CategoricalParameterRangeSpecification", js.undefined)
    
    @scala.inline
    def setContinuousParameterRangeSpecification(value: ContinuousParameterRangeSpecification): Self = StObject.set(x, "ContinuousParameterRangeSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousParameterRangeSpecificationUndefined: Self = StObject.set(x, "ContinuousParameterRangeSpecification", js.undefined)
    
    @scala.inline
    def setIntegerParameterRangeSpecification(value: IntegerParameterRangeSpecification): Self = StObject.set(x, "IntegerParameterRangeSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerParameterRangeSpecificationUndefined: Self = StObject.set(x, "IntegerParameterRangeSpecification", js.undefined)
  }
}
