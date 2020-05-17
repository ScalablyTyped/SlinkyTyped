package typingsSlinky.numjs.mod

import typingsSlinky.ndarray.mod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", "zeros")
@js.native
object zeros extends js.Object {
  def apply[T](shape: Double): NdArray[T] = js.native
  def apply[T](shape: Double, dtype: DataType): NdArray[T] = js.native
  def apply[T](shape: NdArrayData[T]): NdArray[T] = js.native
  def apply[T](shape: NdArrayData[T], dtype: DataType): NdArray[T] = js.native
}

