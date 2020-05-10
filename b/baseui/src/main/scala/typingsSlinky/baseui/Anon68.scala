package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.GF
import typingsSlinky.baseui.baseuiStrings.Plussign594
import typingsSlinky.baseui.baseuiStrings.`French Guiana LeftparenthesisGuyane françaiseRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon68 extends js.Object {
  var dialCode: Plussign594 = js.native
  var id: GF = js.native
  var label: `French Guiana LeftparenthesisGuyane françaiseRightparenthesis` = js.native
}

object Anon68 {
  @scala.inline
  def apply(
    dialCode: Plussign594,
    id: GF,
    label: `French Guiana LeftparenthesisGuyane françaiseRightparenthesis`
  ): Anon68 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon68]
  }
  @scala.inline
  implicit class Anon68Ops[Self <: Anon68] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign594): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: GF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `French Guiana LeftparenthesisGuyane françaiseRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

