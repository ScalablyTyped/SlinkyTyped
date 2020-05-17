package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign998
import typingsSlinky.baseui.baseuiStrings.UZ
import typingsSlinky.baseui.baseuiStrings.`Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `226` extends js.Object {
  var dialCode: Plussign998 = js.native
  var id: UZ = js.native
  var label: `Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis` = js.native
}

object `226` {
  @scala.inline
  def apply(dialCode: Plussign998, id: UZ, label: `Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis`): `226` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`226`]
  }
  @scala.inline
  implicit class `226Ops`[Self <: `226`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign998): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: UZ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Uzbekistan LeftparenthesisOʻzbekistonRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

