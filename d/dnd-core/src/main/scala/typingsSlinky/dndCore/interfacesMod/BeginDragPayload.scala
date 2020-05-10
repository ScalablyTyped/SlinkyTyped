package typingsSlinky.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginDragPayload extends js.Object {
  var clientOffset: XYCoord | Null = js.native
  var isSourcePublic: Boolean = js.native
  var item: js.Any = js.native
  var itemType: Identifier = js.native
  var sourceClientOffset: XYCoord | Null = js.native
  var sourceId: Identifier = js.native
}

object BeginDragPayload {
  @scala.inline
  def apply(isSourcePublic: Boolean, item: js.Any, itemType: Identifier, sourceId: Identifier): BeginDragPayload = {
    val __obj = js.Dynamic.literal(isSourcePublic = isSourcePublic.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginDragPayload]
  }
  @scala.inline
  implicit class BeginDragPayloadOps[Self <: BeginDragPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSourcePublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSourcePublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemType(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceId(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceId")(value.asInstanceOf[js.Any])
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

