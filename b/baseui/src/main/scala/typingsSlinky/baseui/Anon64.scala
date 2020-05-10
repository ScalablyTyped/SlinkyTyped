package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.FO
import typingsSlinky.baseui.baseuiStrings.Plussign298
import typingsSlinky.baseui.baseuiStrings.`Faroe Islands LeftparenthesisFøroyarRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon64 extends js.Object {
  var dialCode: Plussign298 = js.native
  var id: FO = js.native
  var label: `Faroe Islands LeftparenthesisFøroyarRightparenthesis` = js.native
}

object Anon64 {
  @scala.inline
  def apply(dialCode: Plussign298, id: FO, label: `Faroe Islands LeftparenthesisFøroyarRightparenthesis`): Anon64 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon64]
  }
  @scala.inline
  implicit class Anon64Ops[Self <: Anon64] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign298): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: FO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Faroe Islands LeftparenthesisFøroyarRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

