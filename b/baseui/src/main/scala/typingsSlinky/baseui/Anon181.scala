package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.Plussign239
import typingsSlinky.baseui.baseuiStrings.ST
import typingsSlinky.baseui.baseuiStrings.`São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon181 extends js.Object {
  var dialCode: Plussign239 = js.native
  var id: ST = js.native
  var label: `São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis` = js.native
}

object Anon181 {
  @scala.inline
  def apply(
    dialCode: Plussign239,
    id: ST,
    label: `São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis`
  ): Anon181 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon181]
  }
  @scala.inline
  implicit class Anon181Ops[Self <: Anon181] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign239): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: ST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `São Tomé and Príncipe LeftparenthesisSão Tomé e PríncipeRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

