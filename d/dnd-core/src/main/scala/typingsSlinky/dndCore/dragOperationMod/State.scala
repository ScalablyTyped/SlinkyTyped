package typingsSlinky.dndCore.dragOperationMod

import typingsSlinky.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var didDrop: Boolean = js.native
  var dropResult: js.Any = js.native
  var isSourcePublic: Boolean | Null = js.native
  var item: js.Any = js.native
  var itemType: Identifier | js.Array[Identifier] | Null = js.native
  var sourceId: String | Null = js.native
  var targetIds: js.Array[String] = js.native
}

object State {
  @scala.inline
  def apply(didDrop: Boolean, dropResult: js.Any, item: js.Any, targetIds: js.Array[String]): State = {
    val __obj = js.Dynamic.literal(didDrop = didDrop.asInstanceOf[js.Any], dropResult = dropResult.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDidDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSourcePublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSourcePublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSourcePublicNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSourcePublic")(null)
        ret
    }
    @scala.inline
    def withItemType(value: Identifier | js.Array[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(null)
        ret
    }
    @scala.inline
    def withSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceId")(null)
        ret
    }
  }
  
}

