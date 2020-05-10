package typingsSlinky.reduxFirstRouting.mod

import typingsSlinky.history.mod.LocationDescriptorObject
import typingsSlinky.history.mod.LocationState
import typingsSlinky.history.mod.Path
import typingsSlinky.redux.mod.Action
import typingsSlinky.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashREPLACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait replaceAction[T /* <: Path | LocationDescriptorObject[LocationState] */] extends Action[ROUTERSlashREPLACE] {
  var payload: T = js.native
}

object replaceAction {
  @scala.inline
  def apply[T](payload: T, `type`: ROUTERSlashREPLACE): replaceAction[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[replaceAction[T]]
  }
  @scala.inline
  implicit class replaceActionOps[Self[t] <: replaceAction[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPayload(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

