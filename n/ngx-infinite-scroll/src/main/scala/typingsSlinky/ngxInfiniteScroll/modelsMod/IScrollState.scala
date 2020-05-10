package typingsSlinky.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollState extends js.Object {
  var lastScrollPosition: Double = js.native
  var lastTotalToScroll: Double = js.native
  var totalToScroll: Double = js.native
  var triggered: IScrollerDistance = js.native
}

object IScrollState {
  @scala.inline
  def apply(
    lastScrollPosition: Double,
    lastTotalToScroll: Double,
    totalToScroll: Double,
    triggered: IScrollerDistance
  ): IScrollState = {
    val __obj = js.Dynamic.literal(lastScrollPosition = lastScrollPosition.asInstanceOf[js.Any], lastTotalToScroll = lastTotalToScroll.asInstanceOf[js.Any], totalToScroll = totalToScroll.asInstanceOf[js.Any], triggered = triggered.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollState]
  }
  @scala.inline
  implicit class IScrollStateOps[Self <: IScrollState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastScrollPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastScrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastTotalToScroll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTotalToScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalToScroll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalToScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggered(value: IScrollerDistance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggered")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

