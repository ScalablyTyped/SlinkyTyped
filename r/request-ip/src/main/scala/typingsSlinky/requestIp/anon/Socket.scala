package typingsSlinky.requestIp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  var remoteAddress: js.UndefOr[String] = js.native
  var socket: js.UndefOr[RemoteAddress] = js.native
}

object Socket {
  @scala.inline
  def apply(): Socket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Socket]
  }
  @scala.inline
  implicit class SocketOps[Self <: Socket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoteAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSocket(value: RemoteAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(js.undefined)
        ret
    }
  }
  
}

