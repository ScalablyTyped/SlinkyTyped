package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new RaycastResult.
  * @property entity - The entity that was hit.
  * @property point - The point at which the ray hit the entity in world space.
  * @property normal - The normal vector of the surface where the ray hit in world space.
  * @param entity - The entity that was hit.
  * @param point - The point at which the ray hit the entity in world space.
  * @param normal - The normal vector of the surface where the ray hit in world space.
  */
@JSImport("playcanvas", "RaycastResult")
@js.native
class RaycastResult protected ()
  extends typingsSlinky.playcanvas.pc.RaycastResult {
  def this(
    entity: typingsSlinky.playcanvas.pc.Entity,
    point: typingsSlinky.playcanvas.pc.Vec3,
    normal: typingsSlinky.playcanvas.pc.Vec3
  ) = this()
  /**
    * The entity that was hit.
    */
  /* CompleteClass */
  override var entity: typingsSlinky.playcanvas.pc.Entity = js.native
  /**
    * The normal vector of the surface where the ray hit in world space.
    */
  /* CompleteClass */
  override var normal: typingsSlinky.playcanvas.pc.Vec3 = js.native
  /**
    * The point at which the ray hit the entity in world space.
    */
  /* CompleteClass */
  override var point: typingsSlinky.playcanvas.pc.Vec3 = js.native
}

