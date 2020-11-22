package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.anon.Maximum
import typingsSlinky.babylonjs.typesMod.FloatArray
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "extractMinAndMax")
@js.native
object extractMinAndMax extends js.Object {
  
  def apply(positions: FloatArray, start: Double, count: Double): Maximum = js.native
  def apply(
    positions: FloatArray,
    start: Double,
    count: Double,
    bias: js.UndefOr[Nullable[typingsSlinky.babylonjs.mathVectorMod.Vector2]],
    stride: Double
  ): Maximum = js.native
  def apply(
    positions: FloatArray,
    start: Double,
    count: Double,
    bias: Nullable[typingsSlinky.babylonjs.mathVectorMod.Vector2]
  ): Maximum = js.native
}
