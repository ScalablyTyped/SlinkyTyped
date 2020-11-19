package typingsSlinky.pixiSpine.global.PIXI.spine.core

import typingsSlinky.pixiSpine.PIXI.spine.core.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.Utils")
@js.native
class Utils ()
  extends typingsSlinky.pixiSpine.PIXI.spine.core.Utils
/* static members */
@JSGlobal("PIXI.spine.core.Utils")
@js.native
object Utils extends js.Object {
  
  var SUPPORTS_TYPED_ARRAYS: Boolean = js.native
  
  def arrayCopy[T](
    source: ArrayLike[T],
    sourceStart: Double,
    dest: ArrayLike[T],
    destStart: Double,
    numElements: Double
  ): Unit = js.native
  
  def contains[T](array: js.Array[T], element: T): Boolean = js.native
  def contains[T](array: js.Array[T], element: T, identity: Boolean): Boolean = js.native
  
  def ensureArrayCapacity[T](array: js.Array[T], size: Double): js.Array[T] = js.native
  def ensureArrayCapacity[T](array: js.Array[T], size: Double, value: js.Any): js.Array[T] = js.native
  
  def newArray[T](size: Double, defaultValue: T): js.Array[T] = js.native
  
  def newFloatArray(size: Double): ArrayLike[Double] = js.native
  
  def newShortArray(size: Double): ArrayLike[Double] = js.native
  
  def setArraySize[T](array: js.Array[T], size: Double): js.Array[T] = js.native
  def setArraySize[T](array: js.Array[T], size: Double, value: js.Any): js.Array[T] = js.native
  
  def toFloatArray(array: js.Array[Double]): js.Array[Double] | js.typedarray.Float32Array = js.native
  
  def toSinglePrecision(value: Double): Double = js.native
  
  def webkit602BugfixHelper(alpha: Double, blend: typingsSlinky.pixiSpine.PIXI.spine.core.MixBlend): Unit = js.native
}
