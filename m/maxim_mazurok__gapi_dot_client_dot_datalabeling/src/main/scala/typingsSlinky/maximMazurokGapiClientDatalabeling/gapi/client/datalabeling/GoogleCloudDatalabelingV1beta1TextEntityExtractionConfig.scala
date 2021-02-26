package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1TextEntityExtractionConfig extends StObject {
  
  /** Required. Annotation spec set resource name. */
  var annotationSpecSet: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1TextEntityExtractionConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1TextEntityExtractionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1TextEntityExtractionConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1TextEntityExtractionConfigMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1TextEntityExtractionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
  }
}
