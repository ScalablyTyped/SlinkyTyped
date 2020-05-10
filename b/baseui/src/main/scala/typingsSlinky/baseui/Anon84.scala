package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.GW
import typingsSlinky.baseui.baseuiStrings.Plussign245
import typingsSlinky.baseui.baseuiStrings.`Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon84 extends js.Object {
  var dialCode: Plussign245 = js.native
  var id: GW = js.native
  var label: `Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis` = js.native
}

object Anon84 {
  @scala.inline
  def apply(dialCode: Plussign245, id: GW, label: `Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis`): Anon84 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon84]
  }
  @scala.inline
  implicit class Anon84Ops[Self <: Anon84] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign245): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: GW): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Guinea-Bissau LeftparenthesisGuiné BissauRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

