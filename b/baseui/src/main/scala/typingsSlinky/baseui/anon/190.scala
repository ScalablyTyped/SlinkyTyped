package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign386
import typingsSlinky.baseui.baseuiStrings.SI
import typingsSlinky.baseui.baseuiStrings.`Slovenia LeftparenthesisSlovenijaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `190` extends js.Object {
  var dialCode: Plussign386 = js.native
  var id: SI = js.native
  var label: `Slovenia LeftparenthesisSlovenijaRightparenthesis` = js.native
}

object `190` {
  @scala.inline
  def apply(dialCode: Plussign386, id: SI, label: `Slovenia LeftparenthesisSlovenijaRightparenthesis`): `190` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`190`]
  }
  @scala.inline
  implicit class `190Ops`[Self <: `190`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign386): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: SI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Slovenia LeftparenthesisSlovenijaRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

