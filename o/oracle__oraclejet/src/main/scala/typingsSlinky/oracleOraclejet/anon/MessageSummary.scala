package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageSummary extends js.Object {
  var messageDetail: js.UndefOr[String] = js.native
  var messageSummary: js.UndefOr[String] = js.native
}

object MessageSummary {
  @scala.inline
  def apply(): MessageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSummary]
  }
  @scala.inline
  implicit class MessageSummaryOps[Self <: MessageSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageDetail(value: String): Self = {
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
    def withMessageSummary(value: String): Self = {
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

