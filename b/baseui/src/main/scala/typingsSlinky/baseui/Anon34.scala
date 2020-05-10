package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.CF
import typingsSlinky.baseui.baseuiStrings.Plussign236
import typingsSlinky.baseui.baseuiStrings.`Central African Republic LeftparenthesisRépublique centrafricaineRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon34 extends js.Object {
  var dialCode: Plussign236 = js.native
  var id: CF = js.native
  var label: `Central African Republic LeftparenthesisRépublique centrafricaineRightparenthesis` = js.native
}

object Anon34 {
  @scala.inline
  def apply(
    dialCode: Plussign236,
    id: CF,
    label: `Central African Republic LeftparenthesisRépublique centrafricaineRightparenthesis`
  ): Anon34 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon34]
  }
  @scala.inline
  implicit class Anon34Ops[Self <: Anon34] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign236): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: CF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Central African Republic LeftparenthesisRépublique centrafricaineRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

