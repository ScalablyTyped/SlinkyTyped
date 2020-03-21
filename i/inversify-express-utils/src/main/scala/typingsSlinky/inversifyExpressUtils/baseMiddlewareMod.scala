package typingsSlinky.inversifyExpressUtils

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.inversify.interfacesMod.interfaces.BindingToSyntax
import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.HttpContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/base_middleware", JSImport.Namespace)
@js.native
object baseMiddlewareMod extends js.Object {
  @js.native
  abstract class BaseMiddleware () extends js.Object {
    val httpContext: HttpContext = js.native
    /* protected */ def bind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
    def handler(req: Request_[ParamsDictionary], res: Response_, next: NextFunction): Unit = js.native
  }
  
}

