package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new Quat object.
  * @param [x] - The quaternion's x component. Default value 0. If x is an array of length 4, the array will be used to populate all components.
  * @param [y] - The quaternion's y component. Default value 0.
  * @param [z] - The quaternion's z component. Default value 0.
  * @param [w] - The quaternion's w component. Default value 1.
  */
@JSImport("playcanvas", "Quat")
@js.native
class Quat ()
  extends typingsSlinky.playcanvas.pc.Quat {
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
  def this(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    z: js.UndefOr[scala.Nothing],
    w: Double
  ) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double) = this()
  def this(x: js.Array[Double], y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: js.Array[Double], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
  def this(x: js.Array[Double], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
}
/* static members */
@JSImport("playcanvas", "Quat")
@js.native
object Quat extends js.Object {
  
  /**
    * A constant quaternion set to [0, 0, 0, 1] (the identity).
    */
  val IDENTITY: typingsSlinky.playcanvas.pc.Quat = js.native
  
  /**
    * A constant quaternion set to [0, 0, 0, 0].
    */
  val ZERO: typingsSlinky.playcanvas.pc.Quat = js.native
}
