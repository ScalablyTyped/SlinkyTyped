package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceInterfaces extends js.Object {
  var AudioPlayer: js.Any = js.native
  var Display: js.Any = js.native
}

object DeviceInterfaces {
  @scala.inline
  def apply(AudioPlayer: js.Any, Display: js.Any): DeviceInterfaces = {
    val __obj = js.Dynamic.literal(AudioPlayer = AudioPlayer.asInstanceOf[js.Any], Display = Display.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInterfaces]
  }
  @scala.inline
  implicit class DeviceInterfacesOps[Self <: DeviceInterfaces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioPlayer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioPlayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Display")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

