package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.sharedAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareSharedAction extends ShareAction {
  var action: sharedAction = js.native
  var activityType: js.UndefOr[String] = js.native
}

object ShareSharedAction {
  @scala.inline
  def apply(action: sharedAction): ShareSharedAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareSharedAction]
  }
  @scala.inline
  implicit class ShareSharedActionOps[Self <: ShareSharedAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: sharedAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityType")(js.undefined)
        ret
    }
  }
  
}

