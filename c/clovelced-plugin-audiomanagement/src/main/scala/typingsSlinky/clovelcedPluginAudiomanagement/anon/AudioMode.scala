package typingsSlinky.clovelcedPluginAudiomanagement.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioMode extends js.Object {
  var audioMode: typingsSlinky.clovelcedPluginAudiomanagement.mod.AudioMode = js.native
  var label: String = js.native
}

object AudioMode {
  @scala.inline
  def apply(audioMode: typingsSlinky.clovelcedPluginAudiomanagement.mod.AudioMode, label: String): AudioMode = {
    val __obj = js.Dynamic.literal(audioMode = audioMode.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioMode]
  }
  @scala.inline
  implicit class AudioModeOps[Self <: AudioMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioMode(value: typingsSlinky.clovelcedPluginAudiomanagement.mod.AudioMode): Self = {
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

