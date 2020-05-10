package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCaptureConfig extends js.Object {
  /**
    * 
    */
  var CaptureContentTypeHeader: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CaptureContentTypeHeader] = js.native
  /**
    * 
    */
  var CaptureOptions: CaptureOptionList = js.native
  /**
    * 
    */
  var DestinationS3Uri: typingsSlinky.awsSdk.sagemakerMod.DestinationS3Uri = js.native
  /**
    * 
    */
  var EnableCapture: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.EnableCapture] = js.native
  /**
    * 
    */
  var InitialSamplingPercentage: SamplingPercentage = js.native
  /**
    * 
    */
  var KmsKeyId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.KmsKeyId] = js.native
}

object DataCaptureConfig {
  @scala.inline
  def apply(
    CaptureOptions: CaptureOptionList,
    DestinationS3Uri: DestinationS3Uri,
    InitialSamplingPercentage: SamplingPercentage
  ): DataCaptureConfig = {
    val __obj = js.Dynamic.literal(CaptureOptions = CaptureOptions.asInstanceOf[js.Any], DestinationS3Uri = DestinationS3Uri.asInstanceOf[js.Any], InitialSamplingPercentage = InitialSamplingPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCaptureConfig]
  }
  @scala.inline
  implicit class DataCaptureConfigOps[Self <: DataCaptureConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureOptions(value: CaptureOptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationS3Uri(value: DestinationS3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationS3Uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialSamplingPercentage(value: SamplingPercentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialSamplingPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptureContentTypeHeader(value: CaptureContentTypeHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureContentTypeHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureContentTypeHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptureContentTypeHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCapture(value: EnableCapture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
  }
  
}

