package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergePullRequestByThreeWayOutput extends StObject {
  
  var pullRequest: js.UndefOr[PullRequest] = js.native
}
object MergePullRequestByThreeWayOutput {
  
  @scala.inline
  def apply(): MergePullRequestByThreeWayOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergePullRequestByThreeWayOutput]
  }
  
  @scala.inline
  implicit class MergePullRequestByThreeWayOutputMutableBuilder[Self <: MergePullRequestByThreeWayOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPullRequest(value: PullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestUndefined: Self = StObject.set(x, "pullRequest", js.undefined)
  }
}
