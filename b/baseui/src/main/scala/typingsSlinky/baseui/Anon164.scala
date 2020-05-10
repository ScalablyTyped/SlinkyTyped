package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.PL
import typingsSlinky.baseui.baseuiStrings.Plussign48
import typingsSlinky.baseui.baseuiStrings.`Poland LeftparenthesisPolskaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon164 extends js.Object {
  var dialCode: Plussign48 = js.native
  var id: PL = js.native
  var label: `Poland LeftparenthesisPolskaRightparenthesis` = js.native
}

object Anon164 {
  @scala.inline
  def apply(dialCode: Plussign48, id: PL, label: `Poland LeftparenthesisPolskaRightparenthesis`): Anon164 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon164]
  }
  @scala.inline
  implicit class Anon164Ops[Self <: Anon164] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign48): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: PL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Poland LeftparenthesisPolskaRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

