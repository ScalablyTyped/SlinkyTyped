package typingsSlinky.numjs.mod

import typingsSlinky.ndarray.mod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", "identity")
@js.native
object identity extends js.Object {
  def apply[T](n: T): NdArray[T] = js.native
  def apply[T](n: T, dtype: DataType): NdArray[T] = js.native
}

