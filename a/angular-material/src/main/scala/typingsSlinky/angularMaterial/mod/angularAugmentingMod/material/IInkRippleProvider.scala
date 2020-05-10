package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInkRippleProvider extends js.Object {
  def disableInkRipple(): Unit = js.native
}

object IInkRippleProvider {
  @scala.inline
  def apply(disableInkRipple: () => Unit): IInkRippleProvider = {
    val __obj = js.Dynamic.literal(disableInkRipple = js.Any.fromFunction0(disableInkRipple))
    __obj.asInstanceOf[IInkRippleProvider]
  }
  @scala.inline
  implicit class IInkRippleProviderOps[Self <: IInkRippleProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableInkRipple(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInkRipple")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

