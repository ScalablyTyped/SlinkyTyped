package typingsSlinky.officeUiFabricReact.pivotRemoveExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPivotOnChangeExampleState extends js.Object {
  var shouldShowFirstPivotItem: Boolean = js.native
}

object IPivotOnChangeExampleState {
  @scala.inline
  def apply(shouldShowFirstPivotItem: Boolean): IPivotOnChangeExampleState = {
    val __obj = js.Dynamic.literal(shouldShowFirstPivotItem = shouldShowFirstPivotItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPivotOnChangeExampleState]
  }
  @scala.inline
  implicit class IPivotOnChangeExampleStateOps[Self <: IPivotOnChangeExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShouldShowFirstPivotItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldShowFirstPivotItem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

