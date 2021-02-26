package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1TextClassificationAnnotation extends StObject {
  
  /** Label of the text. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.native
}
object GoogleCloudDatalabelingV1beta1TextClassificationAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1TextClassificationAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1TextClassificationAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1TextClassificationAnnotationMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1TextClassificationAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
  }
}
