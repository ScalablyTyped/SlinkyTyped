package typingsSlinky.netKeepalive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandle extends js.Object {
  var _handle: AnonFd = js.native
}

object AnonHandle {
  @scala.inline
  def apply(_handle: AnonFd): AnonHandle = {
    val __obj = js.Dynamic.literal(_handle = _handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandle]
  }
  @scala.inline
  implicit class AnonHandleOps[Self <: AnonHandle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_handle(value: AnonFd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_handle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

