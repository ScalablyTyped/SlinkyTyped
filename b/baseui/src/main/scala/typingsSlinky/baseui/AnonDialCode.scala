package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.AF
import typingsSlinky.baseui.baseuiStrings.Plussign93
import typingsSlinky.baseui.baseuiStrings.`Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDialCode extends js.Object {
  var dialCode: Plussign93 = js.native
  var id: AF = js.native
  var label: `Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis` = js.native
}

object AnonDialCode {
  @scala.inline
  def apply(dialCode: Plussign93, id: AF, label: `Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis`): AnonDialCode = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDialCode]
  }
  @scala.inline
  implicit class AnonDialCodeOps[Self <: AnonDialCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign93): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: AF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Afghanistan Leftparenthesis‫افغانستان‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

