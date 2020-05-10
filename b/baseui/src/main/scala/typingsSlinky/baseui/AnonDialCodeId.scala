package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.DZ
import typingsSlinky.baseui.baseuiStrings.Plussign213
import typingsSlinky.baseui.baseuiStrings.`Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDialCodeId extends js.Object {
  var dialCode: Plussign213 = js.native
  var id: DZ = js.native
  var label: `Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis` = js.native
}

object AnonDialCodeId {
  @scala.inline
  def apply(dialCode: Plussign213, id: DZ, label: `Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`): AnonDialCodeId = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDialCodeId]
  }
  @scala.inline
  implicit class AnonDialCodeIdOps[Self <: AnonDialCodeId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign213): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: DZ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Algeria Leftparenthesis‫الجزائر‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

