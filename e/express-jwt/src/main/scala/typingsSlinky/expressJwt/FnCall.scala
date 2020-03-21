package typingsSlinky.expressJwt

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressUnless.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(options: js.Function1[/* req */ Request_[ParamsDictionary], Boolean]): RequestHandler[ParamsDictionary] = js.native
  def apply(options: Options): RequestHandler[ParamsDictionary] = js.native
}

