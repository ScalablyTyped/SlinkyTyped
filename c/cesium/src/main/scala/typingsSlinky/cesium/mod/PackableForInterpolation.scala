package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PackableForInterpolation extends StObject
@JSImport("cesium", "PackableForInterpolation")
@js.native
object PackableForInterpolation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackableForInterpolation with Double] = js.native
  
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double]): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(
    packedArray: js.Array[Double],
    startingIndex: js.UndefOr[scala.Nothing],
    lastIndex: js.UndefOr[scala.Nothing],
    result: js.Array[Double]
  ): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], lastIndex: Double): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(
    packedArray: js.Array[Double],
    startingIndex: js.UndefOr[scala.Nothing],
    lastIndex: Double,
    result: js.Array[Double]
  ): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(
    packedArray: js.Array[Double],
    startingIndex: Double,
    lastIndex: js.UndefOr[scala.Nothing],
    result: js.Array[Double]
  ): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double): js.Array[Double] = js.native
  def convertPackedArrayForInterpolation(packedArray: js.Array[Double], startingIndex: Double, lastIndex: Double, result: js.Array[Double]): js.Array[Double] = js.native
  
  @js.native
  sealed trait packedInterpolationLength extends PackableForInterpolation
  /* 0 */ val packedInterpolationLength: typingsSlinky.cesium.mod.PackableForInterpolation.packedInterpolationLength with Double = js.native
  
  def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double]): js.Any = js.native
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: js.UndefOr[scala.Nothing],
    lastIndex: js.UndefOr[scala.Nothing],
    result: js.Any
  ): js.Any = js.native
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: js.UndefOr[scala.Nothing],
    lastIndex: Double
  ): js.Any = js.native
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: js.UndefOr[scala.Nothing],
    lastIndex: Double,
    result: js.Any
  ): js.Any = js.native
  def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Double): js.Any = js.native
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Double,
    lastIndex: js.UndefOr[scala.Nothing],
    result: js.Any
  ): js.Any = js.native
  def unpackInterpolationResult(array: js.Array[Double], sourceArray: js.Array[Double], startingIndex: Double, lastIndex: Double): js.Any = js.native
  def unpackInterpolationResult(
    array: js.Array[Double],
    sourceArray: js.Array[Double],
    startingIndex: Double,
    lastIndex: Double,
    result: js.Any
  ): js.Any = js.native
}
