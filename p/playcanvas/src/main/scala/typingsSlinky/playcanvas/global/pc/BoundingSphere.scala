package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.BoundingSphere
  * @classdesc A bounding sphere is a volume for facilitating fast intersection testing.
  * @description Creates a new bounding sphere.
  * @example
  * // Create a new bounding sphere centered on the origin with a radius of 0.5
  * var sphere = new pc.BoundingSphere();
  * @param {pc.Vec3} [center] - The world space coordinate marking the center of the sphere. The constructor takes a reference of this parameter.
  * @param {number} [radius] - The radius of the bounding sphere. Defaults to 0.5.
  */
@JSGlobal("pc.BoundingSphere")
@js.native
class BoundingSphere ()
  extends typingsSlinky.playcanvas.pc.BoundingSphere {
  def this(center: typingsSlinky.playcanvas.pc.Vec3) = this()
  def this(center: typingsSlinky.playcanvas.pc.Vec3, radius: Double) = this()
}

