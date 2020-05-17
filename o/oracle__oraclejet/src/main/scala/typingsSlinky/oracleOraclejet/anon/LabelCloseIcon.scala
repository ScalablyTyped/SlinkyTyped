package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelCloseIcon extends js.Object {
  var labelCloseIcon: js.UndefOr[String] = js.native
}

object LabelCloseIcon {
  @scala.inline
  def apply(): LabelCloseIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelCloseIcon]
  }
  @scala.inline
  implicit class LabelCloseIconOps[Self <: LabelCloseIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelCloseIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCloseIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCloseIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCloseIcon")(js.undefined)
        ret
    }
  }
  
}

