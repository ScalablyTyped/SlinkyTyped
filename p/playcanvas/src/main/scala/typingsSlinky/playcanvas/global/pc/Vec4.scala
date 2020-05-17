package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Vec4
  * @classdesc A 4-dimensional vector.
  * @description Creates a new Vec4 object.
  * @param {number|number[]} [x] - The x value. If x is an array of length 4, the array will be used to populate all components.
  * @param {number} [y] - The y value.
  * @param {number} [z] - The z value.
  * @param {number} [w] - The w value.
  * @example
  * var v = new pc.Vec4(1, 2, 3, 4);
  */
@JSGlobal("pc.Vec4")
@js.native
class Vec4 ()
  extends typingsSlinky.playcanvas.pc.Vec4 {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
}

/* static members */
@JSGlobal("pc.Vec4")
@js.native
object Vec4 extends js.Object {
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec4.ONE
    * @type {pc.Vec4}
    * @description A constant vector set to [1, 1, 1, 1].
    */
  val ONE: typingsSlinky.playcanvas.pc.Vec4 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec4.ZERO
    * @type {pc.Vec4}
    * @description A constant vector set to [0, 0, 0, 0].
    */
  val ZERO: typingsSlinky.playcanvas.pc.Vec4 = js.native
}

