package typingsSlinky.cote.anon

import typingsSlinky.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Monitor extends js.Object {
  var monitor: typingsSlinky.cote.mod.Monitor = js.native
  var server: Server = js.native
}

object Monitor {
  @scala.inline
  def apply(monitor: typingsSlinky.cote.mod.Monitor, server: Server): Monitor = {
    val __obj = js.Dynamic.literal(monitor = monitor.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Monitor]
  }
  @scala.inline
  implicit class MonitorOps[Self <: Monitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonitor(value: typingsSlinky.cote.mod.Monitor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer(value: Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

