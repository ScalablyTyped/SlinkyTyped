package typingsSlinky.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions extends js.Object {
  var actions: js.Array[_] = js.native
  var events: js.Array[_] = js.native
  var failureNotes: String = js.native
  var failureReason: String = js.native
  var firstLocation: js.Array[_] = js.native
  var lastLocation: js.Array[_] = js.native
  var time: Double | Null = js.native
  var unavailableAttachments: js.Array[_] = js.native
}

object Actions {
  @scala.inline
  def apply(
    actions: js.Array[_],
    events: js.Array[_],
    failureNotes: String,
    failureReason: String,
    firstLocation: js.Array[_],
    lastLocation: js.Array[_],
    unavailableAttachments: js.Array[_]
  ): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], failureNotes = failureNotes.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], firstLocation = firstLocation.asInstanceOf[js.Any], lastLocation = lastLocation.asInstanceOf[js.Any], unavailableAttachments = unavailableAttachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  @scala.inline
  implicit class ActionsOps[Self <: Actions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstLocation(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastLocation(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnavailableAttachments(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unavailableAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(null)
        ret
    }
  }
  
}

