package typingsSlinky.officeUiFabricReact.detailsListBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListBasicExampleState extends js.Object {
  var items: js.Array[IDetailsListBasicExampleItem] = js.native
  var selectionDetails: String = js.native
}

object IDetailsListBasicExampleState {
  @scala.inline
  def apply(items: js.Array[IDetailsListBasicExampleItem], selectionDetails: String): IDetailsListBasicExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], selectionDetails = selectionDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListBasicExampleState]
  }
  @scala.inline
  implicit class IDetailsListBasicExampleStateOps[Self <: IDetailsListBasicExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[IDetailsListBasicExampleItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionDetails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

