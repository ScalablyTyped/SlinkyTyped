package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.LT
import typingsSlinky.baseui.baseuiStrings.Plussign370
import typingsSlinky.baseui.baseuiStrings.`Lithuania LeftparenthesisLietuvaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `116` extends js.Object {
  var dialCode: Plussign370 = js.native
  var id: LT = js.native
  var label: `Lithuania LeftparenthesisLietuvaRightparenthesis` = js.native
}

object `116` {
  @scala.inline
  def apply(dialCode: Plussign370, id: LT, label: `Lithuania LeftparenthesisLietuvaRightparenthesis`): `116` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`116`]
  }
  @scala.inline
  implicit class `116Ops`[Self <: `116`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign370): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: LT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Lithuania LeftparenthesisLietuvaRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

