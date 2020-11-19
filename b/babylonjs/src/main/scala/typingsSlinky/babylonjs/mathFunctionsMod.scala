package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.Maximum
import typingsSlinky.babylonjs.mathVectorMod.Vector2
import typingsSlinky.babylonjs.typesMod.FloatArray
import typingsSlinky.babylonjs.typesMod.IndicesArray
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/math.functions", JSImport.Namespace)
@js.native
object mathFunctionsMod extends js.Object {
  
  def extractMinAndMax(positions: FloatArray, start: Double, count: Double): Maximum = js.native
  def extractMinAndMax(
    positions: FloatArray,
    start: Double,
    count: Double,
    bias: js.UndefOr[Nullable[Vector2]],
    stride: Double
  ): Maximum = js.native
  def extractMinAndMax(positions: FloatArray, start: Double, count: Double, bias: Nullable[Vector2]): Maximum = js.native
  
  def extractMinAndMaxIndexed(positions: FloatArray, indices: IndicesArray, indexStart: Double, indexCount: Double): Maximum = js.native
  def extractMinAndMaxIndexed(
    positions: FloatArray,
    indices: IndicesArray,
    indexStart: Double,
    indexCount: Double,
    bias: Nullable[Vector2]
  ): Maximum = js.native
}
