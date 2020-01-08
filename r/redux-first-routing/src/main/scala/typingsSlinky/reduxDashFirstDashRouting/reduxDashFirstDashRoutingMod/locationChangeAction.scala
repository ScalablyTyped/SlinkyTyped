package typingsSlinky.reduxDashFirstDashRouting.reduxDashFirstDashRoutingMod

import typingsSlinky.history.historyMod.Hash
import typingsSlinky.history.historyMod.Pathname
import typingsSlinky.history.historyMod.Search
import typingsSlinky.redux.reduxMod.Action
import typingsSlinky.reduxDashFirstDashRouting.Anon_Hash
import typingsSlinky.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.ROUTERSlashLOCATION_CHANGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait locationChangeAction[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */] extends Action[ROUTERSlashLOCATION_CHANGE] {
  var payload: Anon_Hash[P, S, H]
}

object locationChangeAction {
  @scala.inline
  def apply[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](payload: Anon_Hash[P, S, H], `type`: ROUTERSlashLOCATION_CHANGE): locationChangeAction[P, S, H] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[locationChangeAction[P, S, H]]
  }
}

