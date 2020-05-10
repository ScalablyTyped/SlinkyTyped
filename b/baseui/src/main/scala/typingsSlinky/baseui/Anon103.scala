package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.KZ
import typingsSlinky.baseui.baseuiStrings.Plussign7
import typingsSlinky.baseui.baseuiStrings.`Kazakhstan LeftparenthesisКазахстанRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon103 extends js.Object {
  var dialCode: Plussign7 = js.native
  var id: KZ = js.native
  var label: `Kazakhstan LeftparenthesisКазахстанRightparenthesis` = js.native
}

object Anon103 {
  @scala.inline
  def apply(dialCode: Plussign7, id: KZ, label: `Kazakhstan LeftparenthesisКазахстанRightparenthesis`): Anon103 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon103]
  }
  @scala.inline
  implicit class Anon103Ops[Self <: Anon103] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign7): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: KZ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Kazakhstan LeftparenthesisКазахстанRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

