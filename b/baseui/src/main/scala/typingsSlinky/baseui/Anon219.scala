package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.Plussign1340
import typingsSlinky.baseui.baseuiStrings.VI
import typingsSlinky.baseui.baseuiStrings.`UDotSDot Virgin Islands`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon219 extends js.Object {
  var dialCode: Plussign1340 = js.native
  var id: VI = js.native
  var label: `UDotSDot Virgin Islands` = js.native
}

object Anon219 {
  @scala.inline
  def apply(dialCode: Plussign1340, id: VI, label: `UDotSDot Virgin Islands`): Anon219 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon219]
  }
  @scala.inline
  implicit class Anon219Ops[Self <: Anon219] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign1340): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: VI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `UDotSDot Virgin Islands`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

