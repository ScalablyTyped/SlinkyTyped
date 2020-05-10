package typingsSlinky.officeUiFabricReact.scrollablePaneDetailsListExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollablePaneDetailsListExampleState extends js.Object {
  var items: js.Array[IScrollablePaneDetailsListExampleItem] = js.native
}

object IScrollablePaneDetailsListExampleState {
  @scala.inline
  def apply(items: js.Array[IScrollablePaneDetailsListExampleItem]): IScrollablePaneDetailsListExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollablePaneDetailsListExampleState]
  }
  @scala.inline
  implicit class IScrollablePaneDetailsListExampleStateOps[Self <: IScrollablePaneDetailsListExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[IScrollablePaneDetailsListExampleItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

