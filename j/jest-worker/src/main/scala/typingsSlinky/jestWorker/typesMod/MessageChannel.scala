package typingsSlinky.jestWorker.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageChannel extends js.Object {
  var port1: MessagePort = js.native
  var port2: MessagePort = js.native
}

object MessageChannel {
  @scala.inline
  def apply(port1: MessagePort, port2: MessagePort): MessageChannel = {
    val __obj = js.Dynamic.literal(port1 = port1.asInstanceOf[js.Any], port2 = port2.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageChannel]
  }
  @scala.inline
  implicit class MessageChannelOps[Self <: MessageChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort1(value: MessagePort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort2(value: MessagePort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

