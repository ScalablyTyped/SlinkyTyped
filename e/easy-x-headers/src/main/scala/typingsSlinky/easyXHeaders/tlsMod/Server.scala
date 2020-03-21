package typingsSlinky.easyXHeaders.tlsMod

import typingsSlinky.easyXHeaders.AnonCa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends typingsSlinky.easyXHeaders.netMod.Server {
  def addContext(hostName: String, credentials: AnonCa): Unit = js.native
  def listen(port: Double, host: String, callback: js.Function): Server = js.native
}

