package typingsSlinky.loopback.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("loopback", "rewriteUserLiteral")
@js.native
object rewriteUserLiteral extends js.Object {
  
  /**
    * Rewrite the url to replace current user literal with the logged in user id
    */
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
