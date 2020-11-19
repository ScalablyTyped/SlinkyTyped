package typingsSlinky.restifyCorsMiddleware.mod

import typingsSlinky.restify.mod.Next
import typingsSlinky.restify.mod.Request
import typingsSlinky.restify.mod.RequestHandler
import typingsSlinky.restify.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CorsMiddleware extends js.Object {
  
  def actual(req: Request, res: Response, next: Next): js.Any = js.native
  @JSName("actual")
  var actual_Original: RequestHandler = js.native
  
  def preflight(req: Request, res: Response, next: Next): js.Any = js.native
  @JSName("preflight")
  var preflight_Original: RequestHandler = js.native
}
