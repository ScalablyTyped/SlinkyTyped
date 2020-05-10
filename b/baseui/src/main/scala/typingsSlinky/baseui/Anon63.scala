package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.FK
import typingsSlinky.baseui.baseuiStrings.Plussign500
import typingsSlinky.baseui.baseuiStrings.`Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon63 extends js.Object {
  var dialCode: Plussign500 = js.native
  var id: FK = js.native
  var label: `Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis` = js.native
}

object Anon63 {
  @scala.inline
  def apply(
    dialCode: Plussign500,
    id: FK,
    label: `Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis`
  ): Anon63 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon63]
  }
  @scala.inline
  implicit class Anon63Ops[Self <: Anon63] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign500): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: FK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Falkland Islands LeftparenthesisIslas MalvinasRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

