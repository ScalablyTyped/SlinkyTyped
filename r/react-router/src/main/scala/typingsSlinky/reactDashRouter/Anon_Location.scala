package typingsSlinky.reactDashRouter

import typingsSlinky.history.historyMod.Location
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashRouter.reactDashRouterMod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.reactDashRouter.reactDashRouterStrings.Anon_Location with js.Any */] extends js.Object {
  var location: Location[LocationState]
  var `match`: typingsSlinky.reactDashRouter.reactDashRouterMod.`match`[Params]
}

object Anon_Location {
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactDashRouter.reactDashRouterStrings.Anon_Location with js.Any */](location: Location[LocationState], `match`: `match`[Params]): Anon_Location[Params] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Location[Params]]
  }
}

