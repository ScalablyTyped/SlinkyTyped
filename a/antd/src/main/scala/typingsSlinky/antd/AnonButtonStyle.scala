package typingsSlinky.antd

import typingsSlinky.antd.radioInterfaceMod.RadioGroupButtonStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonButtonStyle extends js.Object {
  var buttonStyle: RadioGroupButtonStyle = js.native
}

object AnonButtonStyle {
  @scala.inline
  def apply(buttonStyle: RadioGroupButtonStyle): AnonButtonStyle = {
    val __obj = js.Dynamic.literal(buttonStyle = buttonStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtonStyle]
  }
  @scala.inline
  implicit class AnonButtonStyleOps[Self <: AnonButtonStyle] (val x: Self) extends AnyVal {
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

