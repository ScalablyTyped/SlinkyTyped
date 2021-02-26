package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePullRequestDescriptionOutput extends StObject {
  
  /**
    * Information about the updated pull request.
    */
  var pullRequest: PullRequest = js.native
}
object UpdatePullRequestDescriptionOutput {
  
  @scala.inline
  def apply(pullRequest: PullRequest): UpdatePullRequestDescriptionOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestDescriptionOutput]
  }
  
  @scala.inline
  implicit class UpdatePullRequestDescriptionOutputMutableBuilder[Self <: UpdatePullRequestDescriptionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPullRequest(value: PullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
  }
}
