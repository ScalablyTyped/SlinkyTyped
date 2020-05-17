package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.JP
import typingsSlinky.baseui.baseuiStrings.Plussign81
import typingsSlinky.baseui.baseuiStrings.`Japan Leftparenthesis日本Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `100` extends js.Object {
  var dialCode: Plussign81 = js.native
  var id: JP = js.native
  var label: `Japan Leftparenthesis日本Rightparenthesis` = js.native
}

object `100` {
  @scala.inline
  def apply(dialCode: Plussign81, id: JP, label: `Japan Leftparenthesis日本Rightparenthesis`): `100` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`100`]
  }
  @scala.inline
  implicit class `100Ops`[Self <: `100`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign81): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: JP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Japan Leftparenthesis日本Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

