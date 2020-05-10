package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.EE
import typingsSlinky.baseui.baseuiStrings.Plussign372
import typingsSlinky.baseui.baseuiStrings.`Estonia LeftparenthesisEestiRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon61 extends js.Object {
  var dialCode: Plussign372 = js.native
  var id: EE = js.native
  var label: `Estonia LeftparenthesisEestiRightparenthesis` = js.native
}

object Anon61 {
  @scala.inline
  def apply(dialCode: Plussign372, id: EE, label: `Estonia LeftparenthesisEestiRightparenthesis`): Anon61 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon61]
  }
  @scala.inline
  implicit class Anon61Ops[Self <: Anon61] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign372): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: EE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Estonia LeftparenthesisEestiRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

