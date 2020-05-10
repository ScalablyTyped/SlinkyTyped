package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.Plussign84
import typingsSlinky.baseui.baseuiStrings.VN
import typingsSlinky.baseui.baseuiStrings.`Vietnam LeftparenthesisViệt NamRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon230 extends js.Object {
  var dialCode: Plussign84 = js.native
  var id: VN = js.native
  var label: `Vietnam LeftparenthesisViệt NamRightparenthesis` = js.native
}

object Anon230 {
  @scala.inline
  def apply(dialCode: Plussign84, id: VN, label: `Vietnam LeftparenthesisViệt NamRightparenthesis`): Anon230 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon230]
  }
  @scala.inline
  implicit class Anon230Ops[Self <: Anon230] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign84): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: VN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Vietnam LeftparenthesisViệt NamRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

