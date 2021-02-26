package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1p1alpha1GcsDestination extends StObject {
  
  /** Required. The format of the gcs destination. Only "text/csv" and "application/json" are supported. */
  var mimeType: js.UndefOr[String] = js.native
  
  /** Required. The output uri of destination file. */
  var outputUri: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1p1alpha1GcsDestination {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1p1alpha1GcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p1alpha1GcsDestination]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1p1alpha1GcsDestinationMutableBuilder[Self <: GoogleCloudDatalabelingV1p1alpha1GcsDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
  }
}
