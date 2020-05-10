package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnterButton extends js.Object {
  var enterButton: Boolean = js.native
}

object AnonEnterButton {
  @scala.inline
  def apply(enterButton: Boolean): AnonEnterButton = {
    val __obj = js.Dynamic.literal(enterButton = enterButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnterButton]
  }
  @scala.inline
  implicit class AnonEnterButtonOps[Self <: AnonEnterButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnterButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterButton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

