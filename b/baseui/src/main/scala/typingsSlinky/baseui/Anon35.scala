package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.Plussign235
import typingsSlinky.baseui.baseuiStrings.TD
import typingsSlinky.baseui.baseuiStrings.`Chad LeftparenthesisTchadRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon35 extends js.Object {
  var dialCode: Plussign235 = js.native
  var id: TD = js.native
  var label: `Chad LeftparenthesisTchadRightparenthesis` = js.native
}

object Anon35 {
  @scala.inline
  def apply(dialCode: Plussign235, id: TD, label: `Chad LeftparenthesisTchadRightparenthesis`): Anon35 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon35]
  }
  @scala.inline
  implicit class Anon35Ops[Self <: Anon35] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign235): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: TD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Chad LeftparenthesisTchadRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

