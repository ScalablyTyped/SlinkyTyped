package typingsSlinky.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePredictorResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the predictor.
    */
  var PredictorArn: js.UndefOr[Arn] = js.native
}
object CreatePredictorResponse {
  
  @scala.inline
  def apply(): CreatePredictorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePredictorResponse]
  }
  
  @scala.inline
  implicit class CreatePredictorResponseMutableBuilder[Self <: CreatePredictorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPredictorArn(value: Arn): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictorArnUndefined: Self = StObject.set(x, "PredictorArn", js.undefined)
  }
}
