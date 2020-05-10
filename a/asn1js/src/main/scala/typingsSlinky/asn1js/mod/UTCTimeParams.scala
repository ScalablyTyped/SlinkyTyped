package typingsSlinky.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UTCTimeParams extends LocalHexBlockParams {
  var value: js.UndefOr[String] = js.native
  var valueDate: js.UndefOr[js.Date] = js.native
}

object UTCTimeParams {
  @scala.inline
  def apply(): UTCTimeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UTCTimeParams]
  }
  @scala.inline
  implicit class UTCTimeParamsOps[Self <: UTCTimeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDate")(js.undefined)
        ret
    }
  }
  
}

