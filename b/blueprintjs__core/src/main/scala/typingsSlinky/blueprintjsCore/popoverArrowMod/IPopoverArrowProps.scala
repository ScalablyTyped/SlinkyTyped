package typingsSlinky.blueprintjsCore.popoverArrowMod

import typingsSlinky.popperJs.mod.Placement
import typingsSlinky.reactPopper.mod.PopperArrowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopoverArrowProps extends js.Object {
  var arrowProps: PopperArrowProps = js.native
  var placement: Placement = js.native
}

object IPopoverArrowProps {
  @scala.inline
  def apply(arrowProps: PopperArrowProps, placement: Placement): IPopoverArrowProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopoverArrowProps]
  }
  @scala.inline
  implicit class IPopoverArrowPropsOps[Self <: IPopoverArrowProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowProps(value: PopperArrowProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacement(value: Placement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

