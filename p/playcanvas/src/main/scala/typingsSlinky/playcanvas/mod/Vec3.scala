package typingsSlinky.playcanvas.mod

import org.scalablytyped.runtime.StObject
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
object Vec3 {
  
  /**
    * A constant vector set to [0, 0, 1].
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.BACK")
  @js.native
  val BACK: typingsSlinky.playcanvas.pc.Vec3 = js.native
  
  /**
    * A constant vector set to [0, -1, 0].
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.DOWN")
  @js.native
  val DOWN: typingsSlinky.playcanvas.pc.Vec3 = js.native
  
  /**
    * A constant vector set to [0, 0, -1].
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.FORWARD")
  @js.native
  val FORWARD: typingsSlinky.playcanvas.pc.Vec3 = js.native
  
  /**
    * A constant vector set to [-1, 0, 0].
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.LEFT")
  @js.native
  val LEFT: typingsSlinky.playcanvas.pc.Vec3 = js.native
  
  /**
    * A constant vector set to [1, 1, 1].
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.ONE")
  @js.native
  val ONE: typingsSlinky.playcanvas.pc.Vec3 = js.native
  
  /**
    * A constant vector set to [1, 0, 0].
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.RIGHT")
  @js.native
  val RIGHT: typingsSlinky.playcanvas.pc.Vec3 = js.native
  
  /**
    * A constant vector set to [0, 1, 0].
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.UP")
  @js.native
  val UP: typingsSlinky.playcanvas.pc.Vec3 = js.native
  
  /**
    * A constant vector set to [0, 0, 0].
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.ZERO")
  @js.native
  val ZERO: typingsSlinky.playcanvas.pc.Vec3 = js.native
}
