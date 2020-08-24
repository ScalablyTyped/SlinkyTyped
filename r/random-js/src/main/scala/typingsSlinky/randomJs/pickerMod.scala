package typingsSlinky.randomJs

import typingsSlinky.randomJs.typesMod.Distribution
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/picker", JSImport.Namespace)
@js.native
object pickerMod extends js.Object {
  def picker[T](source: ArrayLike[T]): Distribution[T] = js.native
  def picker[T](source: ArrayLike[T], begin: js.UndefOr[scala.Nothing], end: Double): Distribution[T] = js.native
  def picker[T](source: ArrayLike[T], begin: Double): Distribution[T] = js.native
  def picker[T](source: ArrayLike[T], begin: Double, end: Double): Distribution[T] = js.native
}

