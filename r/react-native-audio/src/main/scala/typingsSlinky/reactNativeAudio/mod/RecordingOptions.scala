package typingsSlinky.reactNativeAudio.mod

import typingsSlinky.reactNativeAudio.reactNativeAudioStrings.High
import typingsSlinky.reactNativeAudio.reactNativeAudioStrings.Low
import typingsSlinky.reactNativeAudio.reactNativeAudioStrings.Medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordingOptions extends js.Object {
  var AudioEncoding: js.UndefOr[AudioEncodingType] = js.native
  var AudioEncodingBitRate: js.UndefOr[Double] = js.native
  var AudioQuality: js.UndefOr[Low | Medium | High] = js.native
  var AudioSource: js.UndefOr[Double] = js.native
  var Channels: js.UndefOr[Double] = js.native
  var IncludeBase64: js.UndefOr[Boolean] = js.native
  var MeasurementMode: js.UndefOr[Boolean] = js.native
  var MeteringEnabled: js.UndefOr[Boolean] = js.native
  var OutputFormat: js.UndefOr[String] = js.native
  var SampleRate: js.UndefOr[Double] = js.native
}

object RecordingOptions {
  @scala.inline
  def apply(): RecordingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordingOptions]
  }
  @scala.inline
  implicit class RecordingOptionsOps[Self <: RecordingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioEncoding(value: AudioEncodingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioEncodingBitRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioEncodingBitRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioEncodingBitRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioEncodingBitRate")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioQuality(value: Low | Medium | High): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioSource(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioSource")(js.undefined)
        ret
    }
    @scala.inline
    def withChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channels")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeBase64(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeBase64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeBase64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeBase64")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasurementMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeasurementMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasurementMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeasurementMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMeteringEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeteringEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeteringEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeteringEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleRate")(js.undefined)
        ret
    }
  }
  
}

