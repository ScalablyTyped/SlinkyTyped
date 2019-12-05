package typingsSlinky.expressDashPaginate.expressDashPaginateMod

import typingsSlinky.express.expressMod.NextFunction
import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-paginate", "middleware")
@js.native
object middleware extends js.Object {
  def apply(): js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction, Unit] = js.native
  def apply(limit: Double): js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction, Unit] = js.native
  def apply(limit: Double, maxLimit: Double): js.Function3[/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction, Unit] = js.native
}

