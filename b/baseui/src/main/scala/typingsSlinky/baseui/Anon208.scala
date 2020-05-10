package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.Plussign66
import typingsSlinky.baseui.baseuiStrings.TH
import typingsSlinky.baseui.baseuiStrings.`Thailand LeftparenthesisไทยRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon208 extends js.Object {
  var dialCode: Plussign66 = js.native
  var id: TH = js.native
  var label: `Thailand LeftparenthesisไทยRightparenthesis` = js.native
}

object Anon208 {
  @scala.inline
  def apply(dialCode: Plussign66, id: TH, label: `Thailand LeftparenthesisไทยRightparenthesis`): Anon208 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon208]
  }
  @scala.inline
  implicit class Anon208Ops[Self <: Anon208] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign66): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: TH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Thailand LeftparenthesisไทยRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

