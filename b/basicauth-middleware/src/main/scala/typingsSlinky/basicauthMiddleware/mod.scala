package typingsSlinky.basicauthMiddleware

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("basicauth-middleware", JSImport.Namespace)
  @js.native
  def apply(checkFnOrUsers: js.Array[js.Tuple2[String, String]]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("basicauth-middleware", JSImport.Namespace)
  @js.native
  def apply(checkFnOrUsers: js.Array[js.Tuple2[String, String]], realm: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("basicauth-middleware", JSImport.Namespace)
  @js.native
  def apply(checkFnOrUsers: CheckFunction): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("basicauth-middleware", JSImport.Namespace)
  @js.native
  def apply(checkFnOrUsers: CheckFunction, realm: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("basicauth-middleware", JSImport.Namespace)
  @js.native
  def apply(username: String, password: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("basicauth-middleware", JSImport.Namespace)
  @js.native
  def apply(username: String, password: String, realm: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  type CheckFunction = checkFunctionSync | checkFunctionPromise | checkFunctionCallback
  
  type checkFunctionCallback = js.Function3[
    /* username */ String, 
    /* password */ String, 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* authorized */ Boolean, Unit], 
    Unit
  ]
  
  type checkFunctionPromise = js.Function2[/* username */ String, /* password */ String, js.Thenable[Boolean]]
  
  type checkFunctionSync = js.Function2[/* username */ String, /* password */ String, Boolean]
}
