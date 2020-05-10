package typingsSlinky.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var projectArn: js.UndefOr[ProjectArn] = js.native
  /**
    * The ID of the project.
    */
  var projectId: js.UndefOr[ProjectId] = js.native
}

object ProjectSummary {
  @scala.inline
  def apply(): ProjectSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectSummary]
  }
  @scala.inline
  implicit class ProjectSummaryOps[Self <: ProjectSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectArn(value: ProjectArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectArn")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: ProjectId): Self = {
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

