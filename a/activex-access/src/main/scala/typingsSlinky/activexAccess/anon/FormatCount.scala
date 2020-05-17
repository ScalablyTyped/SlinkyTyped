package typingsSlinky.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatCount extends js.Object {
  var Cancel: Double = js.native
  var FormatCount: Double = js.native
}

object FormatCount {
  @scala.inline
  def apply(Cancel: Double, FormatCount: Double): FormatCount = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], FormatCount = FormatCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatCount]
  }
  @scala.inline
  implicit class FormatCountOps[Self <: FormatCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormatCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

