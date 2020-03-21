package typingsSlinky.restify.mod.plugins

import typingsSlinky.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "plugins.inflightRequestThrottle")
@js.native
object inflightRequestThrottle extends js.Object {
  def apply(opts: InflightRequestThrottleOptions): RequestHandler = js.native
}

