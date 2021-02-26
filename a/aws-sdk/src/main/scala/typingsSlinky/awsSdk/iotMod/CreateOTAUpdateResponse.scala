package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOTAUpdateResponse extends StObject {
  
  /**
    * The AWS IoT job ARN associated with the OTA update.
    */
  var awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.native
  
  /**
    * The AWS IoT job ID associated with the OTA update.
    */
  var awsIotJobId: js.UndefOr[AwsIotJobId] = js.native
  
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.native
  
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.native
  
  /**
    * The OTA update status.
    */
  var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.native
}
object CreateOTAUpdateResponse {
  
  @scala.inline
  def apply(): CreateOTAUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOTAUpdateResponse]
  }
  
  @scala.inline
  implicit class CreateOTAUpdateResponseMutableBuilder[Self <: CreateOTAUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsIotJobArn(value: AwsIotJobArn): Self = StObject.set(x, "awsIotJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIotJobArnUndefined: Self = StObject.set(x, "awsIotJobArn", js.undefined)
    
    @scala.inline
    def setAwsIotJobId(value: AwsIotJobId): Self = StObject.set(x, "awsIotJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsIotJobIdUndefined: Self = StObject.set(x, "awsIotJobId", js.undefined)
    
    @scala.inline
    def setOtaUpdateArn(value: OTAUpdateArn): Self = StObject.set(x, "otaUpdateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtaUpdateArnUndefined: Self = StObject.set(x, "otaUpdateArn", js.undefined)
    
    @scala.inline
    def setOtaUpdateId(value: OTAUpdateId): Self = StObject.set(x, "otaUpdateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtaUpdateIdUndefined: Self = StObject.set(x, "otaUpdateId", js.undefined)
    
    @scala.inline
    def setOtaUpdateStatus(value: OTAUpdateStatus): Self = StObject.set(x, "otaUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtaUpdateStatusUndefined: Self = StObject.set(x, "otaUpdateStatus", js.undefined)
  }
}
