package typingsSlinky.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncBatchAnnotateImagesRequest extends StObject {
  
  /** Required. The desired output location and metadata (e.g. format). */
  var outputConfig: js.UndefOr[OutputConfig] = js.native
  
  /**
    * Optional. Target project and location to make a call. Format: `projects/{project-id}/locations/{location-id}`. If no parent is specified, a region will be chosen automatically.
    * Supported location-ids: `us`: USA country only, `asia`: East asia areas, like Japan, Taiwan, `eu`: The European Union. Example: `projects/project-A/locations/eu`.
    */
  var parent: js.UndefOr[String] = js.native
  
  /** Required. Individual image annotation requests for this batch. */
  var requests: js.UndefOr[js.Array[AnnotateImageRequest]] = js.native
}
object AsyncBatchAnnotateImagesRequest {
  
  @scala.inline
  def apply(): AsyncBatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncBatchAnnotateImagesRequest]
  }
  
  @scala.inline
  implicit class AsyncBatchAnnotateImagesRequestMutableBuilder[Self <: AsyncBatchAnnotateImagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequests(value: js.Array[AnnotateImageRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: AnnotateImageRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
