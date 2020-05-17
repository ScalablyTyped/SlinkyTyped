package typingsSlinky.reduxFirstRouting.mod

import typingsSlinky.history.mod.Hash
import typingsSlinky.history.mod.Pathname
import typingsSlinky.history.mod.Search
import typingsSlinky.redux.mod.Action
import typingsSlinky.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashLOCATION_CHANGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait locationChangeAction[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */] extends Action[ROUTERSlashLOCATION_CHANGE] {
  var payload: typingsSlinky.reduxFirstRouting.anon.Hash[P, S, H] = js.native
}

object locationChangeAction {
  @scala.inline
  def apply[P, S, H](payload: typingsSlinky.reduxFirstRouting.anon.Hash[P, S, H], `type`: ROUTERSlashLOCATION_CHANGE): locationChangeAction[P, S, H] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[locationChangeAction[P, S, H]]
  }
  @scala.inline
  implicit class locationChangeActionOps[Self[p, s, h] <: locationChangeAction[p, s, h], P, S, H] (val x: Self[P, S, H]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, S, H] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, S, H]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, S, H]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, S, H]) with Other]
    @scala.inline
    def withPayload(value: typingsSlinky.reduxFirstRouting.anon.Hash[P, S, H]): Self[P, S, H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

