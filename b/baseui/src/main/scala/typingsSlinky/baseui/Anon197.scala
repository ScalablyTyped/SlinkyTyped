package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.LK
import typingsSlinky.baseui.baseuiStrings.Plussign94
import typingsSlinky.baseui.baseuiStrings.`Sri Lanka Leftparenthesisශ්‍රී ලංකාවRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon197 extends js.Object {
  var dialCode: Plussign94 = js.native
  var id: LK = js.native
  var label: `Sri Lanka Leftparenthesisශ්‍රී ලංකාවRightparenthesis` = js.native
}

object Anon197 {
  @scala.inline
  def apply(dialCode: Plussign94, id: LK, label: `Sri Lanka Leftparenthesisශ්‍රී ලංකාවRightparenthesis`): Anon197 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon197]
  }
  @scala.inline
  implicit class Anon197Ops[Self <: Anon197] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign94): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: LK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Sri Lanka Leftparenthesisශ්‍රී ලංකාවRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

