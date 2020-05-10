package typingsSlinky.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ShapeDataItemCollection object, for use in "shapeDataItemCollection.set({ ... })". */
@js.native
trait ShapeDataItemCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ShapeDataItemData]] = js.native
}

object ShapeDataItemCollectionUpdateData {
  @scala.inline
  def apply(): ShapeDataItemCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeDataItemCollectionUpdateData]
  }
  @scala.inline
  implicit class ShapeDataItemCollectionUpdateDataOps[Self <: ShapeDataItemCollectionUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ShapeDataItemData]): Self = {
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

