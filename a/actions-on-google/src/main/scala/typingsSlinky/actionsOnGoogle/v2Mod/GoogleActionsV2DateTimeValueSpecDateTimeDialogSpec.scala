package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec extends js.Object {
  /**
    * This is used to create prompt to ask for date only.
    * For example: What date are you looking for?
    */
  var requestDateText: js.UndefOr[String] = js.native
  /**
    * This is used to create initial prompt by datetime sub-dialog.
    * Example question: \"What date and time do you want?\"
    */
  var requestDatetimeText: js.UndefOr[String] = js.native
  /**
    * This is used to create prompt to ask for time only.
    * For example: What time?
    */
  var requestTimeText: js.UndefOr[String] = js.native
}

object GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec {
  @scala.inline
  def apply(): GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2DateTimeValueSpecDateTimeDialogSpecOps[Self <: GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestDateText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDateText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestDateText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDateText")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestDatetimeText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDatetimeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestDatetimeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDatetimeText")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTimeText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTimeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeText")(js.undefined)
        ret
    }
  }
  
}

