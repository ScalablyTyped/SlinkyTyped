package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.Plussign967
import typingsSlinky.baseui.baseuiStrings.YE
import typingsSlinky.baseui.baseuiStrings.`Yemen Leftparenthesis‫اليمن‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon232 extends js.Object {
  var dialCode: Plussign967 = js.native
  var id: YE = js.native
  var label: `Yemen Leftparenthesis‫اليمن‬‎Rightparenthesis` = js.native
}

object Anon232 {
  @scala.inline
  def apply(dialCode: Plussign967, id: YE, label: `Yemen Leftparenthesis‫اليمن‬‎Rightparenthesis`): Anon232 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon232]
  }
  @scala.inline
  implicit class Anon232Ops[Self <: Anon232] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign967): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: YE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Yemen Leftparenthesis‫اليمن‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

