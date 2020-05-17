package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.KH
import typingsSlinky.baseui.baseuiStrings.Plussign855
import typingsSlinky.baseui.baseuiStrings.`Cambodia Leftparenthesisកម្ពុជាRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `29` extends js.Object {
  var dialCode: Plussign855 = js.native
  var id: KH = js.native
  var label: `Cambodia Leftparenthesisកម្ពុជាRightparenthesis` = js.native
}

object `29` {
  @scala.inline
  def apply(dialCode: Plussign855, id: KH, label: `Cambodia Leftparenthesisកម្ពុជាRightparenthesis`): `29` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`29`]
  }
  @scala.inline
  implicit class `29Ops`[Self <: `29`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign855): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: KH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Cambodia Leftparenthesisកម្ពុជាRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

