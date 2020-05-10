package typingsSlinky.escpos.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapter extends js.Object {
  def open(args: js.Any*): Adapter = js.native
  def write(data: Buffer, callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Adapter = js.native
}

object Adapter {
  @scala.inline
  def apply(
    open: /* repeated */ js.Any => Adapter,
    write: (Buffer, js.Function1[/* error */ js.UndefOr[js.Any], Unit]) => Adapter
  ): Adapter = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction1(open), write = js.Any.fromFunction2(write))
    __obj.asInstanceOf[Adapter]
  }
  @scala.inline
  implicit class AdapterOps[Self <: Adapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpen(value: /* repeated */ js.Any => Adapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: (Buffer, js.Function1[/* error */ js.UndefOr[js.Any], Unit]) => Adapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

