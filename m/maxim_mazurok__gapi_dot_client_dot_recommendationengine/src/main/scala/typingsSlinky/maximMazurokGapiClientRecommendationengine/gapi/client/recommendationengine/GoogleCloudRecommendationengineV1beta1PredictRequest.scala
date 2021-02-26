package typingsSlinky.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1PredictRequest extends StObject {
  
  /**
    * Optional. Use dryRun mode for this prediction query. If set to true, a dummy model will be used that returns arbitrary catalog items. Note that the dryRun mode should only be used
    * for testing the API, or if the model is not ready.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Filter for restricting prediction results. Accepts values for tags and the `filterOutOfStockItems` flag. * Tag expressions. Restricts predictions to items that match all
    * of the specified tags. Boolean operators `OR` and `NOT` are supported if the expression is enclosed in parentheses, and must be separated from the tag values by a space. `-"tagA"`
    * is also supported and is equivalent to `NOT "tagA"`. Tag values must be double quoted UTF-8 encoded strings with a size limit of 1 KiB. * filterOutOfStockItems. Restricts
    * predictions to items that do not have a stockState value of OUT_OF_STOCK. Examples: * tag=("Red" OR "Blue") tag="New-Arrival" tag=(NOT "promotional") * filterOutOfStockItems
    * tag=(-"promotional") * filterOutOfStockItems If your filter blocks all prediction results, nothing will be returned. If you want generic (unfiltered) popular items to be returned
    * instead, set `strictFiltering` to false in `PredictRequest.params`.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Optional. The labels for the predict request. * Label keys can contain lowercase letters, digits and hyphens, must start with a letter, and must end with a letter or digit. *
    * Non-zero label values can contain lowercase letters, digits and hyphens, must start with a letter, and must end with a letter or digit. * No more than 64 labels can be associated
    * with a given request. See https://goo.gl/xmQnxf for more information on and examples of labels.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PredictRequest with TopLevel[js.Any]
  ] = js.native
  
  /** Optional. Maximum number of results to return per page. Set this property to the number of prediction results required. If zero, the service will choose a reasonable default. */
  var pageSize: js.UndefOr[Double] = js.native
  
  /** Optional. The previous PredictResponse.next_page_token. */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Optional. Additional domain specific parameters for the predictions. Allowed values: * `returnCatalogItem`: Boolean. If set to true, the associated catalogItem object will be
    * returned in the `PredictResponse.PredictionResult.itemMetadata` object in the method response. * `returnItemScore`: Boolean. If set to true, the prediction 'score' corresponding to
    * each returned item will be set in the `metadata` field in the prediction response. The given 'score' indicates the probability of an item being clicked/purchased given the user's
    * context and history. * `strictFiltering`: Boolean. True by default. If set to false, the service will return generic (unfiltered) popular items instead of empty if your filter
    * blocks all prediction results.
    */
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PredictRequest with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Required. Context about the user, what they are looking at and what action they took to trigger the predict request. Note that this user event detail won't be ingested to userEvent
    * logs. Thus, a separate userEvent write request is required for event logging.
    */
  var userEvent: js.UndefOr[GoogleCloudRecommendationengineV1beta1UserEvent] = js.native
}
object GoogleCloudRecommendationengineV1beta1PredictRequest {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1PredictRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1PredictRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1PredictRequestMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1PredictRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PredictRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParams(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PredictRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setUserEvent(value: GoogleCloudRecommendationengineV1beta1UserEvent): Self = StObject.set(x, "userEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEventUndefined: Self = StObject.set(x, "userEvent", js.undefined)
  }
}
