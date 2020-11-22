package typingsSlinky.maximMazurokGapiClientRecommender.gapi.client.recommender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1Recommendation extends js.Object {
  
  /** Optional set of additional impact that this recommendation may have when trying to optimize for the primary category. These may be positive or negative. */
  var additionalImpact: js.UndefOr[js.Array[GoogleCloudRecommenderV1Impact]] = js.native
  
  /** Insights that led to this recommendation. */
  var associatedInsights: js.UndefOr[js.Array[GoogleCloudRecommenderV1RecommendationInsightReference]] = js.native
  
  /** Content of the recommendation describing recommended changes to resources. */
  var content: js.UndefOr[GoogleCloudRecommenderV1RecommendationContent] = js.native
  
  /** Free-form human readable summary in English. The maximum length is 500 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** Fingerprint of the Recommendation. Provides optimistic locking when updating states. */
  var etag: js.UndefOr[String] = js.native
  
  /** Last time this recommendation was refreshed by the system that created it in the first place. */
  var lastRefreshTime: js.UndefOr[String] = js.native
  
  /** Name of recommendation. */
  var name: js.UndefOr[String] = js.native
  
  /** The primary impact that this recommendation can have while trying to optimize for one category. */
  var primaryImpact: js.UndefOr[GoogleCloudRecommenderV1Impact] = js.native
  
  /**
    * Contains an identifier for a subtype of recommendations produced for the same recommender. Subtype is a function of content and impact, meaning a new subtype might be added when
    * significant changes to `content` or `primary_impact.category` are introduced. See the Recommenders section to see a list of subtypes for a given Recommender. Examples: For
    * recommender = "google.iam.policy.Recommender", recommender_subtype can be one of "REMOVE_ROLE"/"REPLACE_ROLE"
    */
  var recommenderSubtype: js.UndefOr[String] = js.native
  
  /** Information for state. Contains state and metadata. */
  var stateInfo: js.UndefOr[GoogleCloudRecommenderV1RecommendationStateInfo] = js.native
}
object GoogleCloudRecommenderV1Recommendation {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1Recommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1Recommendation]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1RecommendationOps[Self <: GoogleCloudRecommenderV1Recommendation] (val x: Self) extends AnyVal {
    
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
    def setAdditionalImpactVarargs(value: GoogleCloudRecommenderV1Impact*): Self = this.set("additionalImpact", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalImpact(value: js.Array[GoogleCloudRecommenderV1Impact]): Self = this.set("additionalImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalImpact: Self = this.set("additionalImpact", js.undefined)
    
    @scala.inline
    def setAssociatedInsightsVarargs(value: GoogleCloudRecommenderV1RecommendationInsightReference*): Self = this.set("associatedInsights", js.Array(value :_*))
    
    @scala.inline
    def setAssociatedInsights(value: js.Array[GoogleCloudRecommenderV1RecommendationInsightReference]): Self = this.set("associatedInsights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedInsights: Self = this.set("associatedInsights", js.undefined)
    
    @scala.inline
    def setContent(value: GoogleCloudRecommenderV1RecommendationContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setLastRefreshTime(value: String): Self = this.set("lastRefreshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRefreshTime: Self = this.set("lastRefreshTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrimaryImpact(value: GoogleCloudRecommenderV1Impact): Self = this.set("primaryImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryImpact: Self = this.set("primaryImpact", js.undefined)
    
    @scala.inline
    def setRecommenderSubtype(value: String): Self = this.set("recommenderSubtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommenderSubtype: Self = this.set("recommenderSubtype", js.undefined)
    
    @scala.inline
    def setStateInfo(value: GoogleCloudRecommenderV1RecommendationStateInfo): Self = this.set("stateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateInfo: Self = this.set("stateInfo", js.undefined)
  }
}
