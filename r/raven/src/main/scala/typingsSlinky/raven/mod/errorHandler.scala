package typingsSlinky.raven.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raven", "errorHandler")
@js.native
object errorHandler extends js.Object {
  
  def apply(): js.Function4[
    /* e */ js.Error, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
}
