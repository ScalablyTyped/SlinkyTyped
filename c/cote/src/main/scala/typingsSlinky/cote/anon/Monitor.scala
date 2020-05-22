package typingsSlinky.cote.anon

import typingsSlinky.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monitor extends js.Object {
  var monitor: typingsSlinky.cote.mod.Monitor
  var server: Server
}

object Monitor {
  @scala.inline
  def apply(monitor: typingsSlinky.cote.mod.Monitor, server: Server): Monitor = {
    val __obj = js.Dynamic.literal(monitor = monitor.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Monitor]
  }
}

