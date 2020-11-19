package typingsSlinky.playcanvas.global.pc

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
@JSGlobal("pc.RaycastResult")
@js.native
class RaycastResult protected ()
  extends typingsSlinky.playcanvas.pc.RaycastResult {
  def this(
    entity: typingsSlinky.playcanvas.pc.Entity,
    point: typingsSlinky.playcanvas.pc.Vec3,
    normal: typingsSlinky.playcanvas.pc.Vec3
  ) = this()
}
