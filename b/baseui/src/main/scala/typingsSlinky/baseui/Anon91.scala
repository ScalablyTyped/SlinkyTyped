package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.IN
import typingsSlinky.baseui.baseuiStrings.Plussign91
import typingsSlinky.baseui.baseuiStrings.`India LeftparenthesisभारतRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon91 extends js.Object {
  var dialCode: Plussign91 = js.native
  var id: IN = js.native
  var label: `India LeftparenthesisभारतRightparenthesis` = js.native
}

object Anon91 {
  @scala.inline
  def apply(dialCode: Plussign91, id: IN, label: `India LeftparenthesisभारतRightparenthesis`): Anon91 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon91]
  }
  @scala.inline
  implicit class Anon91Ops[Self <: Anon91] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign91): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: IN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `India LeftparenthesisभारतRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

