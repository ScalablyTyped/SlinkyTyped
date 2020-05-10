package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.BD
import typingsSlinky.baseui.baseuiStrings.Plussign880
import typingsSlinky.baseui.baseuiStrings.`Bangladesh LeftparenthesisবাংলাদেশRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon11 extends js.Object {
  var dialCode: Plussign880 = js.native
  var id: BD = js.native
  var label: `Bangladesh LeftparenthesisবাংলাদেশRightparenthesis` = js.native
}

object Anon11 {
  @scala.inline
  def apply(dialCode: Plussign880, id: BD, label: `Bangladesh LeftparenthesisবাংলাদেশRightparenthesis`): Anon11 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon11]
  }
  @scala.inline
  implicit class Anon11Ops[Self <: Anon11] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign880): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: BD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Bangladesh LeftparenthesisবাংলাদেশRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

