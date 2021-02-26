package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest extends StObject {
  
  /** Optional. Requested page size. Server may return fewer results than requested. Default value is 100. */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional. A token identifying a page of results for the server to return. Typically obtained by the nextPageToken of the response to a previous search rquest. If you don't specify
    * this field, the API call requests the first page of the search.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequestMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1SearchExampleComparisonsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
