package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.LV
import typingsSlinky.baseui.baseuiStrings.Plussign371
import typingsSlinky.baseui.baseuiStrings.`Latvia LeftparenthesisLatvijaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `110` extends js.Object {
  var dialCode: Plussign371 = js.native
  var id: LV = js.native
  var label: `Latvia LeftparenthesisLatvijaRightparenthesis` = js.native
}

object `110` {
  @scala.inline
  def apply(dialCode: Plussign371, id: LV, label: `Latvia LeftparenthesisLatvijaRightparenthesis`): `110` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`110`]
  }
  @scala.inline
  implicit class `110Ops`[Self <: `110`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign371): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: LV): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Latvia LeftparenthesisLatvijaRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

