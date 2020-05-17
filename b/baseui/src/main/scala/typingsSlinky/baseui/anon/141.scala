package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.NA
import typingsSlinky.baseui.baseuiStrings.Plussign264
import typingsSlinky.baseui.baseuiStrings.`Namibia LeftparenthesisNamibiëRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `141` extends js.Object {
  var dialCode: Plussign264 = js.native
  var id: NA = js.native
  var label: `Namibia LeftparenthesisNamibiëRightparenthesis` = js.native
}

object `141` {
  @scala.inline
  def apply(dialCode: Plussign264, id: NA, label: `Namibia LeftparenthesisNamibiëRightparenthesis`): `141` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`141`]
  }
  @scala.inline
  implicit class `141Ops`[Self <: `141`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign264): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: NA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Namibia LeftparenthesisNamibiëRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

