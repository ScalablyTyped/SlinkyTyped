package typingsSlinky.dndCore

import typingsSlinky.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDropResult extends js.Object {
  var dropResult: js.Any = js.native
  var isSourcePublic: Boolean = js.native
  var item: js.Any = js.native
  var itemType: Identifier | js.Array[Identifier] = js.native
  var sourceId: String = js.native
  var targetId: String = js.native
  var targetIds: js.Array[String] = js.native
}

object AnonDropResult {
  @scala.inline
  def apply(
    dropResult: js.Any,
    isSourcePublic: Boolean,
    item: js.Any,
    itemType: Identifier | js.Array[Identifier],
    sourceId: String,
    targetId: String,
    targetIds: js.Array[String]
  ): AnonDropResult = {
    val __obj = js.Dynamic.literal(dropResult = dropResult.asInstanceOf[js.Any], isSourcePublic = isSourcePublic.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDropResult]
  }
  @scala.inline
  implicit class AnonDropResultOps[Self <: AnonDropResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropResult")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withItemType(value: Identifier | js.Array[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

