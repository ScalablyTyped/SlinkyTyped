package typingsSlinky.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlushOnChange extends js.Object {
  var flushOnChange: js.UndefOr[Boolean] = js.native
  var flushOnEnd: js.UndefOr[Boolean] = js.native
}

object FlushOnChange {
  @scala.inline
  def apply(): FlushOnChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlushOnChange]
  }
  @scala.inline
  implicit class FlushOnChangeOps[Self <: FlushOnChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlushOnChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlushOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushOnChange")(js.undefined)
        ret
    }
    @scala.inline
    def withFlushOnEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushOnEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlushOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushOnEnd")(js.undefined)
        ret
    }
  }
  
}

