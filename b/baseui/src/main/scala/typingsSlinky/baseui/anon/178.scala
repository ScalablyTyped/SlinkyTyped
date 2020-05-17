package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign1784
import typingsSlinky.baseui.baseuiStrings.VC
import typingsSlinky.baseui.baseuiStrings.`Saint Vincent and the Grenadines`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `178` extends js.Object {
  var dialCode: Plussign1784 = js.native
  var id: VC = js.native
  var label: `Saint Vincent and the Grenadines` = js.native
}

object `178` {
  @scala.inline
  def apply(dialCode: Plussign1784, id: VC, label: `Saint Vincent and the Grenadines`): `178` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`178`]
  }
  @scala.inline
  implicit class `178Ops`[Self <: `178`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign1784): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: VC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Saint Vincent and the Grenadines`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

