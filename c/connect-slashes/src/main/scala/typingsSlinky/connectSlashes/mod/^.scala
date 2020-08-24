package typingsSlinky.connectSlashes.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-slashes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * @see https://github.com/avinoamr/connect-slashes#usage
    */
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(addTrailingSlashes: js.UndefOr[scala.Nothing], options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(addTrailingSlashes: Boolean): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(addTrailingSlashes: Boolean, options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

