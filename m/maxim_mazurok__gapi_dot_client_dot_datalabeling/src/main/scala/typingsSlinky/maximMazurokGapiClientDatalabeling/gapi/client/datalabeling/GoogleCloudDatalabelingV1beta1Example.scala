package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1Example extends StObject {
  
  /** Output only. Annotations for the piece of data in Example. One piece of data can have multiple annotations. */
  var annotations: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Annotation]] = js.native
  
  /** The image payload, a container of the image bytes/uri. */
  var imagePayload: js.UndefOr[GoogleCloudDatalabelingV1beta1ImagePayload] = js.native
  
  /** Output only. Name of the example, in format of: projects/{project_id}/datasets/{dataset_id}/annotatedDatasets/ {annotated_dataset_id}/examples/{example_id} */
  var name: js.UndefOr[String] = js.native
  
  /** The text payload, a container of the text content. */
  var textPayload: js.UndefOr[GoogleCloudDatalabelingV1beta1TextPayload] = js.native
  
  /** The video payload, a container of the video uri. */
  var videoPayload: js.UndefOr[GoogleCloudDatalabelingV1beta1VideoPayload] = js.native
}
object GoogleCloudDatalabelingV1beta1Example {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1Example = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Example]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ExampleMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1Example] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: js.Array[GoogleCloudDatalabelingV1beta1Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: GoogleCloudDatalabelingV1beta1Annotation*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setImagePayload(value: GoogleCloudDatalabelingV1beta1ImagePayload): Self = StObject.set(x, "imagePayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePayloadUndefined: Self = StObject.set(x, "imagePayload", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTextPayload(value: GoogleCloudDatalabelingV1beta1TextPayload): Self = StObject.set(x, "textPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPayloadUndefined: Self = StObject.set(x, "textPayload", js.undefined)
    
    @scala.inline
    def setVideoPayload(value: GoogleCloudDatalabelingV1beta1VideoPayload): Self = StObject.set(x, "videoPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoPayloadUndefined: Self = StObject.set(x, "videoPayload", js.undefined)
  }
}
