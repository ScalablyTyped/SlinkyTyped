package typingsSlinky.gapiClientAppsactivity.gapi.client.appsactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Move extends js.Object {
  /** The added parent(s). */
  var addedParents: js.UndefOr[js.Array[Parent]] = js.native
  /** The removed parent(s). */
  var removedParents: js.UndefOr[js.Array[Parent]] = js.native
}

object Move {
  @scala.inline
  def apply(): Move = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Move]
  }
  @scala.inline
  implicit class MoveOps[Self <: Move] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedParents(value: js.Array[Parent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedParents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddedParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedParents")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovedParents(value: js.Array[Parent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedParents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovedParents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedParents")(js.undefined)
        ret
    }
  }
  
}

