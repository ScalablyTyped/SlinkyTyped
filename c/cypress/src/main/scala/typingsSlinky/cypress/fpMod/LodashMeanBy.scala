package typingsSlinky.cypress.fpMod

import typingsSlinky.cypress.lodashMod.List
import typingsSlinky.cypress.lodashMod.ValueIteratee
import typingsSlinky.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMeanBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): LodashMeanBy1x1[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): Double = js.native
  def apply[T](iteratee: __): LodashMeanBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashMeanBy1x2[T] = js.native
}

