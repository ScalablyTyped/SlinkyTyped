package typingsSlinky.crossfilter

import typingsSlinky.crossfilter.CrossFilter.HeapSelect
import typingsSlinky.crossfilter.CrossFilter.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallBy extends js.Object {
  def apply[T](array: js.Array[T], lo: Double, hi: Double, k: Double): js.Array[T] = js.native
  def by[T](value: Selector[T]): HeapSelect[T] = js.native
}

