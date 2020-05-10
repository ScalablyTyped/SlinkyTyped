package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.Plussign216
import typingsSlinky.baseui.baseuiStrings.TN
import typingsSlinky.baseui.baseuiStrings.`Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon214 extends js.Object {
  var dialCode: Plussign216 = js.native
  var id: TN = js.native
  var label: `Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis` = js.native
}

object Anon214 {
  @scala.inline
  def apply(dialCode: Plussign216, id: TN, label: `Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis`): Anon214 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon214]
  }
  @scala.inline
  implicit class Anon214Ops[Self <: Anon214] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign216): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: TN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Tunisia Leftparenthesis‫تونس‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

