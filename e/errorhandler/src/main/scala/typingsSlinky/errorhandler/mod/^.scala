package typingsSlinky.errorhandler.mod

import typingsSlinky.express.mod.ErrorRequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("errorhandler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Create new middleware to handle errors and respond with content negotiation.
    */
  def apply(): ErrorRequestHandler[ParamsDictionary] = js.native
  def apply(options: Options): ErrorRequestHandler[ParamsDictionary] = js.native
}

