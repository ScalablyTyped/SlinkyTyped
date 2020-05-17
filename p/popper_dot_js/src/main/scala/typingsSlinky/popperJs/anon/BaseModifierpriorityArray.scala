package typingsSlinky.popperJs.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.popperJs.mod.Popper.Boundary
import typingsSlinky.popperJs.mod.Popper.Data
import typingsSlinky.popperJs.mod.Popper.ModifierFn
import typingsSlinky.popperJs.mod.Popper.Padding
import typingsSlinky.popperJs.mod.Popper.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  priority ? :std.Array<popper.js.popper.js.Popper.Position>,   padding ? :number | popper.js.popper.js.Popper.Padding,   boundariesElement ? :popper.js.popper.js.Popper.Boundary | std.Element,   escapeWithReference ? :boolean} */
@js.native
trait BaseModifierpriorityArray extends js.Object {
  var boundariesElement: js.UndefOr[Boundary | Element] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var escapeWithReference: js.UndefOr[Boolean] = js.native
  var fn: js.UndefOr[ModifierFn] = js.native
  var order: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[Double | Padding] = js.native
  var priority: js.UndefOr[js.Array[Position]] = js.native
}

object BaseModifierpriorityArray {
  @scala.inline
  def apply(): BaseModifierpriorityArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseModifierpriorityArray]
  }
  @scala.inline
  implicit class BaseModifierpriorityArrayOps[Self <: BaseModifierpriorityArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundariesElementElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundariesElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundariesElement(value: Boundary | Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundariesElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundariesElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundariesElement")(js.undefined)
        ret
    }
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
    def withEscapeWithReference(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeWithReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeWithReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeWithReference")(js.undefined)
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
    def withPadding(value: Double | Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: js.Array[Position]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
  }
  
}

