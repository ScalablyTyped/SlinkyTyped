package typingsSlinky.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1Insight extends StObject {
  
  /** Recommendations derived from this insight. */
  var associatedRecommendations: js.UndefOr[js.Array[GoogleCloudRecommenderV1InsightRecommendationReference]] = js.native
  
  /** Category being targeted by the insight. */
  var category: js.UndefOr[String] = js.native
  
  /** A struct of custom fields to explain the insight. Example: "grantedPermissionsCount": "1000" */
  var content: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1Insight with TopLevel[js.Any]
  ] = js.native
  
  /** Free-form human readable summary in English. The maximum length is 500 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** Fingerprint of the Insight. Provides optimistic locking when updating states. */
  var etag: js.UndefOr[String] = js.native
  
  /** Insight subtype. Insight content schema will be stable for a given subtype. */
  var insightSubtype: js.UndefOr[String] = js.native
  
  /** Timestamp of the latest data used to generate the insight. */
  var lastRefreshTime: js.UndefOr[String] = js.native
  
  /** Name of the insight. */
  var name: js.UndefOr[String] = js.native
  
  /** Observation period that led to the insight. The source data used to generate the insight ends at last_refresh_time and begins at (last_refresh_time - observation_period). */
  var observationPeriod: js.UndefOr[String] = js.native
  
  /** Information state and metadata. */
  var stateInfo: js.UndefOr[GoogleCloudRecommenderV1InsightStateInfo] = js.native
  
  /** Fully qualified resource names that this insight is targeting. */
  var targetResources: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudRecommenderV1Insight {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1Insight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1Insight]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1InsightMutableBuilder[Self <: GoogleCloudRecommenderV1Insight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedRecommendations(value: js.Array[GoogleCloudRecommenderV1InsightRecommendationReference]): Self = StObject.set(x, "associatedRecommendations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedRecommendationsUndefined: Self = StObject.set(x, "associatedRecommendations", js.undefined)
    
    @scala.inline
    def setAssociatedRecommendationsVarargs(value: GoogleCloudRecommenderV1InsightRecommendationReference*): Self = StObject.set(x, "associatedRecommendations", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setContent(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1Insight with TopLevel[js.Any]
    ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setInsightSubtype(value: String): Self = StObject.set(x, "insightSubtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightSubtypeUndefined: Self = StObject.set(x, "insightSubtype", js.undefined)
    
    @scala.inline
    def setLastRefreshTime(value: String): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRefreshTimeUndefined: Self = StObject.set(x, "lastRefreshTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObservationPeriod(value: String): Self = StObject.set(x, "observationPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservationPeriodUndefined: Self = StObject.set(x, "observationPeriod", js.undefined)
    
    @scala.inline
    def setStateInfo(value: GoogleCloudRecommenderV1InsightStateInfo): Self = StObject.set(x, "stateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateInfoUndefined: Self = StObject.set(x, "stateInfo", js.undefined)
    
    @scala.inline
    def setTargetResources(value: js.Array[String]): Self = StObject.set(x, "targetResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetResourcesUndefined: Self = StObject.set(x, "targetResources", js.undefined)
    
    @scala.inline
    def setTargetResourcesVarargs(value: String*): Self = StObject.set(x, "targetResources", js.Array(value :_*))
  }
}
