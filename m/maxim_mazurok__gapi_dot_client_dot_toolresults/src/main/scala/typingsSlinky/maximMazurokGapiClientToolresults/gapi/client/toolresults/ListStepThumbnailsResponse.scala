package typingsSlinky.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStepThumbnailsResponse extends StObject {
  
  /** A continuation token to resume the query at the next item. If set, indicates that there are more thumbnails to read, by calling list again with this value in the page_token field. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * A list of image data. Images are returned in a deterministic order; they are ordered by these factors, in order of importance: * First, by their associated test case. Images without
    * a test case are considered greater than images with one. * Second, by their creation time. Images without a creation time are greater than images with one. * Third, by the order in
    * which they were added to the step (by calls to CreateStep or UpdateStep).
    */
  var thumbnails: js.UndefOr[js.Array[Image]] = js.native
}
object ListStepThumbnailsResponse {
  
  @scala.inline
  def apply(): ListStepThumbnailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStepThumbnailsResponse]
  }
  
  @scala.inline
  implicit class ListStepThumbnailsResponseMutableBuilder[Self <: ListStepThumbnailsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setThumbnails(value: js.Array[Image]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    @scala.inline
    def setThumbnailsVarargs(value: Image*): Self = StObject.set(x, "thumbnails", js.Array(value :_*))
  }
}
