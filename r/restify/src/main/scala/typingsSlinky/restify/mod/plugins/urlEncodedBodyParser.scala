package typingsSlinky.restify.mod.plugins

import typingsSlinky.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restify", "plugins.urlEncodedBodyParser")
@js.native
object urlEncodedBodyParser extends js.Object {
  
  /**
    * Parse the HTTP request body IFF the contentType is application/x-www-form-urlencoded.
    *
    * If req.params already contains a given key, that key is skipped and an
    * error is logged.
    */
  def apply(): js.Array[RequestHandler] = js.native
  def apply(options: UrlEncodedBodyParserOptions): js.Array[RequestHandler] = js.native
}
