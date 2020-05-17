package typingsSlinky.popperJs.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.popperJs.mod.Popper.Behavior
import typingsSlinky.popperJs.mod.Popper.Boundary
import typingsSlinky.popperJs.mod.Popper.Data
import typingsSlinky.popperJs.mod.Popper.ModifierFn
import typingsSlinky.popperJs.mod.Popper.Padding
import typingsSlinky.popperJs.mod.Popper.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  behavior ? :popper.js.popper.js.Popper.Behavior | std.Array<popper.js.popper.js.Popper.Position>,   padding ? :number | popper.js.popper.js.Popper.Padding,   boundariesElement ? :popper.js.popper.js.Popper.Boundary | std.Element,   flipVariations ? :boolean,   flipVariationsByContent ? :boolean} */
@js.native
trait BaseModifierbehaviorBehav extends js.Object {
  var behavior: js.UndefOr[Behavior | js.Array[Position]] = js.native
  var boundariesElement: js.UndefOr[Boundary | Element] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var flipVariations: js.UndefOr[Boolean] = js.native
  var flipVariationsByContent: js.UndefOr[Boolean] = js.native
  var fn: js.UndefOr[ModifierFn] = js.native
  var order: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[Double | Padding] = js.native
}

object BaseModifierbehaviorBehav {
  @scala.inline
  def apply(): BaseModifierbehaviorBehav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseModifierbehaviorBehav]
  }
  @scala.inline
  implicit class BaseModifierbehaviorBehavOps[Self <: BaseModifierbehaviorBehav] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehavior(value: Behavior | js.Array[Position]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(js.undefined)
        ret
    }
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
    def withFlipVariations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipVariations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipVariations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipVariations")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipVariationsByContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipVariationsByContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipVariationsByContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipVariationsByContent")(js.undefined)
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
  }
  
}

