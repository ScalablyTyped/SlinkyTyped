package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.GH
import typingsSlinky.baseui.baseuiStrings.Plussign233
import typingsSlinky.baseui.baseuiStrings.`Ghana LeftparenthesisGaanaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `74` extends js.Object {
  var dialCode: Plussign233 = js.native
  var id: GH = js.native
  var label: `Ghana LeftparenthesisGaanaRightparenthesis` = js.native
}

object `74` {
  @scala.inline
  def apply(dialCode: Plussign233, id: GH, label: `Ghana LeftparenthesisGaanaRightparenthesis`): `74` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`74`]
  }
  @scala.inline
  implicit class `74Ops`[Self <: `74`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign233): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: GH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Ghana LeftparenthesisGaanaRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

