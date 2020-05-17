package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.MG
import typingsSlinky.baseui.baseuiStrings.Plussign261
import typingsSlinky.baseui.baseuiStrings.`Madagascar LeftparenthesisMadagasikaraRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `120` extends js.Object {
  var dialCode: Plussign261 = js.native
  var id: MG = js.native
  var label: `Madagascar LeftparenthesisMadagasikaraRightparenthesis` = js.native
}

object `120` {
  @scala.inline
  def apply(dialCode: Plussign261, id: MG, label: `Madagascar LeftparenthesisMadagasikaraRightparenthesis`): `120` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`120`]
  }
  @scala.inline
  implicit class `120Ops`[Self <: `120`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign261): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: MG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Madagascar LeftparenthesisMadagasikaraRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

