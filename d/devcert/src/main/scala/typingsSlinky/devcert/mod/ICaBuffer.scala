package typingsSlinky.devcert.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICaBuffer
  extends IReturnCa[js.Any] {
  var ca: Buffer = js.native
}

object ICaBuffer {
  @scala.inline
  def apply(ca: Buffer): ICaBuffer = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICaBuffer]
  }
  @scala.inline
  implicit class ICaBufferOps[Self <: ICaBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCa(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

