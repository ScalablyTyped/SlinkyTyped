package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ListDataItemsResponse extends StObject {
  
  /** The list of data items to return. */
  var dataItems: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1DataItem]] = js.native
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1ListDataItemsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ListDataItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListDataItemsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ListDataItemsResponseMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ListDataItemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataItems(value: js.Array[GoogleCloudDatalabelingV1beta1DataItem]): Self = StObject.set(x, "dataItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataItemsUndefined: Self = StObject.set(x, "dataItems", js.undefined)
    
    @scala.inline
    def setDataItemsVarargs(value: GoogleCloudDatalabelingV1beta1DataItem*): Self = StObject.set(x, "dataItems", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
