package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new bounding sphere.
  * @example
  * // Create a new bounding sphere centered on the origin with a radius of 0.5
  * var sphere = new pc.BoundingSphere();
  * @param [center] - The world space coordinate marking the center of the sphere. The constructor takes a reference of this parameter.
  * @param [radius] - The radius of the bounding sphere. Defaults to 0.5.
  */
@JSGlobal("pc.BoundingSphere")
@js.native
class BoundingSphere ()
  extends typingsSlinky.playcanvas.pc.BoundingSphere {
  def this(center: typingsSlinky.playcanvas.pc.Vec3) = this()
  def this(center: js.UndefOr[scala.Nothing], radius: Double) = this()
  def this(center: typingsSlinky.playcanvas.pc.Vec3, radius: Double) = this()
}
