package typingsSlinky.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperParameterTuningJobConfig extends StObject {
  
  /**
    * Specifies the ranges of valid values for the hyperparameters.
    */
  var ParameterRanges: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.ParameterRanges] = js.native
}
object HyperParameterTuningJobConfig {
  
  @scala.inline
  def apply(): HyperParameterTuningJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperParameterTuningJobConfig]
  }
  
  @scala.inline
  implicit class HyperParameterTuningJobConfigMutableBuilder[Self <: HyperParameterTuningJobConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterRanges(value: ParameterRanges): Self = StObject.set(x, "ParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterRangesUndefined: Self = StObject.set(x, "ParameterRanges", js.undefined)
  }
}
