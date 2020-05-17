package typingsSlinky.rmcDatePicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cols extends js.Object {
  var cols: js.Array[Key] = js.native
  var selMinute: js.Any = js.native
}

object Cols {
  @scala.inline
  def apply(cols: js.Array[Key], selMinute: js.Any): Cols = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], selMinute = selMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cols]
  }
  @scala.inline
  implicit class ColsOps[Self <: Cols] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCols(value: js.Array[Key]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelMinute(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selMinute")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

