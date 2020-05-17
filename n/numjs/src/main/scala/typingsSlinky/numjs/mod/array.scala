package typingsSlinky.numjs.mod

import typingsSlinky.ndarray.mod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", "array")
@js.native
object array extends js.Object {
  def apply[T](arr: NjArray[T]): NdArray[T] = js.native
  def apply[T](arr: NjArray[T], dtype: DataType): NdArray[T] = js.native
}

