package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.CN
import typingsSlinky.baseui.baseuiStrings.Plussign86
import typingsSlinky.baseui.baseuiStrings.`China Leftparenthesis中国Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `37` extends js.Object {
  var dialCode: Plussign86 = js.native
  var id: CN = js.native
  var label: `China Leftparenthesis中国Rightparenthesis` = js.native
}

object `37` {
  @scala.inline
  def apply(dialCode: Plussign86, id: CN, label: `China Leftparenthesis中国Rightparenthesis`): `37` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`37`]
  }
  @scala.inline
  implicit class `37Ops`[Self <: `37`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign86): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: CN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `China Leftparenthesis中国Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

