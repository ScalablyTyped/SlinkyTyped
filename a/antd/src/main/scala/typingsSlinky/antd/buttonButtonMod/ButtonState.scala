package typingsSlinky.antd.buttonButtonMod

import typingsSlinky.antd.AnonDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonState extends js.Object {
  var hasTwoCNChar: Boolean = js.native
  var loading: js.UndefOr[Boolean | AnonDelay] = js.native
}

object ButtonState {
  @scala.inline
  def apply(hasTwoCNChar: Boolean): ButtonState = {
    val __obj = js.Dynamic.literal(hasTwoCNChar = hasTwoCNChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonState]
  }
  @scala.inline
  implicit class ButtonStateOps[Self <: ButtonState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasTwoCNChar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTwoCNChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoading(value: Boolean | AnonDelay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
  }
  
}

