package typingsSlinky.cypress.typesLodashFpMod

import typingsSlinky.cypress.typesLodashMod.List
import typingsSlinky.cypress.typesLodashMod.ValueIteratee
import typingsSlinky.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMinBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): LodashMinBy1x1[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): js.UndefOr[T] = js.native
  def apply[T](iteratee: __): LodashMinBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashMinBy1x2[T] = js.native
}

