package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergePullRequestByThreeWayOutput extends js.Object {
  
  var pullRequest: js.UndefOr[PullRequest] = js.native
}
object MergePullRequestByThreeWayOutput {
  
  @scala.inline
  def apply(): MergePullRequestByThreeWayOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergePullRequestByThreeWayOutput]
  }
  
  @scala.inline
  implicit class MergePullRequestByThreeWayOutputOps[Self <: MergePullRequestByThreeWayOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPullRequest(value: PullRequest): Self = this.set("pullRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequest: Self = this.set("pullRequest", js.undefined)
  }
}
