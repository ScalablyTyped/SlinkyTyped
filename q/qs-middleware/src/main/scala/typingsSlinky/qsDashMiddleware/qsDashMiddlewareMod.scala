package typingsSlinky.qsDashMiddleware

import typingsSlinky.express.expressMod.RequestHandler
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.qs.qsMod.IParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qs-middleware", JSImport.Namespace)
@js.native
object qsDashMiddlewareMod extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: IParseOptions): RequestHandler[ParamsDictionary] = js.native
}

