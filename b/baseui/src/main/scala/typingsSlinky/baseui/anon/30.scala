package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.CM
import typingsSlinky.baseui.baseuiStrings.Plussign237
import typingsSlinky.baseui.baseuiStrings.`Cameroon LeftparenthesisCamerounRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `30` extends js.Object {
  var dialCode: Plussign237 = js.native
  var id: CM = js.native
  var label: `Cameroon LeftparenthesisCamerounRightparenthesis` = js.native
}

object `30` {
  @scala.inline
  def apply(dialCode: Plussign237, id: CM, label: `Cameroon LeftparenthesisCamerounRightparenthesis`): `30` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`30`]
  }
  @scala.inline
  implicit class `30Ops`[Self <: `30`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign237): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: CM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Cameroon LeftparenthesisCamerounRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

