package typingsSlinky.expressBunyanLogger.mod

import typingsSlinky.express.mod.ErrorRequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-bunyan-logger", "errorLogger")
@js.native
object errorLogger extends js.Object {
  def apply(): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: Options): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
}

