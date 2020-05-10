package typingsSlinky.expressWinston.mod

import typingsSlinky.express.mod.ErrorRequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-winston", "errorLogger")
@js.native
object errorLogger extends js.Object {
  def apply(options: ErrorLoggerOptions): ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
}

