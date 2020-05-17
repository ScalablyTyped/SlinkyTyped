package typingsSlinky.expressCorrelationId

import typingsSlinky.expressCorrelationId.anon.Header
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-correlation-id", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: Header): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def getId(): js.UndefOr[String] = js.native
}

