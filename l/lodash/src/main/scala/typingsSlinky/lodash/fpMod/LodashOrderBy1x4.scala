package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.lodashStrings.asc
import typingsSlinky.lodash.lodashStrings.desc
import typingsSlinky.lodash.mod.Many
import typingsSlinky.lodash.mod.NotVoid
import typingsSlinky.lodash.mod.ValueIteratee
import typingsSlinky.lodash.mod.__
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

