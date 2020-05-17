package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign421
import typingsSlinky.baseui.baseuiStrings.SK
import typingsSlinky.baseui.baseuiStrings.`Slovakia LeftparenthesisSlovenskoRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `189` extends js.Object {
  var dialCode: Plussign421 = js.native
  var id: SK = js.native
  var label: `Slovakia LeftparenthesisSlovenskoRightparenthesis` = js.native
}

object `189` {
  @scala.inline
  def apply(dialCode: Plussign421, id: SK, label: `Slovakia LeftparenthesisSlovenskoRightparenthesis`): `189` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`189`]
  }
  @scala.inline
  implicit class `189Ops`[Self <: `189`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign421): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: SK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Slovakia LeftparenthesisSlovenskoRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

