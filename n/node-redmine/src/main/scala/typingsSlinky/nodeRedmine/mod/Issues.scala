package typingsSlinky.nodeRedmine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Issues extends js.Object {
  var issues: js.Array[IssueRecord] = js.native
}

object Issues {
  @scala.inline
  def apply(issues: js.Array[IssueRecord]): Issues = {
    val __obj = js.Dynamic.literal(issues = issues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issues]
  }
  @scala.inline
  implicit class IssuesOps[Self <: Issues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssues(value: js.Array[IssueRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

