package typingsSlinky.monk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEach[U] extends js.Object {
  def each(record: U, cursor: AnonClose): js.Any = js.native
}

object AnonEach {
  @scala.inline
  def apply[U](each: (U, AnonClose) => js.Any): AnonEach[U] = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction2(each))
    __obj.asInstanceOf[AnonEach[U]]
  }
  @scala.inline
  implicit class AnonEachOps[Self[u] <: AnonEach[u], U] (val x: Self[U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[U] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[U] with Other]
    @scala.inline
    def withEach(value: (U, AnonClose) => js.Any): Self[U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

