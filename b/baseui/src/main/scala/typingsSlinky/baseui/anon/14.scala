package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.BE
import typingsSlinky.baseui.baseuiStrings.Plussign32
import typingsSlinky.baseui.baseuiStrings.`Belgium LeftparenthesisBelgiëRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `14` extends js.Object {
  var dialCode: Plussign32 = js.native
  var id: BE = js.native
  var label: `Belgium LeftparenthesisBelgiëRightparenthesis` = js.native
}

object `14` {
  @scala.inline
  def apply(dialCode: Plussign32, id: BE, label: `Belgium LeftparenthesisBelgiëRightparenthesis`): `14` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  @scala.inline
  implicit class `14Ops`[Self <: `14`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign32): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: BE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Belgium LeftparenthesisBelgiëRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

