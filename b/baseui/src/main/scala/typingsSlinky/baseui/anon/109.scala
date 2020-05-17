package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.LA
import typingsSlinky.baseui.baseuiStrings.Plussign856
import typingsSlinky.baseui.baseuiStrings.`Laos LeftparenthesisລາວRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `109` extends js.Object {
  var dialCode: Plussign856 = js.native
  var id: LA = js.native
  var label: `Laos LeftparenthesisລາວRightparenthesis` = js.native
}

object `109` {
  @scala.inline
  def apply(dialCode: Plussign856, id: LA, label: `Laos LeftparenthesisລາວRightparenthesis`): `109` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`109`]
  }
  @scala.inline
  implicit class `109Ops`[Self <: `109`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign856): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: LA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Laos LeftparenthesisລາວRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

