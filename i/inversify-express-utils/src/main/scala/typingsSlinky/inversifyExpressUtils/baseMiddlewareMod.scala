package typingsSlinky.inversifyExpressUtils

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.inversify.interfacesMod.interfaces.BindingToSyntax
import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.HttpContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMiddlewareMod {
  
  @JSImport("inversify-express-utils/dts/base_middleware", "BaseMiddleware")
  @js.native
  abstract class BaseMiddleware () extends StObject {
    
    /* protected */ def bind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
    
    def handler(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], next: NextFunction): Unit = js.native
    
    val httpContext: HttpContext = js.native
  }
}
