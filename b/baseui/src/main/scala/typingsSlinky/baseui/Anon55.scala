package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.DO
import typingsSlinky.baseui.baseuiStrings.Plussign1
import typingsSlinky.baseui.baseuiStrings.`Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon55 extends js.Object {
  var dialCode: Plussign1 = js.native
  var id: DO = js.native
  var label: `Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis` = js.native
}

object Anon55 {
  @scala.inline
  def apply(
    dialCode: Plussign1,
    id: DO,
    label: `Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis`
  ): Anon55 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon55]
  }
  @scala.inline
  implicit class Anon55Ops[Self <: Anon55] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: DO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Dominican Republic LeftparenthesisRepública DominicanaRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

