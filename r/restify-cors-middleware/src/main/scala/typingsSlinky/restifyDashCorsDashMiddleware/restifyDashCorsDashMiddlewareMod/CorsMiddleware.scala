package typingsSlinky.restifyDashCorsDashMiddleware.restifyDashCorsDashMiddlewareMod

import typingsSlinky.restify.restifyMod.Next
import typingsSlinky.restify.restifyMod.Request
import typingsSlinky.restify.restifyMod.RequestHandler
import typingsSlinky.restify.restifyMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorsMiddleware extends js.Object {
  @JSName("actual")
  var actual_Original: RequestHandler = js.native
  @JSName("preflight")
  var preflight_Original: RequestHandler = js.native
  def actual(req: Request, res: Response, next: Next): js.Any = js.native
  def preflight(req: Request, res: Response, next: Next): js.Any = js.native
}

