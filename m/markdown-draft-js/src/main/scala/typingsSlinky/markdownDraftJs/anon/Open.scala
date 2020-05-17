package typingsSlinky.markdownDraftJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Open extends js.Object {
  def close(): String = js.native
  def open(): String = js.native
}

object Open {
  @scala.inline
  def apply(close: () => String, open: () => String): Open = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Open]
  }
  @scala.inline
  implicit class OpenOps[Self <: Open] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpen(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

