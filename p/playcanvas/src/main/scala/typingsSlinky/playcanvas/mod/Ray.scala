package typingsSlinky.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new infinite ray starting at a given origin and pointing in a given direction.
  * @example
  * // Create a new ray starting at the position of this entity and pointing down
  * // the entity's negative Z axis
  * var ray = new pc.Ray(this.entity.getPosition(), this.entity.forward);
  * @property origin - The starting point of the ray.
  * @property direction - The direction of the ray.
  * @param [origin] - The starting point of the ray. The constructor takes a reference of this parameter.
  * Defaults to the origin (0, 0, 0).
  * @param [direction] - The direction of the ray. The constructor takes a reference of this parameter.
  * Defaults to a direction down the world negative Z axis (0, 0, -1).
  */
@JSImport("playcanvas", "Ray")
@js.native
class Ray ()
  extends typingsSlinky.playcanvas.pc.Ray {
  def this(origin: typingsSlinky.playcanvas.pc.Vec3) = this()
  def this(origin: js.UndefOr[scala.Nothing], direction: typingsSlinky.playcanvas.pc.Vec3) = this()
  def this(origin: typingsSlinky.playcanvas.pc.Vec3, direction: typingsSlinky.playcanvas.pc.Vec3) = this()
}
