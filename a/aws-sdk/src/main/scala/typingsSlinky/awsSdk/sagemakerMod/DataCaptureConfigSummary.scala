package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCaptureConfigSummary extends StObject {
  
  /**
    * 
    */
  var CaptureStatus: typingsSlinky.awsSdk.sagemakerMod.CaptureStatus = js.native
  
  /**
    * 
    */
  var CurrentSamplingPercentage: SamplingPercentage = js.native
  
  /**
    * 
    */
  var DestinationS3Uri: typingsSlinky.awsSdk.sagemakerMod.DestinationS3Uri = js.native
  
  /**
    * 
    */
  var EnableCapture: typingsSlinky.awsSdk.sagemakerMod.EnableCapture = js.native
  
  /**
    * 
    */
  var KmsKeyId: typingsSlinky.awsSdk.sagemakerMod.KmsKeyId = js.native
}
object DataCaptureConfigSummary {
  
  @scala.inline
  def apply(
    CaptureStatus: CaptureStatus,
    CurrentSamplingPercentage: SamplingPercentage,
    DestinationS3Uri: DestinationS3Uri,
    EnableCapture: EnableCapture,
    KmsKeyId: KmsKeyId
  ): DataCaptureConfigSummary = {
    val __obj = js.Dynamic.literal(CaptureStatus = CaptureStatus.asInstanceOf[js.Any], CurrentSamplingPercentage = CurrentSamplingPercentage.asInstanceOf[js.Any], DestinationS3Uri = DestinationS3Uri.asInstanceOf[js.Any], EnableCapture = EnableCapture.asInstanceOf[js.Any], KmsKeyId = KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCaptureConfigSummary]
  }
  
  @scala.inline
  implicit class DataCaptureConfigSummaryMutableBuilder[Self <: DataCaptureConfigSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureStatus(value: CaptureStatus): Self = StObject.set(x, "CaptureStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSamplingPercentage(value: SamplingPercentage): Self = StObject.set(x, "CurrentSamplingPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationS3Uri(value: DestinationS3Uri): Self = StObject.set(x, "DestinationS3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCapture(value: EnableCapture): Self = StObject.set(x, "EnableCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
  }
}
