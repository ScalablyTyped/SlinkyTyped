package typingsSlinky.restify.mod.plugins

import typingsSlinky.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify", "plugins.acceptParser")
@js.native
object acceptParser extends js.Object {
  
  // *************** This module includes the following header parser plugins:
  /**
    * Check the client's Accept header can be handled by this server.
    */
  def apply(accepts: js.Array[String]): RequestHandler = js.native
}
