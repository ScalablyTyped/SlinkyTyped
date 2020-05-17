package typingsSlinky.enzyme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSetState extends js.Object {
  var onSetState: Boolean = js.native
  var prevContext: Boolean = js.native
}

object OnSetState {
  @scala.inline
  def apply(onSetState: Boolean, prevContext: Boolean): OnSetState = {
    val __obj = js.Dynamic.literal(onSetState = onSetState.asInstanceOf[js.Any], prevContext = prevContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSetState]
  }
  @scala.inline
  implicit class OnSetStateOps[Self <: OnSetState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnSetState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSetState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

