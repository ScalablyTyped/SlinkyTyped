package typingsSlinky.onfleetNodeOnfleet.tasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAutoAssign extends js.Object {
  var considerDependencies: js.UndefOr[Boolean] = js.native
  var excludeWorkerIds: js.UndefOr[js.Array[String]] = js.native
  var maxAssignedTaskCount: js.UndefOr[Double] = js.native
  var mode: String = js.native
  var team: js.UndefOr[String] = js.native
}

object TaskAutoAssign {
  @scala.inline
  def apply(mode: String): TaskAutoAssign = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAutoAssign]
  }
  @scala.inline
  implicit class TaskAutoAssignOps[Self <: TaskAutoAssign] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsiderDependencies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("considerDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsiderDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("considerDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeWorkerIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeWorkerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeWorkerIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeWorkerIds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAssignedTaskCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAssignedTaskCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAssignedTaskCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAssignedTaskCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTeam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team")(js.undefined)
        ret
    }
  }
  
}

