package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.MO
import typingsSlinky.baseui.baseuiStrings.Plussign853
import typingsSlinky.baseui.baseuiStrings.`Macau Leftparenthesis澳門Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon118 extends js.Object {
  var dialCode: Plussign853 = js.native
  var id: MO = js.native
  var label: `Macau Leftparenthesis澳門Rightparenthesis` = js.native
}

object Anon118 {
  @scala.inline
  def apply(dialCode: Plussign853, id: MO, label: `Macau Leftparenthesis澳門Rightparenthesis`): Anon118 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon118]
  }
  @scala.inline
  implicit class Anon118Ops[Self <: Anon118] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign853): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: MO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Macau Leftparenthesis澳門Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

