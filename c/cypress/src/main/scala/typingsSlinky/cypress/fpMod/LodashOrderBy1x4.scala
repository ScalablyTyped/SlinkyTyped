package typingsSlinky.cypress.fpMod

import typingsSlinky.cypress.cypressStrings.asc
import typingsSlinky.cypress.cypressStrings.desc
import typingsSlinky.cypress.lodashMod.Many
import typingsSlinky.cypress.lodashMod.NotVoid
import typingsSlinky.cypress.lodashMod.ValueIteratee
import typingsSlinky.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy1x4[T] extends js.Object {
  def apply(iteratees: Many[js.Function1[/* value */ T, NotVoid]]): LodashOrderBy1x5[T] = js.native
  def apply(
    iteratees: Many[(js.Function1[/* value */ T, NotVoid]) | ValueIteratee[T]],
    orders: Many[Boolean | asc | desc]
  ): js.Array[T] = js.native
  def apply(iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy1x6[T] = js.native
}

