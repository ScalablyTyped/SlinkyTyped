package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePullRequestDescriptionInput extends StObject {
  
  /**
    * The updated content of the description for the pull request. This content replaces the existing description.
    */
  var description: Description = js.native
  
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId = js.native
}
object UpdatePullRequestDescriptionInput {
  
  @scala.inline
  def apply(description: Description, pullRequestId: PullRequestId): UpdatePullRequestDescriptionInput = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestDescriptionInput]
  }
  
  @scala.inline
  implicit class UpdatePullRequestDescriptionInputMutableBuilder[Self <: UpdatePullRequestDescriptionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
  }
}
