package typingsSlinky.officeUiFabricReact.dialogTopOffsetFixedExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogTopOffsetFixedExampleState extends js.Object {
  var hideDialog: Boolean = js.native
  var optionSelected: String = js.native
}

object IDialogTopOffsetFixedExampleState {
  @scala.inline
  def apply(hideDialog: Boolean, optionSelected: String): IDialogTopOffsetFixedExampleState = {
    val __obj = js.Dynamic.literal(hideDialog = hideDialog.asInstanceOf[js.Any], optionSelected = optionSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogTopOffsetFixedExampleState]
  }
  @scala.inline
  implicit class IDialogTopOffsetFixedExampleStateOps[Self <: IDialogTopOffsetFixedExampleState] (val x: Self) extends AnyVal {
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
    def withOptionSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionSelected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

