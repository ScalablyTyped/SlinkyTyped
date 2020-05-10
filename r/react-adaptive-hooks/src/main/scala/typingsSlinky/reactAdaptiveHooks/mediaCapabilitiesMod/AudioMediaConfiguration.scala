package typingsSlinky.reactAdaptiveHooks.mediaCapabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioMediaConfiguration extends js.Object {
  var bitrate: Double = js.native
  var channels: Double = js.native
  var contentType: String = js.native
  var samplerate: Double = js.native
}

object AudioMediaConfiguration {
  @scala.inline
  def apply(bitrate: Double, channels: Double, contentType: String, samplerate: Double): AudioMediaConfiguration = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], samplerate = samplerate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioMediaConfiguration]
  }
  @scala.inline
  implicit class AudioMediaConfigurationOps[Self <: AudioMediaConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSamplerate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplerate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

