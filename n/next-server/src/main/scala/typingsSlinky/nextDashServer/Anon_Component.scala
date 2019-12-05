package typingsSlinky.nextDashServer

import typingsSlinky.nextDashServer.distLibRouterRouterMod.NextRouter
import typingsSlinky.nextDashServer.distLibUtilsMod.NextComponentType
import typingsSlinky.nextDashServer.distLibUtilsMod.NextPageContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component[P, R /* <: NextRouter */] extends js.Object {
  var Component: NextComponentType[NextPageContext, _, P]
  var router: R
}

object Anon_Component {
  @scala.inline
  def apply[P, R /* <: NextRouter */](Component: NextComponentType[NextPageContext, _, P], router: R): Anon_Component[P, R] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Component[P, R]]
  }
}

