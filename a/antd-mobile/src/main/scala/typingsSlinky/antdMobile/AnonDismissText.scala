package typingsSlinky.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDismissText extends js.Object {
  var DatePickerLocale: AnonDay = js.native
  var dismissText: String = js.native
  var extra: String = js.native
  var okText: String = js.native
}

object AnonDismissText {
  @scala.inline
  def apply(DatePickerLocale: AnonDay, dismissText: String, extra: String, okText: String): AnonDismissText = {
    val __obj = js.Dynamic.literal(DatePickerLocale = DatePickerLocale.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDismissText]
  }
  @scala.inline
  implicit class AnonDismissTextOps[Self <: AnonDismissText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatePickerLocale(value: AnonDay): Self = {
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

