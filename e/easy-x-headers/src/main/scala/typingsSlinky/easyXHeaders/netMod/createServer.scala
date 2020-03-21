package typingsSlinky.easyXHeaders.netMod

import typingsSlinky.easyXHeaders.AnonAllowHalfOpenBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", "createServer")
@js.native
object createServer extends js.Object {
  def apply(): Server = js.native
  def apply(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  def apply(options: AnonAllowHalfOpenBoolean): Server = js.native
  def apply(options: AnonAllowHalfOpenBoolean, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
}

