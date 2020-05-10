package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.BG
import typingsSlinky.baseui.baseuiStrings.Plussign359
import typingsSlinky.baseui.baseuiStrings.`Bulgaria LeftparenthesisБългарияRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon26 extends js.Object {
  var dialCode: Plussign359 = js.native
  var id: BG = js.native
  var label: `Bulgaria LeftparenthesisБългарияRightparenthesis` = js.native
}

object Anon26 {
  @scala.inline
  def apply(dialCode: Plussign359, id: BG, label: `Bulgaria LeftparenthesisБългарияRightparenthesis`): Anon26 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon26]
  }
  @scala.inline
  implicit class Anon26Ops[Self <: Anon26] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign359): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: BG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Bulgaria LeftparenthesisБългарияRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

