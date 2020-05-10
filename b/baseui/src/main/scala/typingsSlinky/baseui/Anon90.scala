package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.IS
import typingsSlinky.baseui.baseuiStrings.Plussign354
import typingsSlinky.baseui.baseuiStrings.`Iceland LeftparenthesisÍslandRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon90 extends js.Object {
  var dialCode: Plussign354 = js.native
  var id: IS = js.native
  var label: `Iceland LeftparenthesisÍslandRightparenthesis` = js.native
}

object Anon90 {
  @scala.inline
  def apply(dialCode: Plussign354, id: IS, label: `Iceland LeftparenthesisÍslandRightparenthesis`): Anon90 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon90]
  }
  @scala.inline
  implicit class Anon90Ops[Self <: Anon90] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign354): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: IS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Iceland LeftparenthesisÍslandRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

