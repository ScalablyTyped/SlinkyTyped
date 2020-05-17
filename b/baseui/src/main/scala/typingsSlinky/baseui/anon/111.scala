package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.LB
import typingsSlinky.baseui.baseuiStrings.Plussign961
import typingsSlinky.baseui.baseuiStrings.`Lebanon Leftparenthesis‫لبنان‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `111` extends js.Object {
  var dialCode: Plussign961 = js.native
  var id: LB = js.native
  var label: `Lebanon Leftparenthesis‫لبنان‬‎Rightparenthesis` = js.native
}

object `111` {
  @scala.inline
  def apply(dialCode: Plussign961, id: LB, label: `Lebanon Leftparenthesis‫لبنان‬‎Rightparenthesis`): `111` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`111`]
  }
  @scala.inline
  implicit class `111Ops`[Self <: `111`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign961): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: LB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Lebanon Leftparenthesis‫لبنان‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

