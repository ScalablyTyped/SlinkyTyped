package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Incident extends js.Object {
  var active: Boolean = js.native
  var created_at: String = js.native
  var id: Double = js.native
  var updates: js.Array[Message] = js.native
}

object Incident {
  @scala.inline
  def apply(active: Boolean, created_at: String, id: Double, updates: js.Array[Message]): Incident = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updates = updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Incident]
  }
  @scala.inline
  implicit class IncidentOps[Self <: Incident] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdates(value: js.Array[Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

