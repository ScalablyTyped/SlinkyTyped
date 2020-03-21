package typingsSlinky.expressHttpProxy.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-http-proxy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(host: String): RequestHandler[ParamsDictionary] = js.native
  def apply(host: String, options: ProxyOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(host: js.Function1[/* req */ Request_[ParamsDictionary], String]): RequestHandler[ParamsDictionary] = js.native
  def apply(host: js.Function1[/* req */ Request_[ParamsDictionary], String], options: ProxyOptions): RequestHandler[ParamsDictionary] = js.native
}

