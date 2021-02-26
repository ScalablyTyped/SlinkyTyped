package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometry extends StObject {
  
  /**
    * An axis-aligned coarse representation of the detected item's location on the image.
    */
  var BoundingBox: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.BoundingBox] = js.native
  
  /**
    * Within the bounding box, a fine-grained polygon around the detected item.
    */
  var Polygon: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Polygon] = js.native
}
object Geometry {
  
  @scala.inline
  def apply(): Geometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geometry]
  }
  
  @scala.inline
  implicit class GeometryMutableBuilder[Self <: Geometry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    @scala.inline
    def setPolygon(value: Polygon): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonUndefined: Self = StObject.set(x, "Polygon", js.undefined)
    
    @scala.inline
    def setPolygonVarargs(value: Point*): Self = StObject.set(x, "Polygon", js.Array(value :_*))
  }
}
