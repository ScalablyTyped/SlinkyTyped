package typingsSlinky.escpos.escposMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("escpos", "Server")
@js.native
class Server protected ()
  extends typingsSlinky.node.netMod.Server {
  def this(device: Adapter) = this()
  def request(client: js.Any): Unit = js.native
}

