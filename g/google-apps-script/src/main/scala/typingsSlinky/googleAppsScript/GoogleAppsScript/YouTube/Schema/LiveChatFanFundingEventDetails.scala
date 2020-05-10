package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatFanFundingEventDetails extends js.Object {
  var amountDisplayString: js.UndefOr[String] = js.native
  var amountMicros: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var userComment: js.UndefOr[String] = js.native
}

object LiveChatFanFundingEventDetails {
  @scala.inline
  def apply(): LiveChatFanFundingEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatFanFundingEventDetails]
  }
  @scala.inline
  implicit class LiveChatFanFundingEventDetailsOps[Self <: LiveChatFanFundingEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmountDisplayString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amountDisplayString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmountDisplayString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amountDisplayString")(js.undefined)
        ret
    }
    @scala.inline
    def withAmountMicros(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amountMicros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmountMicros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amountMicros")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withUserComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userComment")(js.undefined)
        ret
    }
  }
  
}

