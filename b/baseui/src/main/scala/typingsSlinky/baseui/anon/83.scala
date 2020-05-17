package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.GN
import typingsSlinky.baseui.baseuiStrings.Plussign224
import typingsSlinky.baseui.baseuiStrings.`Guinea LeftparenthesisGuinéeRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `83` extends js.Object {
  var dialCode: Plussign224 = js.native
  var id: GN = js.native
  var label: `Guinea LeftparenthesisGuinéeRightparenthesis` = js.native
}

object `83` {
  @scala.inline
  def apply(dialCode: Plussign224, id: GN, label: `Guinea LeftparenthesisGuinéeRightparenthesis`): `83` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`83`]
  }
  @scala.inline
  implicit class `83Ops`[Self <: `83`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign224): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: GN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Guinea LeftparenthesisGuinéeRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

