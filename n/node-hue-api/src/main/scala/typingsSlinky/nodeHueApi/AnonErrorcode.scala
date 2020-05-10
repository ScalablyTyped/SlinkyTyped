package typingsSlinky.nodeHueApi

import typingsSlinky.nodeHueApi.mod.BackupStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorcode extends js.Object {
  var errorcode: Double = js.native
  var status: BackupStatus = js.native
}

object AnonErrorcode {
  @scala.inline
  def apply(errorcode: Double, status: BackupStatus): AnonErrorcode = {
    val __obj = js.Dynamic.literal(errorcode = errorcode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorcode]
  }
  @scala.inline
  implicit class AnonErrorcodeOps[Self <: AnonErrorcode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorcode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: BackupStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

