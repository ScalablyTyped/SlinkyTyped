package typingsSlinky.popperJs.anon

import typingsSlinky.popperJs.mod.Popper.Data
import typingsSlinky.popperJs.mod.Popper.ModifierFn
import typingsSlinky.popperJs.popperJsStrings.bottom
import typingsSlinky.popperJs.popperJsStrings.left
import typingsSlinky.popperJs.popperJsStrings.right
import typingsSlinky.popperJs.popperJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  gpuAcceleration ? :boolean,   x ? :'bottom' | 'top',   y ? :'left' | 'right'} */
@js.native
trait BaseModifiergpuAccelerati extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var fn: js.UndefOr[ModifierFn] = js.native
  var gpuAcceleration: js.UndefOr[Boolean] = js.native
  var order: js.UndefOr[Double] = js.native
  var x: js.UndefOr[bottom | top] = js.native
  var y: js.UndefOr[left | right] = js.native
}

object BaseModifiergpuAccelerati {
  @scala.inline
  def apply(): BaseModifiergpuAccelerati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseModifiergpuAccelerati]
  }
  @scala.inline
  implicit class BaseModifiergpuAcceleratiOps[Self <: BaseModifiergpuAccelerati] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.undefined)
        ret
    }
    @scala.inline
    def withGpuAcceleration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpuAcceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGpuAcceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpuAcceleration")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: bottom | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

