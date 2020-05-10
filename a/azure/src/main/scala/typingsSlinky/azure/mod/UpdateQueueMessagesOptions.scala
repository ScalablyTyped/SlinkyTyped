package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateQueueMessagesOptions extends TimeoutIntervalOptions {
  var messagetext: js.UndefOr[String] = js.native
}

object UpdateQueueMessagesOptions {
  @scala.inline
  def apply(): UpdateQueueMessagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQueueMessagesOptions]
  }
  @scala.inline
  implicit class UpdateQueueMessagesOptionsOps[Self <: UpdateQueueMessagesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessagetext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagetext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagetext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagetext")(js.undefined)
        ret
    }
  }
  
}

