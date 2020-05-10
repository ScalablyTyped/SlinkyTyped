package typingsSlinky.reactAriaLive

import typingsSlinky.reactAriaLive.reactAriaLiveStrings.assertive
import typingsSlinky.reactAriaLive.reactAriaLiveStrings.polite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArialive extends js.Object {
  var `aria-live`: assertive | polite = js.native
  var clearOnUnmount: js.UndefOr[Boolean] = js.native
  var message: String = js.native
}

object AnonArialive {
  @scala.inline
  def apply(`aria-live`: assertive | polite, message: String): AnonArialive = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArialive]
  }
  @scala.inline
  implicit class AnonArialiveOps[Self <: AnonArialive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-live`(value: assertive | polite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-live")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearOnUnmount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnUnmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearOnUnmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnUnmount")(js.undefined)
        ret
    }
  }
  
}

