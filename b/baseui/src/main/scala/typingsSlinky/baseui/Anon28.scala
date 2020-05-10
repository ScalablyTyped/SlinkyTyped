package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.BI
import typingsSlinky.baseui.baseuiStrings.Plussign257
import typingsSlinky.baseui.baseuiStrings.`Burundi LeftparenthesisUburundiRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon28 extends js.Object {
  var dialCode: Plussign257 = js.native
  var id: BI = js.native
  var label: `Burundi LeftparenthesisUburundiRightparenthesis` = js.native
}

object Anon28 {
  @scala.inline
  def apply(dialCode: Plussign257, id: BI, label: `Burundi LeftparenthesisUburundiRightparenthesis`): Anon28 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon28]
  }
  @scala.inline
  implicit class Anon28Ops[Self <: Anon28] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign257): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: BI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Burundi LeftparenthesisUburundiRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

