package typingsSlinky.numjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", "clip")
@js.native
object clip extends js.Object {
  def apply[T](x: NjParam[T]): NdArray[T] = js.native
  def apply[T](x: NjParam[T], min: Double): NdArray[T] = js.native
  def apply[T](x: NjParam[T], min: Double, max: Double): NdArray[T] = js.native
}

