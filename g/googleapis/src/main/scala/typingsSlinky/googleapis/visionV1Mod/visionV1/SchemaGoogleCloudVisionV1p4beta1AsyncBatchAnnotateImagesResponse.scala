package typingsSlinky.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to an async batch image annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse extends StObject {
  
  /**
    * The output location and metadata from AsyncBatchAnnotateImagesRequest.
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1OutputConfig] = js.native
}
object SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponseMutableBuilder[Self <: SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputConfig(value: SchemaGoogleCloudVisionV1p4beta1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
