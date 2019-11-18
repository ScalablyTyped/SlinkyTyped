package typingsSlinky.node.clusterMod

import typingsSlinky.node.netMod.Server
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.nodeStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "emit")
@js.native
object emit_message extends js.Object {
  def apply(event: message, worker: Worker, message: js.Any, handle: Server): Boolean = js.native
  def apply(event: message, worker: Worker, message: js.Any, handle: Socket): Boolean = js.native
}

