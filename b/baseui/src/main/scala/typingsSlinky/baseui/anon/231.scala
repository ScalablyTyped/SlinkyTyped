package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.Plussign681
import typingsSlinky.baseui.baseuiStrings.WF
import typingsSlinky.baseui.baseuiStrings.`Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `231` extends js.Object {
  var dialCode: Plussign681 = js.native
  var id: WF = js.native
  var label: `Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis` = js.native
}

object `231` {
  @scala.inline
  def apply(
    dialCode: Plussign681,
    id: WF,
    label: `Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis`
  ): `231` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`231`]
  }
  @scala.inline
  implicit class `231Ops`[Self <: `231`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign681): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: WF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Wallis and Futuna LeftparenthesisWallis-et-FutunaRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

