package typingsSlinky.instagramPrivateApi.directThreadBroadcastMediaOptionsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadBroadcastVoiceOptions extends js.Object {
  var file: Buffer = js.native
  var transcodeDelay: js.UndefOr[Double] = js.native
  var uploadId: js.UndefOr[String] = js.native
  var waveform: js.UndefOr[js.Array[Double]] = js.native
  var waveformSamplingFrequencyHz: js.UndefOr[Double] = js.native
}

object DirectThreadBroadcastVoiceOptions {
  @scala.inline
  def apply(file: Buffer): DirectThreadBroadcastVoiceOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastVoiceOptions]
  }
  @scala.inline
  implicit class DirectThreadBroadcastVoiceOptionsOps[Self <: DirectThreadBroadcastVoiceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranscodeDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcodeDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscodeDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcodeDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(js.undefined)
        ret
    }
    @scala.inline
    def withWaveform(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waveform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaveform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waveform")(js.undefined)
        ret
    }
    @scala.inline
    def withWaveformSamplingFrequencyHz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waveformSamplingFrequencyHz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaveformSamplingFrequencyHz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waveformSamplingFrequencyHz")(js.undefined)
        ret
    }
  }
  
}

