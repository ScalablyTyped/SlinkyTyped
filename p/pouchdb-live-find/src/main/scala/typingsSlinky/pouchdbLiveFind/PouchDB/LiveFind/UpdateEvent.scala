package typingsSlinky.pouchdbLiveFind.PouchDB.LiveFind

import typingsSlinky.pouchdbLiveFind.pouchdbLiveFindStrings.ADD
import typingsSlinky.pouchdbLiveFind.pouchdbLiveFindStrings.REMOVE
import typingsSlinky.pouchdbLiveFind.pouchdbLiveFindStrings.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEvent extends js.Object {
  var action: REMOVE | ADD | UPDATE = js.native
  var doc: js.Any = js.native
  var id: js.Any = js.native
  var rev: js.Any = js.native
}

object UpdateEvent {
  @scala.inline
  def apply(action: REMOVE | ADD | UPDATE, doc: js.Any, id: js.Any, rev: js.Any): UpdateEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], doc = doc.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEvent]
  }
  @scala.inline
  implicit class UpdateEventOps[Self <: UpdateEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: REMOVE | ADD | UPDATE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRev(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rev")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

