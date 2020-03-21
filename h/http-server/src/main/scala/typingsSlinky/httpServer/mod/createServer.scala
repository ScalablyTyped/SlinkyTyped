package typingsSlinky.httpServer.mod

import typingsSlinky.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-server", "createServer")
@js.native
object createServer extends js.Object {
  def apply(): Server | typingsSlinky.node.httpsMod.Server = js.native
  def apply(options: Options): Server | typingsSlinky.node.httpsMod.Server = js.native
}

