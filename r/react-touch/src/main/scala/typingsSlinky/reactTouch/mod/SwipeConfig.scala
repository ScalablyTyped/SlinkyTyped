package typingsSlinky.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeConfig extends js.Object {
  /** @default 100 */
  var swipeDistance: js.UndefOr[Double] = js.native
}

object SwipeConfig {
  @scala.inline
  def apply(): SwipeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeConfig]
  }
  @scala.inline
  implicit class SwipeConfigOps[Self <: SwipeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSwipeDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeDistance")(js.undefined)
        ret
    }
  }
  
}

