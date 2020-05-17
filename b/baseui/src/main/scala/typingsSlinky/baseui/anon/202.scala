package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign46
import typingsSlinky.baseui.baseuiStrings.SE
import typingsSlinky.baseui.baseuiStrings.`Sweden LeftparenthesisSverigeRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `202` extends js.Object {
  var dialCode: Plussign46 = js.native
  var id: SE = js.native
  var label: `Sweden LeftparenthesisSverigeRightparenthesis` = js.native
}

object `202` {
  @scala.inline
  def apply(dialCode: Plussign46, id: SE, label: `Sweden LeftparenthesisSverigeRightparenthesis`): `202` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202`]
  }
  @scala.inline
  implicit class `202Ops`[Self <: `202`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign46): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: SE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Sweden LeftparenthesisSverigeRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

