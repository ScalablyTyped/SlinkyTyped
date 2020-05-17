package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.BR
import typingsSlinky.baseui.baseuiStrings.Plussign55
import typingsSlinky.baseui.baseuiStrings.`Brazil LeftparenthesisBrasilRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `22` extends js.Object {
  var dialCode: Plussign55 = js.native
  var id: BR = js.native
  var label: `Brazil LeftparenthesisBrasilRightparenthesis` = js.native
}

object `22` {
  @scala.inline
  def apply(dialCode: Plussign55, id: BR, label: `Brazil LeftparenthesisBrasilRightparenthesis`): `22` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`]
  }
  @scala.inline
  implicit class `22Ops`[Self <: `22`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign55): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: BR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Brazil LeftparenthesisBrasilRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

