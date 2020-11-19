package typingsSlinky.rdfjsExpressHandler.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.rdfjsExpressHandler.mod.expressAugmentingMod.Request
import typingsSlinky.rdfjsExpressHandler.mod.expressAugmentingMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RdfHandler extends js.Object {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: RdfHandlerOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def attach(req: Request, res: Response): js.Promise[Unit] = js.native
}
