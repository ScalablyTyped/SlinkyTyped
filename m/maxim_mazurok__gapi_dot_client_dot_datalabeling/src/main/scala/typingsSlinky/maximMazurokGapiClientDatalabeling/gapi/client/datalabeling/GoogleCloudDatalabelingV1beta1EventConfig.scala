package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1EventConfig extends StObject {
  
  /** Required. The list of annotation spec set resource name. Similar to video classification, we support selecting event from multiple AnnotationSpecSet at the same time. */
  var annotationSpecSets: js.UndefOr[js.Array[String]] = js.native
  
  /** Videos will be cut to smaller clips to make it easier for labelers to work on. Users can configure is field in seconds, if not set, default value is 60s. */
  var clipLength: js.UndefOr[Double] = js.native
  
  /** The overlap length between different video clips. Users can configure is field in seconds, if not set, default value is 1s. */
  var overlapLength: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1beta1EventConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1EventConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1EventConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1EventConfigMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1EventConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpecSets(value: js.Array[String]): Self = StObject.set(x, "annotationSpecSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecSetsUndefined: Self = StObject.set(x, "annotationSpecSets", js.undefined)
    
    @scala.inline
    def setAnnotationSpecSetsVarargs(value: String*): Self = StObject.set(x, "annotationSpecSets", js.Array(value :_*))
    
    @scala.inline
    def setClipLength(value: Double): Self = StObject.set(x, "clipLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipLengthUndefined: Self = StObject.set(x, "clipLength", js.undefined)
    
    @scala.inline
    def setOverlapLength(value: Double): Self = StObject.set(x, "overlapLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapLengthUndefined: Self = StObject.set(x, "overlapLength", js.undefined)
  }
}
