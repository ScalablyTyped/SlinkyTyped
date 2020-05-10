package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobWatermark extends js.Object {
  /**
    * The encryption settings, if any, that you want Elastic Transcoder to apply to your watermarks.
    */
  var Encryption: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Encryption] = js.native
  /**
    *  The name of the .png or .jpg file that you want to use for the watermark. To determine which Amazon S3 bucket contains the specified file, Elastic Transcoder checks the pipeline specified by Pipeline; the Input Bucket object in that pipeline identifies the bucket.  If the file name includes a prefix, for example, logos/128x64.png, include the prefix in the key. If the file isn't in the specified bucket, Elastic Transcoder returns an error. 
    */
  var InputKey: js.UndefOr[WatermarkKey] = js.native
  /**
    * The ID of the watermark settings that Elastic Transcoder uses to add watermarks to the video during transcoding. The settings are in the preset specified by Preset for the current output. In that preset, the value of Watermarks Id tells Elastic Transcoder which settings to use.
    */
  var PresetWatermarkId: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.PresetWatermarkId] = js.native
}

object JobWatermark {
  @scala.inline
  def apply(): JobWatermark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobWatermark]
  }
  @scala.inline
  implicit class JobWatermarkOps[Self <: JobWatermark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryption(value: Encryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(js.undefined)
        ret
    }
    @scala.inline
    def withInputKey(value: WatermarkKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPresetWatermarkId(value: PresetWatermarkId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetWatermarkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresetWatermarkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetWatermarkId")(js.undefined)
        ret
    }
  }
  
}

