package typingsSlinky.asana.mod.resources.Users

import typingsSlinky.asana.mod.resources.PaginationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindAllParams extends PaginationParams {
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
  }
  
}

