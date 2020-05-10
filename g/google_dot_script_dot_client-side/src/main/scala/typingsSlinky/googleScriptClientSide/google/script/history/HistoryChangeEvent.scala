package typingsSlinky.googleScriptClientSide.google.script.history

import typingsSlinky.googleScriptClientSide.google.script.UrlLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryChangeEvent extends js.Object {
  /**
    * A location object associated with the popped event
    */
  var location: UrlLocation = js.native
  /**
    * The state object associated with the popped event.
    * This object is identical to the state object that used in the corresponding push() or replace() method that added the popped state to the history stack.
    */
  var state: State = js.native
}

object HistoryChangeEvent {
  @scala.inline
  def apply(location: UrlLocation): HistoryChangeEvent = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryChangeEvent]
  }
  @scala.inline
  implicit class HistoryChangeEventOps[Self <: HistoryChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: UrlLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(null)
        ret
    }
  }
  
}

