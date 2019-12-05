package typingsSlinky.cypress.typesLodashFpMod

import typingsSlinky.cypress.cypressStrings.asc
import typingsSlinky.cypress.cypressStrings.desc
import typingsSlinky.cypress.typesLodashMod.Many
import typingsSlinky.cypress.typesLodashMod.NotVoid
import typingsSlinky.cypress.typesLodashMod.ValueIteratee
import typingsSlinky.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy1x4[T] extends js.Object {
  def apply(iteratees: Many[ValueIteratee[T]]): LodashOrderBy2x5[T] = js.native
  def apply(
    iteratees: Many[(js.Function1[/* value */ T, NotVoid]) | ValueIteratee[T]],
    orders: Many[Boolean | asc | desc]
  ): js.Array[T] = js.native
  def apply(iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy1x6[T] = js.native
}

