package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.KW
import typingsSlinky.baseui.baseuiStrings.Plussign965
import typingsSlinky.baseui.baseuiStrings.`Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `107` extends js.Object {
  var dialCode: Plussign965 = js.native
  var id: KW = js.native
  var label: `Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis` = js.native
}

object `107` {
  @scala.inline
  def apply(dialCode: Plussign965, id: KW, label: `Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis`): `107` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`107`]
  }
  @scala.inline
  implicit class `107Ops`[Self <: `107`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign965): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: KW): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Kuwait Leftparenthesis‫الكويت‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

