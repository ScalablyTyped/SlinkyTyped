package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.MU
import typingsSlinky.baseui.baseuiStrings.Plussign230
import typingsSlinky.baseui.baseuiStrings.`Mauritius LeftparenthesisMorisRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon129 extends js.Object {
  var dialCode: Plussign230 = js.native
  var id: MU = js.native
  var label: `Mauritius LeftparenthesisMorisRightparenthesis` = js.native
}

object Anon129 {
  @scala.inline
  def apply(dialCode: Plussign230, id: MU, label: `Mauritius LeftparenthesisMorisRightparenthesis`): Anon129 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon129]
  }
  @scala.inline
  implicit class Anon129Ops[Self <: Anon129] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign230): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: MU): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Mauritius LeftparenthesisMorisRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

