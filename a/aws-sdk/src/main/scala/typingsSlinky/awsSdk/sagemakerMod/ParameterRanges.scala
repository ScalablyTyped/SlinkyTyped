package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterRanges extends StObject {
  
  /**
    * The array of CategoricalParameterRange objects that specify ranges of categorical hyperparameters that a hyperparameter tuning job searches.
    */
  var CategoricalParameterRanges: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CategoricalParameterRanges] = js.native
  
  /**
    * The array of ContinuousParameterRange objects that specify ranges of continuous hyperparameters that a hyperparameter tuning job searches.
    */
  var ContinuousParameterRanges: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ContinuousParameterRanges] = js.native
  
  /**
    * The array of IntegerParameterRange objects that specify ranges of integer hyperparameters that a hyperparameter tuning job searches.
    */
  var IntegerParameterRanges: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.IntegerParameterRanges] = js.native
}
object ParameterRanges {
  
  @scala.inline
  def apply(): ParameterRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterRanges]
  }
  
  @scala.inline
  implicit class ParameterRangesMutableBuilder[Self <: ParameterRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoricalParameterRanges(value: CategoricalParameterRanges): Self = StObject.set(x, "CategoricalParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoricalParameterRangesUndefined: Self = StObject.set(x, "CategoricalParameterRanges", js.undefined)
    
    @scala.inline
    def setCategoricalParameterRangesVarargs(value: CategoricalParameterRange*): Self = StObject.set(x, "CategoricalParameterRanges", js.Array(value :_*))
    
    @scala.inline
    def setContinuousParameterRanges(value: ContinuousParameterRanges): Self = StObject.set(x, "ContinuousParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousParameterRangesUndefined: Self = StObject.set(x, "ContinuousParameterRanges", js.undefined)
    
    @scala.inline
    def setContinuousParameterRangesVarargs(value: ContinuousParameterRange*): Self = StObject.set(x, "ContinuousParameterRanges", js.Array(value :_*))
    
    @scala.inline
    def setIntegerParameterRanges(value: IntegerParameterRanges): Self = StObject.set(x, "IntegerParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerParameterRangesUndefined: Self = StObject.set(x, "IntegerParameterRanges", js.undefined)
    
    @scala.inline
    def setIntegerParameterRangesVarargs(value: IntegerParameterRange*): Self = StObject.set(x, "IntegerParameterRanges", js.Array(value :_*))
  }
}
