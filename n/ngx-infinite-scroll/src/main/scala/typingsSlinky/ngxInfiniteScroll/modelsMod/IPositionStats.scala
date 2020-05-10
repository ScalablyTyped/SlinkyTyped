package typingsSlinky.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPositionStats extends js.Object {
  var height: Double = js.native
  var isWindow: js.UndefOr[Boolean] = js.native
  var scrolled: Double = js.native
  var totalToScroll: Double = js.native
}

object IPositionStats {
  @scala.inline
  def apply(height: Double, scrolled: Double, totalToScroll: Double): IPositionStats = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scrolled = scrolled.asInstanceOf[js.Any], totalToScroll = totalToScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionStats]
  }
  @scala.inline
  implicit class IPositionStatsOps[Self <: IPositionStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrolled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalToScroll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalToScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWindow")(js.undefined)
        ret
    }
  }
  
}

