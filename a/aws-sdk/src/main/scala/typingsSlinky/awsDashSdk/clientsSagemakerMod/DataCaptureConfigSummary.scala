package typingsSlinky.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCaptureConfigSummary extends js.Object {
  /**
    * 
    */
  var CaptureStatus: typingsSlinky.awsDashSdk.clientsSagemakerMod.CaptureStatus = js.native
  /**
    * 
    */
  var CurrentSamplingPercentage: SamplingPercentage = js.native
  /**
    * 
    */
  var DestinationS3Uri: typingsSlinky.awsDashSdk.clientsSagemakerMod.DestinationS3Uri = js.native
  /**
    * 
    */
  var EnableCapture: typingsSlinky.awsDashSdk.clientsSagemakerMod.EnableCapture = js.native
  /**
    * 
    */
  var KmsKeyId: typingsSlinky.awsDashSdk.clientsSagemakerMod.KmsKeyId = js.native
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
}

