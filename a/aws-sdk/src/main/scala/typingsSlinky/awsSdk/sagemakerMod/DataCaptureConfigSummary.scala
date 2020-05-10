package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCaptureConfigSummary extends js.Object {
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
  implicit class DataCaptureConfigSummaryOps[Self <: DataCaptureConfigSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureStatus(value: CaptureStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentSamplingPercentage(value: SamplingPercentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentSamplingPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationS3Uri(value: DestinationS3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationS3Uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableCapture(value: EnableCapture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

