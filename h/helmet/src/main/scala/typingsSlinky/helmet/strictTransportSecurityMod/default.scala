package typingsSlinky.helmet.strictTransportSecurityMod

import typingsSlinky.helmet.anon.ReadonlyStrictTransportSe
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("helmet/dist/middlewares/strict-transport-security", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  def apply(options: ReadonlyStrictTransportSe): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
}
