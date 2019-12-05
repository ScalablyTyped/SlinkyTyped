package typingsSlinky.reactDashRouterDashConfig.reactDashRouterDashConfigMod

import typingsSlinky.reactDashRouter.reactDashRouterMod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedRoute[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.reactDashRouterDashConfig.reactDashRouterDashConfigStrings.MatchedRoute with js.Any */] extends js.Object {
  var `match`: typingsSlinky.reactDashRouter.reactDashRouterMod.`match`[Params]
  var route: RouteConfig
}

object MatchedRoute {
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactDashRouterDashConfig.reactDashRouterDashConfigStrings.MatchedRoute with js.Any */](`match`: `match`[Params], route: RouteConfig): MatchedRoute[Params] = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedRoute[Params]]
  }
}

