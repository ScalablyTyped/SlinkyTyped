package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.NE
import typingsSlinky.baseui.baseuiStrings.Plussign227
import typingsSlinky.baseui.baseuiStrings.`Niger LeftparenthesisNijarRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon148 extends js.Object {
  var dialCode: Plussign227 = js.native
  var id: NE = js.native
  var label: `Niger LeftparenthesisNijarRightparenthesis` = js.native
}

object Anon148 {
  @scala.inline
  def apply(dialCode: Plussign227, id: NE, label: `Niger LeftparenthesisNijarRightparenthesis`): Anon148 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon148]
  }
  @scala.inline
  implicit class Anon148Ops[Self <: Anon148] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign227): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: NE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Niger LeftparenthesisNijarRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

