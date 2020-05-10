package typingsSlinky.officeUiFabricReact.announcedBulkOperationsExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnnouncedBulkOperationsExampleState extends js.Object {
  var items: js.Array[IFileExampleItem] = js.native
  var numberOfItems: Double = js.native
}

object IAnnouncedBulkOperationsExampleState {
  @scala.inline
  def apply(items: js.Array[IFileExampleItem], numberOfItems: Double): IAnnouncedBulkOperationsExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], numberOfItems = numberOfItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedBulkOperationsExampleState]
  }
  @scala.inline
  implicit class IAnnouncedBulkOperationsExampleStateOps[Self <: IAnnouncedBulkOperationsExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[IFileExampleItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

