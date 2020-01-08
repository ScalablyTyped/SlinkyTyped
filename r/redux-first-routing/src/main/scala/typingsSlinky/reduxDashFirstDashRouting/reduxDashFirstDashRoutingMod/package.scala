package typingsSlinky.reduxDashFirstDashRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashFirstDashRoutingMod {
  import typingsSlinky.redux.reduxMod.Action
  import typingsSlinky.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.ROUTERSlashGO_BACK
  import typingsSlinky.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.ROUTERSlashGO_FORWARD

  type goBackAction = Action[ROUTERSlashGO_BACK]
  type goForwardAction = Action[ROUTERSlashGO_FORWARD]
}
