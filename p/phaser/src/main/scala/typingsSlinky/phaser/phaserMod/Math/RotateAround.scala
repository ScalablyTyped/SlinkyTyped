package typingsSlinky.phaser.phaserMod.Math

import typingsSlinky.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phaser", "Math.RotateAround")
@js.native
object RotateAround extends js.Object {
  
  /**
    * Rotate a `point` around `x` and `y` to the given `angle`, at the same distance.
    * 
    * In polar notation, this maps a point from (r, t) to (r, angle), vs. the origin (x, y).
    * @param point The point to be rotated.
    * @param x The horizontal coordinate to rotate around.
    * @param y The vertical coordinate to rotate around.
    * @param angle The angle of rotation in radians.
    */
  def apply[T /* <: Vector2Like */](point: T, x: Double, y: Double, angle: Double): T = js.native
}
