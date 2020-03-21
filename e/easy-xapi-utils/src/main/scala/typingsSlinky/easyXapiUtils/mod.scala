package typingsSlinky.easyXapiUtils

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-xapi-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def hasRole(role: String): RequestHandler[ParamsDictionary] = js.native
  def isLoggedIn(): RequestHandler[ParamsDictionary] = js.native
  def isLoggedIn(role: String): RequestHandler[ParamsDictionary] = js.native
  def isLoggedOut(): RequestHandler[ParamsDictionary] = js.native
}

