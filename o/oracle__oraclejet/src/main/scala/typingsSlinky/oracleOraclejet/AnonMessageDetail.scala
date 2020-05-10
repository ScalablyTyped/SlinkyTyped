package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMessageDetail extends js.Object {
  var hint: js.UndefOr[AnonInRange] = js.native
  var messageDetail: js.UndefOr[AnonRangeOverflow] = js.native
  var messageSummary: js.UndefOr[AnonRangeOverflow] = js.native
}

object AnonMessageDetail {
  @scala.inline
  def apply(): AnonMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMessageDetail]
  }
  @scala.inline
  implicit class AnonMessageDetailOps[Self <: AnonMessageDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHint(value: AnonInRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageDetail(value: AnonRangeOverflow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageSummary(value: AnonRangeOverflow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageSummary")(js.undefined)
        ret
    }
  }
  
}

