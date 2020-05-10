package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.CZ
import typingsSlinky.baseui.baseuiStrings.Plussign420
import typingsSlinky.baseui.baseuiStrings.`Czech Republic LeftparenthesisČeská republikaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon51 extends js.Object {
  var dialCode: Plussign420 = js.native
  var id: CZ = js.native
  var label: `Czech Republic LeftparenthesisČeská republikaRightparenthesis` = js.native
}

object Anon51 {
  @scala.inline
  def apply(
    dialCode: Plussign420,
    id: CZ,
    label: `Czech Republic LeftparenthesisČeská republikaRightparenthesis`
  ): Anon51 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon51]
  }
  @scala.inline
  implicit class Anon51Ops[Self <: Anon51] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign420): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: CZ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Czech Republic LeftparenthesisČeská republikaRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

