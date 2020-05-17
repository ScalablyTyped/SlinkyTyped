package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.PA
import typingsSlinky.baseui.baseuiStrings.Plussign507
import typingsSlinky.baseui.baseuiStrings.`Panama LeftparenthesisPanamáRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `159` extends js.Object {
  var dialCode: Plussign507 = js.native
  var id: PA = js.native
  var label: `Panama LeftparenthesisPanamáRightparenthesis` = js.native
}

object `159` {
  @scala.inline
  def apply(dialCode: Plussign507, id: PA, label: `Panama LeftparenthesisPanamáRightparenthesis`): `159` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`159`]
  }
  @scala.inline
  implicit class `159Ops`[Self <: `159`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign507): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: PA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Panama LeftparenthesisPanamáRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

