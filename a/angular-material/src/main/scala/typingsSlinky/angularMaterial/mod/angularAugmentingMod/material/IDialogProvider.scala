package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import typingsSlinky.angularMaterial.anon.Methods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogProvider extends js.Object {
  def addPreset(presetName: String, presetOptions: Methods): IDialogProvider = js.native
}

object IDialogProvider {
  @scala.inline
  def apply(addPreset: (String, Methods) => IDialogProvider): IDialogProvider = {
    val __obj = js.Dynamic.literal(addPreset = js.Any.fromFunction2(addPreset))
    __obj.asInstanceOf[IDialogProvider]
  }
  @scala.inline
  implicit class IDialogProviderOps[Self <: IDialogProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPreset(value: (String, Methods) => IDialogProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPreset")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

