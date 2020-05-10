package typingsSlinky.fastclick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastClickOptions extends js.Object {
  var tapDelay: js.UndefOr[Double] = js.native
  var touchBoundary: js.UndefOr[Double] = js.native
}

object FastClickOptions {
  @scala.inline
  def apply(): FastClickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastClickOptions]
  }
  @scala.inline
  implicit class FastClickOptionsOps[Self <: FastClickOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTapDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchBoundary(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchBoundary")(js.undefined)
        ret
    }
  }
  
}

