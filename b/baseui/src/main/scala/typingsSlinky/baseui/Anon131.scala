package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.MX
import typingsSlinky.baseui.baseuiStrings.Plussign52
import typingsSlinky.baseui.baseuiStrings.`Mexico LeftparenthesisMéxicoRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon131 extends js.Object {
  var dialCode: Plussign52 = js.native
  var id: MX = js.native
  var label: `Mexico LeftparenthesisMéxicoRightparenthesis` = js.native
}

object Anon131 {
  @scala.inline
  def apply(dialCode: Plussign52, id: MX, label: `Mexico LeftparenthesisMéxicoRightparenthesis`): Anon131 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon131]
  }
  @scala.inline
  implicit class Anon131Ops[Self <: Anon131] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign52): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: MX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Mexico LeftparenthesisMéxicoRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

