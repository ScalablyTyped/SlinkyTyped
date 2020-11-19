package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new Vec3 object.
  * @example
  * var v = new pc.Vec3(1, 2, 3);
  * @param [x] - The x value. If x is an array of length 3, the array will be used to populate all components.
  * @param [y] - The y value.
  * @param [z] - The z value.
  */
@JSImport("playcanvas", "Vec3")
@js.native
class Vec3 ()
  extends typingsSlinky.playcanvas.pc.Vec3 {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
  def this(x: js.Array[Double], y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
}
/* static members */
@JSImport("playcanvas", "Vec3")
@js.native
object Vec3 extends js.Object {
  
  /**
    * A constant vector set to [0, 0, 1].
    */
  val BACK: typingsSlinky.playcanvas.pc.Vec3 = js.native
  
  /**
    * A constant vector set to [0, -1, 0].
    */
  val DOWN: typingsSlinky.playcanvas.pc.Vec3 = js.native
  
  /**
    * A constant vector set to [0, 0, -1].
    */
  val FORWARD: typingsSlinky.playcanvas.pc.Vec3 = js.native
  
  /**
    * A constant vector set to [-1, 0, 0].
    */
  val LEFT: typingsSlinky.playcanvas.pc.Vec3 = js.native
  
  /**
    * A constant vector set to [1, 1, 1].
    */
  val ONE: typingsSlinky.playcanvas.pc.Vec3 = js.native
  
  /**
    * A constant vector set to [1, 0, 0].
    */
  val RIGHT: typingsSlinky.playcanvas.pc.Vec3 = js.native
  
  /**
    * A constant vector set to [0, 1, 0].
    */
  val UP: typingsSlinky.playcanvas.pc.Vec3 = js.native
  
  /**
    * A constant vector set to [0, 0, 0].
    */
  val ZERO: typingsSlinky.playcanvas.pc.Vec3 = js.native
}
