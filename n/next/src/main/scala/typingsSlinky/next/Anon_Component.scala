package typingsSlinky.next

import typingsSlinky.next.distNextDashServerLibRouterRouterMod.NextRouter
import typingsSlinky.next.distNextDashServerLibUtilsMod.NextComponentType
import typingsSlinky.next.distNextDashServerLibUtilsMod.NextPageContext
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

