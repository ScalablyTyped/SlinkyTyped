package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodegroupHealth extends js.Object {
  /**
    * Any issues that are associated with the node group. 
    */
  var issues: js.UndefOr[IssueList] = js.native
}

object NodegroupHealth {
  @scala.inline
  def apply(): NodegroupHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodegroupHealth]
  }
  @scala.inline
  implicit class NodegroupHealthOps[Self <: NodegroupHealth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssues(value: IssueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(js.undefined)
        ret
    }
  }
  
}

