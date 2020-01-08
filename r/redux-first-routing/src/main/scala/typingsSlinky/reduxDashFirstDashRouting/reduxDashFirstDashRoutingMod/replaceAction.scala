package typingsSlinky.reduxDashFirstDashRouting.reduxDashFirstDashRoutingMod

import typingsSlinky.history.historyMod.LocationDescriptorObject
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.history.historyMod.Path
import typingsSlinky.redux.reduxMod.Action
import typingsSlinky.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.ROUTERSlashREPLACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait replaceAction[T /* <: Path | LocationDescriptorObject[LocationState] */] extends Action[ROUTERSlashREPLACE] {
  var payload: T
}

object replaceAction {
  @scala.inline
  def apply[T /* <: Path | LocationDescriptorObject[LocationState] */](payload: T, `type`: ROUTERSlashREPLACE): replaceAction[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[replaceAction[T]]
  }
}

