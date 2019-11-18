package typingsSlinky.node.clusterMod

import typingsSlinky.node.netMod.Server
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.nodeStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "once")
@js.native
object once_message extends js.Object {
  def apply(
    event: message,
    listener: js.Function3[/* worker */ Worker, /* message */ js.Any, /* handle */ Socket | Server, Unit]
  ): Cluster = js.native
}

