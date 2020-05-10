package typingsSlinky.discordRpc.mod

import typingsSlinky.discordRpc.discordRpcStrings.ipc
import typingsSlinky.discordRpc.discordRpcStrings.websocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RPCClientOptions extends js.Object {
  var transport: ipc | websocket = js.native
}

object RPCClientOptions {
  @scala.inline
  def apply(transport: ipc | websocket): RPCClientOptions = {
    val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCClientOptions]
  }
  @scala.inline
  implicit class RPCClientOptionsOps[Self <: RPCClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransport(value: ipc | websocket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

