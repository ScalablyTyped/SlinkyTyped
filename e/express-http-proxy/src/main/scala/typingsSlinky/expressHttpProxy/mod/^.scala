package typingsSlinky.expressHttpProxy.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-http-proxy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(host: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(host: String, options: ProxyOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(host: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(
    host: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String],
    options: ProxyOptions
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
