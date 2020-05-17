package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.CV
import typingsSlinky.baseui.baseuiStrings.Plussign238
import typingsSlinky.baseui.baseuiStrings.`Cape Verde LeftparenthesisKabu VerdiRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `32` extends js.Object {
  var dialCode: Plussign238 = js.native
  var id: CV = js.native
  var label: `Cape Verde LeftparenthesisKabu VerdiRightparenthesis` = js.native
}

object `32` {
  @scala.inline
  def apply(dialCode: Plussign238, id: CV, label: `Cape Verde LeftparenthesisKabu VerdiRightparenthesis`): `32` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`32`]
  }
  @scala.inline
  implicit class `32Ops`[Self <: `32`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign238): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: CV): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Cape Verde LeftparenthesisKabu VerdiRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

