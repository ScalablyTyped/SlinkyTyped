package typingsSlinky.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncAnnotateFileRequest extends StObject {
  
  /** Required. Requested features. */
  var features: js.UndefOr[js.Array[Feature]] = js.native
  
  /** Additional context that may accompany the image(s) in the file. */
  var imageContext: js.UndefOr[ImageContext] = js.native
  
  /** Required. Information about the input file. */
  var inputConfig: js.UndefOr[InputConfig] = js.native
  
  /** Required. The desired output location and metadata (e.g. format). */
  var outputConfig: js.UndefOr[OutputConfig] = js.native
}
object AsyncAnnotateFileRequest {
  
  @scala.inline
  def apply(): AsyncAnnotateFileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncAnnotateFileRequest]
  }
  
  @scala.inline
  implicit class AsyncAnnotateFileRequestMutableBuilder[Self <: AsyncAnnotateFileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: js.Array[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setImageContext(value: ImageContext): Self = StObject.set(x, "imageContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageContextUndefined: Self = StObject.set(x, "imageContext", js.undefined)
    
    @scala.inline
    def setInputConfig(value: InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    @scala.inline
    def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
