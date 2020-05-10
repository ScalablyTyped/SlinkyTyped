package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.Plussign221
import typingsSlinky.baseui.baseuiStrings.SN
import typingsSlinky.baseui.baseuiStrings.`Senegal LeftparenthesisSénégalRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon183 extends js.Object {
  var dialCode: Plussign221 = js.native
  var id: SN = js.native
  var label: `Senegal LeftparenthesisSénégalRightparenthesis` = js.native
}

object Anon183 {
  @scala.inline
  def apply(dialCode: Plussign221, id: SN, label: `Senegal LeftparenthesisSénégalRightparenthesis`): Anon183 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon183]
  }
  @scala.inline
  implicit class Anon183Ops[Self <: Anon183] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign221): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: SN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Senegal LeftparenthesisSénégalRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

