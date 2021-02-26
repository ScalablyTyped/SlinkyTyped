package typingsSlinky.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeForecastExportJobResponse extends StObject {
  
  /**
    * When the forecast export job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
    */
  var Destination: js.UndefOr[DataDestination] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the exported forecast.
    */
  var ForecastArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ARN of the forecast export job.
    */
  var ForecastExportJobArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the forecast export job.
    */
  var ForecastExportJobName: js.UndefOr[Name] = js.native
  
  /**
    * When the last successful export job finished.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Message] = js.native
  
  /**
    * The status of the forecast export job. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     The Status of the forecast export job must be ACTIVE before you can access the forecast in your S3 bucket. 
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Status] = js.native
}
object DescribeForecastExportJobResponse {
  
  @scala.inline
  def apply(): DescribeForecastExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeForecastExportJobResponse]
  }
  
  @scala.inline
  implicit class DescribeForecastExportJobResponseMutableBuilder[Self <: DescribeForecastExportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDestination(value: DataDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    @scala.inline
    def setForecastArn(value: Arn): Self = StObject.set(x, "ForecastArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastArnUndefined: Self = StObject.set(x, "ForecastArn", js.undefined)
    
    @scala.inline
    def setForecastExportJobArn(value: Arn): Self = StObject.set(x, "ForecastExportJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastExportJobArnUndefined: Self = StObject.set(x, "ForecastExportJobArn", js.undefined)
    
    @scala.inline
    def setForecastExportJobName(value: Name): Self = StObject.set(x, "ForecastExportJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastExportJobNameUndefined: Self = StObject.set(x, "ForecastExportJobName", js.undefined)
    
    @scala.inline
    def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
