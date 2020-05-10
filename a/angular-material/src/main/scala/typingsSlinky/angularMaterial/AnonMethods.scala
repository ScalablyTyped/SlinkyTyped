package typingsSlinky.angularMaterial

import typingsSlinky.angularMaterial.mod.angularAugmentingMod.material.IDialogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMethods extends js.Object {
  var methods: js.UndefOr[js.Array[String]] = js.native
  def options(): IDialogOptions = js.native
}

object AnonMethods {
  @scala.inline
  def apply(options: () => IDialogOptions): AnonMethods = {
    val __obj = js.Dynamic.literal(options = js.Any.fromFunction0(options))
    __obj.asInstanceOf[AnonMethods]
  }
  @scala.inline
  implicit class AnonMethodsOps[Self <: AnonMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: () => IDialogOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
  }
  
}

