package typingsSlinky.baseui.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalState extends js.Object {
  var isFocused: js.UndefOr[Boolean] = js.native
  var isMasked: js.UndefOr[Boolean] = js.native
}

object InternalState {
  @scala.inline
  def apply(): InternalState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalState]
  }
  @scala.inline
  implicit class InternalStateOps[Self <: InternalState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMasked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMasked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMasked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMasked")(js.undefined)
        ret
    }
  }
  
}

