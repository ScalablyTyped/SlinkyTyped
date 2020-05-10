package typingsSlinky.officeUiFabricReact.dialogLargeHeaderExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogLargeHeaderExampleState extends js.Object {
  var hideDialog: Boolean = js.native
}

object IDialogLargeHeaderExampleState {
  @scala.inline
  def apply(hideDialog: Boolean): IDialogLargeHeaderExampleState = {
    val __obj = js.Dynamic.literal(hideDialog = hideDialog.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogLargeHeaderExampleState]
  }
  @scala.inline
  implicit class IDialogLargeHeaderExampleStateOps[Self <: IDialogLargeHeaderExampleState] (val x: Self) extends AnyVal {
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
  }
  
}

