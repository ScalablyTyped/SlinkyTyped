package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.PM
import typingsSlinky.baseui.baseuiStrings.Plussign508
import typingsSlinky.baseui.baseuiStrings.`Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `177` extends js.Object {
  var dialCode: Plussign508 = js.native
  var id: PM = js.native
  var label: `Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis` = js.native
}

object `177` {
  @scala.inline
  def apply(
    dialCode: Plussign508,
    id: PM,
    label: `Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis`
  ): `177` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`177`]
  }
  @scala.inline
  implicit class `177Ops`[Self <: `177`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign508): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: PM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Saint Pierre and Miquelon LeftparenthesisSaint-Pierre-et-MiquelonRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

