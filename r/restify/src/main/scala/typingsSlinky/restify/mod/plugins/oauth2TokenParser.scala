package typingsSlinky.restify.mod.plugins

import typingsSlinky.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify", "plugins.oauth2TokenParser")
@js.native
object oauth2TokenParser extends js.Object {
  
  /**
    * Parse the client's request for an OAUTH2 access tokensTable
    *
    * Subsequent handlers will see `req.oauth2`, which looks like:
    * ```
    * {
    *    oauth2: {accessToken: 'mF_9.B5f-4.1JqM&p=q'}
    * }
    * ```
    */
  def apply(): RequestHandler = js.native
}
