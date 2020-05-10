package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.PE
import typingsSlinky.baseui.baseuiStrings.Plussign51
import typingsSlinky.baseui.baseuiStrings.`Peru LeftparenthesisPerúRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon162 extends js.Object {
  var dialCode: Plussign51 = js.native
  var id: PE = js.native
  var label: `Peru LeftparenthesisPerúRightparenthesis` = js.native
}

object Anon162 {
  @scala.inline
  def apply(dialCode: Plussign51, id: PE, label: `Peru LeftparenthesisPerúRightparenthesis`): Anon162 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon162]
  }
  @scala.inline
  implicit class Anon162Ops[Self <: Anon162] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign51): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: PE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Peru LeftparenthesisPerúRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

