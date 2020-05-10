package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.Plussign211
import typingsSlinky.baseui.baseuiStrings.SS
import typingsSlinky.baseui.baseuiStrings.`South Sudan Leftparenthesis‫جنوب السودان‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon195 extends js.Object {
  var dialCode: Plussign211 = js.native
  var id: SS = js.native
  var label: `South Sudan Leftparenthesis‫جنوب السودان‬‎Rightparenthesis` = js.native
}

object Anon195 {
  @scala.inline
  def apply(dialCode: Plussign211, id: SS, label: `South Sudan Leftparenthesis‫جنوب السودان‬‎Rightparenthesis`): Anon195 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon195]
  }
  @scala.inline
  implicit class Anon195Ops[Self <: Anon195] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign211): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: SS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `South Sudan Leftparenthesis‫جنوب السودان‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

