package typingsSlinky.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetailedMessage extends js.Object {
  var detailedMessage: js.UndefOr[Boolean] = js.native
  var formatMessage: js.UndefOr[Boolean] = js.native
}

object AnonDetailedMessage {
  @scala.inline
  def apply(): AnonDetailedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDetailedMessage]
  }
  @scala.inline
  implicit class AnonDetailedMessageOps[Self <: AnonDetailedMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetailedMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailedMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailedMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailedMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(js.undefined)
        ret
    }
  }
  
}

