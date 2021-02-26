package typingsSlinky.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new RaycastResult.
  * @property entity - The entity that was hit.
  * @property point - The point at which the ray hit the entity in world space.
  * @property normal - The normal vector of the surface where the ray hit in world space.
  * @param entity - The entity that was hit.
  * @param point - The point at which the ray hit the entity in world space.
  * @param normal - The normal vector of the surface where the ray hit in world space.
  */
@js.native
trait RaycastResult extends StObject {
  
  /**
    * The entity that was hit.
    */
  var entity: Entity = js.native
  
  /**
    * The normal vector of the surface where the ray hit in world space.
    */
  var normal: Vec3 = js.native
  
  /**
    * The point at which the ray hit the entity in world space.
    */
  var point: Vec3 = js.native
}
object RaycastResult {
  
  @scala.inline
  def apply(entity: Entity, normal: Vec3, point: Vec3): RaycastResult = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaycastResult]
  }
  
  @scala.inline
  implicit class RaycastResultMutableBuilder[Self <: RaycastResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: Vec3): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Vec3): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
