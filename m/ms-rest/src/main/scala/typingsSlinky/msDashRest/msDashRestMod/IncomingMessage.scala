package typingsSlinky.msDashRest.msDashRestMod

import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest", "IncomingMessage")
@js.native
class IncomingMessage protected ()
  extends typingsSlinky.node.httpMod.IncomingMessage {
  def this(socket: Socket) = this()
}

