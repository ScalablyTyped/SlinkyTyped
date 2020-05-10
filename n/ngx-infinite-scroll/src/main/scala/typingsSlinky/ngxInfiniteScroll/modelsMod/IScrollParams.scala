package typingsSlinky.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollParams extends js.Object {
  var fire: Boolean = js.native
  var scrollDown: Boolean = js.native
  var stats: IPositionStats = js.native
}

object IScrollParams {
  @scala.inline
  def apply(fire: Boolean, scrollDown: Boolean, stats: IPositionStats): IScrollParams = {
    val __obj = js.Dynamic.literal(fire = fire.asInstanceOf[js.Any], scrollDown = scrollDown.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollParams]
  }
  @scala.inline
  implicit class IScrollParamsOps[Self <: IScrollParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFire(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: IPositionStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

