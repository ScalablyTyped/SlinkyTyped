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

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  behavior :popper.js.popper.js.Popper.Behavior | std.Array<popper.js.popper.js.Popper.Position> | undefined,   padding :number | popper.js.popper.js.Popper.Padding | undefined,   boundariesElement :popper.js.popper.js.Popper.Boundary | std.Element | undefined,   flipVariations :boolean | undefined,   flipVariationsByContent :boolean | undefined} */
trait BaseModifierbehaviorBehav extends js.Object {
  var behavior: js.UndefOr[Behavior | js.Array[Position]] = js.undefined
  var boundariesElement: js.UndefOr[Boundary | Element] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var flipVariations: js.UndefOr[Boolean] = js.undefined
  var flipVariationsByContent: js.UndefOr[Boolean] = js.undefined
  var fn: js.UndefOr[ModifierFn] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double | Padding] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBehavior(value: Behavior | js.Array[Position]): Self = this.set("behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
    @scala.inline
    def setBoundariesElementElement(value: Element): Self = this.set("boundariesElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundariesElement(value: Boundary | Element): Self = this.set("boundariesElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundariesElement: Self = this.set("boundariesElement", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFlipVariations(value: Boolean): Self = this.set("flipVariations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipVariations: Self = this.set("flipVariations", js.undefined)
    @scala.inline
    def setFlipVariationsByContent(value: Boolean): Self = this.set("flipVariationsByContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipVariationsByContent: Self = this.set("flipVariationsByContent", js.undefined)
    @scala.inline
    def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = this.set("fn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPadding(value: Double | Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
  
}

