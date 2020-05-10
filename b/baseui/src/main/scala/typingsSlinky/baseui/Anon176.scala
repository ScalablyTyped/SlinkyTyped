package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.MF
import typingsSlinky.baseui.baseuiStrings.Plussign590
import typingsSlinky.baseui.baseuiStrings.`Saint Martin LeftparenthesisSaint-Martin Leftparenthesispartie françaiseRightparenthesisRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon176 extends js.Object {
  var dialCode: Plussign590 = js.native
  var id: MF = js.native
  var label: `Saint Martin LeftparenthesisSaint-Martin Leftparenthesispartie françaiseRightparenthesisRightparenthesis` = js.native
}

object Anon176 {
  @scala.inline
  def apply(
    dialCode: Plussign590,
    id: MF,
    label: `Saint Martin LeftparenthesisSaint-Martin Leftparenthesispartie françaiseRightparenthesisRightparenthesis`
  ): Anon176 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon176]
  }
  @scala.inline
  implicit class Anon176Ops[Self <: Anon176] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign590): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: MF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(
      value: `Saint Martin LeftparenthesisSaint-Martin Leftparenthesispartie françaiseRightparenthesisRightparenthesis`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

