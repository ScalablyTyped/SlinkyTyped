package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.GL
import typingsSlinky.baseui.baseuiStrings.Plussign299
import typingsSlinky.baseui.baseuiStrings.`Greenland LeftparenthesisKalaallit NunaatRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `77` extends js.Object {
  var dialCode: Plussign299 = js.native
  var id: GL = js.native
  var label: `Greenland LeftparenthesisKalaallit NunaatRightparenthesis` = js.native
}

object `77` {
  @scala.inline
  def apply(dialCode: Plussign299, id: GL, label: `Greenland LeftparenthesisKalaallit NunaatRightparenthesis`): `77` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`77`]
  }
  @scala.inline
  implicit class `77Ops`[Self <: `77`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign299): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: GL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Greenland LeftparenthesisKalaallit NunaatRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

