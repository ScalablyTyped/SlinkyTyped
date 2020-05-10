package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryResponse extends js.Object {
  var endTimeToken: js.UndefOr[String | Double] = js.native
  var messages: js.Array[HistoryMessage] = js.native
  var startTimeToken: js.UndefOr[String | Double] = js.native
}

object HistoryResponse {
  @scala.inline
  def apply(messages: js.Array[HistoryMessage]): HistoryResponse = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryResponse]
  }
  @scala.inline
  implicit class HistoryResponseOps[Self <: HistoryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: js.Array[HistoryMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTimeToken(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimeToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeToken(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeToken")(js.undefined)
        ret
    }
  }
  
}

