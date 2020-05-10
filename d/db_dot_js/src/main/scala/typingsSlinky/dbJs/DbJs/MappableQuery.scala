package typingsSlinky.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappableQuery[T] extends js.Object {
  def map[TMap](fn: js.Function1[/* value */ T, TMap]): Query[TMap] = js.native
}

object MappableQuery {
  @scala.inline
  def apply[T](map: js.Function1[/* value */ T, js.Any] => Query[js.Any]): MappableQuery[T] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[MappableQuery[T]]
  }
  @scala.inline
  implicit class MappableQueryOps[Self[t] <: MappableQuery[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMap(value: js.Function1[/* value */ T, js.Any] => Query[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

