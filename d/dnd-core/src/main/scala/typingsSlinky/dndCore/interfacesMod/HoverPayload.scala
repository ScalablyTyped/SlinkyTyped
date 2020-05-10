package typingsSlinky.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoverPayload extends js.Object {
  var clientOffset: XYCoord | Null = js.native
  var targetIds: js.Array[Identifier] = js.native
}

object HoverPayload {
  @scala.inline
  def apply(targetIds: js.Array[Identifier]): HoverPayload = {
    val __obj = js.Dynamic.literal(targetIds = targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverPayload]
  }
  @scala.inline
  implicit class HoverPayloadOps[Self <: HoverPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetIds(value: js.Array[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIds")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

