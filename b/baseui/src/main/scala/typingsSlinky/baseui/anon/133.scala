package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.MD
import typingsSlinky.baseui.baseuiStrings.Plussign373
import typingsSlinky.baseui.baseuiStrings.`Moldova LeftparenthesisRepublica MoldovaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `133` extends js.Object {
  var dialCode: Plussign373 = js.native
  var id: MD = js.native
  var label: `Moldova LeftparenthesisRepublica MoldovaRightparenthesis` = js.native
}

object `133` {
  @scala.inline
  def apply(dialCode: Plussign373, id: MD, label: `Moldova LeftparenthesisRepublica MoldovaRightparenthesis`): `133` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`133`]
  }
  @scala.inline
  implicit class `133Ops`[Self <: `133`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign373): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: MD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Moldova LeftparenthesisRepublica MoldovaRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

