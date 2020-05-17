package typingsSlinky.basicauthMiddleware.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("basicauth-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(checkFnOrUsers: js.Array[js.Tuple2[String, String]]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(checkFnOrUsers: js.Array[js.Tuple2[String, String]], realm: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(checkFnOrUsers: CheckFunction): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(checkFnOrUsers: CheckFunction, realm: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(username: String, password: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(username: String, password: String, realm: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

