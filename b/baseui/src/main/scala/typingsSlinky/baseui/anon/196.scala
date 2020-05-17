package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.ES
import typingsSlinky.baseui.baseuiStrings.Plussign34
import typingsSlinky.baseui.baseuiStrings.`Spain LeftparenthesisEspañaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `196` extends js.Object {
  var dialCode: Plussign34 = js.native
  var id: ES = js.native
  var label: `Spain LeftparenthesisEspañaRightparenthesis` = js.native
}

object `196` {
  @scala.inline
  def apply(dialCode: Plussign34, id: ES, label: `Spain LeftparenthesisEspañaRightparenthesis`): `196` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`196`]
  }
  @scala.inline
  implicit class `196Ops`[Self <: `196`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign34): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: ES): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Spain LeftparenthesisEspañaRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

