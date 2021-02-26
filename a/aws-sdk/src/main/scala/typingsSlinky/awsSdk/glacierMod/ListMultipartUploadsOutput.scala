package typingsSlinky.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMultipartUploadsOutput extends StObject {
  
  /**
    * An opaque string that represents where to continue pagination of the results. You use the marker in a new List Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is null.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of in-progress multipart uploads.
    */
  var UploadsList: js.UndefOr[typingsSlinky.awsSdk.glacierMod.UploadsList] = js.native
}
object ListMultipartUploadsOutput {
  
  @scala.inline
  def apply(): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultipartUploadsOutput]
  }
  
  @scala.inline
  implicit class ListMultipartUploadsOutputMutableBuilder[Self <: ListMultipartUploadsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setUploadsList(value: UploadsList): Self = StObject.set(x, "UploadsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadsListUndefined: Self = StObject.set(x, "UploadsList", js.undefined)
    
    @scala.inline
    def setUploadsListVarargs(value: UploadListElement*): Self = StObject.set(x, "UploadsList", js.Array(value :_*))
  }
}
