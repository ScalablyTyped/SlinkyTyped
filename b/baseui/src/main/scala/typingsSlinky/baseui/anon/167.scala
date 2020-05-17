package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign974
import typingsSlinky.baseui.baseuiStrings.QA
import typingsSlinky.baseui.baseuiStrings.`Qatar Leftparenthesis‫قطر‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `167` extends js.Object {
  var dialCode: Plussign974 = js.native
  var id: QA = js.native
  var label: `Qatar Leftparenthesis‫قطر‬‎Rightparenthesis` = js.native
}

object `167` {
  @scala.inline
  def apply(dialCode: Plussign974, id: QA, label: `Qatar Leftparenthesis‫قطر‬‎Rightparenthesis`): `167` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`167`]
  }
  @scala.inline
  implicit class `167Ops`[Self <: `167`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign974): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: QA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Qatar Leftparenthesis‫قطر‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

