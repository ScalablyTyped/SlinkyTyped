package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.BA
import typingsSlinky.baseui.baseuiStrings.Plussign387
import typingsSlinky.baseui.baseuiStrings.`Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `20` extends js.Object {
  var dialCode: Plussign387 = js.native
  var id: BA = js.native
  var label: `Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis` = js.native
}

object `20` {
  @scala.inline
  def apply(
    dialCode: Plussign387,
    id: BA,
    label: `Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis`
  ): `20` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  @scala.inline
  implicit class `20Ops`[Self <: `20`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign387): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: BA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Bosnia and Herzegovina LeftparenthesisБосна и ХерцеговинаRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

