package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAriaFocusSkipLink extends js.Object {
  var ariaFocusSkipLink: js.UndefOr[String] = js.native
  var labelCancel: js.UndefOr[String] = js.native
}

object AnonAriaFocusSkipLink {
  @scala.inline
  def apply(): AnonAriaFocusSkipLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAriaFocusSkipLink]
  }
  @scala.inline
  implicit class AnonAriaFocusSkipLinkOps[Self <: AnonAriaFocusSkipLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaFocusSkipLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaFocusSkipLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaFocusSkipLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaFocusSkipLink")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCancel")(js.undefined)
        ret
    }
  }
  
}

