package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.KG
import typingsSlinky.baseui.baseuiStrings.Plussign996
import typingsSlinky.baseui.baseuiStrings.`Kyrgyzstan LeftparenthesisКыргызстанRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon108 extends js.Object {
  var dialCode: Plussign996 = js.native
  var id: KG = js.native
  var label: `Kyrgyzstan LeftparenthesisКыргызстанRightparenthesis` = js.native
}

object Anon108 {
  @scala.inline
  def apply(dialCode: Plussign996, id: KG, label: `Kyrgyzstan LeftparenthesisКыргызстанRightparenthesis`): Anon108 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon108]
  }
  @scala.inline
  implicit class Anon108Ops[Self <: Anon108] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign996): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: KG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Kyrgyzstan LeftparenthesisКыргызстанRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

