package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.EC
import typingsSlinky.baseui.baseuiStrings.Ecuador
import typingsSlinky.baseui.baseuiStrings.Plussign593
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `56` extends js.Object {
  var dialCode: Plussign593 = js.native
  var id: EC = js.native
  var label: Ecuador = js.native
}

object `56` {
  @scala.inline
  def apply(dialCode: Plussign593, id: EC, label: Ecuador): `56` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`56`]
  }
  @scala.inline
  implicit class `56Ops`[Self <: `56`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign593): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: EC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: Ecuador): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

