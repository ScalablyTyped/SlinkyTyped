package typingsSlinky.gitlab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectId extends js.Object {
  var projectId: js.UndefOr[String | Double] = js.native
}

object ProjectId {
  @scala.inline
  def apply(): ProjectId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectId]
  }
  @scala.inline
  implicit class ProjectIdOps[Self <: ProjectId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
  }
  
}

