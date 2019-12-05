package typingsSlinky.nodeDashRal.nodeDashRalMod

import typingsSlinky.express.expressMod.NextFunction
import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", "Middleware")
@js.native
object Middleware extends js.Object {
  def apply(): js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* resp */ Response, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  def apply(options: Service): js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* resp */ Response, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
}

