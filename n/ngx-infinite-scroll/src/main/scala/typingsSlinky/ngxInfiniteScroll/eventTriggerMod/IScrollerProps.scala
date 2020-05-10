package typingsSlinky.ngxInfiniteScroll.eventTriggerMod

import typingsSlinky.ngxInfiniteScroll.modelsMod.IPositionStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollerProps extends IDistanceRange {
  var alwaysCallback: Boolean = js.native
  var container: IPositionStats = js.native
  var disabled: Boolean = js.native
}

object IScrollerProps {
  @scala.inline
  def apply(alwaysCallback: Boolean, container: IPositionStats, disabled: Boolean, down: Double, up: Double): IScrollerProps = {
    val __obj = js.Dynamic.literal(alwaysCallback = alwaysCallback.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollerProps]
  }
  @scala.inline
  implicit class IScrollerPropsOps[Self <: IScrollerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysCallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: IPositionStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

