package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusinessReport extends StObject {
  
  /**
    * The time of report delivery.
    */
  var DeliveryTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The download link where a user can download the report.
    */
  var DownloadUrl: js.UndefOr[BusinessReportDownloadUrl] = js.native
  
  /**
    * The failure code.
    */
  var FailureCode: js.UndefOr[BusinessReportFailureCode] = js.native
  
  /**
    * The S3 location of the output reports.
    */
  var S3Location: js.UndefOr[BusinessReportS3Location] = js.native
  
  /**
    * The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
    */
  var Status: js.UndefOr[BusinessReportStatus] = js.native
}
object BusinessReport {
  
  @scala.inline
  def apply(): BusinessReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessReport]
  }
  
  @scala.inline
  implicit class BusinessReportMutableBuilder[Self <: BusinessReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryTime(value: js.Date): Self = StObject.set(x, "DeliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryTimeUndefined: Self = StObject.set(x, "DeliveryTime", js.undefined)
    
    @scala.inline
    def setDownloadUrl(value: BusinessReportDownloadUrl): Self = StObject.set(x, "DownloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUrlUndefined: Self = StObject.set(x, "DownloadUrl", js.undefined)
    
    @scala.inline
    def setFailureCode(value: BusinessReportFailureCode): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    @scala.inline
    def setS3Location(value: BusinessReportS3Location): Self = StObject.set(x, "S3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3LocationUndefined: Self = StObject.set(x, "S3Location", js.undefined)
    
    @scala.inline
    def setStatus(value: BusinessReportStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
