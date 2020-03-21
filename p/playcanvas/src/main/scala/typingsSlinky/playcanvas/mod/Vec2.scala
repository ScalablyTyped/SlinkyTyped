package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Vec2
  * @classdesc A 2-dimensional vector.
  * @description Creates a new Vec2 object.
  * @param {number|number[]} [x] - The x value. If x is an array of length 2, the array will be used to populate all components.
  * @param {number} [y] - The y value.
  * @example
  * var v = new pc.Vec2(1, 2);
  */
@JSImport("playcanvas", "Vec2")
@js.native
class Vec2 ()
  extends typingsSlinky.playcanvas.pc.Vec2 {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
}

/* static members */
@JSImport("playcanvas", "Vec2")
@js.native
object Vec2 extends js.Object {
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec2.ONE
    * @type {pc.Vec2}
    * @description A constant vector set to [1, 1].
    */
  val ONE: typingsSlinky.playcanvas.pc.Vec2 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec2.RIGHT
    * @type {pc.Vec2}
    * @description A constant vector set to [1, 0].
    */
  val RIGHT: typingsSlinky.playcanvas.pc.Vec2 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec2.UP
    * @type {pc.Vec2}
    * @description A constant vector set to [0, 1].
    */
  val UP: typingsSlinky.playcanvas.pc.Vec2 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec2.ZERO
    * @type {pc.Vec2}
    * @description A constant vector set to [0, 0].
    */
  val ZERO: typingsSlinky.playcanvas.pc.Vec2 = js.native
}

