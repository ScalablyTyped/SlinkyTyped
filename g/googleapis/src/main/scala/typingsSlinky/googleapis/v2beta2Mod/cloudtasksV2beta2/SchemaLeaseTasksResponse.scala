package typingsSlinky.googleapis.v2beta2Mod.cloudtasksV2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for leasing tasks using LeaseTasks.
  */
@js.native
trait SchemaLeaseTasksResponse extends js.Object {
  /**
    * The leased tasks.
    */
  var tasks: js.UndefOr[js.Array[SchemaTask]] = js.native
}

object SchemaLeaseTasksResponse {
  @scala.inline
  def apply(): SchemaLeaseTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaseTasksResponse]
  }
  @scala.inline
  implicit class SchemaLeaseTasksResponseOps[Self <: SchemaLeaseTasksResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTasks(value: js.Array[SchemaTask]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(js.undefined)
        ret
    }
  }
  
}

