package typingsSlinky.mendixmodelsdk.deltasDeltasMod

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.ATTACH_ELEMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAttachElementDelta
  extends IElementDelta
     with Delta {
  var deltaType: ATTACH_ELEMENT = js.native
  /**
    * If the indicated new property is listy, `newIndex` is the index where the element-to-move will end up.
    * If not set, the element-to-move will be added at the end.
    */
  var newIndex: js.UndefOr[Double] = js.native
  /**
    * The ID of the parent element to attach the element to indicated by `elementId` to.
    */
  var newParentId: String = js.native
  /**
    * The name of the property of the new parent element to put the element-to-move in/on.
    */
  var newParentPropertyName: String = js.native
}

object IAttachElementDelta {
  @scala.inline
  def apply(
    deltaType: ATTACH_ELEMENT,
    elementId: String,
    newParentId: String,
    newParentPropertyName: String,
    unitId: String
  ): IAttachElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], newParentId = newParentId.asInstanceOf[js.Any], newParentPropertyName = newParentPropertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttachElementDelta]
  }
  @scala.inline
  implicit class IAttachElementDeltaOps[Self <: IAttachElementDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeltaType(value: ATTACH_ELEMENT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newParentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewParentPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newParentPropertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIndex")(js.undefined)
        ret
    }
  }
  
}

