package typingsSlinky.inversifyDashExpressDashUtils

import typingsSlinky.express.expressMod.NextFunction
import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.BindingToSyntax
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typingsSlinky.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.HttpContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/base_middleware", JSImport.Namespace)
@js.native
object dtsBaseUnderscoreMiddlewareMod extends js.Object {
  @js.native
  abstract class BaseMiddleware () extends js.Object {
    val httpContext: HttpContext = js.native
    /* protected */ def bind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
    def handler(req: Request[ParamsDictionary], res: Response, next: NextFunction): Unit = js.native
  }
  
}

