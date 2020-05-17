package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign249
import typingsSlinky.baseui.baseuiStrings.SD
import typingsSlinky.baseui.baseuiStrings.`Sudan Leftparenthesis‫السودان‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `198` extends js.Object {
  var dialCode: Plussign249 = js.native
  var id: SD = js.native
  var label: `Sudan Leftparenthesis‫السودان‬‎Rightparenthesis` = js.native
}

object `198` {
  @scala.inline
  def apply(dialCode: Plussign249, id: SD, label: `Sudan Leftparenthesis‫السودان‬‎Rightparenthesis`): `198` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`198`]
  }
  @scala.inline
  implicit class `198Ops`[Self <: `198`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign249): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: SD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Sudan Leftparenthesis‫السودان‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

