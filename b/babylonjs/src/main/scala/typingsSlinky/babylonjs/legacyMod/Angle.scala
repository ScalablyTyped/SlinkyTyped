package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Angle")
@js.native
class Angle protected ()
  extends typingsSlinky.babylonjs.indexMod.Angle {
  /**
    * Creates an Angle object of "radians" radians (float).
    * @param radians the angle in radians
    */
  def this(radians: Double) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "Angle")
@js.native
object Angle extends js.Object {
  
  /**
    * Gets a new Angle object valued with the angle value in radians between the two given vectors
    * @param a defines first vector
    * @param b defines second vector
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
