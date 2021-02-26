package typingsSlinky.expressAsyncWrap

import typingsSlinky.connect.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ErrorRequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-async-wrap", JSImport.Default)
  @js.native
  def default(
    handler: js.Function3[
      /* req */ Request[ParamsDictionary, _, _, ParsedQs], 
      /* res */ Response[_, Double], 
      /* next */ NextFunction, 
      js.Promise[Unit]
    ]
  ): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  @JSImport("express-async-wrap", JSImport.Default)
  @js.native
  def default(
    handler: js.Function4[
      /* err */ js.Any, 
      /* req */ Request[ParamsDictionary, _, _, ParsedQs], 
      /* res */ Response[_, Double], 
      /* next */ NextFunction, 
      js.Promise[Unit]
    ]
  ): ErrorRequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
}
