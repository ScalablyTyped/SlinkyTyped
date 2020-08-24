package typingsSlinky.expressUnless.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-unless", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Boolean]): typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: Options): typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

