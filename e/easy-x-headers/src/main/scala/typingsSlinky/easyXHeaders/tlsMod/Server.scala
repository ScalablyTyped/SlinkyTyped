package typingsSlinky.easyXHeaders.tlsMod

import typingsSlinky.easyXHeaders.anon.Ca
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends typingsSlinky.easyXHeaders.netMod.Server {
  def addContext(hostName: String, credentials: Ca): Unit = js.native
  def listen(port: Double, host: js.UndefOr[scala.Nothing], callback: js.Function): Server = js.native
  def listen(port: Double, host: String, callback: js.Function): Server = js.native
}

