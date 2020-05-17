package typingsSlinky.clovelcedPluginAudiomanagement.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxVolume extends js.Object {
  var maxVolume: Double = js.native
}

object MaxVolume {
  @scala.inline
  def apply(maxVolume: Double): MaxVolume = {
    val __obj = js.Dynamic.literal(maxVolume = maxVolume.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxVolume]
  }
  @scala.inline
  implicit class MaxVolumeOps[Self <: MaxVolume] (val x: Self) extends AnyVal {
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

