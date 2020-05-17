package typingsSlinky.numjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", "empty")
@js.native
object empty extends js.Object {
  def apply[T](shape: Double): NdArray[T] = js.native
  def apply[T](shape: Double, dtype: NdType[T]): NdArray[T] = js.native
  def apply[T](shape: NdArrayData[T]): NdArray[T] = js.native
  def apply[T](shape: NdArrayData[T], dtype: NdType[T]): NdArray[T] = js.native
}

