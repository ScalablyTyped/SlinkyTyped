package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.KM
import typingsSlinky.baseui.baseuiStrings.Plussign269
import typingsSlinky.baseui.baseuiStrings.`Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon41 extends js.Object {
  var dialCode: Plussign269 = js.native
  var id: KM = js.native
  var label: `Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis` = js.native
}

object Anon41 {
  @scala.inline
  def apply(dialCode: Plussign269, id: KM, label: `Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis`): Anon41 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon41]
  }
  @scala.inline
  implicit class Anon41Ops[Self <: Anon41] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign269): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: KM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Comoros Leftparenthesis‫جزر القمر‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

