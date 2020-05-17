package typingsSlinky.netKeepalive.anon

import typingsSlinky.netKeepalive.mod.NodeJSSocketWithFileDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handle extends NodeJSSocketWithFileDescriptor {
  var _handle: Fd = js.native
}

object Handle {
  @scala.inline
  def apply(_handle: Fd): Handle = {
    val __obj = js.Dynamic.literal(_handle = _handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handle]
  }
  @scala.inline
  implicit class HandleOps[Self <: Handle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_handle(value: Fd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_handle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

