package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.BT
import typingsSlinky.baseui.baseuiStrings.Plussign975
import typingsSlinky.baseui.baseuiStrings.`Bhutan LeftparenthesisའབྲུགRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `18` extends js.Object {
  var dialCode: Plussign975 = js.native
  var id: BT = js.native
  var label: `Bhutan LeftparenthesisའབྲུགRightparenthesis` = js.native
}

object `18` {
  @scala.inline
  def apply(dialCode: Plussign975, id: BT, label: `Bhutan LeftparenthesisའབྲུགRightparenthesis`): `18` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
  @scala.inline
  implicit class `18Ops`[Self <: `18`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign975): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: BT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Bhutan LeftparenthesisའབྲུགRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

