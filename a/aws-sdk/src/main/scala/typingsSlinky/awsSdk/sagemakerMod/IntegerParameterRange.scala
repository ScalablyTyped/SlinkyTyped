package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerParameterRange extends StObject {
  
  /**
    * The maximum value of the hyperparameter to search.
    */
  var MaxValue: ParameterValue = js.native
  
  /**
    * The minimum value of the hyperparameter to search.
    */
  var MinValue: ParameterValue = js.native
  
  /**
    * The name of the hyperparameter to search.
    */
  var Name: ParameterKey = js.native
  
  /**
    * The scale that hyperparameter tuning uses to search the hyperparameter range. For information about choosing a hyperparameter scale, see Hyperparameter Scaling. One of the following values:  Auto  Amazon SageMaker hyperparameter tuning chooses the best scale for the hyperparameter.  Linear  Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.  Logarithmic  Hyperparameter tuning searches the values in the hyperparameter range by using a logarithmic scale. Logarithmic scaling works only for ranges that have only values greater than 0.  
    */
  var ScalingType: js.UndefOr[HyperParameterScalingType] = js.native
}
object IntegerParameterRange {
  
  @scala.inline
  def apply(MaxValue: ParameterValue, MinValue: ParameterValue, Name: ParameterKey): IntegerParameterRange = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParameterRange]
  }
  
  @scala.inline
  implicit class IntegerParameterRangeMutableBuilder[Self <: IntegerParameterRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxValue(value: ParameterValue): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: ParameterValue): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ParameterKey): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingType(value: HyperParameterScalingType): Self = StObject.set(x, "ScalingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingTypeUndefined: Self = StObject.set(x, "ScalingType", js.undefined)
  }
}
