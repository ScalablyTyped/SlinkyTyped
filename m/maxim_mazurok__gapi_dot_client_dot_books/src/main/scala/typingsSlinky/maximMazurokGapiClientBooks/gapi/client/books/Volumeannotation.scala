package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import typingsSlinky.maximMazurokGapiClientBooks.anon.ContentVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Volumeannotation extends StObject {
  
  /** The annotation data id for this volume annotation. */
  var annotationDataId: js.UndefOr[String] = js.native
  
  /** Link to get data for this annotation. */
  var annotationDataLink: js.UndefOr[String] = js.native
  
  /** The type of annotation this is. */
  var annotationType: js.UndefOr[String] = js.native
  
  /** The content ranges to identify the selected text. */
  var contentRanges: js.UndefOr[ContentVersion] = js.native
  
  /** Data for this annotation. */
  var data: js.UndefOr[String] = js.native
  
  /** Indicates that this annotation is deleted. */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /** Unique id of this volume annotation. */
  var id: js.UndefOr[String] = js.native
  
  /** Resource Type */
  var kind: js.UndefOr[String] = js.native
  
  /** The Layer this annotation is for. */
  var layerId: js.UndefOr[String] = js.native
  
  /** Pages the annotation spans. */
  var pageIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Excerpt from the volume. */
  var selectedText: js.UndefOr[String] = js.native
  
  /** URL to this resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** Timestamp for the last time this anntoation was updated. (RFC 3339 UTC date-time format). */
  var updated: js.UndefOr[String] = js.native
  
  /** The Volume this annotation is for. */
  var volumeId: js.UndefOr[String] = js.native
}
object Volumeannotation {
  
  @scala.inline
  def apply(): Volumeannotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volumeannotation]
  }
  
  @scala.inline
  implicit class VolumeannotationMutableBuilder[Self <: Volumeannotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationDataId(value: String): Self = StObject.set(x, "annotationDataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationDataIdUndefined: Self = StObject.set(x, "annotationDataId", js.undefined)
    
    @scala.inline
    def setAnnotationDataLink(value: String): Self = StObject.set(x, "annotationDataLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationDataLinkUndefined: Self = StObject.set(x, "annotationDataLink", js.undefined)
    
    @scala.inline
    def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
    
    @scala.inline
    def setContentRanges(value: ContentVersion): Self = StObject.set(x, "contentRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRangesUndefined: Self = StObject.set(x, "contentRanges", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    @scala.inline
    def setPageIds(value: js.Array[String]): Self = StObject.set(x, "pageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIdsUndefined: Self = StObject.set(x, "pageIds", js.undefined)
    
    @scala.inline
    def setPageIdsVarargs(value: String*): Self = StObject.set(x, "pageIds", js.Array(value :_*))
    
    @scala.inline
    def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedTextUndefined: Self = StObject.set(x, "selectedText", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
