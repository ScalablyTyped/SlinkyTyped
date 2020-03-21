package typingsSlinky.connectModrewrite

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-modrewrite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(rewrites: js.Array[String]): RequestHandler[ParamsDictionary] = js.native
}

