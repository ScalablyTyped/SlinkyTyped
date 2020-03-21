package typingsSlinky.restify.mod.plugins

import typingsSlinky.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.multipartBodyParser")
@js.native
object multipartBodyParser extends js.Object {
  /**
    * Parses JSONP callback
    */
  def apply(): RequestHandler = js.native
  def apply(options: MultipartBodyParser_): RequestHandler = js.native
}

