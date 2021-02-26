package typingsSlinky.maximMazurokGapiClientRecommender.gapi.client.recommender

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientRecommender.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientRecommender.anon.Alt
import typingsSlinky.maximMazurokGapiClientRecommender.anon.Fields
import typingsSlinky.maximMazurokGapiClientRecommender.anon.Key
import typingsSlinky.maximMazurokGapiClientRecommender.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecommendationsResource extends StObject {
  
  /** Gets the requested recommendation. Requires the recommender.*.get IAM permission for the specified recommender. */
  def get(): Request[GoogleCloudRecommenderV1Recommendation] = js.native
  def get(request: Accesstoken): Request[GoogleCloudRecommenderV1Recommendation] = js.native
  
  /** Lists recommendations for a Cloud project. Requires the recommender.*.list IAM permission for the specified recommender. */
  def list(): Request[GoogleCloudRecommenderV1ListRecommendationsResponse] = js.native
  def list(request: Alt): Request[GoogleCloudRecommenderV1ListRecommendationsResponse] = js.native
  
  def markClaimed(request: Accesstoken, body: GoogleCloudRecommenderV1MarkRecommendationClaimedRequest): Request[GoogleCloudRecommenderV1Recommendation] = js.native
  /**
    * Marks the Recommendation State as Claimed. Users can use this method to indicate to the Recommender API that they are starting to apply the recommendation themselves. This stops the
    * recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationClaimed can be applied to recommendations in CLAIMED,
    * SUCCEEDED, FAILED, or ACTIVE state. Requires the recommender.*.update IAM permission for the specified recommender.
    */
  def markClaimed(request: Fields): Request[GoogleCloudRecommenderV1Recommendation] = js.native
  
  def markFailed(request: Accesstoken, body: GoogleCloudRecommenderV1MarkRecommendationFailedRequest): Request[GoogleCloudRecommenderV1Recommendation] = js.native
  /**
    * Marks the Recommendation State as Failed. Users can use this method to indicate to the Recommender API that they have applied the recommendation themselves, and the operation
    * failed. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationFailed can be applied to
    * recommendations in ACTIVE, CLAIMED, SUCCEEDED, or FAILED state. Requires the recommender.*.update IAM permission for the specified recommender.
    */
  def markFailed(request: Key): Request[GoogleCloudRecommenderV1Recommendation] = js.native
  
  def markSucceeded(request: Accesstoken, body: GoogleCloudRecommenderV1MarkRecommendationSucceededRequest): Request[GoogleCloudRecommenderV1Recommendation] = js.native
  /**
    * Marks the Recommendation State as Succeeded. Users can use this method to indicate to the Recommender API that they have applied the recommendation themselves, and the operation was
    * successful. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state. MarkRecommendationSucceeded can be applied to
    * recommendations in ACTIVE, CLAIMED, SUCCEEDED, or FAILED state. Requires the recommender.*.update IAM permission for the specified recommender.
    */
  def markSucceeded(request: Name): Request[GoogleCloudRecommenderV1Recommendation] = js.native
}
