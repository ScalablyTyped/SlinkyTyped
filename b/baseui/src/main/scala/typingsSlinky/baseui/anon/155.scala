package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.OM
import typingsSlinky.baseui.baseuiStrings.Plussign968
import typingsSlinky.baseui.baseuiStrings.`Oman Leftparenthesis‫عُمان‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `155` extends js.Object {
  var dialCode: Plussign968 = js.native
  var id: OM = js.native
  var label: `Oman Leftparenthesis‫عُمان‬‎Rightparenthesis` = js.native
}

object `155` {
  @scala.inline
  def apply(dialCode: Plussign968, id: OM, label: `Oman Leftparenthesis‫عُمان‬‎Rightparenthesis`): `155` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`155`]
  }
  @scala.inline
  implicit class `155Ops`[Self <: `155`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign968): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: OM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Oman Leftparenthesis‫عُمان‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

