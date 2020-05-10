package typingsSlinky.reactNativeModal.modalMod

import typingsSlinky.reactNativeModal.typesMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSwipeCompleteParams extends js.Object {
  var swipingDirection: Direction = js.native
}

object OnSwipeCompleteParams {
  @scala.inline
  def apply(swipingDirection: Direction): OnSwipeCompleteParams = {
    val __obj = js.Dynamic.literal(swipingDirection = swipingDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSwipeCompleteParams]
  }
  @scala.inline
  implicit class OnSwipeCompleteParamsOps[Self <: OnSwipeCompleteParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSwipingDirection(value: Direction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipingDirection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

