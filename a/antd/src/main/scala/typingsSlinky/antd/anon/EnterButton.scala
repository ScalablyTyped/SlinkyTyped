package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterButton extends js.Object {
  var enterButton: Boolean = js.native
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
    def withEnterButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterButton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

