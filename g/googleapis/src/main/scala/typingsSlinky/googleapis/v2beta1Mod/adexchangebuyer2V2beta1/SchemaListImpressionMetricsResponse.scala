package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing the metrics that are measured in number of
  * impressions.
  */
@js.native
trait SchemaListImpressionMetricsResponse extends StObject {
  
  /**
    * List of rows, each containing a set of impression metrics.
    */
  var impressionMetricsRows: js.UndefOr[js.Array[SchemaImpressionMetricsRow]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListImpressionMetricsRequest.pageToken field in the subsequent call to
    * the impressionMetrics.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListImpressionMetricsResponse {
  
  @scala.inline
  def apply(): SchemaListImpressionMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListImpressionMetricsResponse]
  }
  
  @scala.inline
  implicit class SchemaListImpressionMetricsResponseMutableBuilder[Self <: SchemaListImpressionMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImpressionMetricsRows(value: js.Array[SchemaImpressionMetricsRow]): Self = StObject.set(x, "impressionMetricsRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionMetricsRowsUndefined: Self = StObject.set(x, "impressionMetricsRows", js.undefined)
    
    @scala.inline
    def setImpressionMetricsRowsVarargs(value: SchemaImpressionMetricsRow*): Self = StObject.set(x, "impressionMetricsRows", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
