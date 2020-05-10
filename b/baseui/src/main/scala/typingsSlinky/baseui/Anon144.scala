package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.NL
import typingsSlinky.baseui.baseuiStrings.Plussign31
import typingsSlinky.baseui.baseuiStrings.`Netherlands LeftparenthesisNederlandRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon144 extends js.Object {
  var dialCode: Plussign31 = js.native
  var id: NL = js.native
  var label: `Netherlands LeftparenthesisNederlandRightparenthesis` = js.native
}

object Anon144 {
  @scala.inline
  def apply(dialCode: Plussign31, id: NL, label: `Netherlands LeftparenthesisNederlandRightparenthesis`): Anon144 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon144]
  }
  @scala.inline
  implicit class Anon144Ops[Self <: Anon144] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign31): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: NL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Netherlands LeftparenthesisNederlandRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

