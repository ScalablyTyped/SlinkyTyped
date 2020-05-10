package typingsSlinky.onfleetNodeOnfleet.teamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnfleetTeam extends js.Object {
  var hub: String = js.native
  var id: String = js.native
  var managers: js.Array[String] = js.native
  var name: String = js.native
  var timeCreated: Double = js.native
  var timeLastModified: Double = js.native
  var workers: js.Array[String] = js.native
}

object OnfleetTeam {
  @scala.inline
  def apply(
    hub: String,
    id: String,
    managers: js.Array[String],
    name: String,
    timeCreated: Double,
    timeLastModified: Double,
    workers: js.Array[String]
  ): OnfleetTeam = {
    val __obj = js.Dynamic.literal(hub = hub.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetTeam]
  }
  @scala.inline
  implicit class OnfleetTeamOps[Self <: OnfleetTeam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManagers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeLastModified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

