package typingsSlinky.officeUiFabricReact.dialogBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogBasicExampleState extends js.Object {
  var hideDialog: Boolean = js.native
  var isDraggable: Boolean = js.native
}

object IDialogBasicExampleState {
  @scala.inline
  def apply(hideDialog: Boolean, isDraggable: Boolean): IDialogBasicExampleState = {
    val __obj = js.Dynamic.literal(hideDialog = hideDialog.asInstanceOf[js.Any], isDraggable = isDraggable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogBasicExampleState]
  }
  @scala.inline
  implicit class IDialogBasicExampleStateOps[Self <: IDialogBasicExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideDialog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraggable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

