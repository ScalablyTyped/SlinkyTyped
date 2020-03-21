package typingsSlinky.reduxFirstRouting.mod

import typingsSlinky.history.mod.Hash
import typingsSlinky.history.mod.Pathname
import typingsSlinky.history.mod.Search
import typingsSlinky.redux.mod.Action
import typingsSlinky.reduxFirstRouting.AnonHash
import typingsSlinky.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashLOCATION_CHANGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait locationChangeAction[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */] extends Action[ROUTERSlashLOCATION_CHANGE] {
  var payload: AnonHash[P, S, H]
}

object locationChangeAction {
  @scala.inline
  def apply[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](payload: AnonHash[P, S, H], `type`: ROUTERSlashLOCATION_CHANGE): locationChangeAction[P, S, H] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[locationChangeAction[P, S, H]]
  }
}

