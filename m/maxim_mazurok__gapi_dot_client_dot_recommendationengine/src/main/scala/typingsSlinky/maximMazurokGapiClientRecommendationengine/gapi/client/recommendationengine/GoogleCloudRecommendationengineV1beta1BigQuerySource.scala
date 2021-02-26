package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1BigQuerySource extends StObject {
  
  /**
    * Optional. The schema to use when parsing the data from the source. Supported values for catalog imports: 1: "catalog_recommendations_ai" using
    * https://cloud.google.com/recommendations-ai/docs/upload-catalog#json (Default for catalogItems.import) 2: "catalog_merchant_center" using
    * https://cloud.google.com/recommendations-ai/docs/upload-catalog#mc Supported values for user event imports: 1: "user_events_recommendations_ai" using
    * https://cloud.google.com/recommendations-ai/docs/manage-user-events#import (Default for userEvents.import) 2. "user_events_ga360" using
    * https://support.google.com/analytics/answer/3437719?hl=en
    */
  var dataSchema: js.UndefOr[String] = js.native
  
  /** Required. The BigQuery data set to copy the data from. */
  var datasetId: js.UndefOr[String] = js.native
  
  /** Optional. Intermediate Cloud Storage directory used for the import. Can be specified if one wants to have the BigQuery export to a specific Cloud Storage directory. */
  var gcsStagingDir: js.UndefOr[String] = js.native
  
  /** Optional. The project id (can be project # or id) that the BigQuery source is in. If not specified, inherits the project id from the parent request. */
  var projectId: js.UndefOr[String] = js.native
  
  /** Required. The BigQuery table to copy the data from. */
  var tableId: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1BigQuerySource {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1BigQuerySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1BigQuerySource]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1BigQuerySourceMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1BigQuerySource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSchema(value: String): Self = StObject.set(x, "dataSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSchemaUndefined: Self = StObject.set(x, "dataSchema", js.undefined)
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    @scala.inline
    def setGcsStagingDir(value: String): Self = StObject.set(x, "gcsStagingDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsStagingDirUndefined: Self = StObject.set(x, "gcsStagingDir", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
