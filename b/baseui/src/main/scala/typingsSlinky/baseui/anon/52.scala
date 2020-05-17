package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.DK
import typingsSlinky.baseui.baseuiStrings.Plussign45
import typingsSlinky.baseui.baseuiStrings.`Denmark LeftparenthesisDanmarkRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `52` extends js.Object {
  var dialCode: Plussign45 = js.native
  var id: DK = js.native
  var label: `Denmark LeftparenthesisDanmarkRightparenthesis` = js.native
}

object `52` {
  @scala.inline
  def apply(dialCode: Plussign45, id: DK, label: `Denmark LeftparenthesisDanmarkRightparenthesis`): `52` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`52`]
  }
  @scala.inline
  implicit class `52Ops`[Self <: `52`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign45): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: DK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Denmark LeftparenthesisDanmarkRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

