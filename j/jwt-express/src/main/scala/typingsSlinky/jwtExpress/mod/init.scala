package typingsSlinky.jwtExpress.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jwt-express", "init")
@js.native
object init extends js.Object {
  
  def apply(secret: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(secret: String, options: JWTExpressOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(secret: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(
    secret: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String],
    options: JWTExpressOptions
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
