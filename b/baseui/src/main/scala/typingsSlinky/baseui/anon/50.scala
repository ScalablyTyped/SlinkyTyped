package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.CY
import typingsSlinky.baseui.baseuiStrings.Plussign357
import typingsSlinky.baseui.baseuiStrings.`Cyprus LeftparenthesisΚύπροςRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `50` extends js.Object {
  var dialCode: Plussign357 = js.native
  var id: CY = js.native
  var label: `Cyprus LeftparenthesisΚύπροςRightparenthesis` = js.native
}

object `50` {
  @scala.inline
  def apply(dialCode: Plussign357, id: CY, label: `Cyprus LeftparenthesisΚύπροςRightparenthesis`): `50` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`50`]
  }
  @scala.inline
  implicit class `50Ops`[Self <: `50`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign357): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: CY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Cyprus LeftparenthesisΚύπροςRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

