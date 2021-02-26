package typingsSlinky.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p1beta1NormalizedBoundingPoly extends StObject {
  
  /** Normalized vertices of the bounding polygon. */
  var vertices: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p1beta1NormalizedVertex]] = js.native
}
object GoogleCloudVideointelligenceV1p1beta1NormalizedBoundingPoly {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p1beta1NormalizedBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p1beta1NormalizedBoundingPoly]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p1beta1NormalizedBoundingPolyMutableBuilder[Self <: GoogleCloudVideointelligenceV1p1beta1NormalizedBoundingPoly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVertices(value: js.Array[GoogleCloudVideointelligenceV1p1beta1NormalizedVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: GoogleCloudVideointelligenceV1p1beta1NormalizedVertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
