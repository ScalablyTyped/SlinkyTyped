package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsDeleteCardParams extends js.Object {
  var card_id: Double = js.native
}

object ProjectsDeleteCardParams {
  @scala.inline
  def apply(card_id: Double): ProjectsDeleteCardParams = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsDeleteCardParams]
  }
  @scala.inline
  implicit class ProjectsDeleteCardParamsOps[Self <: ProjectsDeleteCardParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

