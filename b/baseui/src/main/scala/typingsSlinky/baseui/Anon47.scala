package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.HR
import typingsSlinky.baseui.baseuiStrings.Plussign385
import typingsSlinky.baseui.baseuiStrings.`Croatia LeftparenthesisHrvatskaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon47 extends js.Object {
  var dialCode: Plussign385 = js.native
  var id: HR = js.native
  var label: `Croatia LeftparenthesisHrvatskaRightparenthesis` = js.native
}

object Anon47 {
  @scala.inline
  def apply(dialCode: Plussign385, id: HR, label: `Croatia LeftparenthesisHrvatskaRightparenthesis`): Anon47 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon47]
  }
  @scala.inline
  implicit class Anon47Ops[Self <: Anon47] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign385): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: HR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Croatia LeftparenthesisHrvatskaRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

