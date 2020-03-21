package typingsSlinky.lusca.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", "hsts")
@js.native
object hsts extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: hstsOptions): RequestHandler[ParamsDictionary] = js.native
}

