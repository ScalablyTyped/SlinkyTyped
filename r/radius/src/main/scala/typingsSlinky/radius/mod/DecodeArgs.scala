package typingsSlinky.radius.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/retailnext/node-radius#radiusdecode_without_secretargs} for more info.
  **/
@js.native
trait DecodeArgs extends js.Object {
  var packet: Buffer = js.native
}

object DecodeArgs {
  @scala.inline
  def apply(packet: Buffer): DecodeArgs = {
    val __obj = js.Dynamic.literal(packet = packet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeArgs]
  }
  @scala.inline
  implicit class DecodeArgsOps[Self <: DecodeArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPacket(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

