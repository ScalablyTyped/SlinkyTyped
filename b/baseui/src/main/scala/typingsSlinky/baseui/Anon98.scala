package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.IT
import typingsSlinky.baseui.baseuiStrings.Plussign39
import typingsSlinky.baseui.baseuiStrings.`Italy LeftparenthesisItaliaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon98 extends js.Object {
  var dialCode: Plussign39 = js.native
  var id: IT = js.native
  var label: `Italy LeftparenthesisItaliaRightparenthesis` = js.native
}

object Anon98 {
  @scala.inline
  def apply(dialCode: Plussign39, id: IT, label: `Italy LeftparenthesisItaliaRightparenthesis`): Anon98 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon98]
  }
  @scala.inline
  implicit class Anon98Ops[Self <: Anon98] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign39): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: IT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Italy LeftparenthesisItaliaRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

