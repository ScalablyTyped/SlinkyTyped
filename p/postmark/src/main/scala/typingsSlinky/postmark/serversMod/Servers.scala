package typingsSlinky.postmark.serversMod

import typingsSlinky.postmark.serverMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Servers extends js.Object {
  var Servers: js.Array[Server] = js.native
  var TotalCount: Double = js.native
}

object Servers {
  @scala.inline
  def apply(Servers: js.Array[Server], TotalCount: Double): Servers = {
    val __obj = js.Dynamic.literal(Servers = Servers.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Servers]
  }
  @scala.inline
  implicit class ServersOps[Self <: Servers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServers(value: js.Array[Server]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Servers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

