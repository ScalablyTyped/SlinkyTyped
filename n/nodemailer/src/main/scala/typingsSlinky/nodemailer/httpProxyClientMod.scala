package typingsSlinky.nodemailer

import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.tlsMod.TLSSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodemailer/lib/smtp-connection/http-proxy-client", JSImport.Namespace)
@js.native
object httpProxyClientMod extends js.Object {
  
  /**
    * Establishes proxied connection to destinationPort
    */
  def apply(
    proxyUrl: String,
    destinationPort: Double,
    destinationHost: String,
    callback: js.Function2[/* err */ js.Error | Null, /* socket */ TLSSocket | Socket, Unit]
  ): Unit = js.native
}
