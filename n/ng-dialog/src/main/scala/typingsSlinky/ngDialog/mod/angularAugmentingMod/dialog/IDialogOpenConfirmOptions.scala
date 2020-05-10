package typingsSlinky.ngDialog.mod.angularAugmentingMod.dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogOpenConfirmOptions extends IDialogOpenOptions {
  @JSName("scope")
  var scope_IDialogOpenConfirmOptions: js.UndefOr[IDialogConfirmScope] = js.native
}

object IDialogOpenConfirmOptions {
  @scala.inline
  def apply(template: String): IDialogOpenConfirmOptions = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogOpenConfirmOptions]
  }
  @scala.inline
  implicit class IDialogOpenConfirmOptionsOps[Self <: IDialogOpenConfirmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScope(value: IDialogConfirmScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

