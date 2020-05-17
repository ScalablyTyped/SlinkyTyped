package typingsSlinky.numjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", "stack")
@js.native
object stack extends js.Object {
  def apply[T](arrays: js.Array[NdArray[T]]): NdArray[T] = js.native
  def apply[T](arrays: js.Array[NdArray[T]], axis: Double): NdArray[T] = js.native
}

