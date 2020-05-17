package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.PS
import typingsSlinky.baseui.baseuiStrings.Plussign970
import typingsSlinky.baseui.baseuiStrings.`Palestine Leftparenthesis‫فلسطين‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `158` extends js.Object {
  var dialCode: Plussign970 = js.native
  var id: PS = js.native
  var label: `Palestine Leftparenthesis‫فلسطين‬‎Rightparenthesis` = js.native
}

object `158` {
  @scala.inline
  def apply(dialCode: Plussign970, id: PS, label: `Palestine Leftparenthesis‫فلسطين‬‎Rightparenthesis`): `158` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`158`]
  }
  @scala.inline
  implicit class `158Ops`[Self <: `158`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign970): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: PS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Palestine Leftparenthesis‫فلسطين‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

