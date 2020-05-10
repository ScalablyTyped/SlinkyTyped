package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.Plussign1868
import typingsSlinky.baseui.baseuiStrings.TT
import typingsSlinky.baseui.baseuiStrings.`Trinisoad and Tobago`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon213 extends js.Object {
  var dialCode: Plussign1868 = js.native
  var id: TT = js.native
  var label: `Trinisoad and Tobago` = js.native
}

object Anon213 {
  @scala.inline
  def apply(dialCode: Plussign1868, id: TT, label: `Trinisoad and Tobago`): Anon213 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon213]
  }
  @scala.inline
  implicit class Anon213Ops[Self <: Anon213] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign1868): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: TT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Trinisoad and Tobago`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

