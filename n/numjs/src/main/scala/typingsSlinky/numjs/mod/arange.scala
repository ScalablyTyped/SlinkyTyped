package typingsSlinky.numjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", "arange")
@js.native
object arange extends js.Object {
  def apply[T](start: Double): NdArray[T] = js.native
  def apply[T](start: Double, stop: Double): NdArray[T] = js.native
  def apply[T](start: Double, stop: Double, dtype: NdType[T]): NdArray[T] = js.native
  def apply[T](start: Double, stop: Double, step: Double): NdArray[T] = js.native
  def apply[T](start: Double, stop: Double, step: Double, dtype: NdType[T]): NdArray[T] = js.native
  def apply[T](stop: Double, dtype: NdType[T]): NdArray[T] = js.native
}

