package typingsSlinky.pulumiAws.outputMod.elastictranscoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetAudio extends js.Object {
  /**
    * The method of organizing audio channels and tracks. Use Audio:Channels to specify the number of channels in your output, and Audio:AudioPackingMode to specify the number of tracks and their relation to the channels. If you do not specify an Audio:AudioPackingMode, Elastic Transcoder uses SingleTrack.
    */
  var audioPackingMode: js.UndefOr[String] = js.native
  /**
    * The bit rate of the video stream in the output file, in kilobits/second. You can configure variable bit rate or constant bit rate encoding.
    */
  var bitRate: js.UndefOr[String] = js.native
  /**
    * The number of audio channels in the output file
    */
  var channels: js.UndefOr[String] = js.native
  /**
    * The video codec for the output file. Valid values are `gif`, `H.264`, `mpeg2`, `vp8`, and `vp9`.
    */
  var codec: js.UndefOr[String] = js.native
  /**
    * The sample rate of the audio stream in the output file, in hertz. Valid values are: `auto`, `22050`, `32000`, `44100`, `48000`, `96000`
    */
  var sampleRate: js.UndefOr[String] = js.native
}

object PresetAudio {
  @scala.inline
  def apply(): PresetAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetAudio]
  }
  @scala.inline
  implicit class PresetAudioOps[Self <: PresetAudio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioPackingMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioPackingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioPackingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioPackingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withBitRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitRate")(js.undefined)
        ret
    }
    @scala.inline
    def withChannels(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(js.undefined)
        ret
    }
    @scala.inline
    def withCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(js.undefined)
        ret
    }
  }
  
}

