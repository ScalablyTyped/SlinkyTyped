package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.popperPopperMod.PopperPlacementType
import typingsSlinky.materialUiCore.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Placement extends js.Object {
  var TransitionProps: js.UndefOr[typingsSlinky.materialUiCore.transitionMod.TransitionProps] = js.native
  var placement: PopperPlacementType = js.native
}

object Placement {
  @scala.inline
  def apply(placement: PopperPlacementType): Placement = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  @scala.inline
  implicit class PlacementOps[Self <: Placement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlacement(value: PopperPlacementType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionProps(value: TransitionProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitionProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitionProps")(js.undefined)
        ret
    }
  }
  
}

