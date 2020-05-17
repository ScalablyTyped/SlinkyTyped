package typingsSlinky.restify.mod.plugins

import typingsSlinky.restify.anon.MaxBodySize
import typingsSlinky.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.bodyReader")
@js.native
object bodyReader extends js.Object {
  /**
    * Reads the body of the request.
    */
  def apply(): RequestHandler = js.native
  def apply(options: MaxBodySize): RequestHandler = js.native
}

