package typingsSlinky.anydbSql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Having[T] extends js.Object {
  def having(nodes: js.Any*): T = js.native
}

object Having {
  @scala.inline
  def apply[T](having: /* repeated */ js.Any => T): Having[T] = {
    val __obj = js.Dynamic.literal(having = js.Any.fromFunction1(having))
    __obj.asInstanceOf[Having[T]]
  }
  @scala.inline
  implicit class HavingOps[Self[t] <: Having[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHaving(value: /* repeated */ js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("having")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

