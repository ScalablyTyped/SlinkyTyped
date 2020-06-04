package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterButton extends js.Object {
  var enterButton: Boolean
}

object EnterButton {
  @scala.inline
  def apply(enterButton: Boolean): EnterButton = {
    val __obj = js.Dynamic.literal(enterButton = enterButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterButton]
  }
  @scala.inline
  implicit class EnterButtonOps[Self <: EnterButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnterButton(value: Boolean): Self = this.set("enterButton", value.asInstanceOf[js.Any])
  }
  
}

