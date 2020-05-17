package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.ME
import typingsSlinky.baseui.baseuiStrings.Plussign382
import typingsSlinky.baseui.baseuiStrings.`Montenegro LeftparenthesisCrna GoraRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `136` extends js.Object {
  var dialCode: Plussign382 = js.native
  var id: ME = js.native
  var label: `Montenegro LeftparenthesisCrna GoraRightparenthesis` = js.native
}

object `136` {
  @scala.inline
  def apply(dialCode: Plussign382, id: ME, label: `Montenegro LeftparenthesisCrna GoraRightparenthesis`): `136` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`136`]
  }
  @scala.inline
  implicit class `136Ops`[Self <: `136`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign382): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: ME): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Montenegro LeftparenthesisCrna GoraRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

