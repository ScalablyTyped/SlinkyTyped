package typingsSlinky.clovelcedPluginAudiomanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxVolume extends js.Object {
  var maxVolume: Double = js.native
}

object AnonMaxVolume {
  @scala.inline
  def apply(maxVolume: Double): AnonMaxVolume = {
    val __obj = js.Dynamic.literal(maxVolume = maxVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxVolume]
  }
  @scala.inline
  implicit class AnonMaxVolumeOps[Self <: AnonMaxVolume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVolume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

