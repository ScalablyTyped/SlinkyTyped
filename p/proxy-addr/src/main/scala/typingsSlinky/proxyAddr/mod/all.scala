package typingsSlinky.proxyAddr.mod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proxy-addr", "all")
@js.native
object all extends js.Object {
  def apply(req: IncomingMessage): js.Array[String] = js.native
  def apply(req: IncomingMessage, trust: js.Array[Address]): js.Array[String] = js.native
  def apply(req: IncomingMessage, trust: js.Function2[/* addr */ String, /* i */ Double, Boolean]): js.Array[String] = js.native
  def apply(req: IncomingMessage, trust: Address): js.Array[String] = js.native
}

