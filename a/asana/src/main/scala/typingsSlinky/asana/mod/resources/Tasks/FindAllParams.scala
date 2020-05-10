package typingsSlinky.asana.mod.resources.Tasks

import typingsSlinky.asana.mod.resources.PaginationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindAllParams extends PaginationParams {
  var assignee: js.UndefOr[Double] = js.native
  var completed_since: js.UndefOr[String] = js.native
  var modified_since: js.UndefOr[String] = js.native
  var workspace: Double = js.native
}

object FindAllParams {
  @scala.inline
  def apply(workspace: Double): FindAllParams = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindAllParams]
  }
  @scala.inline
  implicit class FindAllParamsOps[Self <: FindAllParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkspace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignee(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleted_since(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed_since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleted_since: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed_since")(js.undefined)
        ret
    }
    @scala.inline
    def withModified_since(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified_since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModified_since: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified_since")(js.undefined)
        ret
    }
  }
  
}

