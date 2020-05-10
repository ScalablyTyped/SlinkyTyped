package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.MK
import typingsSlinky.baseui.baseuiStrings.Plussign389
import typingsSlinky.baseui.baseuiStrings.`Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon119 extends js.Object {
  var dialCode: Plussign389 = js.native
  var id: MK = js.native
  var label: `Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis` = js.native
}

object Anon119 {
  @scala.inline
  def apply(
    dialCode: Plussign389,
    id: MK,
    label: `Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis`
  ): Anon119 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon119]
  }
  @scala.inline
  implicit class Anon119Ops[Self <: Anon119] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign389): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: MK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Macedonia LeftparenthesisFYROMRightparenthesis LeftparenthesisМакедонијаRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

