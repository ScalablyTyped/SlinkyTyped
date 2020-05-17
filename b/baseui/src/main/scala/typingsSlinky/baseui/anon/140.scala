package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.MM
import typingsSlinky.baseui.baseuiStrings.Plussign95
import typingsSlinky.baseui.baseuiStrings.`Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `140` extends js.Object {
  var dialCode: Plussign95 = js.native
  var id: MM = js.native
  var label: `Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis` = js.native
}

object `140` {
  @scala.inline
  def apply(
    dialCode: Plussign95,
    id: MM,
    label: `Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis`
  ): `140` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`140`]
  }
  @scala.inline
  implicit class `140Ops`[Self <: `140`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign95): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: MM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Myanmar LeftparenthesisBurmaRightparenthesis Leftparenthesisမြန်မာRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

