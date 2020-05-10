package typingsSlinky.dndCore.dragOffsetMod

import typingsSlinky.dndCore.interfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var clientOffset: XYCoord | Null = js.native
  var initialClientOffset: XYCoord | Null = js.native
  var initialSourceClientOffset: XYCoord | Null = js.native
}

object State {
  @scala.inline
  def apply(): State = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientOffset(value: XYCoord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientOffsetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientOffset")(null)
        ret
    }
    @scala.inline
    def withInitialClientOffset(value: XYCoord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialClientOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialClientOffsetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialClientOffset")(null)
        ret
    }
    @scala.inline
    def withInitialSourceClientOffset(value: XYCoord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSourceClientOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialSourceClientOffsetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSourceClientOffset")(null)
        ret
    }
  }
  
}

