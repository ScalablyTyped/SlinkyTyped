package typingsSlinky.restify.restifyMod.plugins

import typingsSlinky.restify.Anon_MaxBodySize
import typingsSlinky.restify.restifyMod.RequestHandler
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
  def apply(options: Anon_MaxBodySize): RequestHandler = js.native
}

