package typingsSlinky.officeUiFabricReact.keytipsOverflowExampleMod

import typingsSlinky.officeUiFabricReact.overflowSetTypesMod.IOverflowSetItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeytipsOverflowExampleState extends js.Object {
  var items: js.Array[IOverflowSetItemProps] = js.native
  var overflowItems: js.Array[IOverflowSetItemProps] = js.native
}

object IKeytipsOverflowExampleState {
  @scala.inline
  def apply(items: js.Array[IOverflowSetItemProps], overflowItems: js.Array[IOverflowSetItemProps]): IKeytipsOverflowExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], overflowItems = overflowItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipsOverflowExampleState]
  }
  @scala.inline
  implicit class IKeytipsOverflowExampleStateOps[Self <: IKeytipsOverflowExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[IOverflowSetItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflowItems(value: js.Array[IOverflowSetItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

