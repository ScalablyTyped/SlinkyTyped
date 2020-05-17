package typingsSlinky.antd.anon

import typingsSlinky.antd.radioInterfaceMod.RadioGroupButtonStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonStyle extends js.Object {
  var buttonStyle: RadioGroupButtonStyle = js.native
}

object ButtonStyle {
  @scala.inline
  def apply(buttonStyle: RadioGroupButtonStyle): ButtonStyle = {
    val __obj = js.Dynamic.literal(buttonStyle = buttonStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonStyle]
  }
  @scala.inline
  implicit class ButtonStyleOps[Self <: ButtonStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonStyle(value: RadioGroupButtonStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

