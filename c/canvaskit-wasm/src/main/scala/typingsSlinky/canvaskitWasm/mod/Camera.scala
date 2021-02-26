package typingsSlinky.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camera extends StObject {
  
  /** field of view in radians */
  var angle: AngleInRadians = js.native
  
  /** center of attention - the 3d point the camera is looking at. */
  var coa: Vector3 = js.native
  
  /** a 3d point locating the camera. */
  var eye: Vector3 = js.native
  
  /** far clipping plane distance */
  var far: Double = js.native
  
  /** near clipping plane distance */
  var near: Double = js.native
  
  /**
    * A unit vector pointing the cameras up direction. Note that using only eye and coa
    * would leave the roll of the camera unspecified.
    */
  var up: Vector3 = js.native
}
object Camera {
  
  @scala.inline
  def apply(angle: AngleInRadians, coa: Vector3, eye: Vector3, far: Double, near: Double, up: Vector3): Camera = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], coa = coa.asInstanceOf[js.Any], eye = eye.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  @scala.inline
  implicit class CameraMutableBuilder[Self <: Camera] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: AngleInRadians): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoa(value: Vector3): Self = StObject.set(x, "coa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoaVarargs(value: Double*): Self = StObject.set(x, "coa", js.Array(value :_*))
    
    @scala.inline
    def setEye(value: Vector3): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeVarargs(value: Double*): Self = StObject.set(x, "eye", js.Array(value :_*))
    
    @scala.inline
    def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUp(value: Vector3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpVarargs(value: Double*): Self = StObject.set(x, "up", js.Array(value :_*))
  }
}
