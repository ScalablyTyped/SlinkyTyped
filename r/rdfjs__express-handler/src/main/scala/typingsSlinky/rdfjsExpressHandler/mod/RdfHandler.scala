package typingsSlinky.rdfjsExpressHandler.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RdfHandler extends js.Object {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: RdfHandlerOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def attach(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): js.Promise[Unit] = js.native
}
