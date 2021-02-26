package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullsDismissReviewEndpoint extends StObject {
  
  /**
    * The message for the pull request review dismissal
    */
  var message: String = js.native
  
  var owner: String = js.native
  
  var pull_number: Double = js.native
  
  var repo: String = js.native
  
  var review_id: Double = js.native
}
object PullsDismissReviewEndpoint {
  
  @scala.inline
  def apply(message: String, owner: String, pull_number: Double, repo: String, review_id: Double): PullsDismissReviewEndpoint = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsDismissReviewEndpoint]
  }
  
  @scala.inline
  implicit class PullsDismissReviewEndpointMutableBuilder[Self <: PullsDismissReviewEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_number(value: Double): Self = StObject.set(x, "pull_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReview_id(value: Double): Self = StObject.set(x, "review_id", value.asInstanceOf[js.Any])
  }
}
