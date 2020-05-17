package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign7
import typingsSlinky.baseui.baseuiStrings.RU
import typingsSlinky.baseui.baseuiStrings.`Russia LeftparenthesisРоссияRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `170` extends js.Object {
  var dialCode: Plussign7 = js.native
  var id: RU = js.native
  var label: `Russia LeftparenthesisРоссияRightparenthesis` = js.native
}

object `170` {
  @scala.inline
  def apply(dialCode: Plussign7, id: RU, label: `Russia LeftparenthesisРоссияRightparenthesis`): `170` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`170`]
  }
  @scala.inline
  implicit class `170Ops`[Self <: `170`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign7): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: RU): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Russia LeftparenthesisРоссияRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

