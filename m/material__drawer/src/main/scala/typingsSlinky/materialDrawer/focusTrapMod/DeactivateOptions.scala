package typingsSlinky.materialDrawer.focusTrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@material/drawer.@material/drawer/focus-trap.Options, 'onDeactivate'> */
@js.native
trait DeactivateOptions extends js.Object {
  var onDeactivate: js.UndefOr[js.Function0[Unit]] = js.native
  var returnFocus: js.UndefOr[Boolean] = js.native
}

object DeactivateOptions {
  @scala.inline
  def apply(): DeactivateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeactivateOptions]
  }
  @scala.inline
  implicit class DeactivateOptionsOps[Self <: DeactivateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnDeactivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDeactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(js.undefined)
        ret
    }
  }
  
}

