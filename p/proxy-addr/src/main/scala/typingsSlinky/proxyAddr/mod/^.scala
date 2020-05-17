package typingsSlinky.proxyAddr.mod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proxy-addr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(req: IncomingMessage, trust: js.Array[Address]): String = js.native
  def apply(req: IncomingMessage, trust: js.Function2[/* addr */ String, /* i */ Double, Boolean]): String = js.native
  def apply(req: IncomingMessage, trust: Address): String = js.native
}

