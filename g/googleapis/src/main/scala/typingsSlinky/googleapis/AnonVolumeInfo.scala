package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVolumeInfo extends js.Object {
  var volumeInfo: js.UndefOr[js.Array[AnonStorageFree]] = js.native
}

object AnonVolumeInfo {
  @scala.inline
  def apply(): AnonVolumeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonVolumeInfo]
  }
  @scala.inline
  implicit class AnonVolumeInfoOps[Self <: AnonVolumeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVolumeInfo(value: js.Array[AnonStorageFree]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeInfo")(js.undefined)
        ret
    }
  }
  
}

