package typingsSlinky.clovelcedPluginAudiomanagement

import typingsSlinky.clovelcedPluginAudiomanagement.mod.AudioMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAudioMode extends js.Object {
  var audioMode: AudioMode = js.native
  var label: String = js.native
}

object AnonAudioMode {
  @scala.inline
  def apply(audioMode: AudioMode, label: String): AnonAudioMode = {
    val __obj = js.Dynamic.literal(audioMode = audioMode.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAudioMode]
  }
  @scala.inline
  implicit class AnonAudioModeOps[Self <: AnonAudioMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioMode(value: AudioMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

