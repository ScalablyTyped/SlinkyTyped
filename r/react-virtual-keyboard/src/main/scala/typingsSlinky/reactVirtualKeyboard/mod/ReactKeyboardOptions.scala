package typingsSlinky.reactVirtualKeyboard.mod

import typingsSlinky.virtualKeyboard.mod.KeyboardOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactKeyboardOptions extends KeyboardOptions {
  @JSName("accepted")
  var accepted_ReactKeyboardOptions: js.UndefOr[scala.Nothing] = js.native
}

object ReactKeyboardOptions {
  @scala.inline
  def apply(`type`: String): ReactKeyboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactKeyboardOptions]
  }
  @scala.inline
  implicit class ReactKeyboardOptionsOps[Self <: ReactKeyboardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepted(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccepted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepted")(js.undefined)
        ret
    }
  }
  
}

