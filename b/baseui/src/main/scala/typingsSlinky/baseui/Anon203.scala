package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.CH
import typingsSlinky.baseui.baseuiStrings.Plussign41
import typingsSlinky.baseui.baseuiStrings.`Switzerland LeftparenthesisSchweizRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon203 extends js.Object {
  var dialCode: Plussign41 = js.native
  var id: CH = js.native
  var label: `Switzerland LeftparenthesisSchweizRightparenthesis` = js.native
}

object Anon203 {
  @scala.inline
  def apply(dialCode: Plussign41, id: CH, label: `Switzerland LeftparenthesisSchweizRightparenthesis`): Anon203 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon203]
  }
  @scala.inline
  implicit class Anon203Ops[Self <: Anon203] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign41): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: CH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Switzerland LeftparenthesisSchweizRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

