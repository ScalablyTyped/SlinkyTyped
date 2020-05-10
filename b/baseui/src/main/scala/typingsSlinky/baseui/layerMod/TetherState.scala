package typingsSlinky.baseui.layerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TetherState extends js.Object {
  var isMounted: Boolean = js.native
}

object TetherState {
  @scala.inline
  def apply(isMounted: Boolean): TetherState = {
    val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any])
    __obj.asInstanceOf[TetherState]
  }
  @scala.inline
  implicit class TetherStateOps[Self <: TetherState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMounted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMounted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

