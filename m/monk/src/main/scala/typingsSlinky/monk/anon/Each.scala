package typingsSlinky.monk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Each[U] extends js.Object {
  def each(record: U, cursor: Close): js.Any = js.native
}

object Each {
  @scala.inline
  def apply[U](each: (U, Close) => js.Any): Each[U] = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction2(each))
    __obj.asInstanceOf[Each[U]]
  }
  @scala.inline
  implicit class EachOps[Self[u] <: Each[u], U] (val x: Self[U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[U] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[U] with Other]
    @scala.inline
    def withEach(value: (U, Close) => js.Any): Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

