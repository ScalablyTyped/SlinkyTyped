package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the GroupShapeCollection object, for use in `groupShapeCollection.set({ ... })`. */
@js.native
trait GroupShapeCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ShapeData]] = js.native
}

object GroupShapeCollectionUpdateData {
  @scala.inline
  def apply(): GroupShapeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupShapeCollectionUpdateData]
  }
  @scala.inline
  implicit class GroupShapeCollectionUpdateDataOps[Self <: GroupShapeCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ShapeData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

