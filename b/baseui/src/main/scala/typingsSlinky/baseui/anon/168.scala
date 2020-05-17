package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign262
import typingsSlinky.baseui.baseuiStrings.RE
import typingsSlinky.baseui.baseuiStrings.`Réunion LeftparenthesisLa RéunionRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `168` extends js.Object {
  var dialCode: Plussign262 = js.native
  var id: RE = js.native
  var label: `Réunion LeftparenthesisLa RéunionRightparenthesis` = js.native
}

object `168` {
  @scala.inline
  def apply(dialCode: Plussign262, id: RE, label: `Réunion LeftparenthesisLa RéunionRightparenthesis`): `168` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`168`]
  }
  @scala.inline
  implicit class `168Ops`[Self <: `168`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign262): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: RE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Réunion LeftparenthesisLa RéunionRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

