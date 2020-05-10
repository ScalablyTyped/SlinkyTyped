package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.NO
import typingsSlinky.baseui.baseuiStrings.Plussign47
import typingsSlinky.baseui.baseuiStrings.`Norway LeftparenthesisNorgeRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon154 extends js.Object {
  var dialCode: Plussign47 = js.native
  var id: NO = js.native
  var label: `Norway LeftparenthesisNorgeRightparenthesis` = js.native
}

object Anon154 {
  @scala.inline
  def apply(dialCode: Plussign47, id: NO, label: `Norway LeftparenthesisNorgeRightparenthesis`): Anon154 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon154]
  }
  @scala.inline
  implicit class Anon154Ops[Self <: Anon154] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign47): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: NO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Norway LeftparenthesisNorgeRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

