package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Teams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdatePullRequestReviewProtectionResponseData extends StObject {
  
  var dismiss_stale_reviews: Boolean = js.native
  
  var dismissal_restrictions: Teams = js.native
  
  var require_code_owner_reviews: Boolean = js.native
  
  var required_approving_review_count: Double = js.native
  
  var url: String = js.native
}
object ReposUpdatePullRequestReviewProtectionResponseData {
  
  @scala.inline
  def apply(
    dismiss_stale_reviews: Boolean,
    dismissal_restrictions: Teams,
    require_code_owner_reviews: Boolean,
    required_approving_review_count: Double,
    url: String
  ): ReposUpdatePullRequestReviewProtectionResponseData = {
    val __obj = js.Dynamic.literal(dismiss_stale_reviews = dismiss_stale_reviews.asInstanceOf[js.Any], dismissal_restrictions = dismissal_restrictions.asInstanceOf[js.Any], require_code_owner_reviews = require_code_owner_reviews.asInstanceOf[js.Any], required_approving_review_count = required_approving_review_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdatePullRequestReviewProtectionResponseData]
  }
  
  @scala.inline
  implicit class ReposUpdatePullRequestReviewProtectionResponseDataMutableBuilder[Self <: ReposUpdatePullRequestReviewProtectionResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDismiss_stale_reviews(value: Boolean): Self = StObject.set(x, "dismiss_stale_reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissal_restrictions(value: Teams): Self = StObject.set(x, "dismissal_restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_code_owner_reviews(value: Boolean): Self = StObject.set(x, "require_code_owner_reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_approving_review_count(value: Double): Self = StObject.set(x, "required_approving_review_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
