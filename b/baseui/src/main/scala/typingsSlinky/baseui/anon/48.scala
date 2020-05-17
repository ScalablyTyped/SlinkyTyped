package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.CU
import typingsSlinky.baseui.baseuiStrings.Cuba
import typingsSlinky.baseui.baseuiStrings.Plussign53
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `48` extends js.Object {
  var dialCode: Plussign53 = js.native
  var id: CU = js.native
  var label: Cuba = js.native
}

object `48` {
  @scala.inline
  def apply(dialCode: Plussign53, id: CU, label: Cuba): `48` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`48`]
  }
  @scala.inline
  implicit class `48Ops`[Self <: `48`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign53): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: CU): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: Cuba): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

