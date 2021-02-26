package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewStatusInfo extends StObject {
  
  /** Represents the basic approval needed for a creative to begin serving. Summary of creative_and_landing_page_review_status and content_and_policy_review_status. */
  var approvalStatus: js.UndefOr[String] = js.native
  
  /** Content and policy review status for the creative. */
  var contentAndPolicyReviewStatus: js.UndefOr[String] = js.native
  
  /** Creative and landing page review status for the creative. */
  var creativeAndLandingPageReviewStatus: js.UndefOr[String] = js.native
  
  /** Exchange review statuses for the creative. */
  var exchangeReviewStatuses: js.UndefOr[js.Array[ExchangeReviewStatus]] = js.native
  
  /** Publisher review statuses for the creative. */
  var publisherReviewStatuses: js.UndefOr[js.Array[PublisherReviewStatus]] = js.native
}
object ReviewStatusInfo {
  
  @scala.inline
  def apply(): ReviewStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewStatusInfo]
  }
  
  @scala.inline
  implicit class ReviewStatusInfoMutableBuilder[Self <: ReviewStatusInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalStatus(value: String): Self = StObject.set(x, "approvalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalStatusUndefined: Self = StObject.set(x, "approvalStatus", js.undefined)
    
    @scala.inline
    def setContentAndPolicyReviewStatus(value: String): Self = StObject.set(x, "contentAndPolicyReviewStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentAndPolicyReviewStatusUndefined: Self = StObject.set(x, "contentAndPolicyReviewStatus", js.undefined)
    
    @scala.inline
    def setCreativeAndLandingPageReviewStatus(value: String): Self = StObject.set(x, "creativeAndLandingPageReviewStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeAndLandingPageReviewStatusUndefined: Self = StObject.set(x, "creativeAndLandingPageReviewStatus", js.undefined)
    
    @scala.inline
    def setExchangeReviewStatuses(value: js.Array[ExchangeReviewStatus]): Self = StObject.set(x, "exchangeReviewStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeReviewStatusesUndefined: Self = StObject.set(x, "exchangeReviewStatuses", js.undefined)
    
    @scala.inline
    def setExchangeReviewStatusesVarargs(value: ExchangeReviewStatus*): Self = StObject.set(x, "exchangeReviewStatuses", js.Array(value :_*))
    
    @scala.inline
    def setPublisherReviewStatuses(value: js.Array[PublisherReviewStatus]): Self = StObject.set(x, "publisherReviewStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherReviewStatusesUndefined: Self = StObject.set(x, "publisherReviewStatuses", js.undefined)
    
    @scala.inline
    def setPublisherReviewStatusesVarargs(value: PublisherReviewStatus*): Self = StObject.set(x, "publisherReviewStatuses", js.Array(value :_*))
  }
}
