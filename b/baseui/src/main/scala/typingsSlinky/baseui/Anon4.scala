package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.AM
import typingsSlinky.baseui.baseuiStrings.Plussign374
import typingsSlinky.baseui.baseuiStrings.`Armenia LeftparenthesisՀայաստանRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon4 extends js.Object {
  var dialCode: Plussign374 = js.native
  var id: AM = js.native
  var label: `Armenia LeftparenthesisՀայաստանRightparenthesis` = js.native
}

object Anon4 {
  @scala.inline
  def apply(dialCode: Plussign374, id: AM, label: `Armenia LeftparenthesisՀայաստանRightparenthesis`): Anon4 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon4]
  }
  @scala.inline
  implicit class Anon4Ops[Self <: Anon4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign374): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: AM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Armenia LeftparenthesisՀայաստանRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

