package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLabelNone extends js.Object {
  var labelNone: js.UndefOr[String] = js.native
}

object AnonLabelNone {
  @scala.inline
  def apply(): AnonLabelNone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLabelNone]
  }
  @scala.inline
  implicit class AnonLabelNoneOps[Self <: AnonLabelNone] (val x: Self) extends AnyVal {
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

