package typingsSlinky.reduxDashFirstDashRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashFirstDashRoutingMod {
  import typingsSlinky.redux.reduxMod.Action
  import typingsSlinky.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.`ROUTER/GO_BACK`
  import typingsSlinky.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.`ROUTER/GO_FORWARD`

  type goBackAction = Action[`ROUTER/GO_BACK`]
  type goForwardAction = Action[`ROUTER/GO_FORWARD`]
}
