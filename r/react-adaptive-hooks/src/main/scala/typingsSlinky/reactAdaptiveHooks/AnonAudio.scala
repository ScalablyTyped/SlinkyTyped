package typingsSlinky.reactAdaptiveHooks

import typingsSlinky.reactAdaptiveHooks.mediaCapabilitiesMod.AudioMediaConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAudio extends js.Object {
  var audio: AudioMediaConfiguration = js.native
}

object AnonAudio {
  @scala.inline
  def apply(audio: AudioMediaConfiguration): AnonAudio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAudio]
  }
  @scala.inline
  implicit class AnonAudioOps[Self <: AnonAudio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio(value: AudioMediaConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

