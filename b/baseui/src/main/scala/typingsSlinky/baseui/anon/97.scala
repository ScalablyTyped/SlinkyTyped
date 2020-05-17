package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.IL
import typingsSlinky.baseui.baseuiStrings.Plussign972
import typingsSlinky.baseui.baseuiStrings.`Israel Leftparenthesis‫ישראל‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `97` extends js.Object {
  var dialCode: Plussign972 = js.native
  var id: IL = js.native
  var label: `Israel Leftparenthesis‫ישראל‬‎Rightparenthesis` = js.native
}

object `97` {
  @scala.inline
  def apply(dialCode: Plussign972, id: IL, label: `Israel Leftparenthesis‫ישראל‬‎Rightparenthesis`): `97` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`97`]
  }
  @scala.inline
  implicit class `97Ops`[Self <: `97`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign972): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: IL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Israel Leftparenthesis‫ישראל‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

