package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeForecastExportJobResponse extends js.Object {
  
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
  implicit class DescribeForecastExportJobResponseOps[Self <: DescribeForecastExportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDestination(value: DataDestination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("Destination", js.undefined)
    
    @scala.inline
    def setForecastArn(value: Arn): Self = this.set("ForecastArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForecastArn: Self = this.set("ForecastArn", js.undefined)
    
    @scala.inline
    def setForecastExportJobArn(value: Arn): Self = this.set("ForecastExportJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForecastExportJobArn: Self = this.set("ForecastExportJobArn", js.undefined)
    
    @scala.inline
    def setForecastExportJobName(value: Name): Self = this.set("ForecastExportJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForecastExportJobName: Self = this.set("ForecastExportJobName", js.undefined)
    
    @scala.inline
    def setLastModificationTime(value: js.Date): Self = this.set("LastModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModificationTime: Self = this.set("LastModificationTime", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
