package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.GQ
import typingsSlinky.baseui.baseuiStrings.Plussign240
import typingsSlinky.baseui.baseuiStrings.`Equatorial Guinea LeftparenthesisGuinea EcuatorialRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon59 extends js.Object {
  var dialCode: Plussign240 = js.native
  var id: GQ = js.native
  var label: `Equatorial Guinea LeftparenthesisGuinea EcuatorialRightparenthesis` = js.native
}

object Anon59 {
  @scala.inline
  def apply(
    dialCode: Plussign240,
    id: GQ,
    label: `Equatorial Guinea LeftparenthesisGuinea EcuatorialRightparenthesis`
  ): Anon59 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon59]
  }
  @scala.inline
  implicit class Anon59Ops[Self <: Anon59] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign240): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: GQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Equatorial Guinea LeftparenthesisGuinea EcuatorialRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

