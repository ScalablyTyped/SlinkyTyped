package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ObjectTrackingConfig extends StObject {
  
  /** Required. Annotation spec set resource name. */
  var annotationSpecSet: js.UndefOr[String] = js.native
  
  /** Videos will be cut to smaller clips to make it easier for labelers to work on. Users can configure is field in seconds, if not set, default value is 20s. */
  var clipLength: js.UndefOr[Double] = js.native
  
  /** The overlap length between different video clips. Users can configure is field in seconds, if not set, default value is 0.3s. */
  var overlapLength: js.UndefOr[Double] = js.native
}
object GoogleCloudDatalabelingV1beta1ObjectTrackingConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ObjectTrackingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ObjectTrackingConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ObjectTrackingConfigMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ObjectTrackingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
    
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
