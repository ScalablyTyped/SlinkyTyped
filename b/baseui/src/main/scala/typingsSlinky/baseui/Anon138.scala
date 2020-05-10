package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.MA
import typingsSlinky.baseui.baseuiStrings.Plussign212
import typingsSlinky.baseui.baseuiStrings.`Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon138 extends js.Object {
  var dialCode: Plussign212 = js.native
  var id: MA = js.native
  var label: `Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis` = js.native
}

object Anon138 {
  @scala.inline
  def apply(dialCode: Plussign212, id: MA, label: `Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis`): Anon138 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon138]
  }
  @scala.inline
  implicit class Anon138Ops[Self <: Anon138] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign212): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: MA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Morocco Leftparenthesis‫المغرب‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

