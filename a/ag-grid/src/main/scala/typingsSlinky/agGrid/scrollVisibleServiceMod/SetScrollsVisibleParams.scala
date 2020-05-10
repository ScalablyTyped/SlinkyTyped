package typingsSlinky.agGrid.scrollVisibleServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetScrollsVisibleParams extends js.Object {
  var bodyHorizontalScrollShowing: Boolean = js.native
  var leftVerticalScrollShowing: Boolean = js.native
  var rightVerticalScrollShowing: Boolean = js.native
}

object SetScrollsVisibleParams {
  @scala.inline
  def apply(
    bodyHorizontalScrollShowing: Boolean,
    leftVerticalScrollShowing: Boolean,
    rightVerticalScrollShowing: Boolean
  ): SetScrollsVisibleParams = {
    val __obj = js.Dynamic.literal(bodyHorizontalScrollShowing = bodyHorizontalScrollShowing.asInstanceOf[js.Any], leftVerticalScrollShowing = leftVerticalScrollShowing.asInstanceOf[js.Any], rightVerticalScrollShowing = rightVerticalScrollShowing.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScrollsVisibleParams]
  }
  @scala.inline
  implicit class SetScrollsVisibleParamsOps[Self <: SetScrollsVisibleParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyHorizontalScrollShowing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyHorizontalScrollShowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftVerticalScrollShowing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftVerticalScrollShowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightVerticalScrollShowing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightVerticalScrollShowing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

