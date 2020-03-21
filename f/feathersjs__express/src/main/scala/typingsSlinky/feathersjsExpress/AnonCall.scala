package typingsSlinky.feathersjsExpress

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  @JSName("formatter")
  var formatter_Original: RequestHandler[ParamsDictionary] = js.native
  def apply(): js.Function0[Unit] = js.native
  def apply(handler: RequestHandler[ParamsDictionary]): js.Function0[Unit] = js.native
  def formatter(req: Request[ParamsDictionary, _, _], res: Response[_], next: NextFunction): js.Any = js.native
}

