package typingsSlinky.chrome.chrome.cast.media

import typingsSlinky.chrome.chrome.cast.Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeRequest extends js.Object {
  var customData: js.Object = js.native
  var volume: Volume = js.native
}

object VolumeRequest {
  @scala.inline
  def apply(customData: js.Object, volume: Volume): VolumeRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeRequest]
  }
  @scala.inline
  implicit class VolumeRequestOps[Self <: VolumeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: Volume): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

