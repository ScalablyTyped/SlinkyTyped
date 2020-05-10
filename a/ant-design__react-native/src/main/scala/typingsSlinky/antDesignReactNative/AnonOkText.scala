package typingsSlinky.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOkText extends js.Object {
  var DatePickerLocale: AnonCalendar = js.native
  var dismissText: String = js.native
  var extra: String = js.native
  var okText: String = js.native
}

object AnonOkText {
  @scala.inline
  def apply(DatePickerLocale: AnonCalendar, dismissText: String, extra: String, okText: String): AnonOkText = {
    val __obj = js.Dynamic.literal(DatePickerLocale = DatePickerLocale.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOkText]
  }
  @scala.inline
  implicit class AnonOkTextOps[Self <: AnonOkText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatePickerLocale(value: AnonCalendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatePickerLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

