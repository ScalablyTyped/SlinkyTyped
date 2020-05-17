package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.NP
import typingsSlinky.baseui.baseuiStrings.Plussign977
import typingsSlinky.baseui.baseuiStrings.`Nepal LeftparenthesisनेपालRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `143` extends js.Object {
  var dialCode: Plussign977 = js.native
  var id: NP = js.native
  var label: `Nepal LeftparenthesisनेपालRightparenthesis` = js.native
}

object `143` {
  @scala.inline
  def apply(dialCode: Plussign977, id: NP, label: `Nepal LeftparenthesisनेपालRightparenthesis`): `143` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`143`]
  }
  @scala.inline
  implicit class `143Ops`[Self <: `143`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign977): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: NP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Nepal LeftparenthesisनेपालRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

