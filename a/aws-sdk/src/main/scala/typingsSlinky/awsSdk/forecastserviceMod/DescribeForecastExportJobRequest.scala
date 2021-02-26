package typingsSlinky.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeForecastExportJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the forecast export job.
    */
  var ForecastExportJobArn: Arn = js.native
}
object DescribeForecastExportJobRequest {
  
  @scala.inline
  def apply(ForecastExportJobArn: Arn): DescribeForecastExportJobRequest = {
    val __obj = js.Dynamic.literal(ForecastExportJobArn = ForecastExportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeForecastExportJobRequest]
  }
  
  @scala.inline
  implicit class DescribeForecastExportJobRequestMutableBuilder[Self <: DescribeForecastExportJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForecastExportJobArn(value: Arn): Self = StObject.set(x, "ForecastExportJobArn", value.asInstanceOf[js.Any])
  }
}
