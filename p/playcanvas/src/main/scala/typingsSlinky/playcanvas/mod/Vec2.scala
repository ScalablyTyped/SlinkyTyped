package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new Vec2 object.
  * @example
  * var v = new pc.Vec2(1, 2);
  * @param [x] - The x value. If x is an array of length 2, the array will be used to populate all components.
  * @param [y] - The y value.
  */
@JSImport("playcanvas", "Vec2")
@js.native
class Vec2 ()
  extends typingsSlinky.playcanvas.pc.Vec2 {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
}
/* static members */
@JSImport("playcanvas", "Vec2")
@js.native
object Vec2 extends js.Object {
  
  /**
    * A constant vector set to [0, -1].
    */
  val DOWN: typingsSlinky.playcanvas.pc.Vec2 = js.native
  
  /**
    * A constant vector set to [-1, 0].
    */
  val LEFT: typingsSlinky.playcanvas.pc.Vec2 = js.native
  
  /**
    * A constant vector set to [1, 1].
    */
  val ONE: typingsSlinky.playcanvas.pc.Vec2 = js.native
  
  /**
    * A constant vector set to [1, 0].
    */
  val RIGHT: typingsSlinky.playcanvas.pc.Vec2 = js.native
  
  /**
    * A constant vector set to [0, 1].
    */
  val UP: typingsSlinky.playcanvas.pc.Vec2 = js.native
  
  /**
    * A constant vector set to [0, 0].
    */
  val ZERO: typingsSlinky.playcanvas.pc.Vec2 = js.native
}
