package typingsSlinky.cote

import typingsSlinky.cote.mod.Monitor
import typingsSlinky.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMonitor extends js.Object {
  var monitor: Monitor = js.native
  var server: Server = js.native
}

object AnonMonitor {
  @scala.inline
  def apply(monitor: Monitor, server: Server): AnonMonitor = {
    val __obj = js.Dynamic.literal(monitor = monitor.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMonitor]
  }
  @scala.inline
  implicit class AnonMonitorOps[Self <: AnonMonitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonitor(value: Monitor): Self = {
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

