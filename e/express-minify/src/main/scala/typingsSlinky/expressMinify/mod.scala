package typingsSlinky.expressMinify

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressMinify.ExpressMinifyInterfaces.ExpressMinifyOptions
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-minify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: ExpressMinifyOptions): RequestHandler[ParamsDictionary] = js.native
}

