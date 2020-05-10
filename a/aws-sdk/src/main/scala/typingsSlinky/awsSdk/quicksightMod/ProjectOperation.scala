package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectOperation extends js.Object {
  /**
    * Projected columns.
    */
  var ProjectedColumns: ProjectedColumnList = js.native
}

object ProjectOperation {
  @scala.inline
  def apply(ProjectedColumns: ProjectedColumnList): ProjectOperation = {
    val __obj = js.Dynamic.literal(ProjectedColumns = ProjectedColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectOperation]
  }
  @scala.inline
  implicit class ProjectOperationOps[Self <: ProjectOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectedColumns(value: ProjectedColumnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectedColumns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

