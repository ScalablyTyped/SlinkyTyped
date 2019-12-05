package typingsSlinky.basicauthDashMiddleware

import typingsSlinky.basicauthDashMiddleware.basicauthDashMiddlewareMod.CheckFunction
import typingsSlinky.basicauthDashMiddleware.basicauthDashMiddlewareMod.checkFunctionCallback
import typingsSlinky.basicauthDashMiddleware.basicauthDashMiddlewareMod.checkFunctionPromise
import typingsSlinky.basicauthDashMiddleware.basicauthDashMiddlewareMod.checkFunctionSync
import typingsSlinky.express.expressMod.RequestHandler
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("basicauth-middleware", JSImport.Namespace)
@js.native
object basicauthDashMiddlewareMod extends js.Object {
  def apply(checkFnOrUsers: js.Array[js.Tuple2[String, String]]): RequestHandler[ParamsDictionary] = js.native
  def apply(checkFnOrUsers: js.Array[js.Tuple2[String, String]], realm: String): RequestHandler[ParamsDictionary] = js.native
  def apply(checkFnOrUsers: CheckFunction): RequestHandler[ParamsDictionary] = js.native
  def apply(checkFnOrUsers: CheckFunction, realm: String): RequestHandler[ParamsDictionary] = js.native
  def apply(username: String, password: String): RequestHandler[ParamsDictionary] = js.native
  def apply(username: String, password: String, realm: String): RequestHandler[ParamsDictionary] = js.native
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

