package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.AE
import typingsSlinky.baseui.baseuiStrings.Plussign971
import typingsSlinky.baseui.baseuiStrings.`United Arab Emirates Leftparenthesis‫الإمارات العربية المتحدة‬‎Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon222 extends js.Object {
  var dialCode: Plussign971 = js.native
  var id: AE = js.native
  var label: `United Arab Emirates Leftparenthesis‫الإمارات العربية المتحدة‬‎Rightparenthesis` = js.native
}

object Anon222 {
  @scala.inline
  def apply(
    dialCode: Plussign971,
    id: AE,
    label: `United Arab Emirates Leftparenthesis‫الإمارات العربية المتحدة‬‎Rightparenthesis`
  ): Anon222 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon222]
  }
  @scala.inline
  implicit class Anon222Ops[Self <: Anon222] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign971): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: AE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `United Arab Emirates Leftparenthesis‫الإمارات العربية المتحدة‬‎Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

