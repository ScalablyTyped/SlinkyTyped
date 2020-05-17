package typingsSlinky.jsplumb.anon

import typingsSlinky.jsplumb.mod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Each extends js.Object {
  def each(fn: js.Function1[/* conn */ Connection, Unit]): Unit = js.native
}

object Each {
  @scala.inline
  def apply(each: js.Function1[/* conn */ Connection, Unit] => Unit): Each = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each))
    __obj.asInstanceOf[Each]
  }
  @scala.inline
  implicit class EachOps[Self <: Each] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEach(value: js.Function1[/* conn */ Connection, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

