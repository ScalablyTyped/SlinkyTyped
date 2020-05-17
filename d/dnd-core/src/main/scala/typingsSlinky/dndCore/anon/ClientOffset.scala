package typingsSlinky.dndCore.anon

import typingsSlinky.dndCore.interfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOffset extends js.Object {
  var clientOffset: XYCoord | Null = js.native
  var sourceClientOffset: XYCoord | Null = js.native
}

object ClientOffset {
  @scala.inline
  def apply(): ClientOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOffset]
  }
  @scala.inline
  implicit class ClientOffsetOps[Self <: ClientOffset] (val x: Self) extends AnyVal {
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
    def withSourceClientOffset(value: XYCoord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceClientOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceClientOffsetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceClientOffset")(null)
        ret
    }
  }
  
}

