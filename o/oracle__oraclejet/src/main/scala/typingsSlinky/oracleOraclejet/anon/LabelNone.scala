package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelNone extends js.Object {
  var labelNone: js.UndefOr[String] = js.native
}

object LabelNone {
  @scala.inline
  def apply(): LabelNone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelNone]
  }
  @scala.inline
  implicit class LabelNoneOps[Self <: LabelNone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelNone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelNone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelNone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelNone")(js.undefined)
        ret
    }
  }
  
}

