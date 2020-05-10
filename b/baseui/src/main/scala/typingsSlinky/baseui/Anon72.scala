package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.GE
import typingsSlinky.baseui.baseuiStrings.Plussign995
import typingsSlinky.baseui.baseuiStrings.`Georgia LeftparenthesisსაქართველოRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon72 extends js.Object {
  var dialCode: Plussign995 = js.native
  var id: GE = js.native
  var label: `Georgia LeftparenthesisსაქართველოRightparenthesis` = js.native
}

object Anon72 {
  @scala.inline
  def apply(dialCode: Plussign995, id: GE, label: `Georgia LeftparenthesisსაქართველოRightparenthesis`): Anon72 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon72]
  }
  @scala.inline
  implicit class Anon72Ops[Self <: Anon72] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign995): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: GE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Georgia LeftparenthesisსაქართველოRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

