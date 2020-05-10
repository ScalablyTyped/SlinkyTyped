package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.PK
import typingsSlinky.baseui.baseuiStrings.Plussign92
import typingsSlinky.baseui.baseuiStrings.`Pakistan Leftparenthesis‫پاکستان‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon156 extends js.Object {
  var dialCode: Plussign92 = js.native
  var id: PK = js.native
  var label: `Pakistan Leftparenthesis‫پاکستان‬‎Rightparenthesis` = js.native
}

object Anon156 {
  @scala.inline
  def apply(dialCode: Plussign92, id: PK, label: `Pakistan Leftparenthesis‫پاکستان‬‎Rightparenthesis`): Anon156 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon156]
  }
  @scala.inline
  implicit class Anon156Ops[Self <: Anon156] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign92): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: PK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Pakistan Leftparenthesis‫پاکستان‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

