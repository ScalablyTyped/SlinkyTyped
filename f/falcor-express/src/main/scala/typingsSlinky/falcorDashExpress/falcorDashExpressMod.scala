package typingsSlinky.falcorDashExpress

import typingsSlinky.express.expressMod.Handler
import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.falcor.falcorMod.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("falcor-express", JSImport.Namespace)
@js.native
object falcorDashExpressMod extends js.Object {
  def dataSourceRoute(getDataSource: js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, DataSource]): Handler = js.native
}

