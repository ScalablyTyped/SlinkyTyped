package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.BY
import typingsSlinky.baseui.baseuiStrings.Plussign375
import typingsSlinky.baseui.baseuiStrings.`Belarus LeftparenthesisБеларусьRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon13 extends js.Object {
  var dialCode: Plussign375 = js.native
  var id: BY = js.native
  var label: `Belarus LeftparenthesisБеларусьRightparenthesis` = js.native
}

object Anon13 {
  @scala.inline
  def apply(dialCode: Plussign375, id: BY, label: `Belarus LeftparenthesisБеларусьRightparenthesis`): Anon13 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon13]
  }
  @scala.inline
  implicit class Anon13Ops[Self <: Anon13] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign375): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: BY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Belarus LeftparenthesisБеларусьRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

