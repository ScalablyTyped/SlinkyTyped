package typingsSlinky.babylonjs.mathsIndexMod

import typingsSlinky.babylonjs.typesMod.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/index", "Angle")
@js.native
class Angle protected ()
  extends typingsSlinky.babylonjs.mathMod.Angle {
  /**
    * Creates an Angle object of "radians" radians (float).
    * @param radians the angle in radians
    */
  def this(radians: Double) = this()
}
/* static members */
@JSImport("babylonjs/Maths/index", "Angle")
@js.native
object Angle extends js.Object {
  
  /**
    * Gets a new Angle object valued with the gradient angle, in radians, of the line joining two points
    * @param a defines first point as the origin
    * @param b defines point
    * @returns a new Angle
    */
  def BetweenTwoPoints(
    a: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    b: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector2]
  ): typingsSlinky.babylonjs.mathPathMod.Angle = js.native
  
  /**
    * Gets a new Angle object from the given float in degrees
    * @param degrees defines the angle value in degrees
    * @returns a new Angle
    */
  def FromDegrees(degrees: Double): typingsSlinky.babylonjs.mathPathMod.Angle = js.native
  
  /**
    * Gets a new Angle object from the given float in radians
    * @param radians defines the angle value in radians
    * @returns a new Angle
    */
  def FromRadians(radians: Double): typingsSlinky.babylonjs.mathPathMod.Angle = js.native
}
