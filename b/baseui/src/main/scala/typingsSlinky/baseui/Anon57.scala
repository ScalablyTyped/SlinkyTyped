package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.EG
import typingsSlinky.baseui.baseuiStrings.Plussign20
import typingsSlinky.baseui.baseuiStrings.`Egypt Leftparenthesis‫مصر‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon57 extends js.Object {
  var dialCode: Plussign20 = js.native
  var id: EG = js.native
  var label: `Egypt Leftparenthesis‫مصر‬‎Rightparenthesis` = js.native
}

object Anon57 {
  @scala.inline
  def apply(dialCode: Plussign20, id: EG, label: `Egypt Leftparenthesis‫مصر‬‎Rightparenthesis`): Anon57 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon57]
  }
  @scala.inline
  implicit class Anon57Ops[Self <: Anon57] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign20): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: EG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Egypt Leftparenthesis‫مصر‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

