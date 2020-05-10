package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAriaProvider extends js.Object {
  def disableWarnings(): Unit = js.native
}

object IAriaProvider {
  @scala.inline
  def apply(disableWarnings: () => Unit): IAriaProvider = {
    val __obj = js.Dynamic.literal(disableWarnings = js.Any.fromFunction0(disableWarnings))
    __obj.asInstanceOf[IAriaProvider]
  }
  @scala.inline
  implicit class IAriaProviderOps[Self <: IAriaProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableWarnings(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWarnings")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

