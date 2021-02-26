package typingsSlinky.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredictOutput extends StObject {
  
  var Prediction: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.Prediction] = js.native
}
object PredictOutput {
  
  @scala.inline
  def apply(): PredictOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictOutput]
  }
  
  @scala.inline
  implicit class PredictOutputMutableBuilder[Self <: PredictOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrediction(value: Prediction): Self = StObject.set(x, "Prediction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictionUndefined: Self = StObject.set(x, "Prediction", js.undefined)
  }
}
