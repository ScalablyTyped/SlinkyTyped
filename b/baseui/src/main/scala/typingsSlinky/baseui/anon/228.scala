package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign39
import typingsSlinky.baseui.baseuiStrings.VA
import typingsSlinky.baseui.baseuiStrings.`Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `228` extends js.Object {
  var dialCode: Plussign39 = js.native
  var id: VA = js.native
  var label: `Vatican City LeftparenthesisCittà del VaticanoRightparenthesis` = js.native
}

object `228` {
  @scala.inline
  def apply(
    dialCode: Plussign39,
    id: VA,
    label: `Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`
  ): `228` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`228`]
  }
  @scala.inline
  implicit class `228Ops`[Self <: `228`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign39): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: VA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Vatican City LeftparenthesisCittà del VaticanoRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

