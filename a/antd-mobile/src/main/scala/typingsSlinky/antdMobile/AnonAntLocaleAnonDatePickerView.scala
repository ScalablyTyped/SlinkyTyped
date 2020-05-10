package typingsSlinky.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAntLocaleAnonDatePickerView extends js.Object {
  var antLocale: AnonDatePickerView = js.native
}

object AnonAntLocaleAnonDatePickerView {
  @scala.inline
  def apply(antLocale: AnonDatePickerView): AnonAntLocaleAnonDatePickerView = {
    val __obj = js.Dynamic.literal(antLocale = antLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAntLocaleAnonDatePickerView]
  }
  @scala.inline
  implicit class AnonAntLocaleAnonDatePickerViewOps[Self <: AnonAntLocaleAnonDatePickerView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntLocale(value: AnonDatePickerView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antLocale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

