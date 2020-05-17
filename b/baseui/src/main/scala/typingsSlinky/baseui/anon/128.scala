package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.MR
import typingsSlinky.baseui.baseuiStrings.Plussign222
import typingsSlinky.baseui.baseuiStrings.`Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `128` extends js.Object {
  var dialCode: Plussign222 = js.native
  var id: MR = js.native
  var label: `Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis` = js.native
}

object `128` {
  @scala.inline
  def apply(dialCode: Plussign222, id: MR, label: `Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis`): `128` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`128`]
  }
  @scala.inline
  implicit class `128Ops`[Self <: `128`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign222): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: MR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Mauritania Leftparenthesis‫موريتانيا‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

