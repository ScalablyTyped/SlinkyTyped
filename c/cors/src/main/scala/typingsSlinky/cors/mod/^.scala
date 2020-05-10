package typingsSlinky.cors.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: CorsOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: CorsOptionsDelegate): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

