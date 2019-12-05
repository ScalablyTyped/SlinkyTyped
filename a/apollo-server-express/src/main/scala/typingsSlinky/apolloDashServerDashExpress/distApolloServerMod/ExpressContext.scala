package typingsSlinky.apolloDashServerDashExpress.distApolloServerMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.subscriptionsDashTransportDashWs.distServerMod.ExecutionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressContext extends js.Object {
  var connection: js.UndefOr[ExecutionParams[_]] = js.undefined
  var req: Request[ParamsDictionary]
  var res: Response
}

object ExpressContext {
  @scala.inline
  def apply(req: Request[ParamsDictionary], res: Response, connection: ExecutionParams[_] = null): ExpressContext = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressContext]
  }
}

