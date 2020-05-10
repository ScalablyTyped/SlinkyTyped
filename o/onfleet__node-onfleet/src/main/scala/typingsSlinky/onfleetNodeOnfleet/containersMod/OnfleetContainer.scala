package typingsSlinky.onfleetNodeOnfleet.containersMod

import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.ORGANIZATION
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.TEAM
import typingsSlinky.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.WORKER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnfleetContainer extends js.Object {
  var activeTask: String | Null = js.native
  var id: String = js.native
  var organization: String = js.native
  var tasks: js.Array[String] = js.native
  var timeCreated: Double = js.native
  var timeLastModified: Double = js.native
  var `type`: ORGANIZATION | TEAM | WORKER = js.native
  var worker: String = js.native
}

object OnfleetContainer {
  @scala.inline
  def apply(
    id: String,
    organization: String,
    tasks: js.Array[String],
    timeCreated: Double,
    timeLastModified: Double,
    `type`: ORGANIZATION | TEAM | WORKER,
    worker: String
  ): OnfleetContainer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetContainer]
  }
  @scala.inline
  implicit class OnfleetContainerOps[Self <: OnfleetContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTasks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
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
    def withType(value: ORGANIZATION | TEAM | WORKER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveTask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveTaskNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTask")(null)
        ret
    }
  }
  
}

