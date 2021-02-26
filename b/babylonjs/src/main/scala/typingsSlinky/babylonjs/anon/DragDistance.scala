package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragDistance extends StObject {
  
  var delta: Vector3 = js.native
  
  var dragDistance: Double = js.native
  
  var dragPlaneNormal: Vector3 = js.native
  
  var dragPlanePoint: Vector3 = js.native
  
  var pointerId: Double = js.native
}
object DragDistance {
  
  @scala.inline
  def apply(
    delta: Vector3,
    dragDistance: Double,
    dragPlaneNormal: Vector3,
    dragPlanePoint: Vector3,
    pointerId: Double
  ): DragDistance = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], dragDistance = dragDistance.asInstanceOf[js.Any], dragPlaneNormal = dragPlaneNormal.asInstanceOf[js.Any], dragPlanePoint = dragPlanePoint.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDistance]
  }
  
  @scala.inline
  implicit class DragDistanceMutableBuilder[Self <: DragDistance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelta(value: Vector3): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragDistance(value: Double): Self = StObject.set(x, "dragDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragPlaneNormal(value: Vector3): Self = StObject.set(x, "dragPlaneNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragPlanePoint(value: Vector3): Self = StObject.set(x, "dragPlanePoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
  }
}
