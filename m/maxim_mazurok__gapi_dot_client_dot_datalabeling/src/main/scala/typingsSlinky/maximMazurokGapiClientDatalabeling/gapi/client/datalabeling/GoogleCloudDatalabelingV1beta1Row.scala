package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1Row extends StObject {
  
  /** The annotation spec of the ground truth label for this row. */
  var annotationSpec: js.UndefOr[GoogleCloudDatalabelingV1beta1AnnotationSpec] = js.native
  
  /** A list of the confusion matrix entries. One entry for each possible predicted label. */
  var entries: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry]] = js.native
}
object GoogleCloudDatalabelingV1beta1Row {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Row]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1RowMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1Row] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpec(value: GoogleCloudDatalabelingV1beta1AnnotationSpec): Self = StObject.set(x, "annotationSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecUndefined: Self = StObject.set(x, "annotationSpec", js.undefined)
    
    @scala.inline
    def setEntries(value: js.Array[GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: GoogleCloudDatalabelingV1beta1ConfusionMatrixEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
